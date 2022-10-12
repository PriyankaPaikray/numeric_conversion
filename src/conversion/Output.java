package conversion;

public class Output {

	public static void main(String[] args) {

		DecimalToBinary db = new DecimalToBinary();
		BinaryToDecimal bd = new BinaryToDecimal();

		double decimal = db.findDecimalToBinary();
		String binary = bd.findBinarytoDecimal();

		System.out.println("Convert decimal " + decimal + " to binary? ");
		System.out.println("Convert binary " + binary + " to decimal? ");

	}

}
