package battle.com.WarBattleShips;

public class App {
    public static void main( String[] args ){
    	BattlPanel battl = new BattlPanel();
		battl.setVisible(true);
		battl.setJMenuBar(battl.createMenu());
    }
}
