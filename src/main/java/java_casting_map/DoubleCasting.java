package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java_casting_map.Constants.CASTING_LOG_MSG;

/**
 * This class demonstrate how to cast double primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class DoubleCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(DoubleCasting.class);

	private static final String FROM = "double";

	public static void main(String[] args) {

		double doubleVar = 65; // any value
		LOGGER.info("===========================");
		LOGGER.info("doubleVar = {}", doubleVar);
		LOGGER.info("===========================");

		// casting double to byte		
		byte byteVar = (byte) doubleVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "byte", "byteVar", byteVar);

		// casting double to short
		short shortVar = (short) doubleVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "short", "shortVar", shortVar);

		// casting double to int		
		int intVar = (int) doubleVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "int", "intVar", intVar);

		// casting double to long		
		long longVar = (long) doubleVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "long", "longVar", longVar);

		// casting double to float
		float floatVar = (float) doubleVar;
		LOGGER.info(CASTING_LOG_MSG, FROM, "float", "floatVar", floatVar);

		// casting double to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info("casting {} to {}  {}", FROM, "boolean", hint);

		// casting double to char
		char charVar = (char) (doubleVar);
		hint = "[ It will print corresponding (ASCII) char ]";
		LOGGER.info("casting {} to {} \t {} = {}, {}", FROM, "char", "charVar", charVar, hint);

		// casting double to String
		String stringVar = Double.toString(doubleVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

		// casting double to String - ByConcatenation
		stringVar = doubleVar + "";
		LOGGER.info(CASTING_LOG_MSG, FROM, "String", "stringVar", stringVar);

	}
}
