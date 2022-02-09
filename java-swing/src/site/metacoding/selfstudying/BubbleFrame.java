package site.metacoding.selfstudying;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import site.metacoding.bubble.ex02.Player;

public class BubbleFrame extends JFrame {
	private JLabel backgroundMap;
	private Cha cha;

	public BubbleFrame() {
		initSetting();
		initObject();
		setVisible(true);
	}

	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		cha = new Cha();
		add(cha);


	}

	public static void main(String[] args) {

		new BubbleFrame();

	}

}
