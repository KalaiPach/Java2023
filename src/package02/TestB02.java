package package02;

import package01.TestA02;

public class TestB02 extends TestA02{

	public static void main(String[] args) {
		//from one package to another package
		// Can call only public when it is non static. Cannot call private, protected or default
		
		TestA02 a = new TestA02();
		
		a.add(23, 12);
		

	}

}
