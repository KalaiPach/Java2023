package day09;

public class program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
		System.out.println(Fact+""+temp);
		
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
		System.out.println(Fact+""+temp);
		
	}
	
	public static void forLoop() {
		int Fact =8;
		int x=1;
		long temp=1;
		for (int x1=1; x1<=Fact;x1++)
		{
			temp=temp*x1;
			x1++;
		}
		System.out.println(Fact+""+temp);
		
	}

}

