package edu.saintjoe.cs.brianc.attr;

	
	public class ColorAttr extends Attr {
		
		
		
		private ScreenColor myColor; 

		
		public ColorAttr(String name, Object value) {

			
		    super(name, value);
		  
		    decodeColor();
		    }

		public ColorAttr(String name) {
		    this(name, "transparent");
		    }

		// This is an overloaded method
		public ColorAttr(String name, ScreenColor value) {
		    super(name, value.toString());
		    myColor = value;
		    }

		// This is an example of method overriding!
		public Object setValue(Object newValue)  {
			    Object retval = super.setValue(newValue);
			    decodeColor();
			    return retval;
			    }

		/** Set value to ScreenColor, not description */
		public ScreenColor setValue(ScreenColor newValue) {
			super.setValue(newValue.toString());
			ScreenColor oldValue = myColor;
			myColor = newValue;
			return oldValue;
			}

		  /** Return decoded ScreenColor object */
		  public ScreenColor getColor() {
			    return myColor;
			    }

		  /** Set ScreenColor from description */
		  protected void decodeColor() {
			  if(getValue() == null) {
				  System.out.println("Freakout!!");
				  myColor = null; }
			  else
				  myColor = new ScreenColor(getValue());
		  		  }
		  public String toString() {
			  return super.toString() + " " + myColor.toNumberString();
		  }
	}