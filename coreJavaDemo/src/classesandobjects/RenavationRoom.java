package classesandobjects;

public class RenavationRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Renavation room = new Renavation(0, 0);
		
		room.length = 16;
		room.width = 13;
		room.height = 10;
		
		System.out.println("The area of your room is " + 
							room.calculateFloorArea());
		System.out.println("The cost of to paint your room is " +
							room.costOfPainting());
		
	}

}
