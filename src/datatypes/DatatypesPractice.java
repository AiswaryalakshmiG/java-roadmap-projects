package datatypes;

public class DatatypesPractice {
	public static void main(String[] args){
		//diff between float and double
		float f = 3.145926f;
		double d = 3.145626;
		System.out.println("Float Value: "+ f);
		System.out.println("Double Value: "+ d);
		//String length
		String name= "Aiswaryalakshmi";
		System.out.println("Length of name: "+ name.length());
		//Narrowing conversion
		double d3 = 123.456;
		int i = (int) d3;    // double → int
		byte b = (byte) i;   // int → byte
		System.out.println("Narrowing conversion: double=" + d3 + ", int=" + i + ", byte=" + b);
		//Char to ASCII
		char c ='A';
		int ascii = (int)c;
		System.out.println("Character: " + c + ", ASCII value: " + ascii);

		}
}
