
public class Shop {

	public static void main(String[] args) {
	 Product[] products = new Product [2];
	 
	 products[0] = new Product("Samsung Syncmaster", 700.0);
	 products[1] = new Product("HP Probook 450", 3000.0);
	 
	 System.out.println("Produkty w sklepie: ");
	 System.out.println(products[0].getProductInfo());
	 System.out.println(products[1].getProductInfo());
	 
	}

}
