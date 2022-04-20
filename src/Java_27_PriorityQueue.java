import java.util.Iterator;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{

	private int rank;
	private String name;
	public Student(String name, int rank){
		this.name = name;
		this.rank = rank;
	}

	@Override
	public int compareTo(Student st) {
		if (rank < st.rank)
			return -1;
		else if (rank > st.rank)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Student name: " + name + ", rank= " + rank ;
	}
}

public class Java_27_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Student> studentsQ = new PriorityQueue<>();

		studentsQ.add(new Student("Akash", 5));
		studentsQ.add(new Student("Rabby", 3));
		studentsQ.add(new Student("Manish", 1));
		studentsQ.add(new Student("Sami", 2));

		System.out.println("Size of the queue: "+studentsQ.size());

		Iterator<Student> it = studentsQ.iterator();
		while (it.hasNext()){
			System.out.println("The item of the queue: "+studentsQ.poll().toString());
		}
	}
}
