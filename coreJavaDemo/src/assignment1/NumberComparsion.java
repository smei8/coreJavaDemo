package assignment1;
import java.util.Scanner;

public class NumberComparsion {
	public static int greaterOfTwo(int first, int second) {
		int a = first;
		int b = second;
		
		if (a > b) { return a; } 
		else { return b; }
		
		//what if two numbers are the same?
//		int greater = first > second ? first : second;
//		return greater;
		
	}
	public static int greatestOfThree(int first, int sec, int third) {
		int a = first;
		int b = sec;
		int c = third;
		
		//what if all three numbers are the same?
		if (a > b && a > c) { return a; } 
		else if (b > c) { return b; }
		else { return c; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
//		int first = 22;
//		int sec = 5;
//		int third = 33;
//		
		Scanner numInput1 = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num1 = numInput1.nextInt();
		
		Scanner numInput2 = new Scanner(System.in);
		System.out.println("Please enter the second number: ");
		int num2 = numInput2.nextInt();
		
		//method calling
		int greater = greaterOfTwo(num1, num2);	
		
		System.out.println(greater + " is greater!");
		
		Scanner numInput3 = new Scanner(System.in);
		System.out.println("Please enter a third number: ");
		int num3 = numInput3.nextInt();
		
		int greatest = greatestOfThree(num1, num2, num3);
		
		System.out.println(greatest + " is the greatest of them all!");
		

	}

}
