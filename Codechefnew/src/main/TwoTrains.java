package main;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoTrains {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number test cases:- ");
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("number of stations:- ");
			int n = sc.nextInt();
			int sum = 0;
			int max = 0;
			for (int j = 1; j < n; j++) {
				System.out.println("time in seconds");
				int b = sc.nextInt();
				sum = sum + b;
				if(max < b) {
					max = b;
				}
			}
			sum = sum + max;
			System.out.println(sum);
		}
	}
}