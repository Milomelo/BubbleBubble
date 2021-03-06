package site.metacoding.ex13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayoutEx01 extends MyFrame{

    public BorderLayoutEx01() {
        super(500, 500);

        JPanel panel = (JPanel) getContentPane();
        panel.setLayout(new BorderLayout()); // 생략가능!! 디폴트가 BorderLayout 이니까!!

        JButton btnNorth = new JButton("북쪽");
        JButton btnEast = new JButton("동쪽");
        JButton btnWest = new JButton("서쪽");
        JButton btnSouth = new JButton("남쪽");
        JButton btnCenter = new JButton("가운데");

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
        setVisible(true); // paint 메서드
    }

    public static void main(String[] args) {
        new BorderLayoutEx01();
    }

}