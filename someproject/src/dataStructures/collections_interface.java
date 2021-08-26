package dataStructures;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class collections_interface {

	public static void main(String [] args) {
		//lists();
		//sets();
		//Maps();
		strings();
	}
	
	int i;
	String S="";
	boolean j;
	double k;
	
	public static void lists() {	//duplicates allowed // insertion order maintained
		//LinkedList al = new LinkedList();
		ArrayList al = new ArrayList();
		Date  d = new Date();
		System.out.println("Lists");
		for(int i=0;i<10;i++) {
		al.add("one");
		al.add("two");
		al.add("three");
		al.add(2);
		al.add(true);
		al.add("four");
		}
		//System.out.println(al);
		System.out.println(d.getTime());
		al.add(1,"four");
		System.out.println(al);
		System.out.println(d.getTime());
		
		
	}
	
public static void sets() {  // no insertion order //duplicates not allowed
		SortedSet al = new TreeSet();
		
		System.out.println("Sets");
		System.out.println(al.add("one"));
		al.add("two");
		al.add("three");
		System.out.println(al.add("four"));
		al.add("five");
		System.out.println(al.add("four"));
		System.out.println(al);
		Iterator i = al.iterator();
		
		while(i.hasNext()) {
		System.out.println(i.next());
		}
}

public static void Maps() {  
	
	//HashMap hm= new HashMap();
	collections_interface ci = new  collections_interface();
	collections_interface ci1 = new  collections_interface();
	collections_interface ci2 = new  collections_interface();
	collections_interface ci3= new  collections_interface();
	
	
	
	HashMap<Integer,collections_interface> hm = new HashMap<Integer, collections_interface>();
	
	
	
	
	System.out.println(hm);
	
	String s =new String();
	
	Integer i = new Integer(7);
	
	Boolean b = new Boolean(true);
	
	Character c;
	c=new Character('i');
	//c='i';
	System.out.println("i"+i);
	
	
	

}
	
public static void strings() {
	
	String str= "sdklgnjsdlkngvlkxdcjmvlkmxd.pjgml/;.r;kepj lsdkjg., b ";
	
	System.out.println("index : "+str+";");
}
	


}
