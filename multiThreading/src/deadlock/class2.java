package deadlock;

public class class2 
{
	public synchronized void c2first(class1 c1)
	{
		System.out.println("in c2first");
		c1.c1second();
	}
	public synchronized void c2second()
	{
		System.out.println("in c2second");
	}
	
	
}
