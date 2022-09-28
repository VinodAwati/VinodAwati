package printHi_HouAreYou;

public class t1 extends Thread{
	test t;
	public t1(test t) {

     this.t=t;
	}
@Override
public void run() {
	int i=0;
	while (i<500)
	{
		t.m1();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}
}
	
}
