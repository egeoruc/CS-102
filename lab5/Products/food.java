package lab5.Products;

/**
 * food
 */
public class food extends product{
    private double kgs;
    private String expDate;

    public food(double taxRate, double kgs){
        super(taxRate);
        expDate = "13.11.2018";
		this.kgs = kgs;
    }
    public food(String name){
        super();
        expDate = "13.11.2018";
        setName(name);
    }

    public double getKgs() {
        return kgs;
    }

    public void setKgs(double kgs) {
        this.kgs = kgs;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    
    public String toString(){
        return super.toString()+
            "Kgs: "+kgs+"\n"+
            "Expiration Date: "+expDate+"\n";
    }

}