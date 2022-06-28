
public class FalePrinter implements GameWinnerPrinter{
	String winner;
	public FalePrinter(String winner) {
		this.winner=winner;
	}
	@Override
	public void printWinner(Player winner) {
		System.out.printf("Победитель: %s%n "+winner);
	}
}