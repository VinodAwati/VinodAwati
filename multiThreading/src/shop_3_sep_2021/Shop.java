package shop_3_sep_2021;

public class Shop {
	int stock=5;
	public synchronized void producer()
	{
		if (stock>20)
		{
			try {wait();}catch(Exception e) {}
			
		}
		stock++;
		System.out.println("produce "+stock);
		if (stock>2)
		{
			notify();
		}
	}
	public synchronized void consume() 
	{
		if (stock<=1)
		{
			try{wait();}catch (Exception e) {}
		}
		stock--;
		System.out.println(" consume "+stock);
		if (stock<5)
			notify();
	}

}




