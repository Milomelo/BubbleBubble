package site.metacoding.ex13;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

// Crtl + F11 ����
public class FlowLayoutEx01 extends MyFrame {

	public FlowLayoutEx01() {
		super(); // �����Ǿ� ����.
		JPanel panel = (JPanel) getContentPane(); // JFrame�� �г� ��������
		panel.setLayout(new FlowLayout());

		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutEx01 mf = new FlowLayoutEx01();
	}

}