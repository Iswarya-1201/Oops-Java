package Day12;

import java.util.HashMap;
import java.util.TreeMap;

public class hashmapsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(3,"Java");
        map.put(1,"Python");
        map.put(2,"C++");
        System.out.println(map);
        TreeMap<Integer,String> sort=new TreeMap<>(map);

        System.out.println(sort);

	}

}
