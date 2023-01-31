package day14;

import java.util.Hashtable;

public class program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> x =new Hashtable<>();
		x.put(111, "Ram");
		x.put(112, "Sam");
		x.put(113, "Prem");
		x.put(114, "Rani");
		x.put(115, "Vani");
		x.put(116, "Rita");
		x.put(117, "Prem");
		x.put(115, "Mary");
		System.out.println(x);
		x.remove(112, "bb");
		System.out.println(x);
		x.put(111,  "aa");
		x.put(112, "bb");
		System.out.println(x);
		System.out.println(x.keySet());
		System.out.println(x.values());
		System.out.println(x.entrySet());
		x.replace(112, "rr");
		System.out.println(x);
		x.replace(112, "abc");
		System.out.println(x);
		
	}

}
