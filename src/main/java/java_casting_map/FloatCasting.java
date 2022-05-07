package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java_casting_map.Constants.CASTING_LOG_MSG;

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
		LOGGER.info(CASTING_LOG_MSG, FROM, "byte", "byteVar", byteVar);

		// casting float to short
		short shortVar = (short) floatVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "short", "shortVar", shortVar);

		// casting float to int		
		int intVar = (int) floatVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "int", "intVar", intVar);

		// casting float to long		
		long longVar = (long) floatVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "long", "longVar", longVar);

		// casting float to double
		// BY Default - No casting required
		double doubleVar = floatVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "double", "doubleVar", doubleVar);

		// casting float to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info("casting {} to {}  {}", FROM, "boolean", hint);

		// casting float to char
		char charVar = (char) (floatVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info("casting {} to {} \t {} = {}, {}", FROM, "char", "charVar", charVar, hint);

		// casting float to String
		String stringVar = Float.toString(floatVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

		// casting float to String - ByConcatenation
		stringVar = floatVar + "";
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

	}
}
