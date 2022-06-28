
public class FakeDice implements Dice{
	private int value;

    public FakeDice(int value) {
        this.value = value;
    }

    @Override
    public int roll() {
        return value;
    }
}