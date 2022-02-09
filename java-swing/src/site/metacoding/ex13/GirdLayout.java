package site.metacoding.ex13;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GirdLayout extends MyFrame {
	super(500,500);

	JPanel panel = (JPanel) getContentPane();panel.setLayout(null);

	JButton btn1 = new JButton("¹öÆ°1");btn1.setSize(100,50);btn1.setLocation(0,0);panel.add(btn1);

	public static void main(String[] args) {
		new GridLayout();
		System.out.println();
	}
}