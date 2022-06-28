
public class Assertions {
	public static void assertEquals1(int min, int actual) {
		if (actual < min)
			throw new AssertionError("number " + actual + " out of expected minimal range "+ min + ".");
	}
	public static void assertEquals2(int max, int actual) {
		if (actual > max)
			throw new AssertionError("number " + actual + " out of expected maximal range "+ max + ".");
	}
	public static void assertEquals3(Player player, Player winner) {
		if (player!=winner)
			throw new AssertionError("Player was announced like winnner, don't correspond.");
	}
	public static void assertEquals4(Player player, Player winner) {
		if (player==winner)
			throw new AssertionError("there is not winner in case of equality of scores.");
	}
}