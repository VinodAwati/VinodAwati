package ShopJule26;

public class shop {

	int stock=0;
	synchronized void consumer()
	{
		if (stock==0)
		{  notify();
		
			try{wait();} catch (Exception e) {}
		}
		stock--;
		System.out.println("consumer "+stock);
			notify();
	}
	synchronized void producer()
	{
		if (stock>5)
		{
			notify();
			try {wait();}catch (Exception e) {}
		}
		stock++;
		System.out.println("producer "+stock);
		
			notify();
	}

}
