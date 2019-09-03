package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		String[] items = new String[count];
		double[] prices = new double[count];
		for (int i=0; i<items.length; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		int totalCust = scan.nextInt();
		double total = 0.00;
		
		double biggestPrice = 0.00;
		String biggestCust = "";
		double smallestPrice = 10000.00;
		String smallestCust = "";
		
		for (int j=0; j<totalCust; j++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemNum = scan.nextInt();
			double amountSpent = 0.00;
			for (int k=0; k<itemNum; k++) {
				int quantity = scan.nextInt();
				String item = scan.next();
				for (int l=0; l<items.length; l++) {
			
					if (items[l].contentEquals(item)) {
					amountSpent += (quantity * prices[l]);
					}
				}
			}
			if (amountSpent > biggestPrice) {
				biggestPrice = amountSpent;
				biggestCust = firstName + " " + lastName;				
				
			}
			if (amountSpent < smallestPrice) {
				smallestPrice = amountSpent;
				smallestCust = firstName + " " + lastName;
			}
			total += amountSpent;
			
		}
		double average = (total / totalCust);
		String getAverage = String.format("%.2f", average);
		String getBiggest = String.format("%.2f", biggestPrice);
		String getSmallest = String.format("%.2f", smallestPrice);
		System.out.println("Biggest: " + biggestCust + " ("  + getBiggest + ")" );
		System.out.println("Smallest: " + smallestCust + " ("  + getSmallest + ")" );
		System.out.println("Average: " + getAverage);


				
	}
}
