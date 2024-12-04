package exceptions;

import java.lang.Math;

public class Denomination {
	private String name;
	private double value;
	private int count;
	
	public Denomination(String newName, double newVal) {
		setValue(newVal);
		setName(newName);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double newVal) {
		if (newVal > 0.0) {
			value = newVal;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public double calculateMaxCount(double val) {
		if (value == 0.0) {
			return 0;
		}
		count = (int) Math.floor(val / value);
		return val - (count * value);
	}
	
	public double getTotal() {
		return count * value;
	}
	
	public String toString() {
		return getCount() + " " + getName();
	}
}
