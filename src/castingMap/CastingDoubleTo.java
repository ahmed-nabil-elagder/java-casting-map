package castingMap;

/**
 * This class demonstrate how to cast double primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class CastingDoubleTo {
	
	private static final String FROM = "double";

	public static void main(String[] args) {

		double doubleVar = 65; // any value
		System.out.println("===========================");
		System.out.println("doubleVar = " + doubleVar);
		System.out.println("===========================");

		// casting double to byte		
		byte byteVar = (byte) doubleVar;
		System.out.println(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting double to short
		short shortVar = (short) doubleVar;
		System.out.println(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting double to int		
		int intVar = (int) doubleVar;
		System.out.println(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting double to long		
		long longVar = (long) doubleVar;
		System.out.println(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting double to float
		float floatVar = (float) doubleVar;
		System.out.println(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);

		// casting double to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		System.out.println(Helper.getCastingMessage(FROM, "boolean") +  " " + hint);

		// casting double to char
		char charVar = (char) (doubleVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		System.out.println(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting double to String
		String stringVar = Double.toString(doubleVar);
		System.out.println(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
