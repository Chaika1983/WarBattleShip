package battle.com.WarBattleShips;

public class AircraftCarrier extends Ship {

	public AircraftCarrier() {
		super();
	}

	public AircraftCarrier(int name, int[] deck, int[] coordinate) {
		super(name, deck, coordinate);
	}

	public int[] getAircraftCarrier() {
		setDeck(new int[4]);
		setCoordinate(new int[17]);
		setName((int) (Math.random() * 100));
		if (getName() % 10 == 7 | getName() % 10 == 8 | getName() % 10 == 9) {
			setName(((int) (Math.random() * 100)) - 2);
		}
		for (int i = 0; i < 4; i++) {
			getDeck()[i] = getName() + i;

		}
		getCoordinate()[0] = getName();
		getCoordinate()[1] = getName() + 1;
		getCoordinate()[2] = getName() + 2;
		getCoordinate()[3] = getName() + 3;
		getCoordinate()[4] = getName() - 1;
		getCoordinate()[5] = getName() + 10;
		getCoordinate()[6] = getName() - 10;
		getCoordinate()[7] = getName() + 9;
		getCoordinate()[8] = getName() - 9;
		getCoordinate()[9] = getName() + 11;
		getCoordinate()[10] = getName() - 11;
		getCoordinate()[11] = getName() - 8;
		getCoordinate()[12] = getName() + 12;
		getCoordinate()[13] = getName() - 7;
		getCoordinate()[14] = getName() + 13;
		getCoordinate()[15] = getName() - 6;
		getCoordinate()[16] = getName() + 14;

		setCoordinate(getCoordinate());
		setDeck(getDeck());
		return getDeck();

	}

}
