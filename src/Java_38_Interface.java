package abstraction;
public class Java_38_Interface {
	public static void main(String[] args) {
		MyClass3 ob1 = new MyClass3();
		ob1.myFunction11();
		ob1.myFunction12();
		System.out.println(ob1.myFunction13());
		System.out.println(MyInterface1.myFunction14());
		ob1.myFunction21();
		ob1.myFunction22();
		System.out.println();
		System.out.println("MYCLASS4....");
		System.out.println();

		MyClass4 ob2 =new MyClass4() {
			@Override
			public void myFunction22() {
				System.out.println("myFunction22() is executing with data11= "+data22+".. ");
			}

			@Override
			public void myFunction12() {
				System.out.println("myFunction12() is executing with data11= "+data12+".. ");
			}
		};
		ob2.myFunction11();
		ob2.myFunction12();
		System.out.println(ob2.myFunction13());
		System.out.println(MyInterface1.myFunction14());
		ob2.myFunction21();
		ob2.myFunction22();
		System.out.println();
		System.out.println("Vehicle....");
		System.out.println();

		Bike bike = new Bike();
		Car car = new Car();

		System.out.println("Maximum speed of bike: " +bike.maxSpeed());
		bike.wheelCount();

		System.out.println("Maximum speed of car: " +car.maxSpeed());
		car.wheelCount();
	}
}
