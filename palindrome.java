//palindrome string
public class Main{
	public static void main(String args[]) {
		String s1 = "naman", s2 = "";
		int strLen = s1.length();
		
		for(int i = strLen - 1; i >= 0; --i) {
			s2 = s2 + s1.charAt(i);
		}
		if(s1.toLowerCase().equals(s2.toLowerCase())) {
			System.out.println("String1: "+s2+" is palindrome of String2: "+s1);
		}else {
			System.out.println("Not palindromes");
		}
	}
}

/* output:
String1: naman is palindrome of String2: naman
*/
