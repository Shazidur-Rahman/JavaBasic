public class Java_49_StringFunctions {
	public static void main(String[] args) {
		String str1 = "HELLO", str2 = "Hello";

		System.out.println("The length of The string : " +str1 +" is: " +str1.length());

		if (str1.equals(str2))
			System.out.println(str1 +" & " +str2 +" are same.");
		else
			System.out.println(str1 +" & " +str2 +" are not same.");

		if (str1.equalsIgnoreCase(str2))
			System.out.println(str1 +" & " +str2 +" are same(ignoring case).");
		else
			System.out.println(str1 +" & " +str2 +" are not same.(ignoring case)");

		System.out.println("The character at position 2 is: " +str1.charAt(2));

		System.out.println("Comparing " +str1 +" & " +str2 +" Distance: " +str1.compareTo(str2));

		str1 = "AABBCABBAA";
		str2 = "JAVA String Function";

		System.out.println("The string " +str1 +" is start with (AAB) : " +str1.startsWith("AAB"));
		System.out.println("The string " +str1 +" is end with (ACA) : " +str1.endsWith("ACA"));

		System.out.println("First index of (BB) in " +str1 +" is: " +str1.indexOf("BB"));
		System.out.println("Last index of (BB) in " +str1 +" is: " +str1.lastIndexOf("BB"));

		System.out.println("Replacing (ABB) to (xy) of " +str1 +" is: " +str1.replace("ABB", "xy"));
		System.out.println("Substring of " +str2 +" from 5 to 15: " +str2.substring(5,11));

		str1 = "This-is-a-test-string";
		String[] splitArr = str1.split("-");

		System.out.println("the splitted parts are: ");
		for (String sp : splitArr){
			System.out.println(sp);
		}
		str2 = "         Lot's Of Spaces            ";
		System.out.println("Before trimming: (" +str2 +")");
		System.out.println("After trimming: (" +str2.trim() +")");

	}
}
