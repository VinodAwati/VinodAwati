package deadLock_4_sep_2021;

public class myClass {

	public static void main(String[] args) {
		Class1 c1=new Class1();
		Class2 c2=new Class2();
		T1 t1=new T1(c1 , c2);
		t1.start();
		T2 t2=new T2(c1 , c2);
		t2.start();
	}

}
