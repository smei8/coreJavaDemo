package arrays;

import classesandobjects.Renavation;

public class RoomArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Renavation room1 = new Renavation(20.5,20.6);
		Renavation room2 = new Renavation(20.7, 34.5);
		
		Renavation[] myRoom = new Renavation[3]; //the object is not created yet, we only created a array of 3 room references
		myRoom[0] = new Renavation(21.3, 12.3); //the room object is created
		myRoom[1] = new Renavation(15.6, 3);
		myRoom[2] = new Renavation(35.6, 3.4);
		
		//initialize an array of room object
		//Renavation[] allRooms = {new Renavation(), new Renavation(), new Renavation(), new Renavation()};
		
	}

}
