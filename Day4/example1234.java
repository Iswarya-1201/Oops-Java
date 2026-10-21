package Day4;
import java.util.*;
public class example1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//single
		//father ob=new father();
		//ob.bike();
		
		//multilevel
		//son ob=new son();
		//ob.grandfatherbike();
		
		//hierachical
		//child1 ob1=new child1();
		//ob1.fatherbike();
		//ob1.oldcycle();
		//System.out.println(ob1.amount);
		//System.out.println();
		
		//child2 ob2=new child2();
		//ob2.fatherbike();
		//ob2.newcycle();
		//System.out.println(ob2.amount);
		
		low ob1=new low();
		ob1.display();
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
//single inher=one parent,one child
//multilevel inher=one grandparent,parent,child
class grandfather{
	int amount=10000;//property
	void grandfatherbike(){
		System.out.println("grandfather bike");
	}
	void grandfathercar(){
		System.out.println("grandfather car");
	}
	
}
class father extends grandfather{
	int amount=10000;//property
	void fatherbike(){
		System.out.println("father bike");
	}
	void fathercar(){
		System.out.println("father's car");
	}
	
}
class son extends father{
	int amount=5000;
	void cycle(){
		System.out.println("sons cycle");
	}
	
}
class father1{
	int amount=10000;//property
	void fatherbike(){
		System.out.println("father bike");
	}
	void fathercar(){
		System.out.println("father's car");
	}
	
}
class child1 extends father1{
	void oldcycle(){
		System.out.println("child 1 cycle");
	}
	
}
class child2 extends father1{
	void newcycle(){
		System.out.println("child 2 cycle");
	}
	
}


class high{
	int amount=10000;
	void display(){
		System.out.println("from high ");
		
	}
	
}
class low extends high {
    int amount = 20000;

    void display() {
        System.out.println("from low");

        super.display();
        System.out.println(super.amount);
        System.out.println(this.amount);
    }
}






