import java.util.Scanner;

public class Java_17_String {
	public static void main(String[] args) {
		char[] charString = {'S', 't', 'r', 'i', 'n', 'g'};
		Scanner input = new Scanner(System.in);

		String str = new String(charString);
		System.out.println("The value of String is: "+str);

		System.out.println("......user input.....");
		System.out.println("Enter String: ");
		str = input.next();
		System.out.println("The value of String is: "+str);

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter String: ");
		str = inp.nextLine();
		System.out.println("The value of String is: "+str);

		str = "JAVA String";
		System.out.println("The value of String is: "+str);

		str = "String" + " " + "Concatenate";
		System.out.println("The value of String is: "+str);

		input.close();
		inp.close();
	}
}
