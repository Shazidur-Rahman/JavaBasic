import java.util.Scanner;

public class JavaSwitchCaseStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char c = input.next().charAt(0);

		switch (c){
			case 'A':
				System.out.println("You have typed letter A.");
				break;
			case 'B':
				System.out.println("You have typed letter B.");
				break;
			case 'C':
				System.out.println("You have typed letter C.");
				break;
			case 'D':
				System.out.println("You have typed letter D.");
				break;
			case 'E':
				System.out.println("You have typed letter E.");
				break;
			case 'F':
				System.out.println("You have typed letter F.");
				break;
			default:
				System.out.println("other than A-F");
		}
		input.close();
		System.out.println("..End..");
	}
}
