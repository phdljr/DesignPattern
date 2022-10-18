package hf.dp.observer.observer;

import hf.dp.observer.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float avgTemp;
    private float maxTemp;
    private float minTemp;

    // 온도 데이터 개수
    private int count;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        avgTemp = 0;
        maxTemp = 0;
        minTemp = Integer.MAX_VALUE;
        count = 0;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        count++;
        if(maxTemp < temperature) this.maxTemp = temperature;
        if(minTemp > temperature) this.minTemp = temperature;
        avgTemp = ((float)(count - 1) / count) * avgTemp + temperature / count;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n", avgTemp, maxTemp, minTemp);
    }
}
