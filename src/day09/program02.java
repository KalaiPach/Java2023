package day09;

public class program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileLoop();
		forLoop();
		doLoop();
		
	}
	
	public static void whileLoop() {
		int Fact =20;
		int x=1;
		long temp=1;
		while(x<=Fact)
		{
			temp=temp*x;
			x++;
		}
		System.out.println(Fact+" "+temp);
		
	}
	
	public static void doLoop() {
		int Fact =9;
		int x=1;
		long temp=1;
		do
		{
			temp=temp*x;
			x++;
		}while (x<=Fact);
		System.out.println(Fact+" "+temp);
		
	}
	
	public static void forLoop() {
		int Fact =8;
		int temp=1;
		for (int x=1; x<=Fact;x++)
		{
			temp=temp*x;
		
		}
		System.out.println(Fact+" "+temp);
		
	}

}

