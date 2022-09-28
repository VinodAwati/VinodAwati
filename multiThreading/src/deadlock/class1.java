package deadlock;
public class class1
{
	
	public synchronized void c1first(class2 c2)
	{
		System.out.println("in c1first");
		c2.c2second();
	}
	public synchronized void c1second()
	{
		System.out.println("in c1second");
	}
	
	
}