package arrays;
//ArrayDeclaration
public class ArrayDeclaration {

	public static void main(String[] args) {
		int[] mark = new int[5];
		mark[0] =10;
		mark[1] =20;
		mark[2] =30;
		mark[3] =40;
		mark[4] =50;
		
		for(int i=0;i< mark.length; i++) {
			System.out.println("Mark of Index " + i + " is: "+ mark[i]);
		}

	}

}
