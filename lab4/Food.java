package lab4;

public class Food extends Product {
	private double kgs;
	private String expirationDate;

	

	public Food(double taxRate, double kgs){
		super(taxRate);
		expirationDate = "13.11.2018";
		this.kgs = kgs;
	}

	public Food(String name){
		super();
		expirationDate = "13.11.2018";
		this.setName(name);
	}

	public void setKgs(double kgs){
		this.kgs = kgs;
	}

	public void setExpirationDate(String  expirationDate){
		this.expirationDate = expirationDate;
	}

	public double getKgs() {
		return kgs;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public String toString(){
		return super.toString() + "Kgs : " + kgs + "\n" +
				"Expiration date: " + expirationDate + "\n";
	}
}
