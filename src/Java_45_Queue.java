import java.util.LinkedList;
import java.util.Queue;

public class Java_45_Queue {
	public static void main(String[] args) {
		Queue <Integer> q = new LinkedList<Integer>();

		q.add(10);
		q.add(40);
		q.add(30);
		q.add(10);
		q.add(20);
		q.add(50);

		System.out.println("Queue size: " +q.size());
		System.out.println("1st Element of queue: " +q.peek());

		while (!q.isEmpty()){
			System.out.println("Pooped Item: " +q.remove());
		}
	}
}
