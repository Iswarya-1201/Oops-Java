package Day6;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pizzares ob=new pizzares();
		
		ob.displaymenu();
		ob.caculatebill();
		System.out.println();
		
		burger ob1=new burger();
		
		ob1.displaymenu();
		ob.caculatebill();

	}

}
abstract class restaruant{
	abstract void displaymenu();
	abstract void caculatebill();
	
	
}
class pizzares extends restaruant{
	

	@Override
	void displaymenu() {
		
		// TODO Auto-generated method stub
		System.out.println("pizzares restaruant");
		System.out.println("1.pizza - 200");
		System.out.println("2.burger - 100");
		
	}

	@Override
	void caculatebill() {
		// TODO Auto-generated method stub
		int pizza =200;
		int burger=100;
		System.out.println("total bill at pizza restaruant "+(pizza +burger));
	}
	
}
class burger extends restaruant{
	

	@Override
	void displaymenu() {
		// TODO Auto-generated method stub
		System.out.println("burger restaruant");
		System.out.println("1.veg pizza - 200");
		System.out.println("2.veg burger - 100");
		
	}

	@Override
	void caculatebill() {
		// TODO Auto-generated method stub
		int vegpizza =210;
		int vegburger=110;
		System.out.println("total bill at burger restaruant "+(vegpizza+vegburger));
		
		
	}
	
}
