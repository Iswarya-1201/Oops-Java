package Day10;

public class throwkeyword {
	public void vote(int age){
		if(age<18){
			throw new ArithmeticException("not valid");
			
		}else{
			System.out.println("welcome to vote");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwkeyword ob=new throwkeyword();
		ob.vote(18);
		

	}

}
