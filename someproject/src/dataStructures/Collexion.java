package dataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Collexion {

	
	public static void main(String[] args) {
		//common();
		//Treesets();
		//stacks();
		//queues();
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
	
	public static void stacks() {
		Stack s =new Stack();
		s.add("Hello");
		s.add("Hai");
		s.add("Bonjour");
		s.add("jack");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.toString());
	}
	
	
	public static void queues() {
		Queue<String> q = new PriorityQueue<String>();
		Queue<Integer> k = new PriorityQueue<Integer>();
		List l1 = new ArrayList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		
		q.add("Hello");
		q.add("world");
		q.addAll(l1);
		//System.out.println(q.element());
		System.out.println(q.toString());
		
		
		Queue<String> nq = new LinkedList<String>(); 
		Deque<String> mq = new LinkedList<String>();
		
	}
	
	
	
	public static void Treesets() {
		TreeSet<String> l1 = new TreeSet<String>();
		
		
		l1.add("Treeset");
		l1.add("1");
		l1.add("3");
		l1.add("treeset");
		l1.add("1");
		l1.add("c");
		l1.add("a");
		l1.add("A");
		
		//l1.add(a);
		
		System.out.println(l1.ceiling("jhygfytf"));
		for(String s: l1) {
			System.out.println(" : "+s);
			}
		
		Iterator i1 = l1.iterator();
		
		while(i1.hasNext()) {
		System.out.println(i1.next());
		}
	}
	public static void Sets() {
	Collection<String> set = new HashSet<String>();
	Collection<String> set2 = new HashSet<String>();
	set.add("JavaScript");
	set.add("SIP");
	set.add("Java");
	set.add("Python");
	set.add("Selenium");
	//set.add("Aa");
	set2.add("BB");
	System.out.println("hello+"+set.add("Java"));
	
	System.out.println("set : "+set);
	
	
	Iterator<String> i = set.iterator();
	Iterator<String> i2 = set2.iterator();
	/*
	 * set : [Java, SIP, Selenium, Python]
Java: 0
SIP: -155254712
Selenium: -1916133813
Python: -2030461121
BB: 0
Java: 62975370

	System.out.println(i.next().getClass());
	System.out.println(i.next().hashCode());
	System.out.println(i.next().hashCode());
	System.out.println(i.next().hashCode());
	*/
	String m="";
	
	while(i.hasNext())
		System.out.println(m=i.next()+": "+m.hashCode());
	String n="";
	while(i2.hasNext())
		System.out.println(n=i2.next()+": "+n.hashCode());

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
		HashMap<String,String> set = new HashMap<String,String>();
		set.put("1","Java");
		set.put("2","Python");
		set.put("3","Selenium");
		set.put("4","SIP");
		set.size();
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
