package Shop2;

public class T2_2  extends Thread
{
	Shop2 shop;

	public T2_2(Shop2 shop) {
		
		this.shop = shop;
	}
	@Override
	public void run() {
		while(true)
		{
			shop.consume();
			try {
				sleep(200);
			} catch (Exception e) {}
		}
	}
	
}
