package deadLockJule26;

public class Thread1 extends Thread {
abcd obj1;
abcd obj2;


public Thread1(abcd obj1 , abcd obj2 ) {
	this.obj1=obj1;
	this.obj2=obj2;
}
public void run () {
	obj1.method1(obj2);
}
}
