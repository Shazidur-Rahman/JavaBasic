import java.util.ArrayList;
import java.util.Comparator;

class stringCompare implements Comparator<String>{
	public int compare(String str1, String str2){
		return  str1.compareTo(str2);
	}
}


public class JavaComparatorToSort {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();

		cityList.add("Delhi");
		cityList.add("Dhaka");
		cityList.add("Jashore");
		cityList.add("Khulna");
		cityList.add("Barishal");

		System.out.println("Cities Unsorted: "+cityList);

		cityList.sort(new stringCompare());
		System.out.println("Cities sorted: " +cityList);


	}
}
