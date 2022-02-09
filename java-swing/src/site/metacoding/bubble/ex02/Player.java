package site.metacoding.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * @author ��Ÿ�ڵ�
 * �÷��̾�� �¿� �̵��� �����ϴ�.
 * ������ �����ϴ�
 * ��� �߻� (���߿� ��������)*/

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
        setLocation(x, y); // paintComponent ȣ������
    }

    public void left() {

    }

    public void right() {
        System.out.println("������ �̵�");
        x = x+10;
        setLocation(x,y);
    }

}