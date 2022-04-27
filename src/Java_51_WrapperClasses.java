public class Java_51_WrapperClasses {
	public static void main(String[] args) {

		int val = 10;
		int res;
		Integer integer = new Integer(val);

		res = integer.intValue();
		System.out.println("The value of res: " +res);

		Integer myInt = 50;
		System.out.println("the valu of myInt: " +myInt);

		res = Integer.parseInt("123");
		System.out.println("The value of res after increasing: " + ++res);

		res = Integer.parseInt("FE", 16);
		System.out.println("the value of res: " +res);

		System.out.println("The binary of 91: " +Long.toBinaryString(91));
		System.out.println("The hexadecimal of 91: " +Long.toHexString(91));

		String intString = integer.toString();
		System.out.println("The value of intString: " +intString);

	}
}
