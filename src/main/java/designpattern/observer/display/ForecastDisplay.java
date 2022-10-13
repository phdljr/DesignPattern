package designpattern.observer.display;

import designpattern.observer.Observer;
import designpattern.observer.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
