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
			public void keyPressed(KeyEvent e) { //getKeyCode�� ����Ű�� ���� ���� ���� ����
				System.out.println("��ư�� ���������ϴ�" + e.getKeyCode());
//				��ư�� ���������ϴ�37 ����
//				��ư�� ���������ϴ�38 ����
//				��ư�� ���������ϴ�39 ������
//				��ư�� ���������ϴ�40 �Ʒ���
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){//VK_RIGHT�� KEYEVENT���� ��Ʈ�� Ŭ���� �ϸ� ã�� �� �ִ�.
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