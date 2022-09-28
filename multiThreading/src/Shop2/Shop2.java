
package Shop2;

public class Shop2 {
	int stock=5;
	public synchronized void producer()
	{
		if (stock<20)
		{
			try {
				wait();
			} catch (Exception e) {}
		}
		stock++;
		System.out.println("produceer "+stock);
		if (stock>2)
		{
			notify();
		}
	}
	public synchronized void consume()
	{
		if (stock<=1)
		{
			try {
				wait();
			} catch (Exception e) {}
		}
		stock--;
		System.out.println("counsumer "+stock);
		if (stock <5)
			
		{
			notify();
		}
	}
}
