public class JavaFunctions {

	public static int add(int a, int b){ //user define function
		int sum;
		sum = a + b;
		return sum;
	}

	public static int factorial(int num){
		if(num<=1)
			return num;
	return num * factorial(num-1);
	}

	public static void main(String[] args) {

		int num = 5, res;
		res =(int) Math.pow(num,3); //pre define function
		System.out.println(num +"^3 : "+res);

		res = add(15,20);
		System.out.println("Result: "+res);

		System.out.println("The value of 6! = " +factorial(6));

	}
}
