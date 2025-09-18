package operators;

public class IncrementDecrementOperator {
public static void main(String[] args) {
	int num1 = 5;
	num1++;
	System.out.println(num1);// postfix
	++num1;
	System.out.println(num1);//prfix
	num1--;
	System.out.println(num1--);
	--num1;
	System.out.println(num1);
}
}
