package Loops;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(100, "Ashima");
		hm.put(101, "Divya");
		for(Map.Entry<Integer, String> m: hm.entrySet()){
			System.out.println(m.getKey()+" " + m.getValue());
			
		}
				

	}

}
