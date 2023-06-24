package blazedemo;

public class Test1 {

	public static void main(String[] args) {
		String s = "This is My World";
		String []st = s.split(" ");
		String a="",b="";
		for (int i=0; i<st.length; i++){

		for (int j=st.length-1;j>=0;j--){
		a=a+ st[j];
		}
		b=b+ st[i];
		}
		System.out.println(a);
		
		
	}
}
