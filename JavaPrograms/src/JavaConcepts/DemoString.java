package JavaConcepts;

public class DemoString {

	public static void main(String[] args) {
		String s1 = new String("RANI");
		String s2 = new String("Rani");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1=s2);
	}

}
