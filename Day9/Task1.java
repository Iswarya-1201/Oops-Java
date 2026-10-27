package Day9;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("enter username: ");
        String username = sc.nextLine();

        int length = username.length();
        boolean space = username.contains(" ");

        System.out.println("Username: " + username);
        System.out.println("Length: " + length);
        System.out.println("Contains spaces: " + (space ? "Yes" : "No"));

        if(length>=5&&!space) {
            System.out.println("Username status: Valid");
        } else {
            System.out.println("Username status: Invalid");
        }

	}

}
