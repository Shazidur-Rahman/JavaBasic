
class Employee{
	protected double salary = 30000D;
	public Employee(){
		System.out.println("This is constructor of Employee Class");
	}
}
class Developer extends Employee{
	double bonus = 10000D;

	public Developer(){
		System.out.println("This is contructor od Developer class");
	}
	public void displaySalary(){
		System.out.println("The salary is : "+(salary+bonus)+("\n"));
	}
}

class Tester extends Employee{
	double bonus = 20000;

	public Tester(){
		System.out.println("This is a constructor of tester class");
	}
	public void displaySalary(){
		System.out.println("The salary is :" +(salary+bonus) +"\n");
	}
}

public class JavaInheritance {
	public static void main(String[] args) {

		Developer dev = new Developer();
		dev.displaySalary();

		Tester tester = new Tester();
		tester.displaySalary();
	}
}
