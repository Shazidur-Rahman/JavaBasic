package mathPackage;

public class MyMath {
	public double subtract(double a, double b){
		return a-b;
	}
	public double multiply(double a, double b){
		return a*b;
	}
	public double divide(double a, double b){
		return a/b;
	}
	public double addition(double a, double b){
		return a+b;
	}
	public long factorial(int num){
		if (num <= 1)
			return num;
		return num * factorial(num - 1);
	}
}
