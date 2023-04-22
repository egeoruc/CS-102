package lab5.Products;

public class skirt extends cloth{
    public skirt( int quantity, String brand, String color, double taxRate, String Name){
        super(taxRate, color, brand);
        setName(Name);
        setQuantity(quantity);
    }
    
}
