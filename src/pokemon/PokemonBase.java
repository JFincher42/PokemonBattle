package pokemon;

public class PokemonBase {
	protected String name;			// The name of the Pokemon
	protected int health;			// Current health
	protected int attack;
	protected int defense;
	protected int speed;			// OPTIONAL: used for figuring out who goes first
	
	public PokemonBase() {
	}
	
	public PokemonBase(String name, int health, int attack, int defense, int speed) {
	}
	
	public String getName() {
		// TODO: Add your implementation here
	}
	
	public int getHealth() {
		// TODO: Add your implementation here
	}
	
	public boolean isDown() {
		// TODO: Add your implementation here
	}
	
	public boolean hasHealed() {
		// TODO: Add your implementation here
	}
	
	public int getAttack() {
		// TODO: Add your implementation here
	}
	
	public int getDefense() {
		// TODO: Add your implementation here
	}
	
	public int getSpeed() {
		// TODO: Add your implementation here
	}
	
	public void setName(String name) {
		// TODO: Add your implementation here
	}
	
	public void setHealth(int health) {
		// TODO: Add your implementation here
	}
	
	public void setAttack(int attack) {
		// TODO: Add your implementation here
	}
	
	public void setDefense(int defense) {
		// TODO: Add your implementation here
	}
	
	public void setSpeed(int speed) {
		// TODO: Add your implementation here
	}
	
	public String toString() {
		// TODO: Add your implementation here
	}
	
	public int attack(PokemonBase enemy) {
		// TODO: Add your implementation here
	}
	
	public void damage(int damageAmt) {
		// TODO: Add your implementation here
	}
	
	public int heal() {
		// TODO: Add your implementation here
		// Think about how to track the initial Pokemon health
		// and how to track whether we've healed this Pokemon or not
	}

}
