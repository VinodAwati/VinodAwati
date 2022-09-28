package deadLocknw;

public class t1 extends Thread 
{
	
	calss1 cca;
	 class2 ccb;
public t1(calss1 cca, class2 ccb) 
{
	this.cca=cca;
	this.ccb=ccb;
	}

@Override
public void run() {
	
	cca.c1m1(ccb);
	
}
}
