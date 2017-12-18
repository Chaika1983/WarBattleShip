package battle.com.WarBattleShips;

public class Cruiser extends Ship {

	public Cruiser() {
		super();
	}

	public Cruiser(int name, int[] deck, int[] coordinate) {
		super(name, deck, coordinate);
	}

	public int[] getCruiser(int[] arr) {
		setDeck(new int[3]);
		setCoordinate(new int[14]);
		boolean flag = true;
		while (flag) {
			setName((int) (Math.random() * 100));
			if (getName() % 10 == 8 || getName() % 10 == 9) {
				setName(((int) (Math.random() * 100)) - 2);
			}

			for (int i = 0; i < 3; i++) {
				getDeck()[i] = getName() + i;
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < getDeck().length; j++) {
					if (arr[i] == getDeck()[j]) {
						flag = true;
						break;
					} else {
						flag = false;
					}
				}
			}
		}
		getCoordinate()[0] = getName();
		getCoordinate()[1] = getName() + 1;
		getCoordinate()[2] = getName() + 2;
		getCoordinate()[3] = getName() - 1;
		getCoordinate()[4] = getName() + 10;
		getCoordinate()[5] = getName() - 10;
		getCoordinate()[6] = getName() + 9;
		getCoordinate()[7] = getName() - 9;
		getCoordinate()[8] = getName() + 11;
		getCoordinate()[9] = getName() - 11;
		getCoordinate()[10] = getName() - 8;
		getCoordinate()[11] = getName() + 12;
		getCoordinate()[12] = getName() - 7;
		getCoordinate()[13] = getName() + 13;
		return getDeck();

	}

	public int[] getCruiser2(int[] arr) {
		setDeck(new int[3]);
		setCoordinate(new int[14]);
		boolean flag = true;
		while (flag) {
			setName((int) (Math.random() * 100));
			if (getName() % 10 == 8 || getName() % 10 == 9) {
				setName(((int) (Math.random() * 100)) - 2);
			}

			for (int i = 0; i < 3; i++) {
				getDeck()[i] = getName() + i;
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < getDeck().length; j++) {
					if (arr[i] == getDeck()[j]) {
						flag = true;
						break;
					} else {
						flag = false;
					}
				}
			}
		}

		getCoordinate()[0] = getName();
		getCoordinate()[1] = getName() + 1;
		getCoordinate()[2] = getName() + 2;
		getCoordinate()[3] = getName() - 1;
		getCoordinate()[4] = getName() + 10;
		getCoordinate()[5] = getName() - 10;
		getCoordinate()[6] = getName() + 9;
		getCoordinate()[7] = getName() - 9;
		getCoordinate()[8] = getName() + 11;
		getCoordinate()[9] = getName() - 11;
		getCoordinate()[10] = getName() - 8;
		getCoordinate()[11] = getName() + 12;
		getCoordinate()[12] = getName() - 7;
		getCoordinate()[13] = getName() + 13;

		return getDeck();

	}

}
