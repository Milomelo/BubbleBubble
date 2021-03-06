package site.metacoding.bubble.selfstudying;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backGround;
	private Player player;

	public BubbleFrame() {
		initSetting();
		initObject();
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

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
