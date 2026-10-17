package Day3;
import java.util.*;
public class Logical_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("enter age: ");
        int age = sc.nextInt();

        System.out.print("enter mark: ");
        int mark = sc.nextInt();

        System.out.println("Eligible: " +(age >= 18 && mark >= 50));
        System.out.println("Eligible: " +(age >= 18 || mark >= 50));
        System.out.println(age !=22);
        

	}

}
