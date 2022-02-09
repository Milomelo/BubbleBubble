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
		setVisible(true); // paincomponent�� ȣ��
	}

	// JFrameƲ �����
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null);// ���������� ���巹�̾ƿ� �����
		setLocationRelativeTo(null);// ������ �߰��� ��ġ ��Ű��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X�ڽ� ������ ������ ����
	}

	private void initObject() {
		backGround = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backGround);// ContenPane�� �� �´� ũ��� ����
		
		player = new Player();
		add(player);
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}