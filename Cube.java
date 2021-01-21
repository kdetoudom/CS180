
public class Cube extends Rectangle {
	
	// data members
	private double height;
	
	// methods
	public Cube(double len, double wid, double hght)
	{
		super(len, wid);
		height = hght;
	}
	
	public Cube()
	{
		super();
		height = 0.0;
	}
	
	public void setHeight(double hght)
	{
		height = hght;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void set(double newLength, double newWidth, double hght)
	{
		super.set(newLength, newWidth);
		height = hght;
	}
	
	public double calculateVolume()
	{
		double area = super.calculateArea();
		double volume = area * height;
		return volume;
	}
	
	public boolean equals(Cube otherCube)
	{
		return (super.equals(otherCube)
				&& getHeight() == otherCube.getHeight());
	}
	
	public String toString()
	{
		return(super.toString() + " " + height);
	}
}
