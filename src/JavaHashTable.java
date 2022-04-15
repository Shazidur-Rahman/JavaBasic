import java.util.Hashtable;

public class JavaHashTable {
	public static void main(String[] args) {
		Hashtable<String, Integer> stHash = new Hashtable<>();

		stHash.put("Ayan", 65);
		stHash.put("Dipak", 80);
		stHash.put("Joy", 55);
		stHash.put("Rayan", 75);
		stHash.put("Roy", 70);

		System.out.println("The Student Hash table: \n" +stHash +"\n");

		String maxKey = "";
		int maxMark = 0;

		for (String key: stHash.keySet()){
			if(maxMark < stHash.get(key)){
				maxKey = key;
				maxMark = stHash.get(key);
			}
		}
		System.out.println("The Student "+maxKey+ " got highest marks, marks: " +maxMark);
	}
}
