package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrate how to cast long primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class LongCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(LongCasting.class);
	
	private static final String FROM = "long";

	public static void main(String[] args) {

		long longVar = 65; // any value
		LOGGER.info("===========================");
		LOGGER.info("longVar = {}", longVar);
		LOGGER.info("===========================");

		// casting long to byte
		
		byte byteVar = (byte) longVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting long to short
		short shortVar = (short) longVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting long to int
		
		int intVar = (int) longVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting long to float
		// BY Default - No casting required
		float floatVar = longVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);

		// casting long to double
		// BY Default - No casting required
		double doubleVar = longVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting long to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "boolean") +  "\t" + hint);

		// casting long to char
		char charVar = (char) (longVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting long to String
		String stringVar = Long.toString(longVar);
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting long to String - ByConcatenation
		stringVar = longVar + "";
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
