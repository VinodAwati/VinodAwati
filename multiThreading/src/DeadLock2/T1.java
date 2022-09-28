package DeadLock2;

public class T1 extends Thread {
	class1 c1 ;
	class2 c2 ;
	public T1(class1 c1, class2 c2) {
        this.c1=c1;
        this.c2=c2;
	}
	@Override
	public void run() {
		c1.c1m1(c2);
	}
	 
	

}
