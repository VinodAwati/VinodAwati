package deadLock4;

public class t2 extends Thread {
	class1 c1;
	class2 c2;
	public t2(class1 c1, class2 c2) 
	
	{
		 this.c1=c1;
	     this.c2=c2;	
	
	}
	@Override
	public void run() {
	  c2.c2m1(c1);
	}

	
}
