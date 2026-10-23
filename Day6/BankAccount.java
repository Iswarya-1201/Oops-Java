package Day6;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 bankaccount1 ob = new bankaccount1(101, "Ravi", 10000);

	        System.out.println("Accountholder: " + ob.getaccounthol());
	        System.out.print("Initialbalance: " + ob.getbalance());

	        ob.deposit(2000);
	        ob.withdraw(3000);

	        System.out.print("Available Balance: " + ob.getbalance());

	        ob.withdraw(10000);
	}

}
class bankaccount1 {
    private int accountnum;
    private String accountHol;
    private double balance;
    bankaccount1(int accountnum, String accountHol, double balance) {
        this.accountnum = accountnum;
        this.accountHol = accountHol;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("deposit amount: " + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("insufficient balance");
        } else if (amount > 0) {
            balance = balance - amount;
            System.out.println("withdrawal amount: " + amount);
        }
    }
    public double getbalance() {
        return balance;
    }

    public String getaccounthol() {
        return accountHol;
    }
}