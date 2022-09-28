package deadLocknw;

public class calss1
{
	
	synchronized void c1m1(class2 c)
	{
	System.out.println(" in c1m1");	
	c.c2m2();
	}
	synchronized	void c1m2()
	{
		System.out.println("in c2m2");
	}
}