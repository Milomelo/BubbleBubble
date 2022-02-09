package site.metacoding.selfstudying;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cha extends JLabel {
	private ImageIcon chaR;
	private int x;
	private int y;

	public Cha() {
		initObject();
		initSetting();
	}

	private void initObject() {
		chaR = new ImageIcon("image/playerR.png");

	}

	private void initSetting() {
		x = 70;
		y = 535;
		setIcon(chaR);
		setSize(50, 50);
		setLocation(x, y);

	}

}
