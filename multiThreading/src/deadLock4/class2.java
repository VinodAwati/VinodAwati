package deadLock4;

public class class2 {

    synchronized	void c2m1(class1 j)
	{
		System.out.println("in class 2 method 1");
		j.c1m2();
	}
	
    synchronized	void c2m2()
	{
		System.out.println("in class 2 method 2");
	}
}
