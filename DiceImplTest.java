
public class DiceImplTest {
	public void DiceImplLowerLimitTest(){
		String scenario="Lower limit test";
		try {
			DiceImpl diceImpl=new DiceImpl();
			int actual=diceImpl.roll();
			Assertions.assertEquals1(1, actual);
			System.out.printf("\"%s\" passed. %n", scenario);
		}
		catch (Throwable e) {
			System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
		}
	}
	public void DiceImplUpperLimitTest(){
		String scenario="Upper limit test";
		try {
			DiceImpl diceImpl=new DiceImpl();
			int actual=diceImpl.roll();
			Assertions.assertEquals2(6, actual);
			System.out.printf("\"%s\" passed. %n", scenario);
		}
		catch (Throwable e) {
			System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
		}
	}
}