package selenium_artifactid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


abstract class bisc{
	
	bisc(){
		System.out.println("bisc");
	}
	abstract void biscs();
	void biscs(int x,int b){
		System.out.println("bisc int int");
	}
}
public class misc extends bisc{

	misc(){
		System.out.println("misc");
	}
	misc(int x,int b){
		System.out.println("misc int int");
	}
	
	void biscs(){
		System.out.println("misc class");
	}
	void biscs(int x,int b){
		System.out.println("m1disc int int");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		bisc b =new misc(2,2);
		b.biscs(2,2);
		char[] a =  {'c','b','a'};
		String s1="teststring";
		String s2="stringtest";
		char[] a1= s1.toCharArray();
		char[] a2= s2.toCharArray();
		List<Character> al = new ArrayList<Character>();
		
		for(Character c1 : a1) {
			al.add(c1);
		}
		System.out.println(al.contains('t'));
		System.out.println(al.remove(al.get(0)));
		System.out.println(al);
		
		Character [] f= al.toArray(new Character[al.size()]);
		System.out.println(""+f[0]+f[1]+f[2]);
		
		
		Map<Character, Integer> m = new HashMap();
		
		for(int i=0; i<s1.length();i++) {
			if(m.containsKey(a1[i])) {
				int newValue=m.get(a1[i]);
				m.put(a1[i], newValue+1);
			}
			else {
				m.put(a1[i], 1);
			}
		}
		for(Character r: m.keySet()) {
			System.out.println(r + " "+ m.get(r));
			//System.out.println(m.get(r));
		}
		for(int i=0; i<a2.length;i++) {
			if(m.containsKey(a2[i])) {
				if(m.get(a2[i])>1) {
				int newValue=m.get(a2[i]);
				m.put(a2[i], newValue-1);
				}else {
					m.remove(a2[i]);
				}
			}
			else {
				System.out.println("Not a ");
				break;
			}
		}
		for(Character r: m.keySet()) {
			System.out.println(r);
		}
		System.out.println(m.isEmpty());
		
		String s="HELLO";
		System.out.println(s.toLowerCase());
				
	}
	
		
	

	
}
//Hari answer :