package site.metacoding.bubble.selfstudying02;

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
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.setRight(false);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.setLeft(false);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) { // getKeyCode�� ����Ű�� ���� ���� ���� ����
				System.out.println("��ư�� ���������ϴ�" + e.getKeyCode());
//				37 ���� 38 ���� 39 ������ 40 �Ʒ���
				if (e.getKeyCode() == 39) {
					if (player.isRight() == false) {// VK_RIGHT�� KEYEVENT���� ��Ʈ�� Ŭ���� �ϸ� ã�� �� �ִ�.
						player.right();
					}
				} else if (e.getKeyCode() == 37) {
					if (player.isLeft() == false) {
						player.left();
					}
				}

			}

		});

	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
