package site.metacoding.mytest;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel {

	private static final String TAG = "Bubble : ";
	private static final int BUBBLESPEED = 1;

	private BubbleFrame context;
	
	private Player player;

	private int x, y;

	private ImageIcon bubble, bomb, bubbled;

	private boolean isLeft, isRight, isUp, topWallCrash, leftWallCrash, rightWallCrash;

	// isLeft
	public boolean isLeft() {
		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}

	// isRight
	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	// isUp
	public boolean isUp() {
		return isUp;
	}

	public void setUp(boolean isUp) {
		this.isUp = isUp;
	}

	// topWallCrash
	public boolean isTopWallCrash() {
		return topWallCrash;
	}

	public void setTopWallCrash(boolean topWallCrash) {
		this.topWallCrash = topWallCrash;
	}

	// leftWallCrash
	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	// rightWallCrash
	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	// bubble�� player�� ��ġ�� �����ؾ��Ѵ�.
	// player���� �����ϸ� ������ ���� �� ������ �߻���
	// ���� context�� ����!
	public Bubble(BubbleFrame context) {
		this.context = context;
		this.player = context.getPlayer();

		isLeft = false;
		isRight = false;
		isUp = false;
		topWallCrash = false;
		leftWallCrash = false;
		rightWallCrash = false;

		initObject();
		initSetting();

		// ����üũ
		if (player.getDirection() == -1) {
			left();
		} else if (player.getDirection() == 1) {
			right();
		}
	}

	private void initObject() {
		bubble = new ImageIcon("image/bubble.png");
		bomb = new ImageIcon("image/bomb.png");
		bubbled = new ImageIcon("image/bubbled.png");
	}

	private void initSetting() {
		x = player.getX();
		y = player.getY();

		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	public void left() {
		isLeft = true;

		new Thread(() -> {
			try {
				for (int i = 0; i < 400; i++) {
					x = x - BUBBLESPEED;
					setLocation(x, y);
					attacked();
					Thread.sleep(1);

					if (leftWallCrash == true) {
						up();
						break;
					} else if (i == 399) {
						up();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();

	}

	public void right() {
		new Thread(() -> {
			try {
				for (int i = 0; i < 400; i++) {
					x = x + BUBBLESPEED;
					setLocation(x, y);
					attacked();
					Thread.sleep(1);

					if (rightWallCrash == true) {
						up();
						break;
					} else if (i == 399) {
						up();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
	}

	public void up() {
		isUp = true;

		try {
			while (isUp) {
				y = y - BUBBLESPEED;
				setLocation(x, y);
				Thread.sleep(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pop() {
		// õ�忡 �ٰ� 4�ʵڿ� ��������, repaint
		// setTopWallCrash�� Ʈ���

		new Thread(() -> {

			try {
				Thread.sleep(500);

				if (topWallCrash == true) {
					setIcon(bomb);
					setLocation(x, y);

					Thread.sleep(500);
					context.remove(this);
					context.repaint();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}).start();

	}

	public void attacked() {
		 System.out.println("���� y : " + context.getEnemy().getY());
		 System.out.println("���� y : " + y);
		
		new Thread(() -> {
//			if (x == context.getEnemy().getX()) {
//				System.out.println("X�� ��Ҵ�");
//			}
//
//			if (y == context.getEnemy().getY()) {
//				System.out.println("Y�� ��Ҵ�");
//			}

			try {
				Thread.sleep(1);
				if (x == context.getEnemy().getX() && y+4 == context.getEnemy().getY()+4) {
					
					
					
					System.out.println("¥��");
					setIcon(bubbled);
					context.repaint();
					context.remove(context.getEnemy());
				}

				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();

	}
}
