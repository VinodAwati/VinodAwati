package shop_3_sep_2021;



public class mainClass {

	public static void main(String[] args) {
   Shop s=new Shop();
   T1 t1=new T1(s);
   t1.start();
   T2 t2=new T2(s);
   t2.start();
	}

}
