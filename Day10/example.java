package Day10;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int n=1000/0;;
			System.out.print(n);
		}catch(ArithmeticException e){
			System.out.println(e);
			
		}

	}

}
