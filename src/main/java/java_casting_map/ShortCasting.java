package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java_casting_map.Constants.CASTING_LOG_MSG;

/**
 * This class demonstrate how to cast short primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class ShortCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(ShortCasting.class);
	
	private static final String FROM = "short";

	public static void main(String[] args) {

		short shortVar = 65; // any value
		LOGGER.info("===========================");
		LOGGER.info("shortVar = {}", shortVar);
		LOGGER.info("===========================");

		// casting short to byte
		byte byteVar = (byte) shortVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "byte", "byteVar", byteVar);

		// casting short to int
		// BY Default - No casting required
		int intVar = shortVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "int", "intVar", intVar);

		// casting short to long
		// BY Default - No casting required
		long longVar = shortVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "long", "longVar", longVar);

		// casting short to float
		// BY Default - No casting required
		float floatVar = shortVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "float", "floatVar", floatVar);

		// casting short to double
		// BY Default - No casting required
		double doubleVar = shortVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "double", "doubleVar", doubleVar);

		// casting short to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info("casting {} to {}  {}", FROM, "boolean", hint);

		// casting short to char
		char charVar = (char) (shortVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info("casting {} to {} \t {} = {}, {}", FROM, "char", "charVar", charVar, hint);

		// casting short to String
		String stringVar = Short.toString(shortVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

		// casting short to String - ByConcatenation
		stringVar = shortVar + "";
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

	}
}
