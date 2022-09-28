package printHi_HouAreYou;

public class t2 extends Thread {
	test t;
	public t2(test t) {

  this.t=t;
	
	}
	@Override
	public void run() {
		int j=0;
		while (j<1000)
		{
			t.m2();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
