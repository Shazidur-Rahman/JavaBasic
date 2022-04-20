package Java_34_accessSpecifiers;

class A {
	public int x;
	private int y;
	protected int z;

	public A(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	public void display() {
		System.out.println("The value of x: " + x);
		System.out.println("The value of y: " + y);
		System.out.println("The value of z: " + z);
		System.out.println();
	}

}

class B extends A {

		public B(int a, int b, int c) {
			super(a, b, c);
		}
		public void display(){
			System.out.println("The value of x: " +x);
			System.out.println("The value of z: " +z);
			System.out.println();
		}
	}
/*public class accessSpecifier{
	public static void main(String[] args) {
		System.out.println("Data of class B");
		A classB = new B(5,10,15);
		classB.display();

		System.out.println("Data of Class A");
		A classA = new A(12, 24, 36);
		classA.display();

		C classC = new C(3,16,25);
		classC.display();
		classC.p = 9;
		classC.q = 56;
		classC.display();



	}
}*/

