package designpattern.observer.display;

import designpattern.observer.Observer;
import designpattern.observer.Subject;

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
