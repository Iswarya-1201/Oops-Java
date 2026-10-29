package Day10;

public class StringIExeception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
			 String s="java";
	            System.out.println(s.charAt(5));
	        }
	        catch(StringIndexOutOfBoundsException e){
	            System.out.println("String index is out of bounds");
	        }

	}

}
