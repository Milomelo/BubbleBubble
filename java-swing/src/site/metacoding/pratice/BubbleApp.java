package site.metacoding.pratice;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class BubbleApp extends JFrame implements Init {

	private static final String TAG = "BubbleApp : ";
	private BubbleApp mContext = this;

	private BackgroundMap backgroundMap; // 배경화면
	private Player player; // 플레이어

	public BubbleApp() {
		// System.out.println(TAG+"생성자 실행");
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
		setContentPane(backgroundMap); // DIV박스를 전체 배경화면으로 설정
		player = new Player(backgroundMap);
		add(player);
	}
	
	@Override
	public void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null); // JFrame의 기본 JPanel의 레이아웃 설정
		setLocationRelativeTo(null); // 가운데 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 JVM 같이 종료하기
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
					
					// 내부
					break;
				case KeyEvent.VK_UP:
					player.down();
					// 내부
					break;

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// isRight를 false
					player.setRight(false);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// isLeft를 false
					player.setLeft(false);
				}

			}
		});

	}
}