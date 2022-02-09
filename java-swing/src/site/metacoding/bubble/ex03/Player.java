package site.metacoding.bubble.ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * @ author ��Ÿ�ڵ�
 * �÷��̾�� �¿��̵��� �����ϴ� ���°� xy��ǥ�� �ʿ�
 * ������ �����ϴ�.
 * ���߻�
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
		setLocation(x, y); // paintcompnent ȣ������ ��ġ�� �ٲ��� �� �׸��� �ٽ� �׷�����.
	}
    public void left() { //�������� �ʿ�
    	setIcon(playerL);
        System.out.println("�������� �̵�");
        x = x-50;
        setLocation(x,y);
    }

    public void right() {
		setIcon(playerR);
    	System.out.println("������ �̵�");
        x = x+50;
        setLocation(x,y);
    }

}
	
