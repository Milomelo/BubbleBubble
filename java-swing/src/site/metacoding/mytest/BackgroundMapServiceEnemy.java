package site.metacoding.mytest;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

// ��׶��� ���� (�������� ������� ������ �Ѵ�)
public class BackgroundMapServiceEnemy implements Runnable {

	private static final String TAG = "BackgroundMapServiceEnemy : ";

	// ��������
	private Enemy enemy;
	private BufferedImage image;

	// ���������� ���� ��� -> ������ ���� (�����ڸ� ���ؼ� ����) = DI (Dependency Injection)
	public BackgroundMapServiceEnemy(Enemy enemy) {
		this.enemy = enemy;

		try {
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// ������ �ʰ� while�� ���� ���� Ȯ��
		while (true) {
			try {
				Color leftColor = new Color(image.getRGB(enemy.getX() - 10, enemy.getY() + 25));
				Color rightColor = new Color(image.getRGB(enemy.getX() + 50 + 10, enemy.getY() + 25));

				// System.out.println(TAG + "leftColor : " + leftColor);
				// System.out.println(TAG + "rightColor : " + rightColor);

				int bottomColor = image.getRGB(enemy.getX() + 10, enemy.getY() + 50 + 5) // -1
						+ image.getRGB(enemy.getX() + 50 - 10, enemy.getY() + 50 + 5); // -1

				// System.out.println(TAG + bottomColor);

				if (bottomColor != -2) { // �ٴڿ� ��ֹ��� �ִ�!
					// System.out.println(TAG + "�ٴڿ� �����°� �ֳ�");
					enemy.setDown(false); // �׸� ������
				} else { // �ٴ��� ���
					if (!enemy.isDown()) {
						// System.out.println(TAG + "�ٴڿ� �ƹ��͵� ����!!");
						enemy.down();
					}
				}

				if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) { // ���ʺ��� �������̸�
					// System.out.println(TAG + "���� ���� �ε�����!");
					enemy.setLeftWallCrash(true);
					enemy.setLeft(false);
				} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
					// System.out.println(TAG + "������ ���� �ε�����!");
					enemy.setRightWallCrash(true);
					enemy.setRight(false);
				}

				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
