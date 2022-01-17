package abc;

public class Practices {
	
	
	String FullName;
	String Adhaarno;
	String address;
	int cibscr;
	
	
	Practices(String name,String adhr) {
		FullName = name;
		Adhaarno=adhr;
		//System.out.println("constroctor "+name +" & "+adhr);
	}
	
	public void method(String address, int cibilscore) {
		this.address=address;
		cibscr = cibilscore;
	}
	
	
	
	public static void main(String args[]) {
		Practices t1= new Practices("Hari","wuje8374j");
		t1.method("chennai",777);
		Practices t2= new Practices("Parama","rujt8try98");
		t2.method("pondy",888);
		
		
		
		
		System.out.println(t1.FullName);
		System.out.println(t1.Adhaarno);
		System.out.println(t2.FullName);
		System.out.println(t2.Adhaarno);
		
		System.out.println(t1.address);
		System.out.println(t1.cibscr);
		System.out.println(t2.address);
		System.out.println(t2.cibscr);
		
		t1.method("coimbatore",985);
		t2.method("chennai",845);
		
		
		System.out.println(t1.address);
		System.out.println(t1.cibscr);
		System.out.println(t2.address);
		System.out.println(t2.cibscr);
	}
}