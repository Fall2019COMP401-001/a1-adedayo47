package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		String[] items = new String[count];
		double[] prices = new double[count];
		int[] sold = new int[count];
		String[] custInitials = new String[count];
		for (int u =0; u<custInitials.length; u++) {
			custInitials[u] = "z";
		}
		int[] custBought = new int[count];
		
		for (int i=0; i<items.length; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
			sold[i] = 0;
			
			
		}
		int totalCust = scan.nextInt();
		
				
		for (int j=0; j<totalCust; j++) {
			String firstName = scan.next();
			String lastName = scan.next();
			char firstInitial = firstName.charAt(0);
			char lastInitial = lastName.charAt(0);
			String initials = String.valueOf(firstInitial + lastInitial);
			int repeat = 0;
			int itemNum = scan.nextInt();
			for (int k=0; k<itemNum; k++) {
				int quantity = scan.nextInt();
				String item = scan.next();
				for (int l=0; l<items.length; l++) {
			
					if (items[l].contentEquals(item)) {
						sold[l] += (quantity);
						if (custInitials[l].contentEquals(initials)) {
							repeat += 1;
						} else { 
							custInitials[l] = initials;
							custBought[l] += 1;
							}
						
						
					}		
				}
			}
		}
		for (int m=0; m<items.length; m++) {
			if (custBought[m] == 0 ) {
				System.out.println("No customers bought "+ items[m]);
			} else {
				System.out.println(custBought[m] + " customers bought " + sold[m] + " " + items[m]);
				}
		}
	}
}
