# Pookie Mon Battle 
## Introduction:
The objective of this assignment is to create a text-based game (based on Pokemon), where the user creates set of Pokemon to battle against the computer’s Pokemon.  This project will contain multiple different classes representing different Pokemon, a Player class to manage the players, a Battle Class that manages the game, and a simple main() to kick things off.  Each are described below.  

* 10 points: `PokemonBase` class
* 10 points: `PokemonType` class
  * extends `PokemonBase` class
* 10 points: `Pokemon` Characters class
  * extends `PokemonType` class
* 10 points: `Player` Class
* 10 points: `BattleGround` Class and Final Game
* 25 points: Overall Style Points:
  * 5 points: Good comments
  * 5 points: Indentation
  * 5 points: Descriptive variable names
  * 5 points: Code reuse
  * 5 points: Smart algorithm

Total - 75 points  
Extra Credit - 25 points
 
## Class Hierarchy
The classes are arranged as follows:
> `PokemonBase`
>> `PokemonType`
>>> `Pokemon`

> `Player`  
> `BattleGround`  
 
The `PokemonBase` class implements the basic properties of every Pokemon.

The `PokemonType` class extends the `PokemonBase` class, and implements behavior specific to a type of Pokemon (for example, a Water-type Pokemon, which has an attack advantage over a Fire-type Pokemon).

The `Pokemon` class extends the `PokemonType` class to implement the behavior of an individual Pokemon.  For example, a Squirtle might be an instance of the Pokemon class, and identifies as a Water-type.

The `Player` class implements the actions a player can take, such as holding certain Pokemon, switching the active Pokemon, attacking the opponent, etc.

The `BattleGround` class implements the battle ground itself, selecting players (human v. human or human v. computer), dealing out the Pokemon, managing the battle, and declaring a winner.

Lastly, your `main()` method should be as simple as creating a new `BattleGround` object, then calling it’s `fight()` method.
 
## The PokemonBase Class
This class is the superclass for all Pokemon, and simulates the basic behavior of a Pokemon in the game. It must contain all the fields and methods described below – additional fields and methods can be created as necessary.  It is up to you to select the proper access modifier for each.
### Fields
* name
  * A `String` that holds the name of the Pokemon.
* health
  * An `int` that tracks how much health the Pokemon currently has.
* attack
  * An `int` that tracks how strong the Pokemon attacks are.
* defense
  * An `int` that tracks the strength of the Pokemon’s defense.

### Methods
* `PokemonBase()`  
  Constructor. You should implement a default constructor, and at least one other.

* Various accessors  
  You must implement appropriate getters and setters for each field.

* toString  
  You must implement an appropriate `toString()` method. It returns a `String` representing all the data about the given Pokemon, in a format suitable for your game.

* `int attack(PokemonBase enemy)`  
  Implements an attack on the provided enemy.

  There must be an `attack()` method that receives a PokemonBase object, representing the Pokemon being attacked. This method calculates a random amount of damage between 1 and the difference between the attacking Pokemon’s attack and the attacked Pokemon’s defense, and returns that value. After an attack, the following message is displayed:

  >*name* attacks the *enemy name* doing *damage* damage.

  The enemy Pokemon’s health is reduced by the damage amount returned.

* `void damage(int damageAmt)`  
  Reduces Pokemon health by a set amount.

  The `damage()` method reduces the Pokemon’s health by the amount passed as parameter damageAmt. It should not allow the health to drop below zero. After damage is handled, the following message is displayed:

  >*name* has *health* health left.

  If the Pokemon’s health drops to or below zero, it should be set to zero, and the following message printed:

  >*name* is down!

* `int heal()`  
  Heals a Pokemon once per battle.

  The `heal()` method adds up to 20 health back to the Pokemon, but can only be used once per battle, and returns the amount of health restored.  `heal()` should not increase to the Pokemon’s initial health – for example, if a Pokemon has taken only 10 damage, `heal()` should only restore 10 points.  After it completes, the following message is displayed:

  >*name* has healed *healed* points.  
  >*name* has *health* health left. 

