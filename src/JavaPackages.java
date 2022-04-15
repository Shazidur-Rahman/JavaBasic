import mathPackage.MyMath;

public class JavaPackages {
	public static void main(String[] args) {
		MyMath math = new MyMath();
		double a = 10, b = 5;
		System.out.println(a +" - " +b +" = " +math.subtract(a, b));
		System.out.println(a +" + " +b +" = " +math.addition(a,b));
		System.out.println(a +" * " +b +" = " +math.multiply(a,b));
		System.out.println(a +" / " +b +" = " +math.divide(a, b));
		System.out.println("Factorial of a =" +math.factorial((int) a));

	}
}
