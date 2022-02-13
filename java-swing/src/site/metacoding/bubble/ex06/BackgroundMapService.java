package site.metacoding.bubble.ex06;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

// ��׶��� ���� (�������� ������� �������Ѵ�.)
public class BackgroundMapService implements Runnable {

   // ��������
   private Player player;
   private BufferedImage image; // BufferedImage�� �̹����� �̹��� �״�� �д´�.(�̹��� �м�)

   // DI(Dependency Injection) : ������ ����(�����ڸ� ���ؼ� �����Ѵ�.)
   // ���������� ���� ���
   public BackgroundMapService(Player player) {
      this.player = player;

      try {
         // raw�ϰ� �д´ٴ� �� : ���� �״�� �д� ��.
         image = ImageIO.read(new File("image/backgroundMapService.png")); // �̹����� �������� �Ӽ���ȸ(Buffer�� �д´�)
//         System.out.println(image); // �̹��� ���
//         System.out.println(image.getRGB(10, 10)); // ������� -65536 : ������������ �˾ƺ��� �����.

      } catch (Exception e) {
         e.printStackTrace();
      }
   }


   @Override
   public void run() {
      while(true) {
         // ���� Ȯ��
         Color leftColor = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
         Color rightColor = new Color(image.getRGB(player.getX() + 50 + 15, player.getY() + 25));
         //System.out.println("leftColor : "+leftColor);
         //System.out.println("rightColor : "+rightColor);
         
         if(leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
            System.out.println("���� ���� �浹��");
            player.setLeftWallCrash(true);
            player.setLeft(false);
         }else if(rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
            System.out.println("������ ���� �浹��");
            player.setRighttWallCrash(true);
            player.setRight(false);
         }
         
         try {
            Thread.sleep(10);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }

   }

}