
public class Regex {
	public static void main(String[] args) {
		//System.out.println (Pattern.matches("geeksforge*ks", "geeksforgeeks")); 
		//System.out.println (Pattern.matches("g*geeks*", "geeksfor"));
		String s1="welcome to login page";
		String s2="home page";
		//There are three variants of matches() method.       Java.lang.String.matches() in Java
		System.out.println(s1.matches("(.*)page(.*)"));
		System.out.println(s1.regionMatches(17, s2, 5, 4));
		System.out.println(s1.regionMatches(true, 17,s2,5, 4));
		System.out.println(s1.replaceAll("[\\s]",""));
	}
}
