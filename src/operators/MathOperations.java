package operators;

public class MathOperations {
public static void main(String[] args) {
	int a= 20, b=6;
	double power = Math.pow(a, b);
    double squareRoot = Math.sqrt(a);
    int maximum = Math.max(a, b);
    int minimum = Math.min(a, b);
    double randomNumber = Math.random();
    
    System.out.println("Power (a^b): " + power);
    System.out.println("Square Root of a: " + squareRoot);
    System.out.println("Maximum: " + maximum);
    System.out.println("Minimum: " + minimum);
    System.out.println("Random Number: " + randomNumber);
    }
}
