package abstraction;

public class MyClass5 {
	public static void main(String[] args) {
		MyInterface1 ob1 = new MyInterface1() {
			@Override
			public void myFunction11() {
				System.out.println("myFunction11() is executing with data11= "+data11+".. ");
			}

			@Override
			public void myFunction12() {
				System.out.println("myFunction12() is executing with data11= "+data12+".. ");
			}
		};
		ob1.myFunction11();
		ob1.myFunction12();
		System.out.println(ob1.myFunction13());
		System.out.println(MyInterface1.myFunction14());
	}
}
