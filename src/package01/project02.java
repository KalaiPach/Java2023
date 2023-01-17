package package01;

public class project02 extends TestA02{

	public static void main(String[] args) {
		// public, protected and default non static can be called within the package 
		TestA02 a = new TestA02();
		a.add(10,60);
		a.mul(11,11);
		a.div(40, 5);
		
		
	}

}
