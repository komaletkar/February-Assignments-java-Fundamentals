package Assignments;

import java.util.Scanner;

public class convertFerihentToCelcius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		float fehrenheit = sc.nextFloat();
		float celcius = ((fehrenheit-32)*5)/9; 
		System.out.println(celcius);

	}

}
