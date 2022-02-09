package site.metacoding.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	/**
	 * 
	 * @ author 메타코딩 목적: 배경화면설정, 캐릭터추가
	 */

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true); // 내부에 paintcomponent()호출 코드가 있다.
	}

//new 하는 것
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		
		player = new Player();
		add(player);

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
