package edu.saintjoe.cs.brianc.attr;

public class ScreenColor {
	
	
	private int colorValue;
	private String description;

	
	
	public ScreenColor(Object colorDescriptor) {
		description = (String) colorDescriptor;
	    colorValue = encode(colorDescriptor);
	    }
	  

	private int encode(Object foo) {
		  if (foo.equals("transparent"))
			  
			  return -1;
		  else if (foo.equals("red"))
			  
			  return 0xff0000;
		  else if (foo.equals("green"))
		  		return 0x00cc00;
		  else if (foo.equals("yellow"))
			  	return 0x999900;
		  else if (foo.equals("crimson"))
			  return 0xF71111;
		  else if (foo.equals("chartreuse"))
			  return 0x81F781;
		  
		 
		  return -1;
	  }
	
	
	  public String toString() {
		  return description;
	  }
	  public String toNumberString() {
		  return Integer.toHexString(colorValue);
	  }
	}