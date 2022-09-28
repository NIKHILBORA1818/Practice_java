//character to integer value
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		
		int a = ch;
		System.out.println(a);
		
		char ch2 = 't';
		int b = Character.getNumericValue(ch2);
		System.out.println(b);
	}

}
/* output:
97
29
*/
