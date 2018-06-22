import java.awt.Color;
import java.awt.Graphics2D;


public class Turtle extends Animal{

	public Turtle(int inputX, int inputY) {
		super(inputX, inputY);
	}
	 @Override
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
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 final int A = 50; //°ÅºÏÀÌ º¸Á¤
		 int x = (int)this.x;
		 int y = (int)this.y;
		 if(Left_Right){
		 if(System.currentTimeMillis() - danceFrameCount < 50)
	  {
			 g2.setColor(new Color(255,205,51));
			   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
			   g2.setColor(new Color(255,205,51));
			   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
			   g2.setColor(new Color(255,205,51));
			   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
			   g2.setColor(new Color(0,204,0));
			   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
			   g2.setColor(new Color(255,204,0));
			   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
			   g2.setColor(new Color(0,204,0));
			   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
			   g2.setColor(new Color(102,51,0));
			   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
			   g2.setColor(new Color(102,51,0));
			   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
			   g2.setColor(new Color(102,51,0));
			   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
			   g2.setColor(new Color(102,51,0));
			   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
			   g2.setColor(new Color(0,0,0));
			   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 100)
	  {
		  y+= 5;
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		    g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 40, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 40, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 150)
	  {
		  y+= 10;
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 30, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -3
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 30, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -3
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 200)
	  {
		  y+= 15;
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-85+A, y+Y1-10+A, 5, 5, 180, 180);//´«°¨À½
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 250)
	  {
		  y+= 10;
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		    g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 40, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 40, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 300)
	  {
		  y+= 5;
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 30, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -3
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 30, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -3
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	   danceFrameCount = System.currentTimeMillis();
	  }
		 }
		 else{
			 x -= 35;
			 if(System.currentTimeMillis() - danceFrameCount < 50)
			  {
				 g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 100)
			  {
				  y+= 5;
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 150)
			  {
				  y+= 10;
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1-7+A, 40, 24, 0, -90);//Áö´À·¯¹Ì ¾Õ 1 -2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1+5+A, 40, 24, 180, -90);//Áö´À·¯¹Ì ¾Õ 2 -2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 200)
			  {
				  y+= 15;
				  g2.setColor(new Color(255,205,51));
			   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
			   g2.setColor(new Color(255,205,51));
			   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
			   g2.setColor(new Color(255,205,51));
			   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
			   g2.setColor(new Color(0,204,0));
			   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
			   g2.setColor(new Color(255,204,0));
			   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
			   g2.setColor(new Color(0,204,0));
			   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
			   g2.setColor(new Color(102,51,0));
			   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
			   g2.setColor(new Color(102,51,0));
			   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
			   g2.setColor(new Color(102,51,0));
			   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
			   g2.setColor(new Color(102,51,0));
			   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
			   g2.setColor(new Color(0,0,0));
			   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
			   g2.setColor(new Color(0,120,0));
			   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 250)
			  {
				  y+= 10;
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1-7+A, 40, 24, 0, -90);//Áö´À·¯¹Ì ¾Õ 1 -2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1+5+A, 40, 24, 180, -90);//Áö´À·¯¹Ì ¾Õ 2 -2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 300)
			  {
				  y+= 5;
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+110 +A, y+Y1-10 +A, 5, 5, 180, 180);//´«°¨À½
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			   danceFrameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 private void moveFrame(Graphics2D g2)
	 {
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 final int A = 50; //°ÅºÏÀÌ º¸Á¤
		 int x = (int)this.x;
		 int y = (int)this.y;
		 if(Left_Right){
	  if(System.currentTimeMillis() - frameCount < 100)        //1ÇÁ·¹ÀÓ
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12


	  }
	  else if(System.currentTimeMillis() - frameCount < 200)   //2ÇÁ·¹ÀÓ
	  {

		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }


	  else if(System.currentTimeMillis() - frameCount < 300)   //3ÇÁ·¹ÀÓ
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else if(System.currentTimeMillis() - frameCount < 400)   //4ÇÁ·¹ÀÓ
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else if(System.currentTimeMillis() - frameCount < 500)   //5ÇÁ·¹ÀÓ
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		    g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 40, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 40, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else if(System.currentTimeMillis() - frameCount < 600)   //6ÇÁ·¹ÀÓ
	  {g2.setColor(new Color(255,205,51));
	   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
	   g2.setColor(new Color(255,205,51));
	   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
	   g2.setColor(new Color(255,205,51));
	   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
	   g2.setColor(new Color(0,204,0));
	   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
	   g2.setColor(new Color(255,204,0));
	   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
	   g2.setColor(new Color(0,204,0));
	   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
	   g2.setColor(new Color(102,51,0));
	   g2.fillArc(x+X1-30+A, y+Y1-7+A, 30, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -3
	   g2.setColor(new Color(102,51,0));
	   g2.fillArc(x+X1-35+A, y+Y1+5+A, 30, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -3
	   g2.setColor(new Color(102,51,0));
	   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
	   g2.setColor(new Color(102,51,0));
	   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
	   g2.setColor(new Color(0,0,0));
	   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
	   g2.setColor(new Color(0,120,0));
	   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else if(System.currentTimeMillis() - frameCount < 700)   //7ÇÁ·¹ÀÓ
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-10+A, 30, 30, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -4
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 30, 30, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -4
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
	  }
	  else if(System.currentTimeMillis() - frameCount < 800)   //8ÇÁ·¹ÀÓ
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 30, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -3
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 30, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -3
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else if(System.currentTimeMillis() - frameCount < 900)   //9ÇÁ·¹ÀÓ
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		    g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 40, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 40, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12


	  }
	  else if(System.currentTimeMillis() - frameCount < 1000)  //10ÇÁ·¹ÀÓ
	  {

		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else                            //ÇÁ·¹ÀÓÃÊ±âÈ­
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12


	   frameCount = System.currentTimeMillis();
	  		}
		 }
		 else{//1111 22 33 41 1
			 x -= 35;
			 if(System.currentTimeMillis() - frameCount < 100)        //1ÇÁ·¹ÀÓ
			  {
				 g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 200)   //2ÇÁ·¹ÀÓ
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 300)   //3ÇÁ·¹ÀÓ
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 400)   //4ÇÁ·¹ÀÓ
			  {

				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else if(System.currentTimeMillis() - frameCount < 500)   //5ÇÁ·¹ÀÓ
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1-7+A, 40, 24, 0, -90);//Áö´À·¯¹Ì ¾Õ 1 -2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1+5+A, 40, 24, 180, -90);//Áö´À·¯¹Ì ¾Õ 2 -2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 600)   //6ÇÁ·¹ÀÓ
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2

				   //
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1-7+A, 30, 24, 0, -90);//Áö´À·¯¹Ì ¾Õ 1 -3
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1+5+A, 30, 24, 180, -90);//Áö´À·¯¹Ì ¾Õ 2 -3
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   //
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 700)   //7ÇÁ·¹ÀÓ
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2

				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1-10+A, 30, 30, 0, -90);//Áö´À·¯¹Ì ¾Õ 1 -4
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1+5+A, 30, 30, 180, -90);//Áö´À·¯¹Ì ¾Õ 2 -4

				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 800)   //8ÇÁ·¹ÀÓ
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2

				   //
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1-7+A, 30, 24, 0, -90);//Áö´À·¯¹Ì ¾Õ 1 -3
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1+5+A, 30, 24, 180, -90);//Áö´À·¯¹Ì ¾Õ 2 -3
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   //
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12


			  }
			  else if(System.currentTimeMillis() - frameCount < 900)   //9ÇÁ·¹ÀÓ
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1-7+A, 40, 24, 0, -90);//Áö´À·¯¹Ì ¾Õ 1 -2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15+A, y+Y1+5+A, 40, 24, 180, -90);//Áö´À·¯¹Ì ¾Õ 2 -2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 1000)  //10ÇÁ·¹ÀÓ
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else                            //ÇÁ·¹ÀÓÃÊ±âÈ­
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			   frameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 private void stopFrame(Graphics2D g2)
	 {
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 final int A = 50; //°ÅºÏÀÌ º¸Á¤
		 int x = (int)this.x;
		 int y = (int)this.y;
		 if(Left_Right){
	  if(System.currentTimeMillis() - frameCount < 100)//
			 {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else if(System.currentTimeMillis() - frameCount < 200)//
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else if(System.currentTimeMillis() - frameCount < 300)//
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		    g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 40, 24, 180, 90);//Áö´À·¯¹Ì ¾Õ 1 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 40, 24, 0, 90);//Áö´À·¯¹Ì ¾Õ 2 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else if(System.currentTimeMillis() - frameCount < 400)//
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-85+A, y+Y1-10+A, 5, 5, 180, 180);//´«°¨À½
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else if(System.currentTimeMillis() - frameCount < 500)//
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-85+A, y+Y1-10+A, 5, 5, 180, 180);//´«°¨À½
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12


	  }
	  else if(System.currentTimeMillis() - frameCount < 600)//
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	  }
	  else
	  {
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//´ë°¡¸® 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//´ë°¡¸® 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//´ë°¡¸® 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//Áö´À·¯¹Ì ¾Õ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//Áö´À·¯¹Ì ¾Õ 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//Áö´À·¯¹Ì µÚ 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//Áö´À·¯¹Ì µÚ 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

	   frameCount = System.currentTimeMillis();
	  	}
		 }
		 else if(!Left_Right){//232345  1
			 x -= 35;
			 if(System.currentTimeMillis() - frameCount < 100)//d
			  {
				 g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 200)//
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 300)//
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else if(System.currentTimeMillis() - frameCount < 400)//
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else if(System.currentTimeMillis() - frameCount < 500)//
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12
			  }
			  else if(System.currentTimeMillis() - frameCount < 600)//
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			  }
			  else
			  {
				  g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//´ë°¡¸® 1
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//´ë°¡¸® 2
				   g2.setColor(new Color(255,205,51));
				   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//´ë°¡¸® 3
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//µî²®Áú À§
				   g2.setColor(new Color(255,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//µî²®Áú ¾Æ·¡
				   g2.setColor(new Color(0,204,0));
				   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//µî²®Áú À§ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//Áö´À·¯¹Ì ¾Õ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//Áö´À·¯¹Ì ¾Õ 2
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//Áö´À·¯¹Ì µÚ 1
				   g2.setColor(new Color(102,51,0));
				   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//Áö´À·¯¹Ì µÚ 2
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//´«µ¿ÀÚ
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 1
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 2
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 3
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 4
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 5
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 6
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//µî²®Áú À§ ²®µ¥±â 7
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 8
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 9
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 10
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 11
				   g2.setColor(new Color(0,120,0));
				   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//µî²®Áú À§ ²®µ¥±â 12

			   frameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 @Override
	public boolean touchSpace(double inputX,double inputY)
		{
			if(inputX >= x-90 && inputX <= x+90 && inputY >= y-20 && inputY <= y+20)
				return true;
			else
				return false;
		}
	 @Override
	public boolean targetToMouth(double targetX,double targetY)
	{
		if(Left_Right)
		{
			if(targetX > x-90 && targetX < x-80 && targetY > y && targetY < y+5)
				return true;
			else
				return false;
		}
		else
		{
			if(targetX > x+80 && targetX < x+90 && targetY > y && targetY < y+5)
				return true;
			else
				return false;
		}
	}
	@Override
	public void targetFeed(int newTarget,double targetX,double targetY)
	{
		if(newTarget == -1)
		{
			targetFeed = -1;
			this.distance = 1000;
		}
		else
		{
			double distance;
			if(Left_Right)
				distance = Math.sqrt((targetX-(x-87))*(targetX-(x-87))+(targetY-(y+3))*(targetY-(y+3)));
			else
				distance = Math.sqrt((targetX-(x+87))*(targetX-(x+87))+(targetY-(y+3))*(targetY-(y+3)));
			if(distance<this.distance || newTarget == targetFeed)
			{
				targetFeed = newTarget;
				this.distance = distance;
				if(Left_Right)
				{
					moveDirection_X = 2*(targetX-x+87)/distance;
					moveDirection_Y = 2*(targetY-(y+3))/distance;
				}
				else
				{
					moveDirection_X = 2*(targetX-x-87)/distance;
					moveDirection_Y = 2*(targetY-(y+3))/distance;
				}
				if(Left_Right && x-89 < targetX && targetX < x-86)
					moveDirection_X = -0.000001;   //¹æÇâ°íÁ¤¿ë ±Ø¼Ò°ª
				else if(!Left_Right && x + 86 < targetX && targetX < x+89)
					moveDirection_X = 0.000001;    //¹æÇâ°íÁ¤¿ë ±Ø¼Ò°ª
				else if( x-89<targetX && !Left_Right && targetX < x+86 || Left_Right && x-86<targetX && targetX<x+89)
					moveDirection_X *= -1;
			}
		}
	}
}