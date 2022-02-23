package site.metacoding.mytest;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Enemy extends JLabel {

	private static final String TAG = "Enemy : ";

	private ImageIcon monsterR, monsterL;
	private BubbleFrame context;

	private int x, y;
	private static final int SPEED = 4;

	private boolean isLeft, isRight, isDown;
	private boolean leftWallCrash, rightWallCrash;

	public boolean isDown() {
		return isDown;
	}

	public void setDown(boolean isDown) {
		this.isDown = isDown;
	}

	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isLeft() {
		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}

	public Enemy(BubbleFrame context2) {
		this.context = context;

		initObject();
		initSetting();
		left();
	}

	private void initObject() {
		monsterR = new ImageIcon("image/enemyR.png");
		monsterL = new ImageIcon("image/enemyL.png");
	}

	private void initSetting() {
		x = 550;
		y = 135;

		isLeft = false;

		setIcon(monsterL);
		setSize(50, 50);
		setLocation(x, y);

	}

	private void left() {
		// System.out.println(TAG + "¿ÞÂÊ");

		isLeft = true;

		setIcon(monsterL);

		new Thread(() -> {
			while (isLeft) {
				x = x - SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (!isLeft) {
					// System.out.println(TAG + "¸ØÃâ°Ô");
					right();
				}

			}
		}).start();
	}

	private void right() {
		// System.out.println(TAG + "¿À¸¥ÂÊ");

		isRight = true;

		setIcon(monsterR);

		new Thread(() -> {
			while (isRight) {
				x = x + SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (!isRight) {
					// System.out.println(TAG + "¸ØÃâ°Ô");
					left();
				}

			}
		}).start();
	}

	public void down() {
		// System.out.println(TAG + "¾Æ·¡ÂÊ");
		isDown = true;

		new Thread(() -> {
			// down
			while (isDown) {
				y = y + SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(3);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}).start();
	}
}
