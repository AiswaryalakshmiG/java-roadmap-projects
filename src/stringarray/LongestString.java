package stringarray;

public class LongestString {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "strawberry", "kiwi"};
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
