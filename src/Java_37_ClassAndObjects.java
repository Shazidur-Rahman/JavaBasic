
class Student1{
	String name;
	int id;
	String major;

	public void setName(String name) {
		this.name = name;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	void display(){
		System.out.println("The Student name: " +name);
		System.out.println("Student id: " +id);
		System.out.println("Major subject: " +major);
		System.out.println();
	}
}
public class Java_37_ClassAndObjects {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.setMajor("Joy");
		s1.id = 1022;
		s1.setMajor("Computer Science");

		s2.setName("Roy");
		s2.id = 1232;
		s2.setMajor("Physics");

		s1.display();;
		s2.display();
	}
}
