package battle.com.WarBattleShips;

public class Ship {
	private int name;
	private int[] deck;
	private int[] coordinate;

	Ship() {
	}

	public Ship(int name, int[] deck, int[] coordinate) {
		this.name = name;
		this.deck = deck;
		this.coordinate = coordinate;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int[] getDeck() {
		return deck;
	}

	public void setDeck(int[] deck) {
		this.deck = deck;
	}

	public int[] getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(int[] coordinate) {
		this.coordinate = coordinate;
	}

	

}
