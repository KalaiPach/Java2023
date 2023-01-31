package day12;

public class program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y[]= {23,31,45,67,76,43,70,89};
		System.out.println("lenght of y:-" + y.length);
		
		for(int i=0; i<y.length; i++)
		{
			System.out.println(y[i]);
		}
			
		System.out.println("***************");
		int a=0;
		while(a<y.length)
		{
			System.out.println(y[a]);
			a++;
		}
		
		System.out.println("********************");
		
		for(int val:y)
		{
			//System.out.println("Value");
			System.out.println(val);
		}
		
	}

}
