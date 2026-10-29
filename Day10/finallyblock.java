package Day10;

public class finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int n=1000/0;;
			System.out.println(n);
		}catch(ArithmeticException e){
			System.out.println(e);
			
		}finally{
			System.out.println("thankyou");
		}

	}

}
