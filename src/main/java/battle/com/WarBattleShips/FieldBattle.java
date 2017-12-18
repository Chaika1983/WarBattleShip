package battle.com.WarBattleShips;

public class FieldBattle {
	public int[] field = new int[108];
	public int[] arr = new int[17];
	public int[] arr1 = new int[14];
	public int[] arr2 = new int[14];
	public int[] arr3 = new int[12];
	public int[] arr4 = new int[12];
	public int[] arr5 = new int[12];
	public int[] arr6 = new int[9];
	public int[] arr7 = new int[9];
	public int[] arr8 = new int[9];
	public int[] arr9 = new int[9];
	public AircraftCarrier airCarrier = new AircraftCarrier();
	public Battleship battleship = new Battleship();
	public Cruiser cruiser = new Cruiser();
	public Destroyer destroy = new Destroyer();

	public void getField() {
		airCarrier.getAircraftCarrier();
		for (int i = 0; i < airCarrier.getCoordinate().length; i++) {
			arr[i] = airCarrier.getCoordinate()[i];
		}

		cruiser.getCruiser(arr);
		for (int i = 0; i < cruiser.getCoordinate().length; i++) {
			arr1[i] = cruiser.getCoordinate()[i];
		}
		System.arraycopy(arr, 0, field, 0, arr.length);
		System.arraycopy(arr1, 0, field, arr.length, arr1.length);

		cruiser.getCruiser2(field);
		for (int i = 0; i < cruiser.getCoordinate().length; i++) {
			arr2[i] = cruiser.getCoordinate()[i];
		}
		System.arraycopy(arr2, 0, field, (arr.length+arr1.length), arr2.length);
		battleship.getBattleship(field);
		for (int i = 0; i < battleship.getCoordinate().length; i++) {
			arr3[i] = battleship.getCoordinate()[i];
		}
		System.arraycopy(arr3, 0, field, (arr.length+arr1.length+arr2.length), arr3.length);
		battleship.getBattleship2(field);
		for (int i = 0; i < battleship.getCoordinate().length; i++) {
			arr4[i] = battleship.getCoordinate()[i];
		}
		System.arraycopy(arr4, 0, field, (arr.length+arr1.length+arr2.length+arr3.length), arr4.length);
		battleship.getBattleship3(field);
		for (int i = 0; i < battleship.getCoordinate().length; i++) {
			arr5[i] = battleship.getCoordinate()[i];
		}
		System.arraycopy(arr5, 0, field, (arr.length+arr1.length+arr2.length+arr3.length+arr4.length), arr5.length);
		destroy.getDestroyer(field);
		for (int i = 0; i < destroy.getCoordinate().length; i++) {
			arr6[i] = destroy.getCoordinate()[i];
		}
		System.arraycopy(arr6, 0, field, (arr.length+arr1.length+arr2.length+arr3.length+arr4.length+arr5.length), arr6.length);
		destroy.getDestroyer2(field);
		for (int i = 0; i < destroy.getCoordinate().length; i++) {
			arr7[i] = destroy.getCoordinate()[i];
		}
		System.arraycopy(arr7, 0, field, (arr.length+arr1.length+arr2.length+arr3.length+arr4.length+arr5.length+arr6.length), arr7.length);
		destroy.getDestroyer3(field);
		for (int i = 0; i < destroy.getCoordinate().length; i++) {
			arr8[i] = destroy.getCoordinate()[i];
		}
		System.arraycopy(arr8, 0, field, (arr.length+arr1.length+arr2.length+arr3.length+arr4.length+arr5.length+arr6.length+arr7.length), arr8.length);
		destroy.getDestroyer4(field);
		for (int i = 0; i < destroy.getCoordinate().length; i++) {
			arr9[i] = destroy.getCoordinate()[i];
		}

	}

}
