public class Java_11_BreakStatement {
	public static void main(String[] args) {
		int i = 0;
		while (true){
			System.out.println(" Value is: "+i);
			if (i == 10) {
				break;
			}
		i++;
		}
		System.out.println("..End..");
	}
}
