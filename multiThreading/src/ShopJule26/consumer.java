package ShopJule26;

public class consumer extends Thread{
	shop shopobj;
	consumer (shop shopobj)
	{
		this.shopobj=shopobj;
	}
	public void run() {
		for (int i = 0; i < 1000; i++) {
			shopobj.consumer();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}

}
