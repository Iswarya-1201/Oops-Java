package Day2;

import java.util.Scanner;

public class Number_Div_By5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3
		Scanner sc=new Scanner (System.in);
				System.out.println("enter the number div by 5 ");
				int div=sc.nextInt();
				if(div%5==0){
					System.out.println("divisible by 5  "+div);
					
				}else{
					System.out.println("not divisible by 5");
				}

	}

}
