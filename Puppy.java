
public class Puppy 
{
	// Data members
	private String name;
	private String breed;
	private int age;
	private double weight;
	
	// Method Members
	// Method 1 - Full-argument constructor
	public Puppy (String dogname, String dogbreed, int dogage, double dogweight)
	{
		name = dogname;
		breed = dogbreed;
		age = dogage;
		weight = dogweight;
	}
	
	// Method 2 - No-argument constructor
	public Puppy()
	{
		name = null;
		breed = null;
		age = 0;
		weight = 0.0;
	}
	
	// Method 3 - setName
	public void setName(String dogname)
	{
		this.name = dogname;
	}
	
	// Method 4 - getName
	public String getName()
	{
		return name;
	}
	
	// Method 5 - setBreed
	public void setBreed(String dogbreed)
	{
		this.breed = dogbreed;
	}
	
	// Method 6 - getBreed
	public String getBreed()
	{
		return breed;
	}
	
	// Method 7 - setAge
	public void setAge(int dogage)
	{
		this.age = dogage;
	}
	
	// Method 8 - getAge
	public int getAge()
	{
		return age;
	}
	
	// Method 9 - setWeight
	public void setWeight(double dogweight)
	{
		this.weight = dogweight;
	}
	
	// Method 10 - getWeight
	public double getWeight()
	{
		return weight;
	}
	
	// Method 11 - set (accepts 4 args)
	public void set(String dogname, String dogbreed, int dogage, double dogweight)
	{
		name = dogname;
		breed = dogbreed;
		age = dogage;
		weight = dogweight;
	}
	
	// Method 12 - set (accepts 2 string args)
	public void set(String dogname, String dogbreed)
	{
		name = dogname;
		breed = dogbreed;
	}
	
	// Method 13 - equals (compare 2 Pet's data to see if equal
	public boolean equals(Puppy otherPuppy)
	{
		return( (name.equals(otherPuppy.name)) && (breed.equals(otherPuppy.breed) ) && (age == otherPuppy.age) && (weight == otherPuppy.weight));
	}
	
	// Method 14 - toString()
	public String toString()
	{
		return(name + " " + breed + " " + age + " " + weight);
	}
	}
