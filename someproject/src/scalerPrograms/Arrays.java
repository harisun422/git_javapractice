package scalerPrograms;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int common[] = {3,6,-2,1,0,4,13,-6,7,1};
		
		
		//RotateArray(common,6);
		//maxsubarraysum(common,6);
		allsubarraysum(common);
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
		int sum=0;
		int [] b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			sum =sum+a[i];
			b[i]=sum;
		System.out.println("b["+i+"] : "+b[i]);
		}
		int max=a[k-1];
		for(int i=k;i<b.length;i++) {
			System.out.println("maximum sum was : "+(b[i]-b[i-k]));
			if(max<b[i]-b[i-k])
				max=b[i]-b[i-k];
			
		}
		System.out.println("maximum sum is : "+max);
	}

	public static void allsubarraysum(int a[]) {
		int sum=0;
		int count =0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				sum=sum+a[i];
				count++;
				System.out.println(count +") : "+sum);
			}
		}
	}
}
