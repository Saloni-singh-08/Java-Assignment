publicpublic class Defaultvalues
{
	static byte byteVar;
	static short shortVar;
	static int intVar;
	static long longVar;
	static float floatVar;
	static double doubleVar;
	static char charVar;
	static boolean booleanVar;

	public static void main(String[] args)
	{
		System.out.println("Default values and sizes of primitive datatypes");
		System.out.println("byte: Default =" +bytevar +",Size =" +Byte.BYTES +"bytes");
		System.out.println("short: Default =" +shortvar +",Size =" +short.BYTES +"bytes");
		System.out.println("int: Default =" +intvar +",Size =" +int.BYTES +"bytes");
		System.out.println("long: Default =" +longvar +",Size =" +long.BYTES +"bytes");
		System.out.println("float: Default =" +floatvar +",Size =" +float.BYTES +"bytes");
		System.out.println("double: Default =" +doublevar +",Size =" +double.BYTES +"bytes");
		System.out.println("char: Default =" +(int) charvar +"(as int),Size =" +character.BYTES +"bytes");
		System.out.println("boolean: Default =" +booleanvar +",Size =" JVM Dependent");
	}
}