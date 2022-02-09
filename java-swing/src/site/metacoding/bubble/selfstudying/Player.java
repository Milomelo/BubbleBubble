package site.metacoding.bubble.selfstudying;

import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private ImageIcon playerR;
	private int x;
	private int y;

    public Player() {
    	// init object를 위에 적는걸 잊지말자!!
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
		setLocation(x, y); // paintComponent 호출해줌
	}

}
