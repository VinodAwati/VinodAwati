package isAlive_3_sep_2021;

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
