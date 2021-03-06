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
		setLocationRelativeTo(null); // 프레임 화면 중앙 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main 종료
	}

	private void initObect() {
		myPanel = new JPanel();
		checkBox1 = new JCheckBox();
		btn1 = new JButton("버튼1을 클릭하세요");
		btn2 = new JButton("버튼2를 클릭하세요");
		labelText = new JLabel("레이블1");
		// 자바 상대 경로는 내 프로젝트 폴더부터 시작이다.
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

			// 버튼이 클릭되면 윈도우가 해당 메서드를 콜백해준다.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다");
			}
		});

		btn2.addActionListener((ActionEvent e) -> {
			System.out.println("버튼2가 클릭되었습니다.");

		});

	}

	public static void main(String[] args) {

		new EventEx01();

	}
}