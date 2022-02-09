package site.metacoding.ex13;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyPanel extends JPanel {
	int x = 50;
	int y = 70;

	@Override
	protected void paintComponent(Graphics g) { // g�� ���̴�.
		super.paintComponent(g);
		System.out.println("�г��� �ٽ� �׷����ϴ�");
		g.drawLine(10, 20, 100, 200); // 1�� 2���� ù��° ���� xy ��ǥ. 3�� 4���� �ι�° ���� xy ��ǥ ����
		g.drawLine(10, 20, x, y);
	}
}

public class EventEx02 extends JFrame implements UserInterface {

	MyPanel myPanel;
	JLabel lableText;
	JButton btn1, btn2; // Ŭ���ϸ� 200,300���� ����

	public EventEx02() {
		initSetting();
		initObject();
		initAssign();
		initListener();

		setVisible(true);
	}

	@Override
	public void initSetting() {
		setSize(300, 300);
		setLocationRelativeTo(null); // ������ ȭ�� �߾� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư Ŭ���� main ����
	}

	@Override
	public void initObject() {
		myPanel = new MyPanel();
		lableText = new JLabel("ù����");
		btn1 = new JButton("���ڹ���");
		btn2 = new JButton("�׸�����");

	}

	@Override
	public void initAssign() {
		add(myPanel); // JFrame�� Panel �ϳ� add
		myPanel.add(lableText);
		myPanel.add(btn1);
		myPanel.add(btn2);
	}

	@Override
	public void initListener() {
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// setText�޼���� �κк���!!
				lableText.setText("����?"); // setText �޼���� ���ο� paintcompnent�� ��ȣ�����ش�.

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.x = myPanel.x + 30;
				myPanel.y = myPanel.y + 40;

				System.out.println(myPanel.x);
				System.out.println(myPanel.x);
				repaint();
			}	
		});
	}

	public static void main(String[] args) {
		new EventEx02();
	}

}