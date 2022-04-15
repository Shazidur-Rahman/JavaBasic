public class JavaBuiltInExceptions {
	public static void main(String[] args) {

		int[] myArray = {10,20,30,40,50};
		String myString = null;

		try {
			System.out.println("The value of myArray[10]: " +myArray[10]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index");
		}

		try {
			System.out.println("Chracter at 5 of the srting: " +myString.charAt(5));
		} catch (NullPointerException e){
			System.out.println("String pointing to null value");
		}

		try {
			int number = Integer.parseInt("ABC");
			System.out.println("Number is: " +number);
		} catch (NumberFormatException e){
			System.out.println("Not Valid Number");
		}
	}
}
