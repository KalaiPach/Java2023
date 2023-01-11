package day01;

public class Day02 {

	public static void main(String[] args) {

		addFunction(10, 20);
		addFunction(10.8, 20.45);
		addFunction(10, 20, 40);

	}
	
	public static void addFunction(int m, int n) {
		System.out.println(m+n);
	}
	
	public static void addFunction(double m, double n) {
		System.out.println(m+n);
	}
	
	public static void addFunction(int m, int n, int x) {
		System.out.println(m+n+x);
	}

}
