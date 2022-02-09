package site.metacoding.bubble.selfstudying01;

import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private ImageIcon playerR,playerL;
	private int x;
	private int y;

	public Player() {
		// init object�� ���� ���°� ��������!!
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
		setLocation(x, y); // paintComponent ȣ������

	}

	public void right() {
		setIcon(playerR);
		System.out.println("������ �̵�");
		x = x + 50;
		setLocation(x, y);
	}

	public void left() {
		setIcon(playerL); // playerR�� ���̵� �̹Ƿ� �̰��� ����
		System.out.println("���� �̵�");
		x = x - 50;
		setLocation(x, y);
	}
}
//�������� ������ �Ÿ���