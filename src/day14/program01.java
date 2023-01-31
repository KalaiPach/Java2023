package day14;

import java.util.Arrays;
import java.util.HashSet;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> x = new HashSet<>();
		x.add("aa");
		x.add("bb");
		x.add("cc");
		x.add("dd");
		x.add("ee");
		x.add("ff");
		System.out.println(x);
		x.remove("cc");
		System.out.println(x);
		System.out.println(x.size());
		
		String[]y= {"abc","cba","acb","bca","cab"};
		x.addAll(Arrays.asList(y));
		System.out.println(x);
		
		x.removeAll(Arrays.asList(y));
		System.out.println(x);
		
		System.out.println(x.contains("aa"));
		System.out.println(x.contains("abc"));
		
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x);
	}

}
