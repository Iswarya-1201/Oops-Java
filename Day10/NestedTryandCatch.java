package Day10;

public class NestedTryandCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String a=null;
			System.out.println(a.length());
			try{
				String s="value";   
				int i=Integer.parseInt(s);
			System.out.println(i);
			}catch(NumberFormatException  e){
				System.out.println(e);
				
			}
			
		}catch(NullPointerException e){
			System.out.println(e);
			

	}
		finally{
			System.out.println("completed");
		}

}

	
}