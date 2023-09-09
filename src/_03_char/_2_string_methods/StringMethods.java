package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		
	String the = "the";	

	String letter = "h";

	System.out.println(the.charAt(2));
	
	for(int i = 0; i < the.length(); i++ ) {
		System.out.println(the.charAt(i));
		if(letter.charAt(0) == the.charAt(i)) {
			System.out.println(letter + " is at index " + i + ".");
	}
	
	}
	
	////////for( int b= 0; b < the.length(); b++) {
		
	//	}
		
	
	
	
	
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters

		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt

		
		// 3. Print the length of your String to the console.
		//    HINT: .length()

		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	


	}
	
}
	
	
