package Day10;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Inputmismatcherror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Age: " + age);
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }
		

	}

}
