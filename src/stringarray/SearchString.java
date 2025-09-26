package stringarray;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter color to search: ");
        String search = sc.nextLine();

        boolean found = false;
        for (String color : colors) {
            if (color.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is found in array.");
        } else {
            System.out.println(search + " is not found in array.");
        }
    }
}
