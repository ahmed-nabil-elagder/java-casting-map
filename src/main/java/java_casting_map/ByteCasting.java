package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrate how to cast byte primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class ByteCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(ByteCasting.class);
	
	private static final String FROM = "byte";

	public static void main(String[] args) {

		byte byteVar = 65; // any value
		LOGGER.info("===========================");
		LOGGER.info("byteVar = {}", byteVar);
		LOGGER.info("===========================");

		// casting byte to short
		// BY Default - No casting required
		short shortVar = byteVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting byte to int
		// BY Default - No casting required
		int intVar = byteVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting byte to long
		// BY Default - No casting required
		long longVar = byteVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting byte to float
		// BY Default - No casting required
		float floatVar = byteVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);

		// casting byte to double
		// BY Default - No casting required
		double doubleVar = byteVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting byte to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "boolean") + "\t" + hint);

		// casting byte to char
		char charVar = (char) (byteVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "char") + "\t" + "charVar = " + charVar + "\t" + hint);

		// casting byte to String
		String stringVar = Byte.toString(byteVar);
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting byte to String - ByConcatenation
		stringVar = byteVar + "";
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
