package sep_3_2021_qt1;

public class abc extends Thread{

	@Override
	public void run() {
		int a=1;
		while(a<20)
		{
			System.out.println(a);
			a++;
		}
	}

}
