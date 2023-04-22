package lab4;

public class Detergent extends Cleaning {
	private double lts;
	private boolean liquid;

	public Detergent(String brand, double lts, boolean liquid) {
		super(brand);
		this.lts = lts;
		this.liquid = liquid;
	}

	public Detergent(String brand){
		super(brand);
	}

	public void setLts(double lts){
		this.lts = lts;
	}
	public double getLts() {
		return lts;
	}

	public boolean isLiquid() {
		return liquid;
	}

	public void setLiquid(boolean liquid) {
		this.liquid = liquid;
	}

	public String toString(){
		return super.toString() +
				"Lts: " + lts + "\n" +
				"Liquid: " + liquid + "\n";
	}
}