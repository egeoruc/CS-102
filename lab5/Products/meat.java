package lab5.Products;

public class meat extends food {
    private String quality;

    public meat(double taxRate, double kgs, String quality){
        super(taxRate, kgs);
        this.quality=quality;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
    
    public String toString(){
        return super.toString()+
            "Quality: "+quality+"\n";
    }
}
