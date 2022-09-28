package sep_3_runableInterface;

public class abc implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("abc");	
			try{Thread.sleep(1000);}catch(Exception e) {}

		}
	}


}
