package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities_enum.OrderStatus;

public class Order {
	
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {	
	}
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}
	
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double valueOrder() {
		double sum = 0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: ");
		sb.append(moment + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\nClient" + "\n");
		sb.append(client + "\nOrder items:" + "\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total Price: $");
		sb.append(String.format("%.2f", valueOrder()));
		
		return sb.toString();
	}
	
	
	}

