package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Addition extends Numbers {
	static String input_data;
	static String [] namelist;
	
	public static void main(String args []) {
		// TODO Auto-generated method stub
		System.out.println("First project");
		Addition obj = new Addition();
		input_data= loaddata();
		Split();
		obj.callmarks();
	}
	public static String loaddata() 
	{
		String abc="";
		String line="";
		
		try {
			
			FileReader r = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(r);
			
		
		while((line=br.readLine())!=null) {
			abc+=line+";";
			System.out.println(line);
		}
		br.close();
		r.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("abc value  "+abc);	
		return abc;
	}
	
	public static void Split() {
		//ArrayList<String> lists = new ArrayList<String>();
		 namelist = input_data.split(";");
		
	}
	
	public void callmarks() {
		for(int i=0;i<namelist.length;i++) {
			String eachind [] = namelist[i].split(",");
			sslc_mark(eachind);
		}
		
	}
	

}
