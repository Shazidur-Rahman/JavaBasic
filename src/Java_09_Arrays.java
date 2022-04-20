import java.util.Scanner;

public class Java_09_Arrays {
	public static void main(String[] args) {

		int[] intArr = {10, 20, 30, 40, 50};
		float[] floatArr = new float[5];
		char[] charArr = new char[5];

		Scanner sc = new Scanner(System.in);

		floatArr[0] = 2.6F;
		floatArr[1] = 2.4F;
		floatArr[2] = 2.77F;
		floatArr[3] = 2.89F;
		floatArr[4] = 2.33F;

		for(int i=0;i<5;i++){
			System.out.print("Enter character for index [" +i +"]: ");
			charArr[i] = sc.next().charAt(0);
		}

		System.out.println("Item of integer array: ");
		for(int i=0;i<5;i++){
			System.out.print(+intArr[i] +", ");
		}
		System.out.println();

		System.out.println("Item of float array: ");
		for(float item: floatArr){      //display array content using for-each loop
			System.out.print(item +", ");
		}
		System.out.println();

		System.out.println("Item of char array: ");
		for(char ch: charArr){
			System.out.print(ch +" ");
		}
		sc.close();
	}
}
