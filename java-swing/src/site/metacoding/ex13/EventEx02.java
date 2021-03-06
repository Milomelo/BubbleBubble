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
	protected void paintComponent(Graphics g) { // g는 붓이다.
		super.paintComponent(g);
		System.out.println("패널이 다시 그려집니다");
		g.drawLine(10, 20, 100, 200); // 1번 2번은 첫번째 점의 xy 좌표. 3번 4번은 두번째 점의 xy 좌표 연결
		g.drawLine(10, 20, x, y);
	}
}

public class EventEx02 extends JFrame implements UserInterface {

	MyPanel myPanel;
	JLabel lableText;
	JButton btn1, btn2; // 클릭하면 200,300으로 변경

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
		setLocationRelativeTo(null); // 프레임 화면 중앙 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 클릭시 main 종료
	}

	@Override
	public void initObject() {
		myPanel = new MyPanel();
		lableText = new JLabel("첫글자");
		btn1 = new JButton("글자번경");
		btn2 = new JButton("그림변경");

	}

	@Override
	public void initAssign() {
		add(myPanel); // JFrame에 Panel 하나 add
		myPanel.add(lableText);
		myPanel.add(btn1);
		myPanel.add(btn2);
	}

	@Override
	public void initListener() {
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// setText메서드는 부분변경!!
				lableText.setText("무잉?"); // setText 메서드는 내부에 paintcompnent를 재호출해준다.

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
