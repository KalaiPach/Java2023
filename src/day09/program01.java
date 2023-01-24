package day09;

import java.util.Scanner;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doLoop();

	}
	
	public static void whileLoop() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the table value:- ");
		int tables = input.nextInt();
		input.close();
		int a=1;
		while(a<=10) {
			System.out.println(tables+"x"+a+"="+tables*a);
			a++;
		}	
		
		}
			
	public static void doLoop1() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the table value:- ");
		int tables = input.nextInt();
		input.close();
		int a=1;
		do {
			System.out.println(tables+"x"+a+"="+tables*a);
			a++;
		}while (a<=10);
		
		}

	public static void doLoop() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the table value:- ");
		int tables = input.nextInt();
		input.close();
		int a=1;
		do {
			System.out.println(tables+"x"+a+"="+tables*a);
			a++;
		}while (a<=10);
		
		}

	
	}
	
