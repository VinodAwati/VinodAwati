package deadLock_4_sep_2021;

public class T2 extends Thread {
	
	Class1 c1;
	Class2 c2;
	public T2(Class1 c1, Class2 c2)
	{
		
		this.c1 = c1;
		this.c2 = c2;
	}
	public  void run()
	{
		c2.first(c1);
	}
	
	

}
