package com.gratelearning.dsa;

import java.util.Scanner;

public class Transaction {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Ask user to Enter the size of transaction array
		System.out.println("Enter the size of transaction array : ");
		int size = sc.nextInt();

		// Enter the value of array
		int txnValue[] = new int[size];
		for (int k = 0; k < size; k++) {
			System.out.println("Enter the value of array ; ");
			txnValue[k] = sc.nextInt();
		}
		// Enter the total number of targets that needs to be achieved:
		System.out.println("Enter the total number of targets that needs to be achieved: ");
		int noTargets = sc.nextInt();

		// Check whether the target can be achieved. If the target cant be achieved then
		for (int j = 0; j < noTargets; j++) {
			System.out.println("Enter the value of target: ");
			int targetValue = sc.nextInt();			
			int sumVal = 0;
			int targetAchieved;
			targetAchieved = 0;			
			for (int i = 0; i < size; i++) {
				sumVal = sumVal + txnValue[i];
				if (sumVal >= targetValue) {
					System.out.println("Target achieved after " + (i + 1) + " transactions: ");
					targetAchieved = 1;
					break;
				}
			}
			// print Given target is not achieved
			if (targetAchieved == 0) {
				System.out.println("Given target is not achieved : ");
			}
		}
		System.out.println("Thank You");
	}
}
