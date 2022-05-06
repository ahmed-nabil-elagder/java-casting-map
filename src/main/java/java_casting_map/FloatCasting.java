package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrate how to cast float primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class FloatCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(FloatCasting.class);
	
	private static final String FROM = "float";

	public static void main(String[] args) {

		float floatVar = 65; // any value
		LOGGER.info("===========================");
		LOGGER.info("floatVar = {}", floatVar);
		LOGGER.info("===========================");

		// casting float to byte		
		byte byteVar = (byte) floatVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting float to short
		short shortVar = (short) floatVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting float to int		
		int intVar = (int) floatVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting float to long		
		long longVar = (long) floatVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting float to double
		// BY Default - No casting required
		double doubleVar = floatVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting float to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "boolean") +  " " + hint);

		// casting float to char
		char charVar = (char) (floatVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting float to String
		String stringVar = Float.toString(floatVar);
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting float to String - ByConcatenation
		stringVar = floatVar + "";
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
