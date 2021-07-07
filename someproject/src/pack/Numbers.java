package pack;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void sslc_mark(int tamil,int english,int maths,int science,int social)
	{
		int total;
		float average;
		total = tamil+english+maths+science+social;
		System.out.println("Total values_1"+" " +total);
		average1(total);
	}
	
	public void sslc_mark(String a[])
	{
		int total=0;
		float average;
		String Name;
		for(int i=1;i<a.length;i++) {
			total += Integer.valueOf(a[i]);
		}
		Name=a[0];
		System.out.println(Name+" " +total);
		//average1(total);
	}
	public void average1(int total)
	{
		System.out.println("Total Value_2  "+total);
	}
	public void threeadd(int a,int b,int c)
	{
		int d;
		d = a+b+c;
		System.out.println("Addition of three digits"+d);
	}

}
