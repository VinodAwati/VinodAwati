package deadLock4;

public class t1 extends Thread{
	class1 c1;
	class2 c2;
	public t1(class1 c1, class2 c2)
	{
       this.c1=c1;
       this.c2=c2;
	
	}
	@Override
	public void run() 
	{
		c1.c1m1(c2);
	}

}
