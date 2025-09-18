package strings;

public class StringExample {
	public static void main(String[] args) {
        String name = "Aiswaryalakshmi";
        System.out.println("My name is: " + name);
        
        int len = name.length();
        System.out.println("Length of name: " + len);
        
        String upper = name.toUpperCase();
        System.out.println("Uppercase: " + upper);
        
        String lower = name.toLowerCase();
        System.out.println("Lowercase: " + lower);
        
        // Get a character at index
        char ch = name.charAt(3); 
        System.out.println("Character at index 3: " + ch);
        
        // string contains a word
        boolean hasWord = name.contains("lakshmi");
        System.out.println("Contains 'lakshmi'? " + hasWord);
        
        // Compare strings
        String otherName = "Aishu";
        boolean same = name.equals(otherName);
        System.out.println("Is name same as otherName? " + same);
        
        //  Concatenate strings
        String fullName = name + " G";
        System.out.println("Full name: " + fullName);
    }
}
