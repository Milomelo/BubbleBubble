package site.metacoding.bubble.selfstudying;

import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private ImageIcon playerR;
	private int x;
	private int y;

    public Player() {
    	// init object�� ���� ���°� ��������!!
    	initObject();
        initSetting();

    }

	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
	}

	private void initSetting() {
		x = 70;
		y = 535;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y); // paintComponent ȣ������
	}

}