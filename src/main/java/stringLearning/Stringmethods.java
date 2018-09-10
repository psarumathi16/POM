package stringLearning;

public class Stringmethods {

	public static void main(String[] args) {
		
		
		String st1 = "My name is sarumathi";
		String st2 = "My husband name is santhosh";
		
		
		//Length
	/*	System.out.println("The lenght of the string is  :" + st1.length());
		System.out.println("The lenght of the string is  :" + st2.length());
		
		//index
		System.out.println("The index of u : " + st1.indexOf("u"));
		System.out.println("The index of n : " + st2.indexOf("n"));
		System.out.println("The substring of is :" + st1.indexOf("is")); */
		
		//CharAt
		
		//System.out.println("Character at 21 position : " + st1.charAt(21));
		System.out.println("Character at 15 position : " + st1.charAt(15));
		
		
		//CompareTo
		
		System.out.println("Compare st1 to st2 :" + st1.compareTo(st2));
		System.out.println("Compare st2 to st2 :" + st2.compareTo(st2));
		System.out.println("Compare st1 to st2 :" + st1.compareToIgnoreCase(st2));
		
		//Contains
		
		if (st1.contains("sarumathi") ) {
			System.out.println("The Keyword : sarumathi is present in given string");
			
		}else
		{
			
			System.out.println("The Keyword : sarumathi is not present in given string");	
			
		}

//replace
		
		System.out.println(st1.replace("s", "S"));
		//System.out.println(st2.replaceAll("\\s", ""));
		System.err.println(st2.replaceFirst("s", "S"));
		
		
		
	}

}
