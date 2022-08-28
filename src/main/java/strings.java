
public class strings {

	public static void main(String[] args){
		String s="Welcome";
		char a=s.charAt(6);
		System.out.println(a);
		System.out.println("The string variable"+"is from the string class");
		
		String s1= "apple";
		String s2= "pine";
		
		String s3= s2.concat(s1);
		System.out.println(s3);
		
		String s4= " Welcome to the java's session";
		boolean s5= s4.contains("session");
		System.out.println(s5);
		
		String s6="welcome";
		String s7="Welcome";
		System.out.println(s6.equals(s7));
		System.out.println(s6.equalsIgnoreCase(s7));
		
		System.out.println(s7.length());
		System.out.println(s4.replace('e', 'o'));
		System.out.println(s4.replace('\'', 'o'));
		String [] words=s4.split(" ");
		for(String s9: words)
		System.out.println(s9);
		System.out.println(s6.substring(3, 7));
		
		String s10="WELCOME";
		System.out.println(s10.toLowerCase());
		System.out.println(s6.toUpperCase());
		
		int value=40;
		String s11= String.valueOf(value);
		System.out.println(30+s11);
		
	}
}
