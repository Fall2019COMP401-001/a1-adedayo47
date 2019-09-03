package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalCust = scan.nextInt();
		for (int i=0; i < totalCust; i++ ) {
			String firstName = scan.next();
			char firstInt = firstName.charAt(0);
			String lastName = scan.next();
			int itemTotal = scan.nextInt();
			double total = 0.00;
			for (int j=0; j<itemTotal; j++) {
				int itemNum = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				total += (itemNum * price);
			}
			String getTotal = String.format("%.2f", total);
			System.out.println(firstInt + ". " + lastName + ": " + getTotal); 
		}
		scan.close();
	}
}
