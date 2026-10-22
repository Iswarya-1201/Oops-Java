package Day5;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp ob=new peremp();
		ob.calsalary("peremp");
		System.out.println();
	    emp ob1=new conemp();
		ob1.calsalary("conemp");
		

	}

}
class emp{
	int empid=1;
	String name="ishu";
	int bs=10000;
	 void calsalary(String a){
		 
		 
	 }
	
}
class peremp extends emp{
	void calsalary(String a){
		System.out.println("permanent");
		int allow=(super.bs*20)/100;
		System.out.println(bs+allow);
		 
	 }
	
}
class conemp extends emp{
	void calsalary(String a){
		int fixbonus=2000;
		System.out.println("contract class ");
		System.out.println(super.bs+fixbonus);
		
		 
	 }
	
}
