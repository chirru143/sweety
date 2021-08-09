package abcd;

import java.util.Scanner;

public class EvenOrodd {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int num;
		System.out.println("enter a number");
		num=ab.nextInt();
		if(num%2==0)
		{
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
		

	}

}
