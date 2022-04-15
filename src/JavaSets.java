import java.util.HashSet;
import java.util.Set;

public class JavaSets {
	public static void main(String[] args) {
		int[] list1 = {1, 5, 2, 6, 5, 2, 12, 10,6};
		int[] list2 = {12, 4, 3, 2, 4, 15, 7};

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int item: list1){
			set1.add(item);
		}
		for (int item: list2){
			set2.add(item);
		}

		System.out.println("The first set: "+set1);
		System.out.println("The second list: "+set2);

		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Set union: "+union);

		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Set intersection: "+intersection);

		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("The Difference: " +difference);
 	}
}
