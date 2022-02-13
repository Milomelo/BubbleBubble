package site.metacoding.bubble.ex06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author stuuu ���� : ���� �׽�Ʈ (�� �浹 ���� �׽�Ʈ) 1 . ���� �׽�Ʈ�� ���� test.png�� �̿��Ѵ�. - �浹��
 *         å���� �÷��̾ �ƴ� ���� ������. ��? - �ټ��� ���� �Ҽ��� ���� ����ϴ°��� �ξ� ���� ������ �����̴�. - ������
 *         �̿��Ͽ� �� ��ֹ��� ����� ���� �ش�. - �Ķ��������� �Ʒ����� ����ǰ� ������ �浹�� ����Ų��.(�� �߰� ��ֹ� ������
 *         ������) - ������������ ���� ������� �浹�� ����Ų��.(�� �ٱ����� ĳ������ �̵��� ���� ���) - ĳ���Ͱ� ���� ��
 *         �������°��� for�� �ϸ� 3��, 4������ 1������ �������⶧���� while�� ����Ѵ�.(�ٴ����� ��������)
 *
 */
public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		initService();

		setVisible(true); // paintComponent() �޼��� ȣ��
	}

	private void initService() { // ���� Ȯ�� ����
		new Thread(new BackgroundMapService(player)).start(); // ������ ����
	}

	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMapService.png"));
		setContentPane(backgroundMap); // Background ��漳��

		player = new Player();
		add(player);

	}

	private void initSetting() {
		setSize(1000, 640); // Frame ������ x = 1000, y = 640
		getContentPane().setLayout(null); // absolute Layout ���� ����
		setLocationRelativeTo(null); // Windowâ�� ȭ�� ����� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Windowâ���� x��ư Ŭ���� JVM�� ���� �����.
	}

	private void initListener() {
		addKeyListener(new KeyListener() { // KeyListener ���̺귯�� ȣ��

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) { // Ű���带 ������ ��
				System.out.println("Ű���忡�� ���� �������ϴ�.");

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // Ű���� ������ ����Ű ��������
					player.setRight(false); // Player�� setRight�� False�� �ٲ۴�
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // Ű���� ���� ����Ű ��������
					player.setLeft(false); // Player�� setLeft�� False�� �ٲ۴�
				}
			}

			@Override
			public void keyPressed(KeyEvent e) { // Ű���带 ������ ��
				// KeyCode : ��38 ��40 ��37 ��39
				System.out.println("Ű���带 �������ϴ�." + e.getKeyCode());

				// Ű���带 ������ �ִ��� ������ ���� ������ Ȯ���ϴ� ���º����� �ʿ��ϴ�.
				// Ű���带 ������ �ִ� ���� right() �޼��带 �ѹ��� �����ϰ� �ʹ�. �������� ��� ����Ǿ���.

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // Ű���� ������ ����Ű ��������
					if (player.isRight() == false  && player.isRightWallCrash()==false) { // isRight�� false���
						player.right(); // Player�� right �޼��� ����
					}

				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // Ű���� ���� ����Ű ��������
					if (player.isLeft() == false && player.isLeftWallCrash() == false) { // isLeft�� false���
						player.left(); // Player�� left �޼��� ����
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) { // Ű���� ���� ����Ű�� ��������
					// if ��ü�� ������ �̺�Ʈ ���� ����� ���� �ʴ´�.
					if (player.isJump() == false) { // isLeft�� false���
						// �޼��� ���ο��� if�б�ó���� �̺�Ʈ ������ ��ϸ� �ǰ� ������ ���� �ʴ´�.
						player.jump(); // Player�� left �޼��� ����
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}