
public class Product {
 
String name;
double price;

// konstruktor
Product(String name, double price) {
	this.name = name;
	this.price = price;
}

String getProductInfo() {
return name + " : " + price;
}
}
