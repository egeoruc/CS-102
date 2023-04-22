package lab5.Products;

public class product {
    
    private double taxRate;
    private String name;
    private double price;

    public product (){
        taxRate=18;
        price=1;
    }
    public product (double taxRate){
        this.taxRate=taxRate;
    }
    public product(double taxRate, double price){
        this.taxRate=taxRate;
        this.price=price;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getTax(){
        return taxRate;
    }
    public void setTax(double taxRate){
        this.taxRate=taxRate;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public String toString(){
        return "Name: "+name+ "\n" +
                "Tax Rate: "+taxRate+"\n"+
                "Price: "+price+"\n";
    }
}
