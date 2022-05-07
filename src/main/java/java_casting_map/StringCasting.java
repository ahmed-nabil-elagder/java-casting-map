package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java_casting_map.Constants.CASTING_LOG_MSG;

/**
 * This class demonstrate how to cast String data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class StringCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(StringCasting.class);
	
	private static final String FROM = "String";

	public static void main(String[] args) {

		LOGGER.info("===========================");
		LOGGER.info("String Casting");
		LOGGER.info("===========================");

		// casting String to byte	
		String stringVar = "123"; // if stringVar not equal numeric value, you will face NumberFormatException
		byte byteVar = Byte.parseByte(stringVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "byte", "byteVar", byteVar);

		// casting String to short
		stringVar = "123"; // if stringVar not equal numeric value, you will face NumberFormatException
		short shortVar = Short.parseShort(stringVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "shor", "shortVar", shortVar);

		// casting String to int		
		stringVar = "123"; // if stringVar not equal numeric value, you will face NumberFormatException
		int intVar = Integer.parseInt(stringVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "int", "intVar", intVar);

		// casting String to long		
		stringVar = "123"; // if stringVar not equal numeric value, you will face NumberFormatException
		long longVar = Long.parseLong(stringVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "long", "longVar", longVar);

		// casting String to float
		stringVar = "123.45"; // if stringVar not equal numeric value, you will face NumberFormatException
		float floatVar = Float.parseFloat(stringVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "float", "floatVar", floatVar);

		// casting String to double
		stringVar = "123.67"; // if stringVar not equal numeric value, you will face NumberFormatException
		double doubleVar = Double.parseDouble(stringVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "double", "doubleVar", doubleVar);

		// casting String to boolean
		stringVar = "true"; 
		// [parseBoolean] returned true 
		// if the string value not null and is equal, ignoring case, to the string "true",
		// else return false
		boolean booleanVar = Boolean.parseBoolean(stringVar);
		LOGGER.info(CASTING_LOG_MSG, FROM, "boolean", "booleanVar", booleanVar);

		// casting String to char
		stringVar = "A";
		char charVar = stringVar.charAt(0);
		LOGGER.info(CASTING_LOG_MSG, FROM, "char", "charVar", charVar);

	}
}
