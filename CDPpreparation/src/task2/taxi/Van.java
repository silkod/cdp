package task2.taxi;

public class Van extends Vehicle {
	private String name;
	private static final int NSEATS = 6;
	private double consumption;
	private Cost vancost;


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

	public Van(String name, double consumption) {
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
		return "Van [name=" + name + ", consumption=" + consumption + "]";
	}

}
