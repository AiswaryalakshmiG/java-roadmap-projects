package datatypes;

public class TypeCastingExample {
	public static void main(String[] args) {
		int number = 130;
		byte smallNumber = (byte) number; // narrowing type cast
		System.out.println("Original int value: " + number);
		System.out.println("After casting to byte: " + smallNumber);
		
		int num2 = 10;
		double num3 = num2; //widening
		
		double num4 = 10.5;
		int num5 = (int)num4; // narrowing
		
		System.out.println("num2 value: " +num2);
		System.out.println("num3 value: " +num3);
		System.out.println("num4 value: " +num4);
		System.out.println("num5 value: " +num5);
		
	}
}
