package demo;

import java.util.Scanner;

public class convertInchToMeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int inch = sc.nextInt();
		double meter = inch/39.37;
		System.out.println(meter);

	}

}
