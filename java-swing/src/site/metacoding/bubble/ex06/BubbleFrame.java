package site.metacoding.bubble.ex06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author stuuu 목적 : 낙하 테스트 (맵 충돌 감지 테스트) 1 . 색상 테스트를 위해 test.png를 이용한다. - 충돌의
 *         책임은 플레이어가 아닌 맵이 가진다. 왜? - 다수인 쪽이 소수인 쪽을 계산하는것이 훨씬 쉽고 가볍기 때문이다. - 색깔을
 *         이용하여 맵 장애물의 기능을 각각 준다. - 파란색라인은 아래에선 통과되고 위에선 충돌을 일으킨다.(맵 중간 장애물 점프시
 *         통과기능) - 빨간색라인은 방향 상관없이 충돌을 일으킨다.(맵 바깥으로 캐릭터의 이동을 막는 기능) - 캐릭터가 점프 후
 *         떨어지는것을 for로 하면 3층, 4층에선 1개층만 떨어지기때문에 while을 써야한다.(바닥으로 떨어지게)
 *
 */
public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		initService();

		setVisible(true); // paintComponent() 메서드 호출
	}

	private void initService() { // 색상 확인 실행
		new Thread(new BackgroundMapService(player)).start(); // 스레드 실행
	}

	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMapService.png"));
		setContentPane(backgroundMap); // Background 배경설정

		player = new Player();
		add(player);

	}

	private void initSetting() {
		setSize(1000, 640); // Frame 사이즈 x = 1000, y = 640
		getContentPane().setLayout(null); // absolute Layout 으로 설정
		setLocationRelativeTo(null); // Window창을 화면 가운데에 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Window창에서 x버튼 클릭시 JVM이 같이 종료됨.
	}

	private void initListener() {
		addKeyListener(new KeyListener() { // KeyListener 라이브러리 호출

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) { // 키보드를 떼었을 때
				System.out.println("키보드에서 손을 떼었습니다.");

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // 키보드 오른쪽 방향키 떼었을때
					player.setRight(false); // Player의 setRight를 False로 바꾼다
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 키보드 왼쪽 방향키 떼었을때
					player.setLeft(false); // Player의 setLeft를 False로 바꾼다
				}
			}

			@Override
			public void keyPressed(KeyEvent e) { // 키보드를 눌렀을 때
				// KeyCode : 상38 하40 좌37 우39
				System.out.println("키보드를 눌렀습니다." + e.getKeyCode());

				// 키보드를 누르고 있는지 누르고 있지 않은지 확인하는 상태변수가 필요하다.
				// 키보드를 누르고 있는 동안 right() 메서드를 한번만 실행하고 싶다. 기존에는 계속 실행되었다.

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // 키보드 오른쪽 방향키 눌렀을때
					if (player.isRight() == false  && player.isRightWallCrash()==false) { // isRight가 false라면
						player.right(); // Player의 right 메서드 실행
					}

				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 키보드 왼쪽 방향키 눌렀을때
					if (player.isLeft() == false && player.isLeftWallCrash() == false) { // isLeft가 false라면
						player.left(); // Player의 left 메서드 실행
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) { // 키보드 위쪽 방향키를 눌렀을때
					// if 자체를 막으면 이벤트 루프 등록이 되지 않는다.
					if (player.isJump() == false) { // isLeft가 false라면
						// 메서드 내부에서 if분기처리는 이벤트 루프에 등록만 되고 실행이 되지 않는다.
						player.jump(); // Player의 left 메서드 실행
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}