package package02;

import package01.TestA01;

public class TestB01 extends TestA01 {

	public static void main(String[] args) {
		//from one package to another package
		// Can call only public and protected from one package to another when it is static
		
		add(20,40);
		mul(20,30);
		
	}

}
