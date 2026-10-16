package Day2;

import java.util.Scanner;

public class Else_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
				System.out.print("enter the age  ");
				int ageof=sc.nextInt();
				if(ageof>18){
					System.out.println("Eligible to Vote");
					
				}else{
					System.out.println("not Eligible to Vote");
				}

	}

}
