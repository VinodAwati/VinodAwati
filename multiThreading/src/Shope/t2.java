package Shope;

public class t2 extends Thread {
	shop s;
	public t2(shop s) 
	{
		this.s=s;
		
	}
	 @Override
	public void run() {
		while(true) { s.counsumer();
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 }
		
	 

}
