package lab5.Products;

public class detergent extends cleaning{
    private int lts;
    private boolean liquid;

    public detergent(String brand){
        super(brand);
    }
    public detergent(String brand, int lts, boolean liquid){
        super(brand);
        this.lts=lts;
        this.liquid=liquid;
    }
    public int getLts() {
        return lts;
    }
    public void setLts(int lts) {
        this.lts = lts;
    }
    public boolean isLiquid() {
        return liquid;
    }
    public void setLiquid(boolean liquid) {
        this.liquid = liquid;
    }
    
    public String toString(){
        return super.toString()+
            "Lts: "+lts+"\n"+
            "Liquid: "+liquid+"\n";
    }
}
