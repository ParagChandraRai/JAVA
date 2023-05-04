import java.security.SecureRandom;

public class dicesum{
	private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		int[] frequency = new int[13];

		for (int i = 0; i < 36_000_000; i++) {
			int die1 = 1 + random.nextInt(6);
			int die2 = 1 + random.nextInt(6);

			int sum = die1 + die2;

			++frequency[sum];
		}

		System.out.printf("%s %s%n", "Sum", "Frequency");

		for (int i = 2; i < frequency.length; i++) {
			System.out.printf("%2d %10d%n", i, frequency[i]);
		}
	}

}