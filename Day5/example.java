package Day5;
import java.util.*;
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son ob=new son();
		son ob1=new son(10);
		son ob2=new son("ishu");
		ob.display();

	}

}
class father{
	father(){
		System.out.println("default con");
		
	}
	//constructor overloading. we cannot archive the constructors overriding because constructors are not inherited logically not possible 
	father(String a){
		System.out.println(" para con "+a);
	}
	father(int a){
		System.out.println(" para con "+a);
		
	}
}
class son extends father{
	
	son(){
		super();	
		System.out.println("son class con");	
	}
	son(int a){
		super(a);
		System.out.println("son class para con");
			
	}
	son(String a){
		super(a);
		System.out.println("son class para con");		
	}
	
	void display(){
		System.out.println("son class method");
		
		
		
		
	}
	
	
}
