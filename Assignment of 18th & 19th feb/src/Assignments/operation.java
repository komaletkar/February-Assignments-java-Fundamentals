package Assignments;

import java.util.Scanner;

public class operation {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter character");
	char a = sc.next().charAt(0);
	
	System.out.println("Enter  first number ");
	int b = sc.nextInt();
	
	System.out.println("Enter second number ");
	int c = sc.nextInt();
	
	System.out.println(a);
	
	int add=a+b+c;
	int sub=a-b-c;
	int mul=a*b*c;
	double div=a/b/c;
	
	System.out.println(add);
	System.out.println(sub);
	System.out.println(mul);
	System.out.println(div);
	}

}
