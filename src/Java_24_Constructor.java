
class Account{
	private String name;
	private String accNo;
	protected double balance;

	public Account(){
		name="";
		accNo="";
		balance=0.0;
	}

	public Account(String name, String accNo, double balance){
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}

	public void setDetails(String name, String accNo){
		this.name = name;
		this.accNo = accNo;
	}

	public void setMoney(double balance){
		this.balance += balance;
	}

	public void getDetails(){
		System.out.println("Name of Account holder: " +name);
		System.out.println("Account number: " +accNo);
		System.out.println("Balance: " +balance);
		System.out.println();
	}
}


public class Java_24_Constructor {
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account("Jhon", "01234", 20000);

		acc1.setDetails("Rabby", "01123");
		acc1.setMoney(12000);

		System.out.println("Details of account 1");
		acc1.getDetails();

		System.out.println("details od account 2");
		acc2.getDetails();
	}
}
