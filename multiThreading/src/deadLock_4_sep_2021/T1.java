package deadLock_4_sep_2021;

public class T1 extends Thread {
	Class1 c1;
	Class2 c2;
	public T1(Class1 c1, Class2 c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public void run() {
		c1.first(c2);
	}
	
	

}
