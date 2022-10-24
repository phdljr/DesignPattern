package add.dp.observer.observer;


import add.dp.observer.subject.NumberGenerator;

public interface Observer {
	
	
	public abstract void update(NumberGenerator generator);
}
