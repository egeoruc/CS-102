package lab4;

public class Test {

	public static void main(String[] args) {
				
		Cloth sweaters = new Cloth(20, "darkGray", "A");
		sweaters.setTaxRate(18);
		sweaters.setName("sweaters");
		sweaters.setQuantity(2);
		System.out.println(sweaters);

		Trousers jean = new Trousers(30, "blue", "B");
		jean.setPrice(50.99);
		jean.setName("skinny jean");
		jean.setQuantity(0);
		System.out.println(jean);

		Dairy milk = new Dairy(25, 1, true, "milk");
	    milk.setExpirationDate("09.11.2018");
	    milk.setPrice(2.95);
	    System.out.println(milk);
	
	    Food pepper = new Food("pepper");
	    System.out.println(pepper);
	    
	    DishWashing tablet = new DishWashing("C");
	    tablet.setLts(30);
	    tablet.setLiquid(false);
	    tablet.setName("tablet");
	    System.out.println(tablet);
	    
	    Vegetable lemon = new Vegetable(15, 1, true, "lemon");
	    lemon.setExpirationDate("19.11.2018");
	    lemon.setPrice(5.15);
	    System.out.println(lemon);

		System.out.println(mil.getName());


	}

}
