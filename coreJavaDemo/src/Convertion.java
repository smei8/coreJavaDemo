//write a program to convert a cel to a fa
//write a program to convert km to m
import java.util.Scanner;

public class Convertion {
	public static double tempConvert(double temp) {
		double fah = (temp * 9/5) + 32;
		return fah;
	}
	public static int kmConvert(int km) {
		int length = km * 1000;
		return length;
	}
	public static void main(String[] args) {
		//input 
		//double cel = 5;
		//getting user input temp
		Scanner celInput = new Scanner(System.in);
		System.out.println("Enter a temperture in Celsius: ");
		
		double cel = celInput.nextDouble();
		double tempConvert = tempConvert(cel);
		System.out.println("Celsius "+ cel + " = " + tempConvert);
		
		Scanner kmInput = new Scanner(System.in);
		System.out.println("Enter the length in Kilometer: ");
		
		int km = kmInput.nextInt();
		int kmConvert = kmConvert(km);
		System.out.println("Kilometer " + km + " = " + kmConvert);	
	}

}
