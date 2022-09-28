package Shop2;

public class T1_2 extends Thread {
	Shop2 shop;

	public T1_2(Shop2 shop) {
		
		this.shop = shop;
	}
	@Override
	public void run() {
		while (true)
		{
			shop.producer();
			try {
				sleep(100);
			} catch (InterruptedException e) {}
		}
	}
	
	

}
