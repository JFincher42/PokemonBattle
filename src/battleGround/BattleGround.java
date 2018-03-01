package battleGround;

import player.Player;
import pokemon.Pokemon;
import pokemon.PokemonType;

/**
 * BattleGround
 * 
 * Manages a Pokemon battle between two players
 * @author jon
 *
 */
public class BattleGround {

	// Inheritable fields
	protected Player[] players;				// Who is playing?
	
	/**
	 * BattleGround
	 * 
	 * Default constructor:
	 * - creates two new players
	 * - gets player details
	 * - initializes the list of Pokemon available for battle, and
	 * - doles out Pokemon to each player
	 */
	public BattleGround() {
		// TODO: Add your implementation here
	}
	
	/**
	 * setNextPlayer
	 * 
	 * Changes the active player, and their opponent, to the next player
	 */
	public void setNextPlayer() {
		// TODO: Add your implementation here
	}
	
	/**
	 * getCurrentPlayer
	 * 
	 * Who is the current player?
	 * @return Player object representing the current player
	 */
	public Player getCurrentPlayer() {
		// TODO: Add your implementation here
	}
	
	/**
	 * getOpponent
	 * 
	 * Who is the current opponent?
	 * @return Player object representing the opponent player
	 */
	public Player getOpponent() {
		// TODO: Add your implementation here
	}
	
	/**
	 * fight
	 * 
	 * The main fight method.  Implements a game loop, which:
	 * - presents the current state of the game
	 * - handles a move by the current player
	 * - if the move ends the turn, end the players turn
	 * - check to see if the current player has won
	 * 
	 * Human player moves include:
	 * - attack: attacks the opponent's Pokemon
	 * 			 If this downs that Pokemon, ask the opponent to swap
	 * - heal:   heals up to 20 points for the current Pokemon
	 *           no effect if the current Pokemon has healed already
	 * - swap:   change to another Pokemon
	 * - stats:  show all the Pokemon the player has
	 *           doesn't end the turn
	 * 
	 * Computer player moves are handled randomly:
	 * - attack: 70% of the time
	 * 			 If this downs the human Pokemon, ask them to swap
	 * - swap:   15% of the time
	 * - heal:   15% of the time
	 * 
	 * End conditions are whether one player has no active Pokemon left
	 * Since the current player will never be in that situation, always check the opponent
	 */
	public void fight() {
		// TODO: Add your implementation here
	}
		
}
