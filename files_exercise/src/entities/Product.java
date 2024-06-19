package entities;

public class Product {

	private String name;
	private double unityPrice;
	private int quantity;
	
	public Product(String name, double unityPrice, int quantity) {
		this.name = name;
		this.unityPrice = unityPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnityPrice() {
		return unityPrice;
	}

	public void setUnityPrice(double unityPrice) {
		this.unityPrice = unityPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalPrice() {
		return unityPrice * quantity;
	}
	
	public String toString() {
		return name + ", " + String.format("%.2f", totalPrice());
	}
	
}
