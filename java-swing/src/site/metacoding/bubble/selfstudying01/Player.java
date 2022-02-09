package site.metacoding.bubble.selfstudying01;

import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private ImageIcon playerR,playerL;
	private int x;
	private int y;

	public Player() {
		// init object를 위에 적는걸 잊지말자!!
		initObject();
		initSetting();

	}

	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");

	}

	private void initSetting() {
		x = 70;
		y = 535;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y); // paintComponent 호출해줌

	}

	public void right() {
		setIcon(playerR);
		System.out.println("오른쪽 이동");
		x = x + 50;
		setLocation(x, y);
	}

	public void left() {
		setIcon(playerL); // playerR은 빽이동 이므로 이것을 수정
		System.out.println("왼쪽 이동");
		x = x - 50;
		setLocation(x, y);
	}
}
//아직가진 버버벅 거린다
