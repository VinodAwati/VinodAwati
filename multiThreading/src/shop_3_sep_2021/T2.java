package shop_3_sep_2021;

public class T2 extends Thread {
	
Shop shop;
T2(Shop shop)
{
	this.shop=shop;
}

public void run()
{
	while (true)
	{
		shop.consume();
		try {Thread.sleep(200);}catch (Exception e ) {}
	}
}
}
