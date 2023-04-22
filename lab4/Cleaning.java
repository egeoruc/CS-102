package lab4;

public class Cleaning extends Product {
	private String brand;

	public Cleaning(String brand){
		this.brand = brand;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		 return brand;
	}
	public String toString(){
		return super.toString() +
				"Brand: " + brand + "\n";
	}
}
