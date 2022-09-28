package deadLock4;

public class mainClass {

	public static void main(String[] args) {

		class1 c1=new class1();
		class2 c2=new class2();
		t1 d=new t1(c1,c2);
		t2 e=new t2(c1,c2);
		d.start();
		e.start();
		
		
	}

}
