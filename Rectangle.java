//Name: Konnie Detoudom
//Project 5

public class Rectangle {

	//data members
	private double length;
	private double width;
	
	//add a constructor method that takes in 2 double arguments named len and wid and sets the values for length and width
	
	public Rectangle(double len, double wid)
	{
		length = len;
		width = wid;
	}
	
	//add another constructor method that takes in 1 double argument named len and sets the values for length and width
	
	public Rectangle(double len)
	{
		length = len;
		width = 0;
	}
	
	//add a no-arg constructor method that sets the values for length and width
	
	public Rectangle( )
	{
		length = 0;
		width = 0;
	}
	
	//add an overloaded method named "set" that will take in 2 double variables named newLength and newWidth and set the values for length and width
	
	public void set(double newLength, double newWidth)
	{
		length = newLength;
		width = newWidth;
	}
	
	
	public void set(double newLength)
	{
		length = newLength; 
	}
		
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double calculateArea()
	{
		double area = length * width;
		return area;
	}
	
	//add a toString method
	
	public String toString()
	{
		return("Length: " + length + "Width: " + width);
	}
	
	//add an equals method
	
	public boolean equals(Rectangle otherRectangle)
	{
		return( (length == otherRectangle.length) && (width == otherRectangle.width));
	}

}
