package methods;

public class MethodExample {
	 // Method with no return and no parameters
    public static void greet() {
        System.out.println("Hello! Welcome to Java.");
    }
    
    // Method with parameters
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    
    // Method with return type
    public static int multiply(int x, int y) {
        return x * y;
    }
    
    public static void main(String[] args) {
        // Call method with no parameters
        greet();
        
        // Call method with parameters
        printSum(5, 10);
        
        // Call method with return
        int result = multiply(4, 6);
        System.out.println("Multiplication: " + result);
    }
}
