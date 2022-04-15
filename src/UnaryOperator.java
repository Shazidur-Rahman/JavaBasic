public class UnaryOperator {
	public static void main(String[] args) {
		int var1,var2;

		var1 = 50;
		var2 = -var1; //invert the sign of the value of var1
		System.out.println("var1 = " +var1 +" var2 =" +var2);

		var1 = 50;
		var2 = var1++; //post-increment, store previous value, then increase var1 by 1
		System.out.println("var1 = " +var1 +" var2 =" +var2);

		var1 = 50;
		var2 = ++var1; //pre-increment, increase var1 by 1, then assign to var2
		System.out.println("var1 = " +var1 +" var2 =" +var2);

		var1 = 50;
		var2 = var1--; //post-decrement, store previous value, then decrease var1 by 1
		System.out.println("var1 = " +var1 +" var2 =" +var2);

		var1 = 50;
		var2 = --var1; //pre-decrement, increase var1 by 1, then assign to var2
		System.out.println("var1 = " +var1 +" var2 =" +var2);

		boolean bool1,res;
		bool1 = true;
		res = !bool1;
		System.out.println("the bool1 is : "+bool1 +", the result is: "+res);
	}
}
