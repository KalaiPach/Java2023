package day14;

import java.util.HashMap;

public class program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> x=new HashMap<>();
		x.put(101, "aa");
		x.put(102, "bb");
		x.put(103, "abc");
		x.put(101, "bbb"); //duplicate key is replaced with latest values
		x.put(104, "bb"); //duplicate values are allowed
		System.out.println(x);
		x.remove(101);
		System.out.println(x);
		x.remove(102, "bb");
		System.out.println(x);
		x.put(101,  "aa");
		x.put(102, "bb");
		System.out.println(x);
		System.out.println(x.keySet());
		System.out.println(x.values());
		System.out.println(x.entrySet());
		x.replace(102, "rr");
		System.out.println(x);
		x.replace(102, "abc");
		System.out.println(x);
	}

}
