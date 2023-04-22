
public class CarTest {
	public static void main(String[] args) {
		Car toyota = new Car("Toyota", "Red");
		Car sedan = new Car("Sedan", "Blue");
		Car cherokee = new Car("Cherokee");
		
		toyota.drive(5.2, 70);
		toyota.incrementGear();
		toyota.display();
	
		sedan.drive(7, 85);
		sedan.display();
		sedan.decrementGear();
		sedan.display();
		
		// decrementGear() BONUS test
		sedan.decrementGear();
		sedan.decrementGear();
		

		cherokee.drive(4.8, 60.5);
		cherokee.incrementGear();
		cherokee.incrementGear();
		cherokee.display();
		
		// incrementGear() BONUS test
		cherokee.incrementGear();
		cherokee.incrementGear();
		
	}
	
}
