package deadLockJule26;

public class thread2  extends Thread{
abcd obj1;
abcd obj2;

public thread2(abcd obj1 , abcd obj2) {
	this.obj1=obj1;
	this.obj2=obj2;
}
public void run () {
	obj2.method1(obj1);
}
}
