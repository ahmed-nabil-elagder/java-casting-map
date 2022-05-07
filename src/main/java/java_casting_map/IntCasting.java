package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java_casting_map.Constants.CASTING_LOG_MSG;

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
		LOGGER.info(CASTING_LOG_MSG, FROM, "byte", "byteVar", byteVar);

		// casting int to short
		short shortVar = (short) intVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "short", "shortVar", shortVar);

		// casting int to long
		// BY Default - No casting required
		long longVar = intVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "long", "longVar", longVar);

		// casting int to float
		// BY Default - No casting required
		float floatVar = intVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "float", "floatVar", floatVar);

		// casting int to double
		// BY Default - No casting required
		double doubleVar = intVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "double", "doubleVar", doubleVar);

		// casting int to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info("casting {} to {}  {}", FROM, "boolean", hint);

		// casting int to char
		char charVar = (char) (intVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info("casting {} to {} \t {} = {}, {}", FROM, "char", "charVar", charVar, hint);

		// casting int to String
		String stringVar = Integer.toString(intVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

		// casting int to String - ByConcatenation
		stringVar = intVar + "";
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

	}
}
