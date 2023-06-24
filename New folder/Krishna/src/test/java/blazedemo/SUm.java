package blazedemo;

import java.util.HashMap;

public class SUm {
	static void character (String s) {
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		char[] ca = s.toCharArray();
		for (char x : ca) {
			if (m.containsKey(x)) {
				Integer i = m.get(x);
				m.put(x, i+1);
			}else {
				m.put(x, 1);
			}
		}
		System.out.println(m);
	}
	
	static void string (String s) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		String[] split = s.split(" ");
		System.out.println(split);
		for (String st : split) {
			if (m.containsKey(st)) {
				Integer x = m.get(st);
				m.put(st, x+1);
			}else {
				m.put(st, 1);
			}
		}
		System.out.println(m);
	}
	
	static void rev(String s ) {
		
		String a="",b="";
			for ( int i =s.length()-1; i>=0; i--) {
				if (i<=4) {
					char c = s.charAt(i);
					a= a+c;
				}if (i>=5) {
					char c = s.charAt(i);
					b= b+c;
				}
			}
			System.out.println(a + " " + b);
	}

	public static void main(String[] args) {

		character("This is simple program this is for my interview");
		string("This is simple program this is for my interview");
		rev("Hello World");
}
}