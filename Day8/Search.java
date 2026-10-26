package Day8;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] rollNumbers={101,102,103,104,105,106};
	     int searchNumber=104;
	     boolean found=false;
	     for(int i=0;i<rollNumbers.length;i++){
	            if(rollNumbers[i]==searchNumber){
	                System.out.println("roll number found");
	                System.out.println("position: " + (i + 1));
	                found = true;
	                break;
	            }
	        }

	        if(!found){
	            System.out.println("Roll Number Not Found");
	        }

	}

}
