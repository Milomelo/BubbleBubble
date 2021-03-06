package site.metacoding.bubble.selfstudying01;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backGround;
	private Player player;

	public BubbleFrame() {
		initSetting();
		initObject();
		initListener();
		setVisible(true); // paincomponent를 호출
	}

	// JFrame틀 만들기
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null);// 제이프레임 보드레이아웃 만들기
		setLocationRelativeTo(null);// 프레임 중간에 위치 시키기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X박스 누르면 완전히 끄기
	}

	private void initObject() {
		backGround = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backGround);// ContenPane에 딱 맞는 크기로 설정

		player = new Player();
		add(player);
	}

	private void initListener() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) { //getKeyCode는 방향키에 대한 숫자 값을 받음
				System.out.println("버튼이 눌러졌습니다" + e.getKeyCode());
//				버튼이 눌러졌습니다37 왼쪽
//				버튼이 눌러졌습니다38 위쪽
//				버튼이 눌러졌습니다39 오른쪽
//				버튼이 눌러졌습니다40 아래쪽
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){//VK_RIGHT는 KEYEVENT에서 컨트롤 클릭을 하면 찾을 수 있다.
					player.right();
				}else if(e.getKeyCode()==KeyEvent.VK_LEFT){
					player.left();
				}
				
			}
			
		});

	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
