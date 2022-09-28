package Shope;
 public class shop {
	 
	 int stock=5;
	 
	synchronized void producer()
	 {
		 if (stock<20)
		 {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.println("producer "+stock);
		 stock++;
		 if (stock<2)
		 {
			 notify();
		 }
	 }
	synchronized void counsumer()
	 {
		 if (stock<=1)
		 {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.println("consumer "+stock);
		 stock--;
		 if (stock<5)
		 {
			 notify();
		 }
	 }
	 
	 
 }