## The PokemonType Class
The `PokemonType` class extends the `PokemonBase` class and encapsulates behavior specific to specific Pokemon types. The complete range of types implemented are up to you, but you must implement at least Water, Fire, and Grass types.

This class must implement the fields and methods below – additional fields and methods may be created and used as necessary.  It is up to you to select the proper access modifier for each.

### Fields
* `type`  
    A field which holds the type of the Pokemon.

### Methods
* `PokemonType()`  
  Constructor.  You should implement a default and at least one other.

  All `PokemonType()` constructors should call the appropriate superclass constructor, including proper parameters which initialize all `PokemonBase` class fields (`name`, `health`, `attack`, and `defense`).  The constructor should also take an appropriate parameter to initialize the `type` field.

* Various accessors  
  You must implement getters and setters for each field.

* `String toString()`  
  You must implement an appropriate `toString()` method. The `toString()` method should return data about the Pokemon type, in a format suitable for your game.

* `double advantage(PokemonType enemy)`  
  Calculates the attack advantage over another given type.

  The `advantage()` method returns a double indicating the advantage the current Pokemon type has over the given enemy.

  For example, a Bulbasaur enjoys a 2x advantage versus a Squirtle, since Grass type Pokemon have a 2x advantage over all Water type Pokemon.  Therefore, `advantage()` would return 2.0 in this case.

  The chart below shows the advantages each type has over the others – if you add types to your game, you may wish to update this chart.

  ```
  Attack -->      Water   Grass   Fire  
  Defend --V  
  Water           NONE    x2      x1/2
  Grass           x1/2    NONE    x2
  Fire            x2      x1/2    NONE
  ```

* `int attack(PokemonBase enemy)`  
  (Override) Replace the `PokemonBase.attack()` method with one which takes type advantages into account.

  You will override the `attack()` method from PokemonBase in your `PokemonType` class to address the advantage this Pokemon has over the enemy.  You should use `super` to call the original `attack()` method, and modify the result accordingly. 

## The Pokemon Class 
This class extends the `PokemonType` class, and simulates the actual Pokemon. It must contain all the fields and methods described below – additional fields and methods can be created as necessary.  It is up to you to select the proper access modifier for each.

### Fields
*  `critChance`  
	A `double` that tracks the chance of a critical hit

### Methods
* `Pokemon()`  
	Constructor.  You should implement a default and at least one other.

    The `Pokemon()` constructor should call the superclass constructor, and include proper parameters which initializes all PokemonType class fields (`name`, `health`, `attack`, `defense`, and `type`).  The constructor should also take an appropriate parameter to initialize the `critChance` field.

* Various accessors  
    You must implement appropriate getters and setters for each field.

* `String toString()`  
	You must implement an appropriate `toString()` method.

* `int attack(PokemonBase enemy)`  
    (Override) Replace the `PokemonType.attack()` method with one which takes critical hit chances into account.

    You should use super to call the original `attack()` method, and modify the result accordingly.

    To check for a critical hit, generate a random number to see if it is less than `critChance`. If it is, the Pokemon has scored a critical hit, which doubles the attack. The following is printed if a critical hit is achieved:

    > *name* has scored a critical hit!  Damage doubled!

 
## The Player Class 
This class controls a player of the Pokemon Battle game.  Player objects can either be human or computer controlled – human controlled `Player` objects get input from the console for each turn, while computer controlled players make random (or possibly AI guided) selections for each turn.

The `Player` class must contain all the fields and methods described below – additional fields and methods can be created as necessary.  It is up to you to select the proper access modifier for each.

### Fields
* `name`  
	A `String` representing the name of the player.
* `human`  
	A `boolean` indicating if the player is human or not
* `pokemon`  
	An array holding up to three (3) Pokemon objects.

### Methods
* `Player()`  
	Constructor. You should implement a default and at least one other.

* Various accessors  
    You must implement appropriate getters and setters for each field.

* `String toString()`  
	You must implement an appropriate `toString()` method.

* `void addPokemon(Pokemon pokemon)`  
    Adds a Pokemon to the player's list. If the player already has three Pokemon, this does nothing.

