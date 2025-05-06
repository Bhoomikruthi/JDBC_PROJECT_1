package com.Test;
import java.util.Scanner;
public class Program_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World!...");
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int Square = n*n;
		System.out.println("Square of the number"+n+"is"+Square);
	}

}
