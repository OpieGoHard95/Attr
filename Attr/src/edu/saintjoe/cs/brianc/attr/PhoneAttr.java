package edu.saintjoe.cs.brianc.attr;

public class PhoneAttr {
	public String company;
	public String model;
	public int quantity;
	
	PhoneAttr() {
		company = "No company given";
		model = "No model given";
		quantity = 1;
	}
	
	PhoneAttr(String thisCompany, String thisModel, int thisQuantity) {
		company = thisCompany;
		model = thisModel;
		quantity = thisQuantity;
	}
	
	PhoneAttr(String thisCompany, String thisModel) {
		this();
		company = thisCompany;
		model = thisModel;
	}
	
	PhoneAttr(String thisCompany) {
		this();
		company = thisCompany;
	}
	
	public String toString() {
		String output = "";
		output = company + " manufactured this phone," + " it is a " + model + ", and you have: " + quantity + " of them.";
		return output;
				
	}
}
