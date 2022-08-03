package java_beans;

public class StringClass {
	public static void main(String[] args) {
	
		String s=new String("Ankit");
		String s2=new String();
		s2=s;
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s.concat("SmartAnkit"));
		
		String name=s.concat("Shukla");
		System.out.println(s);
		System.out.println(name);
	}

}
