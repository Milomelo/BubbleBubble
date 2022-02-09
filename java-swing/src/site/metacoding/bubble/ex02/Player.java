package site.metacoding.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * @author 메타코딩
 * 플레이어는 좌우 이동이 가능하다.
 * 점프가 가능하다
 * 방울 발사 (나중에 생각하자)*/

public class Player extends JLabel {

    private ImageIcon playerR;
    private int x;
    private int y;

    public Player() {
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

    public void left() {

    }

    public void right() {
        System.out.println("오른쪽 이동");
        x = x+10;
        setLocation(x,y);
    }

}