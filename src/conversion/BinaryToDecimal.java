
package conversion;

import java.util.Random;

public class BinaryToDecimal {

	final int MAX = 100;
	final int MIN = 1;

	public String findBinarytoDecimal() {
		Random random = new Random();
		Integer randInt = random.nextInt((MAX - MIN) + 1) + MIN;
		return Integer.toBinaryString(randInt);
	}
}
