
public class VariableDemo {
	public static void main(String[] args) {
		//8 primitive data types
		
		//byte - takes 1 byte of memory - a whole number
		//short - takes 2 bytes of memory
		//int - 4 bytes
		//long - 8 bytes
		
		//float - decimal number
		//double
		
		//boolean - true or false
		
		//char - single character
		
		//int literal - negative and positive whole numbers
		//float literal - decimal numbers - 4.5, 2.7
		//declaring a variable
		int englishMark;
		
		//assigning a variable
		englishMark = 20;
		
		//initialize a variable
		int mathMark = 50;
		
		System.out.println("English Mark : " + englishMark);
		System.out.println("Math Mark : " + mathMark);
		
		short test = 4567;
		
		long longTest = 234567890;
		
		boolean flag = true;
		boolean result = false;
		
		System.out.println("Flag : " + flag);
		System.out.println("Result : " + result);
		
		char option = 'y';
		System.out.println("Option : " + option);
		
		//type casting
		byte data = 45;
		int myData = data; //implicit casting
		
		byte smallData = (byte) myData; //explicit casting
		//explicit casting only if you are sure that the data is small enough to fil
		
		double socialMark = 45.67;
		
		float scienceMark = 56.7f;
		//float scienceMark = (float) 56.7;
		//a decimal number by default type double float has less capacity 
		//then double so you need explicit casting
		
		System.out.println("social mark : " + socialMark);
		System.out.println("science mark : " + scienceMark);
		
	}
}
