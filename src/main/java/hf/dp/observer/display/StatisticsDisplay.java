package hf.dp.observer.display;

import hf.dp.observer.Observer;
import hf.dp.observer.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
