package dataStructures;



public class Multithreading extends Thread {

	public static void main(String[] args) {
		
		Multithreading m1 = new Multithreading();
		
		//m1.method3();
		//m1.start();
		//m2.start();
		System.out.println(m1.endUp("abcdefghi"));
	}
	static int count=0;
	void method1() {
		count+=1;
		try {
		System.out.println("THis is method one "+this.getId()+"-"+count);
		//System.out.println(getPriority()+" "+getName()+" "+getId()+" "+isAlive());
		Thread.sleep(6000);
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
	}

	int method2() {
		System.out.println("THis is method two");
		return 5;
	}
	int method3() {
		System.out.println("THis is method three");
		System.out.println(this.getId());
		return 455;
	}
	public void run() {
		method1();
		method2();
	}
	
		
	public boolean stringE(String str) {
		int count=0;
		char [] s = str.toCharArray();
			  for(char d: s) {
			    if(d=='e')
			    	count +=1;
			  }
			  if(count<=3)
				  return true;
			  else
				  return false;
			}

	public int div(int a) {
		return a%10;
	}
	
	public boolean endUp(String str) {
		System.out.println(str.substring(1,3));
			  if(str.length()>2){
			    if(str.substring(1,3)=="bc")
			    return true;
			    else
			    return false;
			  }
			  else
			  return false;
			
		}
}
