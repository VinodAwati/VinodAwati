package deadLock_4_sep_2021;

public class Class1 {
	
	public synchronized void first(Class2 c2 )
	{
		System.out.println("c1 1   T1");
		try {Thread.sleep(100);} catch (Exception e) {}
		c2.second();
	}
	public synchronized void second() 
	{
		System.out.println("c1 2   T2 ");
	}

}
