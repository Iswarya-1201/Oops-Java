package Day12;
import java.util.TreeMap;
public class treemapDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"Java");
        map.put(1,"HTML");

        System.out.println(map);

	}

}
