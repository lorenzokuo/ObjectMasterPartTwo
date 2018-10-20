
class Samurai extends Human {
	public static int counter = 0;

	public Samurai(String name) {
		super(name);
		super.health = 200;
		counter++;
	}
	public void deathBlow(Human x) {
		x.health = 0;
		health = health/2;
		System.out.println("'"+name+"' is shooting death blow to '"+x.name+"'");

	}
	public void meditate() {
		health = 200;
		System.out.println("'"+name+"' fully healed");
	}
	public int howMany() {
		System.out.println("Samurai Numebrs: "+counter);
		return counter;
	}
}
