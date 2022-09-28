package sep_3_runableInterface;

public class pqr extends Thread {
  @Override
public void run() {  
	  for (int i = 0; i <20; i++)
	  {
		
System.out.println("hellio");	
     try{Thread.sleep(1000);}catch(Exception e) {}
	  }
}

}
