package deadLock_4_sep_2021;

public class Class2 {
 public synchronized void first(Class1 c1)
 {
	System.out.println("c2 1   T2");
	try {
		Thread.sleep(100);} catch (Exception e) {}
	c1.second();
	
}
 public synchronized void second()
 {
System.out.println("c2 2    T1");
}
}
