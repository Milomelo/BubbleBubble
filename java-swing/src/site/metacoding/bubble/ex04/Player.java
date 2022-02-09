package site.metacoding.bubble.ex04;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * @author ��Ÿ�ڵ�
 * �÷��̾�� �¿� �̵��� �����ϴ�.
 * ������ �����ϴ�
 * ��� �߻� (���߿� ��������)*/

public class Player extends JLabel {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	private boolean isRight; // ���������� �����ִ�?
	private boolean isLeft;
	private boolean isJump;
	private final int JUMPSPEED = 2;

	public boolean isJump() {
		return isJump;
	}

	public void setJump(boolean isJump) {
		this.isJump = isJump;
	}

	public boolean isRight() { // is�� get�� �ȶ�!
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

	public Player() {
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

		isRight = false; // ���������� �����̴� ���µ� �������� �����̴� ���µ� �ƴϱ� ������ false
		isLeft = false;
		isJump = false;
	}

	public void jump() {
		isJump = true;
		for (int i = 0; i < 130; i++) {
			
		}

		// ������ for���� ������ �Ѵ�.
		isJump = false;

	}

	public void left() {

		isLeft = true;
		setIcon(playerL);
		System.out.println("���� �̵�");

		new Thread(() -> {
			while (isLeft) {
				x = x - 10;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

		}).start();
	}

	public void right() {
		isRight = true;
		setIcon(playerR);
		System.out.println("������ �̵�");

		new Thread(() -> {
			while (isRight) {
				x = x + 10;
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