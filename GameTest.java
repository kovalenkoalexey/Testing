
public class GameTest {
	
	public void winningPlayer() {
		Dice dice=new FakeDice(3);
		GameWinnerPrinter winnerPrinter=new FalePrinter("Petya");
		FaleGame faleGame=new FaleGame(dice, winnerPrinter);
		String scenario="Winner test";
		try {
			Player player1=new Player("Vasya");
			Player player2=new Player("Petya");
			faleGame.playGame(player1, player2);
			Assertions.assertEquals3(player2, faleGame.getWinner());
			System.out.printf("\"%s\" passed. %n", scenario);
		}
		catch (Throwable e) {
			System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
		}
	}
	public void drawGame() {
		Dice dice=new FakeDice(3);
		GameWinnerPrinter winnerPrinter=new FalePrinter("draw");
		FaleGame faleGame=new FaleGame(dice, winnerPrinter);
		String scenario="Draw test";
		try {
			Player player1=new Player("Vasya");
			Player player2=new Player("Petya");
			faleGame.playGameWithEqualScores(player1, player2);
			Assertions.assertEquals4(player2, faleGame.getWinner());
			System.out.printf("\"%s\" passed. %n", scenario);
		}
		catch (Throwable e) {
			System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
		}
	}
}
