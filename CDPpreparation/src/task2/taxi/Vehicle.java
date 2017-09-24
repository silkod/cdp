package task2.taxi;

public abstract class Vehicle {
	
	private double consumption;
	
	public double getConsumption() {
		return consumption;
	}

	

	public abstract void createOrder();

	public abstract void cancelOrder();
}
