import  java.util.*;
public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();

		//add item to array list
		cityList.add("Dhaka");
		cityList.add("Khulna");
		cityList.add("Barishal");
		cityList.add("Chitagang");
		cityList.add("Jashore");
		cityList.add("Delhi");

		System.out.println("The size of the array list: "+cityList.size());

		System.out.println("Cities: "+cityList);

		for (String city: cityList){
			System.out.println(city);
		}

		cityList.add(2,"Kolkata"); //add city in 2 number position

		System.out.println("Cities: "+cityList);

		System.out.println("The size of the array list: "+cityList.size());
	}
}
