package lab4;

public class Dairy extends Food {
	private boolean pasteurized;

	public Dairy(double taxRate, double kgs, boolean pasteurized, String name){
		super(taxRate, kgs);
		this.pasteurized = pasteurized;
		this.setName(name);
	}

	public boolean isPasteurized() {
		return pasteurized;
	}

	public void setPasteurized(boolean pasteurized) {
		this.pasteurized = pasteurized;
	}

	public String toString(){
		return super.toString() + "Pasteurized: " + pasteurized + "\n";
	}
}
