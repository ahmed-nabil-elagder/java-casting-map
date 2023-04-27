# java-casting-map
Its an easy MAP to illiterate, how to cast a java primitive data type to another one by examples  
[**Supported Java Primitive Data Types**][1]  
`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`, `String`  
You can click on any cell of below table map to show the code example.


Casting Map
============


| From=>To 	| **byte**                                                                                         | **short**                                                                                          | **int**                                                                                | **long**                                                                               | **float**                                                                              | **double**                                                                             | **boolean**                            | **char**                               | **String**                                                                                                          |  
|--------------|--------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|----------------------------------------|----------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| **byte**     | -                                                                                                | [*By Default*][01]                                                                                 | [*By Default*][02]                                                                     | [*By Default*][03]                                                                     | [*By Default*][04]                                                                     | [*By Default*][05]                                                                     | [**INVALID**][06]                      | [*(char) byteVar; //ASCII_Char*][07]   | [*String.valueOf(byteVar);*][010] or <br/> [*Byte.toString(byteVar);*][08] or <br/> [By Concatenation][09]          |
| **short**    | [(byte) shortVar;][10]                                                                           | -                                                                                                  | [*By Default*][12]                                                                     | [*By Default*][13]                                                                     | [*By Default*][14]                                                                     | [*By Default*][15]                                                                     | [**INVALID**][16]                      | [*(char) shortVar; //ASCII_Char*][17]  | [*String.valueOf(shortVar);*][110] or <br/> [*Short.toString(shortVar);*][18] or <br/> [By Concatenation][19]       |
| **int**      | [(byte) intVar;][20]                                                                             | [(short) intVar;][21]                                                                              | -                                                                                      | [*By Default*][23]                                                                     | [*By Default*][24]                                                                     | [*By Default*][25]                                                                     | [**INVALID**][26]                      | [*(char) intVar; //ASCII_Char*][27]    | [*String.valueOf(intVar);*][210] or <br/> [*Integer.toString(intVar);*][28] or <br/> [By Concatenation][29]         |
| **long**     | [(byte) longVar;][30]                                                                            | [(short) longVar;][31]                                                                             | [(int) longVar;][32]                                                                   | -                                                                                      | [*By Default*][34]                                                                     | [*By Default*][35]                                                                     | [**INVALID**][36]                      | [*(char) longVar; //ASCII_Char*][37]   | [*String.valueOf(longVar);*][310] or <br/> [*Long.toString(longVar);*][38] or <br/> [By Concatenation][39]          |
| **float**    | [(byte) floatVar;][40]                                                                           | [(short) floatVar;][41]                                                                            | [(int) floatVar;][42]                                                                  | [(long) floatVar;][43]                                                                 | -                                                                                      | [*By Default*][45]                                                                     | [**INVALID**][46]                      | [*(char) floatVar; //ASCII_Char*][47]  | [*String.valueOf(floatVar);*][410] or <br/> [*Float.toString(floatVar);*][48] or <br/> [By Concatenation][49]       |
| **double**   | [(byte) doubleVar;][50]                                                                          | [(short) doubleVar;][51]                                                                           | [(int) doubleVar;][52]                                                                 | [(long) doubleVar;][53]                                                                | [(float) doubleVar;][54]                                                               | -                                                                                      | [**INVALID**][56]                      | [*(char) doubleVar; //ASCII_Char*][57] | [*String.valueOf(doubleVar);*][510] or <br/> [*Double.toString(doubleVar);*][58] or <br/> [By Concatenation][59]    |
| **boolean**  | [**INVALID**][60]                                                                                | [**INVALID**][60]                                                                                  | [**INVALID**][60]                                                                      | [**INVALID**][60]                                                                      | [**INVALID**][60]                                                                      | [**INVALID**][60]                                                                      | -                                      | [**INVALID**][60]                      | [*String.valueOf(booleanVar);*][610] or <br/> [*Boolean.toString(booleanVar);*][68] or <br/> [By Concatenation][69] |
| **char**     | [(byte) charVar; //ASCII_Number][70] or <br/> [(byte) (charDigitVar-'0'); //Digit_Number][720]   | [(short) charVar; //ASCII_Number][71] or <br/> [(short) (charDigitVar-'0'); //Digit_Number][721]   | [*By Default //ASCII_Number*][72] or <br/> [(charDigitVar-'0'); //Digit_Number][722]   | [*By Default //ASCII_Number*][73] or <br/> [(charDigitVar-'0'); //Digit_Number][723]   | [*By Default //ASCII_Number*][74] or <br/> [(charDigitVar-'0'); //Digit_Number][724]   | [*By Default //ASCII_Number*][75] or <br/> [(charDigitVar-'0'); //Digit_Number][725]   | [**INVALID**][76]                      | -                                      | [*String.valueOf(charVar);*][710] or <br/> [*Char.toString(charVar);*][78] or <br/> [By Concatenation][79]          |
| **String**   | [Byte.parseByte(stringVar);][80]                                                                 | [Short.parseShort(stringVar);][81]                                                                 | [Integer.parseInt(stringVar);][82]                                                     | [Long.parseLong(stringVar);][83]                                                       | [Float.parseFloat(stringVar);][84]                                                     | [Double.parseDouble(stringVar);][85]                                                   | [Boolean.parseBoolean(stringVar);][86] | [stringVar.charAt(index);][87]         | -                                                                                                                   |


Primitive Data Types - Values Range
============

|      -      |   | **size**               | Internal Implementation                          | **Default Value**     | **Minimum value**           | **Maximum value**         |       |
| ----------- | - |------------------------|--------------------------------------------------| --------------------- | --------------------------- | ------------------------- | ----- |
| **byte**    |   | 8 bit  <br/> (1 byte)  | Two's complement integer.                        | 0                     | \-128                       | 127                       | 2\^7  |
| **short**   |   | 16 bit <br/> (2 bytes) | Two's complement integer.                        | 0                     | \-32,768                    | 32,767                    | 2\^15 |
| **int**     |   | 32 bit <br/> (4 bytes) | Two's complement integer.                        | 0                     | \-2,147,483,648             | 2,147,483,647             | 2\^31 |
| **long**    |   | 64 bit <br/> (8 bytes) | Two's complement integer.                        | 0L <br> 0l            | \-9,223,372,036,854,770,000 | 9,223,372,036,854,770,000 | 2\^63 |
| **float**   |   | 32 bit <br/> (4 bytes) | Single-precision 32-bit/IEEE 754 floating point. | 0.0F <br> 0.0f        | 1.4E-45                     | 3.4028235E38              |       |
| **double**  |   | 64 bit <br/> (8 bytes) | Double-precision 64-bit/IEEE 754 floating point. | 0.0D <br> 0.0d        | 4.9E-324                    | 1.7976931348623157E308    |       |
| **boolean** |   | VM dependent           | VM dependent, to store either `true` of `false`  | `false`               |                             |                           |       |
| **char**    |   | 16 bit <br/> (2 bytes) | Single 16-bit Unicode character.                 | '\\u0000'             | \\u0000' (or 0)             | \\uffff' (or 65,535)      |       |
| **String**  |   |                        |                                                  | null                  |                             |                           |       |










[1]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

[01]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L26-L29 "BY Default - No casting required"
[02]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L31-L34 "BY Default - No casting required"
[03]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L36-L39 "BY Default - No casting required"
[04]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L41-L44 "BY Default - No casting required"
[05]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L46-L49 "BY Default - No casting required"
[06]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L51-L54
[07]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L56-L59
[08]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L61-L63
[09]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L65-L67
[010]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ByteCasting.java#L69-L71 "By String.valueOf(int i) [internally will call Integer.toString(int i)]"

[10]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L26-L28
[12]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L30-L33 "BY Default - No casting required"
[13]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L35-L38 "BY Default - No casting required"
[14]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L40-L43 "BY Default - No casting required"
[15]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L45-L48 "BY Default - No casting required"
[16]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L50-L53
[17]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L55-L58
[18]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L60-L62
[19]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L64-L66
[110]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/ShortCasting.java#L68-L70 "By String.valueOf(int i) [internally will call Integer.toString(int i)]"

[20]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L26-L29
[21]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L31-L33
[23]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L35-L38 "BY Default - No casting required"
[24]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L40-L43 "BY Default - No casting required"
[25]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L45-L48 "BY Default - No casting required"
[26]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L50-L53
[27]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L55-L58
[28]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L60-L62
[29]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L64-L66
[210]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/IntCasting.java#L68-L70 "By String.valueOf(int i) [internally will call Integer.toString(int i)]"


[30]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L26-L28
[31]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L30-L32
[32]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L34-L36
[34]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L38-L41 "BY Default - No casting required"
[35]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L43-L46 "BY Default - No casting required"
[36]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L48-L51
[37]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L53-L56
[38]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L58-L60
[39]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L62-L64
[310]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/LongCasting.java#L66-L68 "By String.valueOf(long l) [internally will call Long.toString(long l)]"



[40]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L26-L28
[41]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L30-L34
[42]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L34-L36
[43]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L38-L40
[45]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L42-L45 "BY Default - No casting required"
[46]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L47-L50
[47]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L52-L55
[48]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L57-L59
[49]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L61-L63
[410]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/FloatCasting.java#L65-L67 "By String.valueOf(float f) [internally will call Float.toString(float f)]"


[50]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L26-L28
[51]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L30-L32
[52]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L34-L36
[53]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L38-L40
[54]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L42-L44
[56]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L46-L49
[57]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L51-L54
[58]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L56-L58
[59]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L60-L62
[510]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/DoubleCasting.java#L64-L66 "By String.valueOf(double d) [internally will call Double.toString(double d)]"

[60]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/BooleanCasting.java#L26-L28 "boolean - Can NOT be casted to byte/short/int/long/float/double/char"
[68]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/BooleanCasting.java#L30-L33
[69]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/BooleanCasting.java#L35-L38
[610]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/BooleanCasting.java#L40-L43 "By String.valueOf(boolean b) [internally has a conditional check]"


[70]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L26-L29
[71]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L31-L34
[72]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L36-L40
[73]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L42-L46
[74]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L48-L52
[75]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L54-L58
[76]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L60-L63
[78]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L65-L67
[79]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L69-L71
[710]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L73-L75 "By String.valueOf(char c) [internally has a conditional check to return a new String]"

[720]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L85-L88
[721]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L90-L93
[722]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L95-L98
[723]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L100-L103
[724]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L105-L108
[725]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/CharCasting.java#L110-L113


[80]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/StringCasting.java#L25-L28
[81]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/StringCasting.java#L30-L33
[82]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/StringCasting.java#L35-L38
[83]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/StringCasting.java#L40-L43
[84]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/StringCasting.java#L45-L48
[85]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/StringCasting.java#L50-L53
[86]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/StringCasting.java#L55-L61
[87]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/main/java/java_casting_map/StringCasting.java#L63-L66

