package hf.dp.observer.observer;

import hf.dp.observer.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float avgTemp = 0f;
    private float maxTemp = 0f;
    private float minTemp = 200f;
    private float tempSum = 0f;
    private int numReadings = 0;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        numReadings++;
        tempSum += temperature;
        avgTemp = tempSum / numReadings;
        if(maxTemp < temperature) this.maxTemp = temperature;
        if(minTemp > temperature) this.minTemp = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n", avgTemp, maxTemp, minTemp);
    }
}
