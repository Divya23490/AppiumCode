package Loops;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("Sumit");
		arr.add("Ashima");
		arr.add("Divya");
		Iterator itr=arr.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		arr.remove(0);
		for(String var:arr){
			System.out.println(var);
		}

	}

}
