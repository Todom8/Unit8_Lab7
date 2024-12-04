package exceptions;

import java.util.ArrayList;

public class Wallet {
	private ArrayList<Denomination> denominations = new ArrayList<Denomination>();
	
	public Wallet() {
		addDenomination("Ten Dollar Bill(s)", 10.0);
		addDenomination("Five Dollar Bill(s)", 5.0);
		addDenomination("One Dollar Bill(s)", 1.0);
		addDenomination("Quarter(s)", 0.25);
		addDenomination("Dime(s)", 0.10);
		addDenomination("Nickle(s)", 0.05);
		addDenomination("Penny(s)", 0.01);
	}
	
	public void addDenomination(String name, double value) {
		Denomination newDenomination = new Denomination(name, value);
		for (int i = 0; i < denominations.size(); i++) {
			if (denominations.get(i).getValue() < newDenomination.getValue()) {
				denominations.add(i, newDenomination);
				return;
			}
		}
		denominations.add(newDenomination);
	}
	
	public void setTotal(double total) {
		for (int i = 0; i < denominations.size(); i++) {
			total = denominations.get(i).calculateMaxCount(total);
		}
	}
	
	public double getTotal() {
		double total = 0.0;
		for (int i = 0; i < denominations.size(); i++) {
			total += denominations.get(i).getTotal();
		}
		return total;
	}
	
	public String toString() {
		String returnStr = "";
		for (int i = 0; i < denominations.size(); i++) {
			returnStr += "\n" + denominations.get(i);
		}
		return returnStr;
	}
}
