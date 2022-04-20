public class Java_12_ContinueStatement {
	public static void main(String[] args) {
		int i = 0;

		while (true){
			if (i>=5 && i<=10){
				i++;
				continue;
			}
			System.out.println("The value is: " +i);
			if (i==15)
				break;;
			i++;
		}
		System.out.println("..END..");
	}
}
