package deadLocknw;

public class MyClass

{
public static void main(String[] args) {
	
	calss1 cca=new calss1();
	class2 ccb=new class2();
	
	t1 t=new t1(cca,ccb);
	t2 tt=new t2(cca,ccb);
	t.start();
	tt.start();
}
}
