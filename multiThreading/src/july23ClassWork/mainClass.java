package july23ClassWork;

public class mainClass {

	public static void main(String[] args) throws Exception
	{
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t1.join();
t2.start();
t2.join();
System.out.println("my work is done ");
	}

}
