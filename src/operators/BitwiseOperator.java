package operators;

public class BitwiseOperator {
public static void main(String[] args) {
	int num1 = 5;//0101
	int num2 = 3;//0011
	
	System.out.println(num1&num2);//0001 -1
	System.out.println(num1|num2);//0111 -7
	System.out.println(num1^num2);//0110 -6
	System.out.println(~num1);//2's complement - -6
	System.out.println(num1<<1);//1010 -10
	System.out.println(num1>>1);//0010 -2
}
}
