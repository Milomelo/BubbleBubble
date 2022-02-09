package site.metacoding.selfstudying01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cha extends JLabel {
	private ImageIcon chaR, chaL;

	private int x;
	private int y;

	public Cha() {
		initObject();
		initSetting();
	}

	private void initObject() {
		chaR = new ImageIcon("image/playerR.png");
		chaL = new ImageIcon("image/playerL.png");
	}

	private void initSetting() {
		x = 70;
		y = 535;
		setIcon(chaR);
		setSize(50, 50);
		setLocation(x, y);

	}

	public void right() {
		setIcon(chaR);
		System.out.println("오른쪽으로 이동");
		x = x + 50;
		setLocation(x, y);
	}

	public void left() {
		setIcon(chaL);
		System.out.println("왼쪽으로 이동");
		x = x - 50;
		setLocation(x, y);
	}
}