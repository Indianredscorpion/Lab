public class String1 {

	public static void main(java.lang.String[] args) {
		
	public static void main(String[] args) {
		String str = "Welcome to Java World";
		System.out.println("String : " + str);
		
		System.out.println();
		
		//1] return character at 5th position
		System.out.println("Character at fifth position : " + str.charAt(4) );
		
		System.out.println();
		
		//2] compare str with "Welcome" lexicographically
		
		System.out.println("Lexicographically Compared Strings are   : " + str.compareToIgnoreCase("Welcome"));
		
		System.out.println();
		
		//3] concatenate 'let us learn'
		System.out.println(str.concat(" Let us learn"));
		
		System.out.println();
		
		//4] return position of first occurence of character 'a'
	  System.out.println("Position of first occurence of character 'a' is : " + str.indexOf('a'));
	    
	    System.out.println();
		
		//5] Replace all occurences of 'a' character with new 'e' 
	    System.out.println("Replaced string :" + str.replaceAll("a", "e") );
	    
	    System.out.println();
	    
	    //6] return string between 4th and 10th position 
	    
	    System.out.println("String between 4th and 10th position is : " + str.substring(3, 11));
	    
	    System.out.println();
	    
	    //7. Lowercase 
	    System.out.println("String in lowercase : " + str.toLowerCase());
	    
	    System.out.println();

		

	}

}
