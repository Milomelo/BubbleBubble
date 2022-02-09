package site.metacoding.bubble.ex03;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	/**
	 * 
	 * @ author 메타코딩 목적: 캐릭터 좌우 이동
	 */

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true); // 내부에 paintcomponent()호출 코드가 있다.
	}

//new 하는 것
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);

		player = new Player();
		add(player);

	}

	private void initListener() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("키보드 릴리즈");				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// 왼쪽 37, 오른쪽38, 위쪽39, 아래쪽 40
				System.out.println("키보드 프레스");	
				if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
					player.right();	
				}
				if(e.getKeyCode()== KeyEvent.VK_LEFT	) {
					player.left();	
				}
				
			}
		});
		
	}


	// 각종 모든 세팅
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null); // JFrame의 기본 jpanel의 레이아웃 설정
		setLocationRelativeTo(null); // 가운데 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 버튼 클릭시 jvm같이 종료하기
	}



	public static void main(String[] args) {
		new BubbleFrame();
	}

}
