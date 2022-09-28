package deadLockJule26;

public class abcd {
	synchronized void method1(abcd obj)
	{
		System.out.println("in method 1 ");
		try {Thread.sleep(1000);}catch (Exception e  ) {}
		obj.method2();
	}

synchronized	private void method2() {
		
	System.out.println("in method 2");
	}

}
