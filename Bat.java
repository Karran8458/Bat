public class Bat {
	int energy = 300;
	public void Bat() {
    this.energy = energy;
    }
	public void fly() {
	System.out.println("The sound of a bat taking off");
	this.energy = this.energy - 50;
	}
	public void eatHumans() {
	System.out.println("So- well, never mind");
	this.energy = this.energy + 25;
	}
	public void attackTown() {
	this.energy = this.energy - 100;
	System.out.println("The sound of a town on fire");
	}
}