* `void removePokemon(int index)`  
	Removes the Pokemon at the provided index from the players list. If the index is invalid, or there is no Pokemon there, this does nothing,

* `void selectPokemon(int index)`  
	Selects the Pokemon at the provided index as the current Pokemon for attack and defense.
	
## BattleGround class
The `BattleGround` is where all the battles take place.  This class:
* selects the players, 
* deals out Pokemon, 
* controls the battle, and 
* determines winners.

The `BattleGround` class must contain all the fields and methods described below – additional fields and methods can be created as necessary.  It is up to you to select the proper access modifier for each.

### Fields
* `Player players[]`  
	Array containing `Player` objects for each human or computer player. For the initial battle, this array contains only two `Player` objects.

### Methods
* `BattleGround()`  
    Constructor. You should implement at least a default constructor.

* Various accessors  
    You must implement appropriate getters and setters for each field.

* `void setNextPlayer()`  
	Change the current active player

* `Player getCurrentPlayer()`  
	Returns the object representing the current active player

* `Player getOpponent()`  
	Returns the object representing the current opponent

* `void fight()`  
	Manages the battle.

    The `fight()` method implements a basic game loop, which:
	 * presents the current state of the game
	 * handles a move by the current player
	 * if the move ends the turn, end the players turn
	 * checks to see if the current player has won
	 
	 Human player moves include:
	 * **attack**: attacks the opponent's Pokemon  
	    If this downs the opponent's Pokemon, ask them to swap to another Pokemon.
	 * **heal** : heals up to 20 points for the current Pokemon  
	    This has no effect if the current Pokemon has healed already during the battle.
	 * **swap**: make another Pokemon active.  
        The player cannot change to a downed Pokemon.
	 * **stats**: show all the Pokemon the player has.  
	    This command doesn't end the turn
	 
	 Computer player moves are handled randomly, and all move end the computer's turn:
	 * **attack**: occurs 80% of the time
	    If this downs the human Pokemon, ask them to swap to another Pokemon
	 * **swap**: occurs 10% of the time.
        Randomly swap to another Pokemon
	 * **heal**: occurs 10% of the time.
        Randomly heal the current acrive Pokemon. If the Pokemon is at full health, or has already healed, this does nothing.
	 
	 The game ends when one player has no active Pokemon left.

## Main Program
Your main program should be as simple as follows:

```
public class PokemonBattle{
    public static void main(String[] args){
        BattleGround battle = new BattleGround();
        battle.fight();
    }
}
```

## Example run
Here’s the transcript from a sample run of Pokemon Battle:

TBD: Add Transcript

 
## Extra Credit Ideas
Additional functionality or game embellishments are worth up to 25 points of extra credit, awarded at the discretion of the grader). Here are some ideas to get your started, but feel free to be creative!

* Implement different attack moves for each Pokemon  
    Different Pokemon have different attacks – for example, Fire-type Pokemon have Fire Blast, Fire Punch, and Flamethrower attacks, to name a few.  Each of these attacks deals out different damage amounts, but also have different accuracy (lower damage attacks are generall more accurate).
    
    Adding different attack moves means handling accuracy as well as the different damage amounts. Done correctly, this feature is worth 10 points, plus 2 points for each attack added.

* Additional Pokemon Types and Pokemon to fill them  
    The basic game only implements three Pokemon types – adding more types and more Pokemon to fill those types is worth 5 points per Type. Each new type should have at least three Pokemon from which to choose.
    
    Just adding new Pokemon to the existing types is worth 1 point per Pokemon added.

* Implement the `speed` rating  
    Some Pokemon are fast – so fast, they sometimes get two attacks per turn! Implement the speed feature so a fast Pokemon gets a random second attack after the opponent moves, in accordance with the speed difference between them.

If you add something else, be sure to call it out in the comments or notes associated with your project.

**NOTE**: Game balance is important, so extra points are counted across all types and Pokemon. For example, if you decide to add two new Grass-type Pokemon, you should also add two new Fire-type and two new Water-type Pokemon to keep things balanced.  In this case, these new Pokemon only count for two (2) new Pokemon, not six (6), since you are adding two new Pokemon to each type.

