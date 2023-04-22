package lab5.Products;

public class cleaning extends product {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public cleaning(String brand){
        this.brand=brand;
    }

    public String toString(){
        return super.toString()+
            "Brand: "+ brand+"\n";
    }
}
