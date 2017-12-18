package battle.com.WarBattleShips;

public class Destroyer extends Ship {

	public Destroyer() {
	}

	public Destroyer(int name, int[] deck, int[] coordinate) {
		super(name, deck, coordinate);
	}

	public int[] getDestroyer(int[] arr) {
		setDeck(new int[1]);
		setCoordinate(new int[9]);
		boolean flag = true;
		while (flag) {
			setName((int) (Math.random() * 100));
			getDeck()[0] = getName();

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
		getCoordinate()[2] = getName() - 1;
		getCoordinate()[3] = getName() + 10;
		getCoordinate()[4] = getName() - 10;
		getCoordinate()[5] = getName() + 9;
		getCoordinate()[6] = getName() - 9;
		getCoordinate()[7] = getName() + 11;
		getCoordinate()[8] = getName() - 11;
		return getDeck();

	}

	public int[] getDestroyer2(int[] arr) {
		setDeck(new int[1]);
		setCoordinate(new int[9]);
		boolean flag = true;
		while (flag) {
			setName((int) (Math.random() * 100));
			getDeck()[0] = getName();

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
		getCoordinate()[2] = getName() - 1;
		getCoordinate()[3] = getName() + 10;
		getCoordinate()[4] = getName() - 10;
		getCoordinate()[5] = getName() + 9;
		getCoordinate()[6] = getName() - 9;
		getCoordinate()[7] = getName() + 11;
		getCoordinate()[8] = getName() - 11;
		return getDeck();

	}

	public int[] getDestroyer3(int[] arr) {
		setDeck(new int[1]);
		setCoordinate(new int[9]);
		boolean flag = true;
		while (flag) {
			setName((int) (Math.random() * 100));
			getDeck()[0] = getName();

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
		getCoordinate()[2] = getName() - 1;
		getCoordinate()[3] = getName() + 10;
		getCoordinate()[4] = getName() - 10;
		getCoordinate()[5] = getName() + 9;
		getCoordinate()[6] = getName() - 9;
		getCoordinate()[7] = getName() + 11;
		getCoordinate()[8] = getName() - 11;
		return getDeck();

	}

	public int[] getDestroyer4(int[] arr) {
		setDeck(new int[1]);
		setCoordinate(new int[9]);
		boolean flag = true;
		while (flag) {
			setName((int) (Math.random() * 100));
			getDeck()[0] = getName();

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
		getCoordinate()[2] = getName() - 1;
		getCoordinate()[3] = getName() + 10;
		getCoordinate()[4] = getName() - 10;
		getCoordinate()[5] = getName() + 9;
		getCoordinate()[6] = getName() - 9;
		getCoordinate()[7] = getName() + 11;
		getCoordinate()[8] = getName() - 11;
		return getDeck();

	}

}
