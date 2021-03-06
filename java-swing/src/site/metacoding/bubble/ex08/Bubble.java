package site.metacoding.bubble.ex08;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel {

	private BubbleFrame context;
	private Player player;

	private int x;
	private int y;
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	private boolean left;
	private boolean right;
	private ImageIcon bubble, bomb;

	public Bubble(BubbleFrame context) {
		this.context = context;
		this.player = context.getPlayer();
		// this.player = context.getPla
		initObject();
		initSetting();
		BubbleMove();
	}

	private void initObject() {
		bubble = new ImageIcon("image/bubble.png");
		bomb = new ImageIcon("image/bomb.png");
	}

	private void initSetting() {
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
		right = false;
		left = false;
	}

	private void BubbleMove() {

		new Thread(() -> {
			if (player.getDirection() == 1) {
				while(true) {
//					System.out.println("이것은 작동");
					x = x + 10;
					setLocation(x, y);
					
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if(right == true) {
					break;
					}
				
				}

			}
		}).start();

		new Thread(() -> {
			if (player.getDirection() == 0) {
				for (int i = 0; i < 400; i++) {
//					System.out.println("이것은 작동");
					x = x - 10;
					setLocation(x, y);
					try {
						Thread.sleep(1);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		}).start();

	}
}
