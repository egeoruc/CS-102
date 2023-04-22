
public class Car {
	private double odometer;
	private String brand;
	private String color;
	private int gear;

	// BONUS
	private double hoursDriven;
	
	public Car(String b, String c) {
		odometer = 0;
		brand = b;
		color = c;
		gear = 0;		
	}
	public Car(String b) {
		odometer = 0;
		brand = b;
		color = "White";
		gear = 0;		
	}
	
	public void drive(double hours, double kmph) {
		if (hours > 0 && kmph > 0) { 
			odometer += hours * kmph;
			
			// BONUS
			hoursDriven += hours;
		}
	}

	public void incrementGear(){
		// Normally
		// gear += 1;
		
		// BONUS
		if(gear <= 4)  
		  gear += 1;
		else
		  System.out.println("Cannot increment the gear anymore. It's already at " + gear +  System.lineSeparator());
	  }

	  public void decrementGear(){
		// Normally
		// gear -= 1;
			
		// BONUS		
		if(gear > 0)  
		  gear -= 1;
		else
		  System.out.println("Cannot decrement the gear anymore. It's already at " + gear + System.lineSeparator());
	  }
	  public void setColor (String c) {
		  color = c;
	  }
	  public String getBrand() {
			return brand;
	  }
	  public String getColor() {
			return color;
	  }
	  public double getOdometer() {
			return odometer;
	  }
	  public int getGear() {
			return gear;
	  }
	  
	  public void display(){
		System.out.println("The " + brand + " has color " + color + "." + 
	                       "It has traveled " + odometer + " kms so far." +
				           "It's at gear " + gear + ".");
		// BONUS
		//System.out.println("Its average speed is " + averageSpeed + " and it's driven " +
		//                 hoursDriven + " hours.");
	  }
}
