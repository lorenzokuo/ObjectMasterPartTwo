
public class Human {
	public String name = "no name";
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void attack(Human x) {
		x.health = x.health-3;
		System.out.println(x.name + " has been attacked by " + this.name);
	}
	
	public void display() {
		System.out.println(" ");
		System.out.println("Character: "+this.name);
		System.out.println("Current strength: " + this.strength);
		System.out.println("Current stealth: " + this.stealth);
		System.out.println("Current intelligence: " + this.intelligence);
		System.out.println("Current health: " + this.health);

	}
}
