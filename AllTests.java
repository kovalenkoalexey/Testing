
public class AllTests {
	
	public static void main(String[] args) {
		new DiceImplTest().DiceImplLowerLimitTest();
		new DiceImplTest().DiceImplUpperLimitTest();
		new GameTest().winningPlayer();
		new GameTest().drawGame();
	}
}