package add.dp.strategy;

public class Player {
	private String name;

	private Strategy strategy;

	private int wincount;

	private int losecount;

	private int gamecount;


	public Player(String name, Strategy strategy) { 
		this.name = name;
		this.strategy = strategy;
	}

	public Hand nextHand() { 
		return strategy.nextHand();
	}

	
	public void win() { 
		strategy.study(true);
		wincount++;
		gamecount++;
	}

	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	public void even() { 
		gamecount++;
	}

	public String toString() {
		return "[" + name + " / 이전 성적:" + gamecount + " games, " + wincount
				+ " win, " + losecount + " lose" + "]";
	}
}
