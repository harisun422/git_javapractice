package dataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collexion {

	
	public static void main(String[] args) {
		common();
		Treesets();
		Sets();
//		LinkedHashSets();
//		Lists();
//		HashMaps();
//		LinkedHashMaps();
	}

	
	public static void common() {
		ArrayList<String> l1 = new ArrayList();
		ArrayList l2 = new ArrayList();
		l2.add("Happy");
		l2.add("Travel");
		ArrayList<String> l3 = new ArrayList();
		l3.add("test");
		l3.add("test");
		
		l1.add("asdf");
		l1.add("1");
		int a[] ={1,2,3,4,};
		//l1.add(a);
		l1.addAll(l2);
		l1.addAll(l3);
		l2.add(l1.clone());
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));
		System.out.println(l1.get(2));
		System.out.println(l1);
		System.out.println(l1.removeAll(l3));
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l2.size());
	}
	
	public static void Treesets() {
		TreeSet<String> l1 = new TreeSet<String>();
		
		
		l1.add("Treeset");
		l1.add("1");
		int a[] ={9,5,8,7,4,};
		//l1.add(a);
		
		System.out.println(l1.ceiling("jhygfytf"));
		Iterator i1 = l1.iterator();
		
		while(i1.hasNext()) {
		System.out.println(i1.next());
		}
	}
	public static void Sets() {
	Collection<String> set = new HashSet<String>();
	set.add("Java");
	set.add("Python");
	set.add("Selenium");
	set.add("SIP");
	
	System.out.println("set : "+set);
	
	
	Iterator<String> i = set.iterator();
	System.out.println(i.next().getClass());
	System.out.println(i.next().hashCode());
	System.out.println(i.next().hashCode());
	System.out.println(i.next().hashCode());
	while(i.hasNext())
		System.out.println(i.next().hashCode());

	
	}
	
	public static void LinkedHashSets() {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		int [] abc = {9,2,3,4};
		set.add(abc);
		set.add("Python");
		set.add("Selenium");
		set.add("SIP");
		
		System.out.println("linked hash set : "+set);
		Object [] oc = set.toArray();
		System.out.println("Lhset : " +((int[]) oc[0])[0]);
		
		Iterator<Object> i = set.iterator();
		System.out.println(i.next().getClass());
		System.out.println(i.next().hashCode());
		System.out.println(i.next().hashCode());
		System.out.println(i.next().hashCode());
		
		}
	
	public static void Lists() {
		List<String> l1 = new ArrayList<String>();
		l1.add("Java");
		l1.add("Python");
		l1.add("Selenium");
		l1.add("SIP");
		
		System.out.println("List : "+l1);
		System.out.println("L1 : "+l1.get(0));
		System.out.println("L2 : "+l1.get(1));
		System.out.println("L3 : "+l1.get(2));
		System.out.println("L4 : "+l1.get(3));
		
		Iterator<String> i = l1.iterator();
		System.out.println(i.next().hashCode());
		System.out.println(i.next().hashCode());
		System.out.println(i.next().hashCode());
		System.out.println(i.next().hashCode());
		
		}
	
	public static void HashMaps() {
		Map<String,String> set = new HashMap<String,String>();
		set.put("1","Java");
		set.put("2","Python");
		set.put("3","Selenium");
		set.put("4","SIP");
		
		System.out.println("Map : "+set);
		
		System.out.println("M1 "+set.get("1"));
		System.out.println("M1 "+set.get("2"));
		System.out.println("M1 "+set.get("3"));
		System.out.println("M1 "+set.get("4"));
		
		}
	
	public static void LinkedHashMaps() {
		LinkedHashMap<String,String> set = new LinkedHashMap<String,String>();
		set.put("1","Java");
		set.put("2","Python");
		set.put("3","Selenium");
		set.put("4","SIP");
		
		System.out.println("Map : "+set);
		
		System.out.println("M1 "+set);
		System.out.println("M1 "+set.get("2"));
		System.out.println("M1 "+set.get("3"));
		System.out.println("M1 "+set.get("4"));
		
		}
}
