package operators;

public class ConditionalOperator {
public static void main(String[] args) {
	int tamil = 90, english = 95;
	int max;
    if (tamil > english) {
        max = tamil;
    } else {
        max = english;
    }
    System.out.println("Highest mark = " + max);
    String tamilResult;
    if (tamil >= 40) {
        tamilResult = "Pass";
    } else {
        tamilResult = "Fail";
    }

    String englishResult;
    if (english >= 40) {
        englishResult = "Pass";
    } else {
        englishResult = "Fail";
    }

    System.out.println("Tamil: " + tamilResult);
    System.out.println("English: " + englishResult);
}
}
