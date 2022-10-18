package add.dp.strategy.strategy;

import add.dp.strategy.Hand;

public interface Strategy {
	
	
	
	public abstract Hand nextHand();

	
	
	
	public abstract void study(boolean win);
}
