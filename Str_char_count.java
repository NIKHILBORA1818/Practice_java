//Find the Frequency of Character in a String
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		char ch = 'l';
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(ch == s.charAt(i)) {
				count += 1;
			}
		}
		System.out.println("Freq. of character "+ch+" in a given string is: "+count);
	}

}

/* output:
Freq. of character l in a given string is: 3
*/
