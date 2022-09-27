//Count the Number of Vowels and Consonants in a Sentence
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		int vowel = 0, conso = 0, dig = 0;
		s = s.toLowerCase();
		System.out.println("Given string is: "+s);
		
		for(int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if(ch == 'a' | ch == 'i' | ch == 'e' | ch == 'o' | ch == 'u') {
				vowel++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				conso++;
			}
			else if(ch >= '0' && ch <= '9') {
				dig++;
			}
			
		}
		System.out.println("Total no. of vowels are : "+vowel+ " and consonants are: "+conso);

	}

}

/*output
Given string is: hello world
Total no. of vowels are : 3 and consonants are: 7
*/
