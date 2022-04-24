

public class Java_42_PolymorphismFunctionsOverloading {
	public  static void area(float side) {
		System.out.println("Area of a Square: " +(side * side));
	}
	public static void area (double radius) {
		System.out.println("Area of a circle: " +(3.1416 * radius * radius));
	}
	public static void area (float l, float b) {
		System.out.println("Area of a rectangle: " +(l * b));
	}

	public static void main(String[] args) {
		area(4,5);
		area(5F);
		area(6D);
	}

}
