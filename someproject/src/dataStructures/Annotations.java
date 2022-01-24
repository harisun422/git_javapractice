package dataStructures;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Annotations {

	@Target(ElementType.TYPE_USE)
	@interface Hello{}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	public void green() {
		System.out.println("Hello - this is green");
	}
}
