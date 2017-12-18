package battle.com.WarBattleShips;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BattlPanel extends JFrame implements ActionListener {

	public JButton[][] button = new JButton[10][10];
	public JButton button1;
	public JButton button3;
	public JButton button2;
	public JButton button14;
	public JButton button16;
	public MouseEvent i;
	public JPanel panel = new JPanel();
	public JPanel panel1 = new JPanel();
	public JPanel panel2 = new JPanel();
	public JPanel panel3 = new JPanel();
	public int torpeda = 0;
	public int click = 0;
	FieldBattle field = new FieldBattle();

	public JMenuBar createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Battle Menu");
		JMenuItem menuItem;

		menuBar.add(menu);
		menuItem = new JMenuItem("New Game");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menuItem = new JMenuItem("Save Game");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menu.addSeparator();
		return menuBar;
	}

	public BattlPanel() {
		super("My Battleships v.1.0");
		field.getField();
		for (int i = 0; i <= button.length - 1; i++) {
			for (int j = 0; j <= button[i].length - 1; j++) {
				button[i][j] = new JButton(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\sea.jpg"));
				button[i][j].setActionCommand("" + i + j);
				button[i][j].addMouseListener(new CustomListener());
				button[i][j].addActionListener(this);
				panel.add(button[i][j]);
			}
		}
		button14 = new JButton(new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\lose.jpg"));
		button16 = new JButton(new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\won.jpg"));
		button3 = new JButton(new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\img1.jpg"));
		button2 = new JButton(new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\play.jpg"));
		button1 = new JButton(new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\img2.jpg"));
		button14.setSize(800, 800);
		button14.setLocation(1, 1);
		button16.setSize(800, 800);
		button16.setLocation(1, 1);
		button1.setSize(400, 800);
		button3.setSize(400, 400);
		button2.setSize(400, 400);
		button1.setLocation(1, 10);
		button2.setLocation(400, 400);
		button3.setLocation(400, 10);
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel2.add(button14);
		panel3.setLayout(null);
		panel3.add(button16);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel.setLayout(new GridLayout(10, 10));
		panel.setSize(800, 800);
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);
		button3.setBorderPainted(false);
		button3.setFocusPainted(false);
		button3.setContentAreaFilled(false);
		button14.setBorderPainted(false);
		button14.setFocusPainted(false);
		button14.setContentAreaFilled(false);
		button16.setBorderPainted(false);
		button16.setFocusPainted(false);
		button16.setContentAreaFilled(false);

		setContentPane(panel1);
		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
	}

	private void initListeners() {
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getPanel();
			}
		});
	}

	public void getPanel() {
		panel1.setVisible(false);
		setContentPane(panel);
		panel.setVisible(true);

	}

	public class CustomListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {
			click += e.getClickCount();
			if (getClick() == 50) {
				panel.setVisible(false);
				setContentPane(panel2);
				panel2.setVisible(true);
			}

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}
	}

	protected String getClassName(Object o) {
		String classString = o.getClass().getName();
		int dotIndex = classString.lastIndexOf(".");
		return classString.substring(dotIndex + 1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String classname = getClassName(e.getSource());

		if (classname.equals("JMenuItem")) {
			JMenuItem menusource = (JMenuItem) (e.getSource());
			String menutext = menusource.getText();
			if (menutext.equals("Save Game")) {
				SaveGame();
			} else if (menutext.equals("New Game")) {
				NewGame();
			}
		} else if (classname.equals("JButton")) {
			JButton button = (JButton) (e.getSource());
			int shot = Integer.parseInt(button.getActionCommand());
			int row = shot;

			if (row == field.arr9[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\destroyer.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda = 1;
			}
			if (row == field.arr8[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\destroyer.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr7[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\destroyer.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr6[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\destroyer.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr5[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\battleship2.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr5[1]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\battleship1.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr4[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\battleship2.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr4[1]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\battleship1.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr3[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\battleship2.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr3[1]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\battleship1.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr2[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\carrier3.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr2[1]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\carrier2.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr2[2]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\carrier1.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr1[0]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\carrier3.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr1[1]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\carrier2.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr1[2]) {
				button.setIcon(
						new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\carrier1.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr[0]) {
				button.setIcon(new ImageIcon(
						"C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\aircraftCarrier1.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr[1]) {
				button.setIcon(new ImageIcon(
						"C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\aircraftCarrier2.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr[2]) {
				button.setIcon(new ImageIcon(
						"C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\aircraftCarrier3.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;
			}
			if (row == field.arr[3]) {
				button.setIcon(new ImageIcon(
						"C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\aircraftCarrier4.jpg"));
				button.setBorderPainted(false);
				button.setFocusPainted(false);
				button.setContentAreaFilled(false);
				torpeda++;

			} else if (row != field.arr9[0] && row != field.arr8[0] && row != field.arr7[0] && row != field.arr6[0]
					&& row != field.arr5[0] && row != field.arr5[1] && row != field.arr4[0] && row != field.arr4[1]
					&& row != field.arr3[0] && row != field.arr3[1] && row != field.arr2[0] && row != field.arr2[1]
					&& row != field.arr2[2] && row != field.arr1[0] && row != field.arr1[1] && row != field.arr1[2]
					&& row != field.arr[0] && row != field.arr[1] && row != field.arr[2] && row != field.arr[3]) {
				button.setIcon(new ImageIcon("C:\\Users\\Chaika\\eclipse-workspace\\WarBattleShips\\image\\white.png"));
			}
			if (torpeda == 20) {
				panel.setVisible(false);
				setContentPane(panel3);
				panel3.setVisible(true);
			}

			fireShot(row);
		}
	}

	public void NewGame() {
		BattlPanel battl = new BattlPanel();
		battl.setVisible(true);
		battl.setJMenuBar(battl.createMenu());

	}

	public void SaveGame() {

	}

	public int getClick() {
		return click;

	}

	public void fireShot(int row) {

	}

}
