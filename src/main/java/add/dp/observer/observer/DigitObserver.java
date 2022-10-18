package add.dp.observer.observer;


import add.dp.observer.subject.NumberGenerator;

public class DigitObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber()); 
		try {
			
			
			Thread.sleep(100); 
		} catch (InterruptedException e) {
		}
	}
}
