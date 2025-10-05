package activities;

class Car {
	// Properties (fields)
	String brand;
	String color;
	int speed;
	// Constructor
	Car(String b, String c, int s) {
	brand = b;
	color = c;
	speed = s;
	}
	// Methods (behaviors)
	void drive() {
	System.out.println(brand + " is driving at " + speed + " km/h.");
	}
	void stop() {
	System.out.println(brand + " has stopped.");
	}

public class test {
	
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Red", 120);
		Car car2 = new Car("Honda", "Blue", 100);
		// Call methods
		car1.drive();
		car2.drive();
		car1.stop();
		
	}

}
}
