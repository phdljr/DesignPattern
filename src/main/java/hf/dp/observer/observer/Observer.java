package hf.dp.observer.observer;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}