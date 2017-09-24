package task2.taxi;

public class Car extends Vehicle {
	private String name;
	private static final int NSEATS = 4;
	private double consumption;
	private Cost buscost;

	
	public Cost getBuscost() {
		return buscost;
	}

	public void setBuscost(Cost buscost) {
		this.buscost = buscost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public static int getNseats() {
		return NSEATS;
	}

	public Car(String name, double consumption) {
		this.name = name;
		this.consumption = consumption;
	}

	@Override
	public void createOrder() {
	System.out.println("заказ л/a: ");
	}

	@Override
	public void cancelOrder() {
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + ", consumption=" + consumption + "]";
	}

}
