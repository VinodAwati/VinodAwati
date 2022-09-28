package DeadLock2;

public class class2 {
public synchronized void  c2m1(class1 c1)
{
	System.out.println("in class 2 m1 method ");
	c1.c1m2();
}
public synchronized void c2m2()
{
	System.out.println(" in class 2 m2 method ");
}

}
