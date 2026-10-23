package Day6;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class RBI{//cannot create object
	private  final void deposit(){
		System.out.println("deposit method");
	}
	private  final void withdrawal(){
		System.out.println("withdrawel method");
	}
	
	abstract void educationloan();//unimplemented or abstract
	abstract void agriloan();
}
class SBI extends RBI{
	
	@Override
	void educationloan() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void agriloan() {
		// TODO Auto-generated method stub
		
	}
	
	void carloan(){
		System.out.println("withdrawel method");
	}
	void housingloan(){
		System.out.println("withdrawel method");
	}
	
	
}


