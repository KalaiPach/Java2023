package day10;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whileFibonacci();
		forFibonacci();
		doFibonacci();
		whileFibonacci();
	}
	
	public static void whileFibonacci() {
		int x=0;
		int y=1;
		int a=1;
		
		while (a<=10) {
			System.out.println(x);
		int z=x+y;
		x=y;
		y=z;
		a++;
		}
	}
	
	public static void forFibonacci() {
		// TODO Auto-generated method stub
		int x=0;
		int y=1;
		int a=1;
		
		for(a=1;a<=10;a++)
		{
			System.out.println(x);
		int z=x+y;
		x=y;
		y=z;
		} 
	}
	
	public static void doFibonacci() {
		int x=0;
		int y=1;
		int a=1;
		
		do {
			System.out.println(x);
		int z=x+y;
		x=y;
		y=z;
		a++;
		}while (a<=10);
	}

}
