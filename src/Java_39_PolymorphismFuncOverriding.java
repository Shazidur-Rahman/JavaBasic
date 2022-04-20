package inheritance;

public class Java_39_PolymorphismFuncOverriding{
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.movement();

		animal = new Dog();
		animal.movement();

		animal = new Frog();
		animal.movement();
	}
}
