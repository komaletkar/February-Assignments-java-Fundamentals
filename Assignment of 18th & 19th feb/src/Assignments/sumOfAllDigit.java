package Assignments;

import java.util.Scanner;

public class sumOfAllDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int last = n%10;
			sum=sum+last;
			n=n/10;
		}
		System.out.println(sum);

	}

}
