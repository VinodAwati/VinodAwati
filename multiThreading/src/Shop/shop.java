package Shop;
public class shop{
	
	int stock=5;
synchronized	void producer()
	{
		if (stock>20)
		{    
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		
			
			System.out.println("producer "+stock);
			stock++;
			if (stock>2)
			
		{
			notify();
		}
	}
  synchronized	void counsumer()
	{
		if (stock<2)
		{		
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();}
		}
		
			System.out.println("counsumer "+stock);
			stock--;
		if (stock<5)
		{
			notify();
		}
	}
	
}