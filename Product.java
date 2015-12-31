import java.io.*;

public class Product {
	String product_name;
	double product_price;
	int product_quantity;

	public Product() {

	}

	public void setName(String pname) {
		product_name = pname;
	}

	public String getName() {
		return product_name;
	}

	public void setPrice(double pprice) {
		product_price = pprice;
	}

	public double getPrice() {
		return product_price;
	}

	public void setQuantity(int pquantity) {
		product_quantity = pquantity;
	}

	public int getQuantity() {
		return product_quantity;
	}
}