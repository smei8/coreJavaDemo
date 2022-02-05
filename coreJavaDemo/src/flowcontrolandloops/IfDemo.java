
package flowcontrolandloops;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to check if a number is greater than 10
		//input
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int numInput = number.nextInt();
		
		//int number = 5;
		String output = " ";
		
		//process
		if(numInput > 10) {
			//if true
			output = "the number is greater than 10";
		} else { output = "the number is less than 10"; } //if false
			
		
		//output
		System.out.println(output);
	}

}
