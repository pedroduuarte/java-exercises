package entities;

public class Client {
	private String accountNumber;
	private String name;
	private double actualBalance;

	public Client(String accountNumber, String name, double inicialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(inicialDeposit);
	}
	
	public Client(String accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	} 
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getActualBalance() {
		return this.actualBalance;
	}
	
	public double deposit(double valueDeposit) {
		actualBalance += valueDeposit;
		return actualBalance;
	}
	
	public double withdraw(double valueWithdraw) {
		actualBalance -= (valueWithdraw + 5);
		return actualBalance;
	}
	
	public String toString() {
		return "Account " + getAccountNumber() + ", Holder: " + getName() + 
				", Balance: $ " + String.format("%.2f", getActualBalance() ); 
				
	}
	
}