package flowcontrolandloops;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to check if a char is a vowel or not
		
		//input
		char letter = 'u';
		String output = "";
		
		//process - logic
		//switch only takes char or int or data type is not supported
		switch(letter) {
			case 'a', 'e', 'i', 'o', 'u':
				output = "Vowel";
				break;
//			case 'e':
//				output = "Vowel";
//				break;
//			case 'i':
//				output = "Vowel";
//				break;
//			case 'o':
//				output = "Vowel";
//				break;
//			case 'u':
//				output = "Vowel";
//				break;
			default:
				output = "Not a Vowel!"; //if none of the case above is true
				break;
		}
		
		
		//output
		System.out.println(output);
	}

}
