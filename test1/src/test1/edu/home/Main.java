package test1.edu.home;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("a = ");
		double a = s.nextDouble();
		System.out.print("b = ");
		double b = s.nextDouble();
		
		if(a==0)
			if(b==0)
				System.out.println("Vo so nghiem");
			else
				System.out.println("Vo nghiem");
		else
			System.out.println("x = " + (-b/a));	
	}
}
