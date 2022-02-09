package site.metacoding.ex13;

import java.awt.Checkbox;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventEx01 extends JFrame {

	JPanel myPanel;
	JButton btn1;
	JButton btn2;
	JCheckBox checkBox1;
	JLabel labelText, labelIMG;

	public EventEx01() {
		initSetting();
		initObect();
		initAsgin();
		initListner();

		setVisible(true);

	}

	private void initSetting() {
		setSize(300, 300);
		setLocationRelativeTo(null); // ������ ȭ�� �߾� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� main ����
	}

	private void initObect() {
		myPanel = new JPanel();
		checkBox1 = new JCheckBox();
		btn1 = new JButton("��ư1�� Ŭ���ϼ���");
		btn2 = new JButton("��ư2�� Ŭ���ϼ���");
		labelText = new JLabel("���̺�1");
		// �ڹ� ��� ��δ� �� ������Ʈ �������� �����̴�.
		labelIMG = new JLabel(new ImageIcon("image/dog.jpg"));
	}

	private void initAsgin() {

		add(myPanel);
		myPanel.add(btn1);
		myPanel.add(checkBox1);
		myPanel.add(labelText);
		myPanel.add(labelIMG);
	}

	private void initListner() {
		btn1.addActionListener(new ActionListener() {

			// ��ư�� Ŭ���Ǹ� �����찡 �ش� �޼��带 �ݹ����ش�.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� Ŭ���Ǿ����ϴ�");
			}
		});

		btn2.addActionListener((ActionEvent e) -> {
			System.out.println("��ư2�� Ŭ���Ǿ����ϴ�.");

		});

	}

	public static void main(String[] args) {

		new EventEx01();

	}
}