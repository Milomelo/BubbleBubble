	package site.metacoding.ex13;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Ctrl + Shift + F 자동정렬
// Ctrl + Shift + O import
public class MyFrame extends JFrame{
    public MyFrame() {
    	super();// 생략되어 잇음
    	System.out.println("FlowLayOutEX01");	
    			
        setSize(600, 400); // w, h
        setLocationRelativeTo(null); // 프레임 화면 중앙 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main 종료

        setVisible(true); // 그림 그리기
    }
    public MyFrame(int w, int h) {
        setSize(w, h); // w, h
        setLocationRelativeTo(null); // 프레임 화면 중앙 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main 종료



        setVisible(true); // 그림 그리기
    }
}