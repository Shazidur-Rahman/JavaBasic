package inheritance;

class Animal {
	public void movement(){
		System.out.println("Animal can move.");
	}
}
class Dog extends Animal{
	@Override
	public void movement() {
		System.out.println("Dog can walk and run also.\n");
	}
}
class Frog extends Animal{
	@Override
	public void movement() {
		System.out.println("Calling movement method of parent class");
		super.movement();
		System.out.println("Frog can jump");
	}
}