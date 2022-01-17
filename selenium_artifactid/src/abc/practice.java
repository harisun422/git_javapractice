package abc;

public class practice {
	practice(String name,String adhr) {
		System.out.println("constroctor");
	}
	
	public void method(int a,int b) {
		System.out.println("method");
	}
	
	public static void main(String args[]) {
		practice t1= new practice("Hari","wuje8374j");
		int c [] = {10,2,5,4,5,4,6,17,11,22};
		int opt = t1.thirdlargestno(c);
		System.out.println("opt : "+opt);
		System.out.println(t1.fact(5));
		//t1.practice(5,7);
	}
	public int thirdlargestno(int [] a) {
		int b[]=a.clone();
		int m=0;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			m=m+1;
			if(m>3)
				break;
		}
		
		
		return a[2];
	}
	public int fact(int a) {
		int sum=1;
		if(a>=2) {
			sum =sum*fact(a-1);
			return sum;
		}else {
			return 1;
		}
		
	}
	
}
