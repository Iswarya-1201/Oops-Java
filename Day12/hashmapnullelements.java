package Day12;
import java.util.*;
public class hashmapnullelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map = new HashMap<>();

	        map.put(null,"Java");
	        map.put(1,null);
	        map.put(2,null);
	        map.put(3,"Python");

	        System.out.println(map);

	}

}
