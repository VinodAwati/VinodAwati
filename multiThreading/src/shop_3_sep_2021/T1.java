package shop_3_sep_2021;

public class T1 extends Thread{
	Shop shop;
	T1(Shop shop)
	{
		this.shop=shop;
	}
	
	
	@Override
	public void run() {
		while (true)
		{
			shop.producer();
			try {Thread.sleep(100);}catch(Exception e) {}
		}
		
	}

}
