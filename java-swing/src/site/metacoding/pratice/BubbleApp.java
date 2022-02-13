package site.metacoding.pratice;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class BubbleApp extends JFrame implements Init {

	private static final String TAG = "BubbleApp : ";
	private BubbleApp mContext = this;

	private BackgroundMap backgroundMap; // ���ȭ��
	private Player player; // �÷��̾�

	public BubbleApp() {
		// System.out.println(TAG+"������ ����");
		initObject();
		initSetting();
		initListener();

		setVisible(true);
	}

	public static void main(String[] args) {
		new BubbleApp();
	}

	@Override
	public void initObject() {
		backgroundMap = new BackgroundMap();
		setContentPane(backgroundMap); // DIV�ڽ��� ��ü ���ȭ������ ����
		player = new Player(backgroundMap);
		add(player);
	}
	
	@Override
	public void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null); // JFrame�� �⺻ JPanel�� ���̾ƿ� ����
		setLocationRelativeTo(null); // ��� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� JVM ���� �����ϱ�
	}

	@Override
	public void initListener() {
		mContext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_RIGHT :
					if (!player.isRight()&& player.isRightWallCrash()==false)player.right();
					
	
				
				
					break;
				case KeyEvent.VK_LEFT:
					if (!player.isLeft()&& player.isLeftWallCrash()==false)player.left();
					
					// ����
					break;
				case KeyEvent.VK_UP:
					player.down();
					// ����
					break;

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// isRight�� false
					player.setRight(false);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// isLeft�� false
					player.setLeft(false);
				}

			}
		});

	}
}