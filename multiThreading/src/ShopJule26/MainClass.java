package ShopJule26;

public class MainClass {

	public static void main(String[] args) {
shop shopobj=new shop();
producer producer=new producer(shopobj);
consumer consumer=new consumer(shopobj);

producer.start();
consumer.start();
	}

}
