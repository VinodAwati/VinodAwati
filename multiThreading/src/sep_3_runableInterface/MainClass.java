package sep_3_runableInterface;

public class MainClass {

	public static void main(String[] args) throws Exception {

		abc a=new abc();
		Thread t=new Thread(a);
		t.start();
		pqr p=new pqr(); 

		p.start();
		t.join();
		p.join();
		System.out.println("work done");
	}

}
