package demo;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height and weight");
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		double BMI = weight/(height*height);
		System.out.println(BMI);

	
	}

}
