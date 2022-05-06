package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrate how to cast boolean primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class BooleanCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(BooleanCasting.class);
	
	private static final String FROM = "double";

	public static void main(String[] args) {

		boolean booleanVar = true; // true or false
		LOGGER.info("===========================");
		LOGGER.info("booleanVar = {}", booleanVar);
		LOGGER.info("===========================");

		// casting boolean to byte/short/int/long/float/double/char
		String hint = "[ boolean - Can NOT be casted to byte/short/int/long/float/double/char ]";
		LOGGER.info( hint);

		// casting boolean to String
		// If the specified boolean is true, then the string "true" will be returned, otherwise the string "false" will be returned
		String stringVar = Boolean.toString(booleanVar);
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting boolean to String - ByConcatenation
		// If the specified boolean is true, then the string "true" will be returned, otherwise the string "false" will be returned
		stringVar = booleanVar + "";
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);

	}
}
