//write a program to find the square of a number
//write a program to find the cube of a number
//write to find the ascii number
//write a program to convert a cel

// input
// process
// output


//scope of the variable 
public class MethodDemo {
	//defining the method (method definition)
	public static int squareOfNum(int num) {
		//process
		int square = num * num;
		return square;
	}
	public static int cubeOfNum(int num) {
		//process
		int cube = num * num * num;
		return cube;
	}
	public static int asciiOfch(char ch) {
		int asciiVal = (int) ch;
		return ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		int number = 30;
		char ch = 'a';
		
		//method invocation
		int answerSq = squareOfNum(number);
		int answerCub = cubeOfNum(number);
		
		//output
		System.out.println("The square of " + number + " is " + answerSq);
		System.out.println("The cube of " + number + " is " + answerCub);
		System.out.println("The ASCII value of character " + ch + " is " + asciiOfch(ch));
	}

}
