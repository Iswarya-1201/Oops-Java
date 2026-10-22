package Day5;

public class staticandfinal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//1
		child ob=new child();
		ob.car();//car method we can call but we cannot change value
		
		//2
		childs ob1=new childs();
		//ob1.car();  cannot access because it is private only that class access the method
		
		b.car();

	}

}
//1
class parent{
	final void car(){
		System.out.println("car from  parent");
	}
}
class child extends parent{
	
	
}

//2
class parents{
	private final void car(){
		System.out.println("car from  parent");
	}
}
class childs extends parents{
	
	
	
}
//3
/*
final class A{
	private final void car(){
		System.out.print("car from  parent");
	}
}
class B extends A{
	
	
	
}
*/

//4

class a{
	private final void car(){
		System.out.println("car from  parent");
	}
}
class b extends a{
	static void car(){ 
		System.out.println("without creating object calling");
	}
	
	
	
	
}




