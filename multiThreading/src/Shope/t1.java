package Shope;

public class t1 extends Thread {
	shop s;
	public t1(shop s) {
		
	this.s=s;
	}
	
@Override
public void run() {
	while(true)
	{
	s.producer();
	 try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
	
}
