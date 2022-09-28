package july23ClassWork;

public class Thread1 extends Thread
{

public void run() {
	for (int i = 0; i < 11; i++)
	{
		System.out.println("hi");
		try{Thread.sleep(1000);
		
		}catch(Exception a) {}
	}
}
}
