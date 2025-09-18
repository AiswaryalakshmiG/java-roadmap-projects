package variables;

public class VariablePractice {
	int globalVariable = 10;

	public static void main(String[] args) {
		VariablePractice scope = new VariablePractice();
		scope.display();
		// System.out.println("Local variable: " + localVariable);
	}

	public void display() {
		int localVariable = 20;
		System.out.println("Global Variable: " + globalVariable);
		System.out.println("local Variable: " + localVariable);
	}

}