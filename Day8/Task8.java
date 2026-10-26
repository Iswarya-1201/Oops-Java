package Day8;
import java.util.Arrays;
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={10,45,30,50};
		int min=Arrays.stream(ar).min().getAsInt();
		int max=Arrays.stream(ar).max().getAsInt();
		System.out.println("maximum "+max);
		System.out.println("minimum "+min);

	}

}
