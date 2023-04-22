package lab5.Products;

public class vegetable extends food{
    private boolean organic;

    public vegetable(double taxRate, double kgs, boolean organic, String name){
        super(taxRate, kgs);
        setName(name);
        this.organic=organic;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }
    public String toString(){
        return super.toString()+
            "Organic: "+organic+"\n";
    }
    
    
}
