package tester_ppt;

public class tester_1 {
	public static void main(String []args){
		String c = "1";
		String d = "1";
		String e = "",f = "1";
		d += "3";
	    c += "3";
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println(c==d);
		System.out.println(c.equals(d));
		System.out.println(f==e);
		System.out.println(f==c);
		System.out.println(f.equals(e));
		
	}
}
