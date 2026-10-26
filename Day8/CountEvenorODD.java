package Day8;

public class CountEvenorODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {12,7,24,9,15,30,18,5};
		int even = 0;
		int odd =0;
		for(int i=0;i<numbers.length;i++){
		            if(numbers[i]%2==0){
		                even++;
		            } else {
		                odd++;
		            }
		        }
              System.out.println("Even Numbers Count: " + even);
		      System.out.println("Odd Numbers Count: " + odd);
		    }
		

}
