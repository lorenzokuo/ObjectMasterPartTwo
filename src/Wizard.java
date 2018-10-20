
class Wizard extends Human {
	public Wizard(String name, int health, int intelligence) {
		super(name);
		super.health = health;
		this.intelligence = intelligence;
	}
	public void heal(Human x) {
		x.health += intelligence;
		System.out.println("'"+name+"' is healing '"+x.name+"'");
	}
	public void fireBall(Human x) {
		x.health -= intelligence*3;
		System.out.println("'"+name+"' is throwing fire ball to '"+x.name+"'");

	}

}
