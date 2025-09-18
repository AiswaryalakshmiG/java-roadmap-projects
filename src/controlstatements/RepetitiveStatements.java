package controlstatements;

public class RepetitiveStatements {
    public static void main(String[] args) {
    	 int i = 1;
         System.out.println("While Loop:");
         while (i <= 5) {
             System.out.println("Count (while): " + i);
             i++;
         }
         
         
         int j = 1;
         System.out.println("\nDo-While Loop:");
         do {
             System.out.println("Count (do-while): " + j);
             j++;
         } while (j <= 5);
         
         
         
         System.out.println("\nFor Loop:");
         for (int k = 1; k <= 5; k++) {
             System.out.println("Count (for): " + k);
         }
    }
}
