# java-casting-map
Its an easy MAP to illiterate, how to cast a java primitive data type to another one by examples  
**Supported Types**  
`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`, `String`  


Casting Map
============


| From => To 	|       **byte**        |       **short**       |   **int**     |         **long**      |       **float**       |   **double**     |         **boolean**      |       **char**       |   **String**     |  
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| **byte**  	| -                     | [*ByDefault*][01]      | [*ByDefault*][02]    | [*ByDefault*][03] | [*ByDefault*][04]  | [*ByDefault*][05] | [**INVALID**][06] | [*(char)byteVar;//ASCII_Char*][07]  | [*Byte.toString(byteVar);*][08] |
| **short** 	| [(byte)shortVar;][10] | -                     | [*ByDefault*][02]    | XXX | XXX  | XXX | XXX | XXX  | XXX |
| **int**   	| [(byte)intVar;][20]   | [(short)intVar;][21] | -     | XXX | XXX  | XXX | XXX | XXX  | XXX |
| **long**   	| XXX   | XXX | XXX | - | XXX  | XXX | XXX | XXX  | XXX |
| **float**   	| XXX   | XXX | XXX | XXX | -  | XXX | XXX | XXX  | XXX |
| **double**   	| XXX   | XXX | XXX | XXX | XXX  | - | XXX | XXX  | XXX |
| **boolean**	| XXX   | XXX | XXX | XXX | XXX  | XXX | - | XXX  | XXX |
| **char**   	| XXX   | XXX | XXX | XXX | XXX  | XXX | XXX | -  | XXX |
| **String**   	| XXX   | XXX | XXX | XXX | XXX  | XXX | XXX | XXX  | - |


[01]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L20-L23
[02]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L25-L28
[03]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L30-L33
[04]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L35-L38
[05]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L40-L43
[06]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L45-L48
[07]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L50-L53
[08]: https://github.com/ahmednabil88/java-casting-map/blob/master/src/castingMap/CastingByteTo.java#L55-L57

[10]: https://www.url.com/
[02]: https://www.url.com/

[20]: https://www.url.com/
[21]: https://www.url.com/



