package Day4;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob3=new C();
		ob3.display("Iswarya");
		ob3.display(20.9);
		ob3.display(10);
		

	}

}
class A{
	void display(int a){
		System.out.println("from class A");
		
	}
}
class B extends A{
	void display(double b){
		System.out.println("from class B");
		
	}
	
	
}
class C extends B{
	void display(String a){
		System.out.println("from class C");
		
	}
	
	
}

