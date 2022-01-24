package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import org.openqa.selenium.interactions.Actions;

public class Inheritance extends parentInheritance{

	public static void main(String[] args) {
	Inheritance	h = new Inheritance();
	
	//023+h.collections();
	//h.allsubstring();
	h.allsubarray();
	//h.secondLargest();
	//h.sortingHashmap();
	//h.sortingList();

	}
	
	public void collections() {
		String s= "Moneyheist";
		char ss[] =s.toCharArray();
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
	
		
		for(Character c1:ss){
			if(m.get(c1) == null) {
				m.put(c1,1);
				System.out.println("char "+c1+m.get(c1));
			}else {	
			m.put(c1,m.get(c1)+1);
				System.out.println("char "+c1+m.get(c1));

			}
		}
			int index =s.length(); 
		for(char c:m.keySet()) {
			if(m.get(c)==1) {
				if(index>s.indexOf(c))
					index=s.indexOf(c);
			}
		}
		System.out.println("non repeated char : "+ ss[index]);
		
	
	}
	
	
	public void allsubstring() {
		String s = "hello";
		
		for(int i=0; i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				System.out.println("substring : "+s.substring(i,j+1));
			}
		}
	}
	
	public void allsubarray() {
		int [] a = {1,-3,2,1,4,-2,-4,2,-1,0,3};
		int count=0;
		for(int i=0; i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
			int sum=0;
				for(int k=i;k<=j;k++) {
					sum=sum+a[k];
				}
				if(sum==4) {
					count++;
				}
				System.out.println("sum : "+sum);
			}
			System.out.println("count : "+count);
		}
	}
	
	public void secondLargest() {
		int [] a = {1,-3,55,15,4,-2,-4,2,-1,0,3};
		int temp,count=0;
		for(int i=0; i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[j]>a[i]) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			}
		//count++;
		if(count++==2)
			break;
		}
		System.out.println("second lar : "+a[1]);
	}
	
	public void sortingHashmap() {
		
		HashMap<String,Integer> names  = new HashMap<String,Integer>();
		
		names.put("Hari",98);
		names.put("Jagadeesh",93);
		names.put("Jack",97);
		names.put("Depp", 98);
		
		Iterator<String> itr = names.keySet().iterator();
		
		int i=0;
		while(itr.hasNext()) {
			i++;
			System.out.println("i : "+itr.next());
		}
			
		//Collections.sort(list, null);
		
		
	}
	
	public void sortingList() {
		ArrayList<String> as = new ArrayList<String>();
		as.add("Jack");
		as.add("potter");
		as.add("Ambli");
		as.add("sachin");
		Collections.sort(as);
		System.out.println("sorted : "+as);
		
		//Actions bui = new Actions(driver);
		   //Action drop1Image1 = builder.clickAndHold(drag1FromImage1)
	}
	
	public void unreachable() {
		try {
			int a;
			//a=a/0;
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetic");
		}
		finally{
			System.out.println("finally");
		}
	}
	
}
	




