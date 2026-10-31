package Day12;
import java.util.TreeMap;
public class TreemapNullElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<Integer,String> map=new TreeMap<>();
		 map.put(1,null);
	     map.put(2,null);
	     map.put(3,"Java");
	     System.out.println(map);
	     map.put(null,"Python");

	}

}
