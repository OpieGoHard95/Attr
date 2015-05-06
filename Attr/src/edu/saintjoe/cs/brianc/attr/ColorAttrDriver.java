package edu.saintjoe.cs.brianc.attr;

public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		ColorAttr testOne, testTwo, testThree;
		Attr testFour;
		
		
		ScreenColor newColor = new ScreenColor("green");
		
		
		testOne = new ColorAttr("ColorOne","red");
		System.out.println(testOne.toString());
		
		
		testTwo = new ColorAttr("ColorTwo");
		System.out.println(testTwo.toString());
		
		
		testThree = new ColorAttr("ColorThree", newColor);
		System.out.println(testThree.toString());

		testFour = new Attr("ColorFour", "yellow");
		System.out.println(testFour.toString());
		
		ColorAttr crimson = new ColorAttr("Color Five", "crimson");
		System.out.println(crimson.toString());
		
		ColorAttr chartreuse = new ColorAttr("Color Six", "chartreuse");
		System.out.println(chartreuse.toString());
		
	} 
}