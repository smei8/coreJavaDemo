package interfacesandabstractclasses;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); - cannot do this because class is abstract
		
		Cat cat = new Cat();
		cat.breath();
		cat.mobility();
		cat.makeSound();
		
		System.out.println("-----------------------------------------------");
		Snake snake = new Snake();
		snake.breath();
		snake.mobility();
		snake.sound();
	}

}
