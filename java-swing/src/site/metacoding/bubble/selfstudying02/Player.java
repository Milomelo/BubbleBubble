package site.metacoding.bubble.selfstudying02;

import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	public boolean isJump;

	public boolean isJump() {
		return isJump;
	}

	public void setJump(boolean isJump) {
		this.isJump = isJump;
	}

	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public boolean isLeft() {
		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}

	private boolean isRight;
	private boolean isLeft;

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

		isRight = false; // �������� ���� �����̱� ����
		isLeft = false;
	}

	public void right() {
		isRight = true;
		setIcon(playerR);
		System.out.println("������ �̵�");
		new Thread(() -> {
			while (isRight) {
				x = x + 50;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
		;

	}

	public void left() {
		isLeft = true;
		setIcon(playerL);
		System.out.println("���� �̵�");
		new Thread(() -> {
			while (isLeft) {
				x = x - 50;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();

	}
}