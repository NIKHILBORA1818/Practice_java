//sort in dictionary order
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] w = {"hello", "nikhil", "pratik", "roman", "john"};
		
		for(int i = 0; i < 4; ++i) {
			for(int j = i+1; j < 5; ++j) {
				if(w[i].compareTo(w[j]) > 0) {
					String temp = w[i];
					w[i] = w[j];
					w[j] = temp;
				}
			}
	}
		System.out.println("Dictionary order: ");
		for(int k = 0; k < w.length; ++k) {
			System.out.println(w[k]);
		}

}
}

/* output
Dictionary order: 
hello
john
nikhil
pratik
roman
*/
