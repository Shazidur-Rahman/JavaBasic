
class BelowAgeException extends Exception{
	BelowAgeException(){
		super("Age is under 18");
	}
}

class Application{
	private String name;
	private String course;
	private int age;
	Application(String name, String course){
		this.name = name;
		this.course = course;
		age = 18;
	}
	public Application(){
		this("","");
	}
	public void setAge(int age) throws BelowAgeException{
		if (age < 18)
			throw new BelowAgeException();
		else
			this.age = age;
	}
	public void display(){
		System.out.println("Name of the student: " +name);
		System.out.println("Applied for: " +course);
		System.out.println("Application Age: " +age);
		System.out.println();
	}
}

public class Java_48_UserDefinedExceptions {
	public static void main(String[] args) {
		Application ap1 = new Application("Jhon", "Java Programming");
		Application ap2 = new Application("Rabby", "Operating System");

		ap1.display();
		try {
			ap2.setAge(17);
		}catch (BelowAgeException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
