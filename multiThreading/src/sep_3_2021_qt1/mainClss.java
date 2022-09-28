package sep_3_2021_qt1;

public class mainClss {

	public static void main(String[] args) 
	{
		abc a=new abc();
		a.start();
		a.setPriority(10);
		xyz x=new xyz();
		x.start();
		x.setPriority(5);
		System.out.println(a.getPriority());
		System.out.println(x.getPriority());
	}

}
