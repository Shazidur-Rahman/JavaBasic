import java.util.Scanner;

public class Java_02_InputOutput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Your name: ");
		String name = input.nextLine();


		System.out.println("Enter Your age: ");
		int age = input.nextInt();

		System.out.println("Enter a Char");
		char c = input.next().charAt(0);
		input.close();

		System.out.println("your name is : "+name);
		System.out.println("Your age is : "+age);
		System.out.println("your inputed Char is: "+c);

	}
}
