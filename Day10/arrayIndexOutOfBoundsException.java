package Day10;

public class arrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a[]=new int[5];   
			a[10]=50;
			System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			
		}

	}

}
