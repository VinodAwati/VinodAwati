package sep_3_2021_qt1;

public class xyz extends Thread {
	@Override
	public void run() {
		double a=1.0;
		while(a<20)
		{
			System.out.println(a);
			a++;
		}
	}

}
