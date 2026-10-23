
package Day6;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phonepay ob=new phonepay();
		System.out.println(ob.getName());
		ob.setBalance(20000);
		System.out.println(ob.getBalance());

	}

}
class hdfc{
	private final int accountNumber=101;
	private final  String name="ishu";
	private final String accounttype ="Saving account";
	private final String gmail="ishu@gmail.com";
	private int balance=10000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance += balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public String getGmail() {
		return gmail;
	}
	
	
}
class phonepay extends hdfc{
	
}

