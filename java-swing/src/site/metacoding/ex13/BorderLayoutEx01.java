package site.metacoding.ex13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayoutEx01 extends MyFrame{

    public BorderLayoutEx01() {
        super(500, 500);

        JPanel panel = (JPanel) getContentPane();
        panel.setLayout(new BorderLayout()); // ��������!! ����Ʈ�� BorderLayout �̴ϱ�!!

        JButton btnNorth = new JButton("����");
        JButton btnEast = new JButton("����");
        JButton btnWest = new JButton("����");
        JButton btnSouth = new JButton("����");
        JButton btnCenter = new JButton("���");

        panel.add(btnNorth,BorderLayout.NORTH);
        panel.add(btnNorth,BorderLayout.WEST);
        panel.add(btnWest, "West");
        panel.add(btnSouth, "South");
        panel.add(btnCenter, "Center");

//        
//        panel.add(btnNorth, "North");
//        panel.add(btnEast, "East");
//        panel.add(btnWest, "West");
//        panel.add(btnSouth, "South");
//        panel.add(btnCenter, "Center");
        setVisible(true); // paint �޼���
    }

    public static void main(String[] args) {
        new BorderLayoutEx01();
    }

}