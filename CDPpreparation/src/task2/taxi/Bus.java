package task2.taxi;

public class Bus extends Vehicle {
	private String name;
	private static final int NSEATS = 10;
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

	public Bus(String name, double consumption) {
		super();
		this.name = name;
		this.consumption = consumption;
	}

	@Override
	public void createOrder() {
	}

	@Override
	public void cancelOrder() {
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + ", consumption=" + consumption + "]";
	}

}
