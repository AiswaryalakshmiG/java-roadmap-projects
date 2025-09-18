package operators;

public class LogicalOperator {
public static void main(String[] args) {
	int age = 23;
	boolean hasVoterId = true;
	System.out.println(age >= 18 && hasVoterId);//conditional operator
	System.out.println(age >=18 || hasVoterId);
	System.out.println(!(hasVoterId));
}
}
