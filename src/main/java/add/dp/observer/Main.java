package add.dp.observer;

import add.dp.observer.observer.DigitObserver;
import add.dp.observer.observer.GraphObserver;
import add.dp.observer.observer.Observer;
import add.dp.observer.subject.NumberGenerator;
import add.dp.observer.subject.RandomNumberGenerator;
import info.MyHWInfo;

public class Main {
	public static void main(String[] args) {
		MyHWInfo.printInfo();
		
		NumberGenerator generator = new RandomNumberGenerator();
		
		
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		
		
		generator.execute();
		
	}
}
