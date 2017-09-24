package task1.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.println("����� ����� ����� 1: ");
		String num1 = reader.readLine();
		while (num1.contains(".") || num1.contains(",")) {
			System.out.println("��������� ����� ������ ���� �����! ����� ����� �����: ");
			num1 = reader.readLine();
		}
		int a = Integer.parseInt(num1);

		System.out.println("����� ����: (+ - * /)");
		String operation = reader.readLine();
		
		System.out.println("����� ����� ����� 2: ");
		String num2 = reader.readLine();
		while (num2.contains(".") || num2.contains(",")) {
			System.out.println("��������� ����� ������ ���� �����! ����� ����� �����: ");
			num2 = reader.readLine();
		}
		int b = Integer.parseInt(num2);

	

		switch (operation) {
		case "+":
			Operate.plus(a, b);
			break;
		case "-":
			Operate.minus(a, b);
			break;
		case "*":
			Operate.multiply(a, b);
			break;
		case "/":
			Operate.division(a, b);
			break;
		}

	}
}
