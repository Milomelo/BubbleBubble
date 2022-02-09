package site.metacoding.bubble.ex03;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	/**
	 * 
	 * @ author ��Ÿ�ڵ� ����: ĳ���� �¿� �̵�
	 */

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true); // ���ο� paintcomponent()ȣ�� �ڵ尡 �ִ�.
	}

//new �ϴ� ��
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
				System.out.println("Ű���� ������");				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// ���� 37, ������38, ����39, �Ʒ��� 40
				System.out.println("Ű���� ������");	
				if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
					player.right();	
				}
				if(e.getKeyCode()== KeyEvent.VK_LEFT	) {
					player.left();	
				}
				
			}
		});
		
	}


	// ���� ��� ����
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null); // JFrame�� �⺻ jpanel�� ���̾ƿ� ����
		setLocationRelativeTo(null); // ��� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ��ư Ŭ���� jvm���� �����ϱ�
	}



	public static void main(String[] args) {
		new BubbleFrame();
	}

}
