package hf.dp.observer.observer;

import hf.dp.observer.subject.Subject;

import java.util.Random;

public class ForecastDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private String[] msg = new String[3];
    private Random random = new Random();

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        msg[0] = "Improving weather on the way!";
        msg[1] = "Watch out for cooler, rainy weather.";
        msg[2] = "More of the same.";
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.printf("Forecast: %s\n", msg[random.nextInt(3)]);
    }
}
