package deadlock;

public class T2 extends Thread 
{
	class1 c1;
	class2 c2;

	public T2(class1 c1, class2 c2) 
	{
		this.c1=c1;
		this.c2=c2;
	}
@Override
public void run() 
{
	c2.c2first(c1);
}
}
