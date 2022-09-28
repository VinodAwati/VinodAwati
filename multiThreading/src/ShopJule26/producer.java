package ShopJule26;

public class producer  extends Thread{
	shop shopobj;
	public producer(shop shopobj) 
	{
		this.shopobj=shopobj;
	}
	public void run () {
		for (int i = 0; i < 1000; i++) 
		{
			shopobj.producer();
			try {
				Thread.sleep(100);
			}catch (Exception e) {}
			
		}
	}

}
