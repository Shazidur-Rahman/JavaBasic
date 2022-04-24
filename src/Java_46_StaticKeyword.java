
class staticDemo{

	static int staticVar;
	int var;

	public staticDemo(){
		var = 0;
	}

	public static void setStaticVar(int i){
		staticVar = 0; //static method only access static variable
	}

	public void increase(){
		staticVar++;
		var++;
	}

	public void display(){
		System.out.println(" The value of Static variable: "+staticVar);
		System.out.println(" The value of Non-Static variable: "+var);
		System.out.println();
	}
}

public class Java_46_StaticKeyword {
	public static void main(String[] args) {
		staticDemo s1 = new staticDemo();
		staticDemo s2 = new staticDemo();

		s1.increase();
		s1.increase();
		s1.display();

		s2.increase();
		s2.increase();
		s2.increase();
		s2.display();

		staticDemo.setStaticVar(50);
		System.out.println("Static var: "+staticDemo.staticVar);
		s1.setStaticVar(51);
		System.out.println("Static var: "+staticDemo.staticVar);
		s2.setStaticVar(52);
		System.out.println("Static var: "+staticDemo.staticVar);


	}
}
