package site.metacoding.bubble.ex06;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

// 백그라운드 서비스 (독립적인 스레드로 돌려야한다.)
public class BackgroundMapService implements Runnable {

   // 컴포지션
   private Player player;
   private BufferedImage image; // BufferedImage는 이미지를 이미지 그대로 읽는다.(이미지 분석)

   // DI(Dependency Injection) : 의존성 주입(생성자를 통해서 주입한다.)
   // 컴포지션을 위한 기술
   public BackgroundMapService(Player player) {
      this.player = player;

      try {
         // raw하게 읽는다는 뜻 : 날것 그대로 읽는 것.
         image = ImageIO.read(new File("image/backgroundMapService.png")); // 이미지를 색상으로 속성조회(Buffer로 읽는다)
//         System.out.println(image); // 이미지 출력
//         System.out.println(image.getRGB(10, 10)); // 색상출력 -65536 : 무슨색깔인지 알아보기 힘들다.

      } catch (Exception e) {
         e.printStackTrace();
      }
   }


   @Override
   public void run() {
      while(true) {
         // 색상 확인
         Color leftColor = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
         Color rightColor = new Color(image.getRGB(player.getX() + 50 + 15, player.getY() + 25));
         //System.out.println("leftColor : "+leftColor);
         //System.out.println("rightColor : "+rightColor);
         
         if(leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
            System.out.println("왼쪽 벽에 충돌함");
            player.setLeftWallCrash(true);
            player.setLeft(false);
         }else if(rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
            System.out.println("오른쪽 벽에 충돌함");
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