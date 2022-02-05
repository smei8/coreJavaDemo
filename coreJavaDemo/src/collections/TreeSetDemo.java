package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//treeset will sort the elements
		
		Set<String> allNames = new TreeSet<String>();
		
		allNames.add("xyz");
		allNames.add("abc");
		allNames.add("lnm");
		allNames.add("fgh");
		
		System.out.println(allNames);  //it calls the toString method implicitly
		
		
	}

}
