

class ClassA{
	final int finInt;
	protected int myInt;
	public ClassA(int x, int y){
		finInt = x;
		myInt =y;
	}
	public ClassA(){
		this(0,0);
	}
	final public void dispFinal(){
		System.out.println("The value of Final Variable: "+finInt);
	}
	public void dispMyInt(){
		System.out.println("The value of myInt: "+myInt);
	}
}

final class ClassB extends ClassA{
	protected int myInt;
	public void setMyInt(int x) {
		myInt = x;
	}

	public void dispMyInt(){
		System.out.println("The value of myInt for class B: "+myInt);
	}
}

public class Java_18_FinalKeyword {
	public static void main(String[] args) {
		ClassA clA = new ClassA(10,15);
		clA.dispFinal();
		clA.dispMyInt();

		ClassB clB =new ClassB();
		clB.setMyInt(50);
		clB.dispMyInt();
	}
}
