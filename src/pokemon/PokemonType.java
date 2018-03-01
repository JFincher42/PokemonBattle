package pokemon;

public class PokemonType extends PokemonBase {

	protected String type;					// What type of Pokemon?
											// Valid types are "Grass", "Fire", and "Water"

	public PokemonType() {
		// TODO: Add your implementation here
	}

	public PokemonType(String name, String type, int health, int attack, int defense, int speed) {
		// TODO: Add your implementation here
	}

	public String getType() {
		// TODO: Add your implementation here
	}

	public void setType(String type) {
		// TODO: Add your implementation here
	}

	public String toString() {
		// TODO: Add your implementation here
	}

	public double advantage(PokemonType defender) {
		// TODO: Add your implementation here
	}

	public int attack(PokemonBase defender) {
		// TODO: Add your implementation here
		// Note the parameter type and handle it accordingly
	}
}