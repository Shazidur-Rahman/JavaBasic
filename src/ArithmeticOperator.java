
import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int a,b,result;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the value of a: ");
		a = input.nextInt();
		System.out.print("Enter the value of b: ");
		b = input.nextInt();

		result = a + b; // addition
		System.out.println(" Addition of a+b= "+result);

		result = a-b;
		System.out.println("Subtraction of a-b:  "+result);

		result = a*b;
		System.out.println("Multiplication of a*b:  "+result);

		result = a/b;
		System.out.println("Division of a/b:  "+result);

        result = a%b;
		System.out.print("Modulus of a%b:  "+result);

        input.close();
	}
}
