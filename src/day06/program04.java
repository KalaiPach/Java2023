package day06;

import java.util.Scanner;

public class program04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner (System.in);
		System.out.println("Enter value for a: ");
		int a=x.nextInt();
		System.out.println("Enter value for b: ");
		int b=x.nextInt();
		x.close();
		
		int c=100;
		int d=200;
		if (a>b)
		{
			System.out.println("a is greater");
		}
		else if (b>a){
			System.out.println("b is greater");
		}
			
		else if (a==b){
			System.out.println("a & b are equal");
		}
		
		else {
			System.out.println("Nothing");
		}

	}

}
