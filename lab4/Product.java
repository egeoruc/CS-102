package lab4;

public class Product {
	private double taxRate;
	private String name;
	private double price;

	public Product(){
		taxRate = 18;   // 18 %
		price = 1;      // 1 TL
	}

	public Product(double taxRate){
		this.taxRate = taxRate;
		System.out.println("this comes from produc");
	}

	public Product(double taxRate, double price){
		this.taxRate = taxRate;
		this.price = price;
	}
  
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public String toString(){
		return "Name: " + name + "\n" +
				"Tax rate: " + taxRate + "\n" +
				"Price: " + price + "\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}