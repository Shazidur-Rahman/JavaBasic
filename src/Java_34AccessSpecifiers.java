package Java_34_accessSpecifiers;

public class Java_34AccessSpecifiers {
	public static void main(String[] args) {
		System.out.println("Data of class B");
		A classB = new B(5, 10, 15);
		classB.display();

		System.out.println("Data of Class A");
		A classA = new A(12, 24, 36);
		classA.display();

		C classC = new C(3, 16, 25);
		classC.display();
		classC.p = 9;
		classC.q = 250;
		classC.display();
	}
}
