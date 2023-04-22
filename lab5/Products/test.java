package lab5.Products;

public class test {
    public static void main(String[] args) {
        cloth sweaters = new cloth(20, "darkGray", "A");
		sweaters.setTax(18);
		sweaters.setName("sweaters");
		sweaters.setQuantity(2);
		System.out.println(sweaters);

		trousers jean = new trousers(30, "blue", "B");
		jean.setPrice(50.99);
		jean.setName("skinny jean");
		jean.setQuantity(0);
		System.out.println(jean);

		dairy milk = new dairy(25, 1, true, "milk");
	    milk.setExpDate("09.11.2018");
	    milk.setPrice(2.95);
	    System.out.println(milk);
	
	    food pepper = new food("pepper");
	    System.out.println(pepper);
	    
	    dishwashing tablet = new dishwashing("C");
	    tablet.setLts(30);
	    tablet.setLiquid(false);
	    tablet.setName("tablet");
	    System.out.println(tablet);
	    
	    vegetable lemon = new vegetable(15, 1, true, "lemon");
	    lemon.setExpDate("19.11.2018");
	    lemon.setPrice(5.15);
	    System.out.println(lemon);
    }
}
