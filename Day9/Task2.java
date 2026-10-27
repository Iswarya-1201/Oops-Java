package Day9;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("enter email: ");
        String email=sc.nextLine();

        int at=email.indexOf("@");
        int dot=email.lastIndexOf(".");

        String username=email.substring(0,at);
        String domain=email.substring(at+1);

        System.out.println("Username: "+username);
        System.out.println("Domain: "+domain);


	}

}
