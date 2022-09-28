package deadlock;

public class MyClass 
{
	
	public static void main(String[] args) {
		class1 c1=new class1();
		class2 c2=new class2();
		T1 t1=new T1(c1,c2);
		T2 t2=new T2(c1,c2);
		
		t1.start();
		t2.start();
	}

	
}
