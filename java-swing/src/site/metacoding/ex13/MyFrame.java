	package site.metacoding.ex13;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Ctrl + Shift + F �ڵ�����
// Ctrl + Shift + O import
public class MyFrame extends JFrame{
    public MyFrame() {
    	super();// �����Ǿ� ����
    	System.out.println("FlowLayOutEX01");	
    			
        setSize(600, 400); // w, h
        setLocationRelativeTo(null); // ������ ȭ�� �߾� ��ġ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� main ����

        setVisible(true); // �׸� �׸���
    }
    public MyFrame(int w, int h) {
        setSize(w, h); // w, h
        setLocationRelativeTo(null); // ������ ȭ�� �߾� ��ġ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� main ����



        setVisible(true); // �׸� �׸���
    }
}