package generic;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(20, 10, 20);
		
		BoxGeneric<Float, Double> box2 = new BoxGeneric<Float, Double>(20.5f, 10.5f, 5.5f); // a decimal literal by default is a double literal that is being stored in a float
																			// here we are explicitly casting a double to a float
		BoxGeneric<Integer, Double> box3 = new BoxGeneric<Integer, Double>(50, 30, 20);
	}

}


//generic is available from java 1.8
//autoboxing - from java 1.8
//Primitive			   Wrapper
//  byte				byte
// short				Short
//  int 				Integer
//  long				Long

// float				Float
// double				Double

// boolean				Boolean

// char					Character