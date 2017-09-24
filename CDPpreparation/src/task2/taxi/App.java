package task2.taxi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	static Map<Vehicle, Integer> taxiCompany;

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("¬ы хотите заказать такси?" + "\n y - продолжить"
				+ "\n люба€ клавиша - отказатьс€");
		while (!reader.readLine().equals("y")) {
			System.out.println("¬озвращайтесь, когда захотите");
			return;
		}
		createTaxiC();
		countTotalCarsCost();
		List<Vehicle> vehicles = sortByConsumption();

		/*
		 * for (Vehicle vehicle : vehicles) { System.out.println(vehicle); }
		 */

	}

	public static void createTaxiC() {
		taxiCompany = new HashMap<>();
		taxiCompany.put(new Car("Audi", 9.0), 10000);
		taxiCompany.put(new Car("VW", 7.5), 7000);
		taxiCompany.put(new Car("BMW", 11.5), 14500);
		taxiCompany.put(new Van("VW", 10.5), 9000);
		taxiCompany.put(new Van("Peugeot", 11.0), 8300);
		taxiCompany.put(new Bus("Mercedes", 13.5), 11500);
	}

	public static void countTotalCarsCost() {
		int sum = 0;
		for (Integer price : taxiCompany.values()) {
			sum += price;
		}
		System.out.println("сумма стоимости всех авто в таксопарке составо€ет "
				+ sum);
	}

	public static List<Vehicle> sortByConsumption() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>(taxiCompany.keySet());
		Collections.sort(vehicles, new Comparator<Vehicle>() {
			@Override
			public int compare(Vehicle v1, Vehicle v2) {

				if (v1.getConsumption() > v2.getConsumption()) {
					return 1;
				} else if (v1.getConsumption() < v2.getConsumption()) {
					return -1;
				}
				return 0;
			}
		});
		return vehicles;
	}
}
