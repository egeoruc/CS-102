package lab5.Products;

public class dairy extends food{
    private boolean pasteurized;
    public dairy(double taxRate, double kgs, boolean pasteurized, String name){
       super(taxRate, kgs);
       setName(name);
       this.pasteurized=pasteurized;

    }
    public boolean isPasteurized() {
        return pasteurized;
    }
    public void setPasteurized(boolean pasteurized) {
        this.pasteurized = pasteurized;
    }
    public String toString(){
        return super.toString()+
            "Pasteurized: "+pasteurized+"\n";
    }
}
