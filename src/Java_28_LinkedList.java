import java.util.ArrayList;
import java.util.LinkedList;

public class Java_28_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> intList =new LinkedList<>();

		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);

		System.out.println("The linked list size: " +intList.size() +"\ncontent: " +intList +("\n"));

		int[] array ={5,15,60,30,80,25};
		ArrayList<Integer> arrList =new ArrayList<>();
		for (int item: array){
			arrList.add(item);
		}

		System.out.println("The Array list size: " +arrList.size() +"\ncontent: " +arrList +("\n"));

		intList.addAll(2,arrList);
		System.out.println("The linked list size: " +intList.size() +"\ncontent: " +intList +("\n"));
	}
}
