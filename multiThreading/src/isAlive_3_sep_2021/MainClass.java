package isAlive_3_sep_2021;

public class MainClass {

	public static void main(String[] args) throws Exception {

		abc a=new abc();
		Thread t=new Thread(a);
		t.start();
		pqr p=new pqr(); 

		p.start();
		
		while(t.isAlive() && p.isAlive())
		{
			
		}
		System.out.println("work done");
	}

}
