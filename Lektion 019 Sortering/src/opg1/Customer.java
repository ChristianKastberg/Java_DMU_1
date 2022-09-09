package opg1;

public class Customer {

	private String name;
	private int income;

	public Customer(String name, int income) {
		this.name = name;
		this.income = income;
	}

	public int customerCompare(Customer customer) {
		return income - customer.getIncome();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return income + "income";
	}
}
