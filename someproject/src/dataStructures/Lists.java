package dataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lists {

	
	public static void main(String[] args) {
		Listed();

	}

	public static void Listed() {
	Set<String> set = new HashSet<String>();
	set.add("Java");
	set.add("Python");
	set.add("Selenium");
	set.add("SIP");
	
	System.out.println("set : "+set);
		
	Iterator<String> i = set.iterator();
	System.out.println(i.next().hashCode());
	System.out.println(i.next().hashCode());
	System.out.println(i.next().hashCode());
	System.out.println(i.next().hashCode());
	
	
	}
	
}
