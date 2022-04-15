public class ConditonalOperator {
	public static void main(String[] args) {
		boolean bool1,bool2,result;
		bool1 = true;
		bool2 = false;

		result = bool1 || bool2; // a or b one of them true then value is tru
		System.out.println("result: "+result);

		result = bool1 && bool2; //if both true then true
		System.out.println("result: "+result);

	}
}
