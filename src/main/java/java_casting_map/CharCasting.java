package java_casting_map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrate how to cast char primitive data type to others ones
 * 
 * @author Ahmed Nabil
 *
 */
public class CharCasting {
	private static final Logger LOGGER = LoggerFactory.getLogger(CharCasting.class);
	
	private static final String FROM = "char";

	public static void main(String[] args) {

		char charVar = 'A';
		LOGGER.info("===========================");
		LOGGER.info("charVar = {}", charVar);
		LOGGER.info("===========================");

		// casting char to byte	
		// It will print corresponding (ASCII) Number
		byte byteVar = (byte) charVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteVar = " + byteVar);

		// casting char to short
		// It will print corresponding (ASCII) Number
		short shortVar = (short) charVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "short") + "\t" + "shortVar = " + shortVar);

		// casting char to int	
		// BY Default - No casting required
		// It will print corresponding (ASCII) Number
		int intVar = charVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "int") + "\t" + "intVar = " + intVar);

		// casting char to long		
		// BY Default - No casting required
		// It will print corresponding (ASCII) Number
		long longVar = charVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "long") + "\t" + "longVar = " + longVar);

		// casting char to float
		// BY Default - No casting required
		// It will print corresponding (ASCII) Number
		float floatVar = charVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "float") + "\t" + "floatVar = " + floatVar);
		
		// casting char to double
		// BY Default - No casting required
		// It will print corresponding (ASCII) Number
		double doubleVar = charVar;
		LOGGER.info(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleVar = " + doubleVar);

		// casting char to boolean
		// boolean booleanVar = true;
		String hint = "[ InValid - Can NOT be casted ]";
		LOGGER.info(Helper.getCastingMessage(FROM, "boolean") +  " " + hint);

		// casting char to String
		String stringVar = Character.toString(charVar);
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		// casting char to String - ByConcatenation
		stringVar = charVar + "";
		LOGGER.info(Helper.getCastingMessage(FROM, "String") + "\t" + "stringVar = " + stringVar);
		
		
		LOGGER.info("");
		
		char charDigitVar = '9';
		LOGGER.info("===========================");
		LOGGER.info("charDigitVar = {}", charDigitVar);
		LOGGER.info("===========================");
		
		// casting char to byte	
		// It will print corresponding (Digit) Number
		byte byteDigitVar = (byte) (charDigitVar-'0');
		LOGGER.info(Helper.getCastingMessage(FROM, "byte") + "\t" + "byteDigitVar = " + byteDigitVar);
		
		// casting char to short	
		// It will print corresponding (Digit) Number
		short shortDigitVar = (short) (charDigitVar-'0');
		LOGGER.info(Helper.getCastingMessage(FROM, "short") + "\t" + "shortDigitVar = " + shortDigitVar);
		
		// casting char to int	
		// It will print corresponding (Digit) Number
		int intDigitVar = (charDigitVar-'0');
		LOGGER.info(Helper.getCastingMessage(FROM, "int") + "\t" + "intDigitVar = " + intDigitVar);
		
		// casting char to long	
		// It will print corresponding (Digit) Number
		long longDigitVar = (charDigitVar-'0');
		LOGGER.info(Helper.getCastingMessage(FROM, "long") + "\t" + "longDigitVar = " + longDigitVar);
		
		// casting char to float	
		// It will print corresponding (Digit) Number
		float floatDigitVar = (charDigitVar-'0');
		LOGGER.info(Helper.getCastingMessage(FROM, "float") + "\t" + "floatDigitVar = " + floatDigitVar);
		
		// casting char to double	
		// It will print corresponding (Digit) Number
		double doubleDigitVar = (charDigitVar-'0');
		LOGGER.info(Helper.getCastingMessage(FROM, "double") + "\t" + "doubleDigitVar = " + doubleDigitVar);
		
	}
}
