package deadLocknw;

public class t2 extends Thread
{
 calss1 cca;
 class2 ccb;
	public t2(calss1 cca, class2 ccb) 
	{
		this.cca=cca;
		this.ccb=ccb;
	}

	@Override
	public void run() {
	ccb.c2m1(cca);
	}
}
