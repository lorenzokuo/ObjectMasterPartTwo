
class Ninja extends Human {
	public Ninja(String name) {
		super(name);
		super.stealth = 10;
	}
	public void steal(Human x) {
		health += stealth;
		x.health -= stealth;
		System.out.println("'"+name+"' is stealing health from '"+x.name+"'");

	}
	public void runAway() {
		health -= 10;
		System.out.println("'"+name+"' run away... ");
	}
}