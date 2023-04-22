package lab4;

public class Vegetable extends Food {
	private boolean organic;

	public Vegetable(double taxRate, double kgs, boolean organic, String name) {
		super(taxRate, kgs);
		this.organic = organic;
		this.setName(name);
	}
  
	public boolean isOrganic() {
		return organic;
	}

	public void setOrganic(boolean organic) {
		this.organic = organic;
	}

	public String toString(){
		return super.toString() +
				"Is organic: " + organic + "\n";
	}
}