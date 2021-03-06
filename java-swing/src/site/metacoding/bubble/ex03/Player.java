package site.metacoding.bubble.ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * @ author 메타코딩
 * 플레이어는 좌우이동이 가능하다 상태갑 xy좌표가 필요
 * 점프가 가능하다.
 * 방울발사
 */


public class Player extends JLabel {

	private int x;
	private int y;
	
	private ImageIcon playerR, playerL;

	public Player() {
		initObject();
		initSetting();

	}

	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");

	}

	private void initSetting() {
		x = 70;
		y = 535;
		setIcon(playerR);
		setSize(50,50);
		setLocation(x, y); // paintcompnent 호출해줌 위치를 바꿨을 때 그림을 다시 그려야함.
	}
    public void left() { //방향전한 필요
    	setIcon(playerL);
        System.out.println("왼쪽으로 이동");
        x = x-50;
        setLocation(x,y);
    }

    public void right() {
		setIcon(playerR);
    	System.out.println("오른쪽 이동");
        x = x+50;
        setLocation(x,y);
    }

}
	

