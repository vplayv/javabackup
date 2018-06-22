import java.awt.*;

public class Animal
{
 int x;
 int y;
 long FrameCount;
 long moveTime;                              //이동시간
 long stopTime;        //정지시간
 long moveDirection_X;                       //1프레임당 이동하는  x축이동량
 long moveDirection_Y;      //1프레임당 이동하는  y축이동량
 long moveCount;
 boolean Left_Right;                                //동물이 false일때 왼쪽을, false일때 오른쪽을 봄
 boolean danceFlag;
 public Animal(int inputX,int inputY)
 {
  danceFlag = false;
  Left_Right = false;
  moveCount = System.currentTimeMillis();
  moveTime = (long)(Math.random()*3)*1000+1000;        //이동시간 1초 or 2초  or 3초로 설정(애니메이션이 1초짜리이기 때문)
  stopTime = (long)((Math.random()*2))*600+600;        //이동후 정지시간 0.6초 or 1.2초로 설정(애니메이션이 0.5초짜리이기 떄문)
  x = inputX;
  y = inputY;
  moveDirection_X = (long)(Math.random()*4);     //프레임당 x축이동 -3~+3
  moveDirection_Y = 3-moveDirection_X;
  if((int)(Math.random()*2) == 1)
   moveDirection_X *= -1;
  if((int)(Math.random()*2) == 1)
   moveDirection_Y *= -1;
  FrameCount = System.currentTimeMillis();
 }
 public void draw(Graphics2D g2) 
 {
  if(danceFlag)
   danceFrame(g2);
  else if(System.currentTimeMillis()-moveCount < moveTime )
   moveFrame(g2);
  else 
   stopFrame(g2);
 }
 private void danceFrame(Graphics2D g2)
 {
  if(System.currentTimeMillis() - FrameCount < 50)
  {
   g2.setColor(new Color(0,0,255));
   g2.fillOval(x-10, y-10, 20, 20);
  }
  else if(System.currentTimeMillis() - FrameCount < 100)
  {
   g2.setColor(new Color(0,0,255));
   g2.fillOval(x-15, y-15, 30, 30);
  }
  else if(System.currentTimeMillis() - FrameCount < 150)
  {
   g2.setColor(new Color(0,0,255));
   g2.fillOval(x-20, y-20, 40, 40);
  }
  else if(System.currentTimeMillis() - FrameCount < 200)
  {
   g2.setColor(new Color(0,0,255));
   g2.fillOval(x-25, y-25, 50, 50);
  }
  else if(System.currentTimeMillis() - FrameCount < 250)
  {
   g2.setColor(new Color(0,0,255));
   g2.fillOval(x-20, y-20, 40, 40);
  }
  else if(System.currentTimeMillis() - FrameCount < 300)
  {
   g2.setColor(new Color(0,0,255));
   g2.fillOval(x-15, y-15, 30, 30);
  }
  else
  {
   g2.setColor(new Color(0,0,255));
   g2.fillOval(x-10, y-10, 20, 20);
   FrameCount = System.currentTimeMillis();
  }
 }
 private void moveFrame(Graphics2D g2)
 {
  if(System.currentTimeMillis() - FrameCount < 100)        //1프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-25, y-50, 50, 100);
  }
  else if(System.currentTimeMillis() - FrameCount < 200)   //2프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-30, y-45, 60, 90);
  }
  else if(System.currentTimeMillis() - FrameCount < 300)   //3프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-35, y-40, 70, 80);
  }
  else if(System.currentTimeMillis() - FrameCount < 400)   //4프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-40, y-35, 80, 70);
  }
  else if(System.currentTimeMillis() - FrameCount < 500)   //5프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-45, y-30, 90, 60);
  }
  else if(System.currentTimeMillis() - FrameCount < 600)   //6프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-50, y-25, 100, 50);
  }
  else if(System.currentTimeMillis() - FrameCount < 700)   //7프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-45, y-30, 90, 60);
  }
  else if(System.currentTimeMillis() - FrameCount < 800)   //8프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-40, y-35, 80, 70);
  }
  else if(System.currentTimeMillis() - FrameCount < 900)   //9프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-35, y-40, 70, 80);
  }
  else if(System.currentTimeMillis() - FrameCount < 1000)  //10프레임
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-30, y-45, 60, 90);
  }
  else                            //프레임초기화
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-25, y-50, 50, 100);
   FrameCount = System.currentTimeMillis();
  }
 }
 private void stopFrame(Graphics2D g2)
 {
  if(System.currentTimeMillis() - FrameCount < 100)
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-50, y-50, 100, 100);
   g2.setColor(new Color(0,255,0));
   g2.fillOval(x-10, y-10, 20, 20);
  }
  else if(System.currentTimeMillis() - FrameCount < 200)
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-50, y-50, 100, 100);
   g2.setColor(new Color(0,255,0));
   g2.fillOval(x-15, y-15, 30, 30);
  }
  else if(System.currentTimeMillis() - FrameCount < 300)
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-50, y-50, 100, 100);
   g2.setColor(new Color(0,255,0));
   g2.fillOval(x-20, y-20, 40, 40);
  }
  else if(System.currentTimeMillis() - FrameCount < 400)
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-50, y-50, 100, 100);
   g2.setColor(new Color(0,255,0));
   g2.fillOval(x-25, y-25, 50, 50);
  }
  else if(System.currentTimeMillis() - FrameCount < 500)
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-50, y-50, 100, 100);
   g2.setColor(new Color(0,255,0));
   g2.fillOval(x-20, y-20, 40, 40);
  }
  else if(System.currentTimeMillis() - FrameCount < 600)
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-50, y-50, 100, 100);
   g2.setColor(new Color(0,255,0));
   g2.fillOval(x-15, y-15, 30, 30);
  }
  else
  {
   g2.setColor(new Color(0,0,0));
   g2.fillOval(x-50, y-50, 100, 100);
   g2.setColor(new Color(0,255,0));
   g2.fillOval(x-10, y-10, 20, 20);
   FrameCount = System.currentTimeMillis();
  }
 }
 public void moveAround()
 {
  if(System.currentTimeMillis()-moveCount < moveTime)
  {
   if(moveDirection_X >= 0)
    Left_Right = false;
   else
    Left_Right = true;
   x += moveDirection_X;
   y += moveDirection_Y;
   if(545<x)
    moveDirection_X = -Math.abs(moveDirection_X);
   if(50>x)
    moveDirection_X = Math.abs(moveDirection_X);
   if(y<50)
    moveDirection_Y = Math.abs(moveDirection_Y);
   if(y>440)
    moveDirection_Y = -Math.abs(moveDirection_Y);
  }
  else if(System.currentTimeMillis()-moveCount >= moveTime+stopTime)
  {
   moveCount = System.currentTimeMillis();
   moveTime = (long)(Math.random()*3)*1000+1000;        //이동시간 1초 or 2초  or 3초로 설정(애니메이션이 1초짜리이기 때문)
   stopTime = (long)((Math.random()*2))*600+600;        //이동후 정지시간 0.6초 or 1.2초로 설정(애니메이션이 0.5초짜리이기 떄문)
   moveDirection_X = (long)(Math.random()*4);     //프레임당 x축이동 -3~+3
   moveDirection_Y = 3-moveDirection_X;
   if((int)(Math.random()*2) == 1)
    moveDirection_X *= -1;
   if((int)(Math.random()*2) == 1)
    moveDirection_Y *= -1;
  } 
 }
 public boolean touchSpace(int inputX,int inputY)
 {
  if(inputX >= x-50 && inputX <= x+50 && inputY >= y-50 && inputY <= y+50)
   return true;
  else
   return false;
 }
 public void setXY(int inputX, int inputY)
 {
   x = inputX;
   y = inputY;
 }
 public void setDance()
 {
  if(!danceFlag){
	  danceFlag = true;
  }
  else
	  danceFlag = false;
 }
} 