//reverese a sentence using recursion

public class Main{
	public static String reverse(String sen){
		if(sen.isEmpty())
			return sen;
		return reverse(sen.substring(1))+sen.charAt(0);
	}
	
	public static void main(String args[]) {
		String sen = "Nikhil bora";
		String rev = reverse(sen);
		System.out.println(rev);
	
}}

/* output:
arob lihkiN
*/
