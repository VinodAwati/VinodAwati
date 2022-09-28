package deadLock4;
public class class1{
	
   synchronized	void c1m1(class2 k)
	{
		System.out.println("in class 1 method 1");
		k.c2m2();
	}
	synchronized void  c1m2()
	{
		System.out.println("in class  1 method 2");
	}
}