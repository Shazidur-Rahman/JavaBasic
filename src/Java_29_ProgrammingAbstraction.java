
abstract class Emp{ //no object can be generated from abstract class
	public void description(){
		System.out.print("It is an employee");
	}                        //abstract method has no body
	abstract void salary(); //abstract class must have an abstract method
}
class Programmer extends  Emp{
	@Override
	public void description() {
		System.out.println("It is a Programmer");
	}

	@Override
	void salary() {  // must be define in child class
		System.out.println("Salary of the programmer 25000");
	}
}

class TesterEmp extends Emp{
	@Override
	public void description() {
		super.description();//call description of parent class
		System.out.println(" Works as a tester");
	}

	@Override
	void salary() {
		System.out.println("Salary of tester 30000");
	}
}

public class Java_29_ProgrammingAbstraction {
	public static void main(String[] args) {
		Emp e = new Programmer();
		e.description();
		e.salary();

		e = new TesterEmp();
		e.description();
		e.salary();
	}

}
