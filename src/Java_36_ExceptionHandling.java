import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_36_ExceptionHandling {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("Enter the number: ");
			int data1 = Integer.parseInt(br.readLine());
			System.out.println("Enter the 2nd number: ");
			int data2 = Integer.parseInt(br.readLine());
			int result = data1/data2;
			System.out.println("result= "+result);
		} catch (ArithmeticException arexcp){
			System.out.println("Dividing by 0 is not allowed.");
			System.out.println("The exception is: " +arexcp);
		} catch ( NumberFormatException  nfe){
			System.out.println("NumberFormatException has taken place ");

		} catch ( IOException ioe) {
			System.out.println("IOException has tacken place " +ioe);
			ioe.printStackTrace();
		}
		finally {//this block always executes
			System.out.println("Operation performed...");
		}
		System.out.println("End of the program...");
	}
}
