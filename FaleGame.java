
public class FaleGame extends Game{
	private Player winner;
	private final Dice dice;
	private final GameWinnerPrinter winnerPrinter;

	public FaleGame(Dice dice, GameWinnerPrinter winnerPrinter) {
		super(dice, winnerPrinter);
		this.dice = dice;
		this.winnerPrinter = winnerPrinter;
	}

	@Override
	public void playGame(Player player1, Player player2) {
		Dice fakeDice1=new FakeDice(1);
		Dice fakeDice2=new FakeDice(3);
		int player1Result = fakeDice1.roll();
		int player2Result = fakeDice2.roll();
		Player winner = (player1Result > player2Result)? player1: player2;
		this.winner = winner;
	}
	public void playGameWithEqualScores(Player player1, Player player2) {
		Dice fakeDice1=new FakeDice(3);
		Dice fakeDice2=new FakeDice(3);
		int player1Result = fakeDice1.roll();
		int player2Result = fakeDice2.roll();
		Player winner = (player1Result > player2Result)? player1: player2;
		this.winner = winner;
	}
	public Player getWinner() {
		return winner;
	}
	
}