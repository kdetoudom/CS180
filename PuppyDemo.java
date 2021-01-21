
public class PuppyDemo {

	public static void main(String[] args) {
		Puppy Rascal = new Puppy();
		Puppy Scruffy = new Puppy("Scruffy", "Pomeranian", 2, 5.0);
		
		Rascal.setWeight(22.5);
		if (Scruffy.equals(Rascal))
			System.out.println(Scruffy + " equals " + Rascal);
		else
			System.out.println(Scruffy + " does not equal " + Rascal);
		
		Rascal.toString();
		Scruffy.toString();
	}

}
