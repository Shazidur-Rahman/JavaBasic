import java.util.*;

public class Java_22_EnumerationAndIterators {
	public static void main(String[] args) {
		String[] wordArr = {"Book", "Number", "Place", "Lemon", "Apple", "Tree"};

		Vector<String> wordList = new Vector<>(Arrays.asList(wordArr)); //directly convert array to vector

		System.out.println("\nThe word list: \n"+wordList +"\n");

		Enumeration<String> vectorEnum = wordList.elements();//enumeration iteration through vector

		while (vectorEnum.hasMoreElements()){
			System.out.println(vectorEnum.nextElement());
		}

		LinkedList<String> wordLinkedList = new LinkedList<>();
		wordLinkedList.addAll(wordList);//add all from vector to linked list

		wordLinkedList.add("Ball");
		wordLinkedList.add("Mango");

		System.out.println("\nThe word list (Linked list): \n"+wordLinkedList+"\n");

		Iterator<String> it = wordLinkedList.iterator();//point element of the linked list

		while (it.hasNext()){
			System.out.println(it.next());
		}


	}
}
