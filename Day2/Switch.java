package Day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the first n1 ");
		 int a = sc.nextInt();
		 System.out.println("enter the secound n2 ");
	     int b = sc.nextInt();
	     System.out.println("choose ");
	     char op = sc.next().charAt(0);

	        switch (op) {
	            case '+':
	                System.out.println(a + b);
	                break;
	            case '-':
	                System.out.println(a - b);
	                break;
	            case '*':
	                System.out.println(a * b);
	                break;
	            case '/':
	                System.out.println(a / b);
	                break;
	            default:
	                System.out.println("Invalid operator");
	        }
		

	}

}
