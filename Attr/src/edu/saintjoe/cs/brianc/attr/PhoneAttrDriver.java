package edu.saintjoe.cs.brianc.attr;

public class PhoneAttrDriver {
	public static void main(String [] args) {
		PhoneAttr testPhone = new PhoneAttr();
		System.out.println(testPhone.toString());
		PhoneAttr iphone6 = new PhoneAttr("Apple", "iPhone6", 2);
		System.out.println(iphone6.toString());
		PhoneAttr galaxys6 = new PhoneAttr("Samsung", "Galaxy S6");
		System.out.println(galaxys6.toString());
		PhoneAttr Android = new PhoneAttr("Android");
		System.out.println(Android.toString());
	}

}
