package task2.taxi;

public class Car extends Vehicle {
	private String name;
	private static final int NSEATS = 3;
	private double consumption;
	private Cost carcost;

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

	public Car() {
	}

	public Car(String name, double consumption) {
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
		return "Car [name=" + name + ", consumption=" + consumption + "]";
	}

}
