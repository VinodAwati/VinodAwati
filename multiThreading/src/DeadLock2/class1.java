
package DeadLock2;

public class class1 {
    public synchronized void c1m1(class2 c2)
    {
    	System.out.println("in class 1 m1 method ");
    	c2.c2m2();
    	
    }
    public synchronized void c1m2()
    {
    	System.out.println("in class 1 m2 method ");
    }
}
