package hf.dp.observer.display;

import hf.dp.observer.Observer;
import hf.dp.observer.Subject;

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
