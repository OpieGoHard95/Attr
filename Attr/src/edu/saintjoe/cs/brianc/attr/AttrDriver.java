package edu.saintjoe.cs.brianc.attr;

public class AttrDriver {
	
	public static void main(String[] args) {
		
	Attr one;
	Attr two;
	
	one = new Attr("Name", "Jared");
	two = new Attr("Height", 60);
	
	System.out.println(one.toString());
	System.out.println(two.toString());
	}
}
