package scalerPrograms;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int common[] = {3,6,-2,1,0,4,13,-6,7,1};
		
		
		//RotateArray(common,6);
	}

	//Rotate the Array by K positions
	public static void RotateArray(int a[],int k) {
		
		int len = a.length;
		int b[] = new int[len];
		for(int i=0;i<len;i++) {
		b[i]=a[(i+k)%len];
		System.out.println(i+"th element is : "+b[i]);
		}
		
	}
	
	public static void maxsubarraysum(int a[], int k) {
		
	}
	
}
