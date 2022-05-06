package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrate how to cast int primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class IntCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(IntCasting.class);
	
	private static final String FROM = "int";

	public static void main(String[] args) {

		int intVar = 65; // any value
		LOGGER.info("===========================");
		LOGGER.info("intVar = {}", intVar);
		LOGGER.info("===========================");

		// casting int to byte
		// BY Default - No casting required
		byte byteVar = (byte) intVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting int to short
		short shortVar = (short) intVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting int to long
		// BY Default - No casting required
		long longVar = intVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting int to float
		// BY Default - No casting required
		float floatVar = intVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);

		// casting int to double
		// BY Default - No casting required
		double doubleVar = intVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting int to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "boolean") +  "\t" + hint);

		// casting int to char
		char charVar = (char) (intVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting int to String
		String stringVar = Integer.toString(intVar);
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting int to String - ByConcatenation
		stringVar = intVar + "";
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
