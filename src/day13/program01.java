package day13;

import java.util.ArrayList;
import java.util.Arrays;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x= new ArrayList<>();
		x.add(10);
		x.add(20);
		x.add(30);
		System.out.println(x);
		x.remove(0);
		System.out.println(x);
		x.add(10);
		System.out.println(x);
		x.add(20);
		System.out.println(x);
		x.add(2, 20);
		System.out.println(x.size());
		System.out.println(x.contains(20));
		System.out.println(x.contains(200));
		System.out.println(x.isEmpty());
		//x.clear();
		System.out.println(x);
		
		x.set(3, 40);
		System.out.println(x);
		Integer[] y= {50,60,70,80,90};
		x.addAll(Arrays.asList(y));
		System.out.println(x);
		Integer[] z= {10, 20, 30};
		x.removeAll(Arrays.asList(z));
		System.out.println(x);
		

		

	}

}
