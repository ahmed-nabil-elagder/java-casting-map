package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java_casting_map.Constants.CASTING_LOG_MSG;

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
		LOGGER.info(CASTING_LOG_MSG, FROM, "byte", "byteVar", byteVar);

		// casting long to short
		short shortVar = (short) longVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "short", "shortVar", shortVar);

		// casting long to int
		
		int intVar = (int) longVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "int", "intVar", intVar);

		// casting long to float
		// BY Default - No casting required
		float floatVar = longVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "float", "floatVar", floatVar);

		// casting long to double
		// BY Default - No casting required
		double doubleVar = longVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "double", "doubleVar", doubleVar);

		// casting long to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info("casting {} to {}  {}", FROM, "boolean", hint);

		// casting long to char
		char charVar = (char) (longVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info("casting {} to {} \t {} = {}, {}", FROM, "char", "charVar", charVar, hint);

		// casting long to String
		String stringVar = Long.toString(longVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

		// casting long to String - ByConcatenation
		stringVar = longVar + "";
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

	}
}
