package Shop;

public class mainclass {

	public static void main(String[] args) {
   
		shop s=new shop();
		t1 t=new t1(s);
		t2 k=new t2(s);
		t.start();
		k.start();
		
	}

}
