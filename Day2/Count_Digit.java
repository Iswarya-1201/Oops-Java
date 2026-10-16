package Day2;

public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
        for (int n = 123456; n > 0; n = n / 10) {
            count++;
        }

        System.out.println("Number of digits: " + count);

	}
	}


