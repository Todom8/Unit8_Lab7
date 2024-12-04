package exceptions;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Wallet wallet = new Wallet();
		while(true) {
			System.out.print("Enter Amount (Type \"QUIT\" to Quit): ");
			String inputValue = input.next();
			if (inputValue == "QUIT") {
				return;
			}
			try {
				double total = Double.parseDouble(inputValue);
				wallet.setTotal(total);
				System.out.println(wallet);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, try again.");
			}
			System.out.println("\n\n");
		}
	}
}
