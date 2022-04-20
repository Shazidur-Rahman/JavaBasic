package abstraction;

public interface Vehicle {
	double maxSpeed();
	void wheelCount();
}
class Bike implements Vehicle {

	int wheel = 2;

	@Override
	public double maxSpeed() {
		return 150;
	}

	@Override
	public void wheelCount() {
		System.out.println("Number of wheels for bike: " +wheel);
	}
}
class Car implements Vehicle{

	int wheel = 4;

	@Override
	public double maxSpeed() {
		return 280;
	}

	@Override
	public void wheelCount() {
		System.out.println("Number of wheels for car: " +wheel);
	}
}
