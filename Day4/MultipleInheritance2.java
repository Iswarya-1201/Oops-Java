package Day4;

public class MultipleInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount ob1=new SavingsAccount();
		ob1.display();
		System.out.println();
		CurrentAccount ob2=new CurrentAccount();
		ob2.display();

	}

}
class Bankaccount {
    int accountNumber;
    int balance;
}
class SavingsAccount extends Bankaccount{ 
	void display(){
	System.out.println("Savings Account");
	accountNumber= 1001;
	balance=25000;
	System.out.println(accountNumber);
	System.out.println(balance);
	}
}
class CurrentAccount extends Bankaccount{
	void display(){
		System.out.println("Current Account");
		accountNumber= 1002;
		balance=50000;
		System.out.println(accountNumber);
		System.out.println(balance);
		
		}
}
