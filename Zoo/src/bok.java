import java.awt.Color;
import java.awt.Graphics2D;


public class bok extends Animal{

	public bok(int inputX, int inputY) {
		super(inputX, inputY);
		// TODO Auto-generated constructor stub
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
	  if(System.currentTimeMillis() - FrameCount < 100)
	  {
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x, y, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x, y, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x, y+20, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20, y+30, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22, y+33, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x, y, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100, y+30, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6, y+30, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75, y+28, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105, y+45, x+115 , y+45);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105, y+35, x+115 , y+35);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105, y+40, x+115 , y+40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5, y+44, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5, y+47, x , y+47);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5, y+60, x+7 , y+65);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7, y+65, x+10 , y+60);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20, y+62, x+23 , y+67);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23, y+67, x+26 , y+62);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40, y+61, x+43 , y+65);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43, y+65, x+46 , y+61);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5, y+60, x+7 , y+65);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7, y+65, x+10 , y+60);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40, y+70, x+43 , y+75);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43, y+75, x+46 , y+70);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20, y+82, x+23 , y+87);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23, y+87, x+26 , y+82);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33, y+87, x+36 , y+92);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36, y+92, x+39 , y+87);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47, y+87, x+50 , y+92);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50, y+92, x+53 , y+87);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33, y+87, x+36 , y+92);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36, y+92, x+39 , y+87);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35, y+33, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50, y+28, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10, y+40, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60, y+36, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70, y+27, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35, y+33, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35, y+33, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35, y+33, 6, 6);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 200)
	  {
	   g2.setColor(new Color(0,0,255));
	   g2.fillOval(x-15, y-15, 30, 30);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 300)
	  {
	   g2.setColor(new Color(0,0,255));
	   g2.fillOval(x-20, y-20, 40, 40);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 400)
	  {
	   g2.setColor(new Color(0,0,255));
	   g2.fillOval(x-25, y-25, 50, 50);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 500)
	  {
	   g2.setColor(new Color(0,0,255));
	   g2.fillOval(x-20, y-20, 40, 40);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 600)
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
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 
	  if(System.currentTimeMillis() - FrameCount < 100)        //1프레임
	  {
	
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 200)   //2프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6); }
	  else if(System.currentTimeMillis() - FrameCount < 300)   //3프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 400)   //4프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 500)   //5프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 600)   //6프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 700)   //7프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 800)   //8프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);}
	  else if(System.currentTimeMillis() - FrameCount < 900)   //9프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
	  }
	  else if(System.currentTimeMillis() - FrameCount < 1000)  //10프레임
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
	  }
	  else                            //프레임초기화
	  {
			
		  	 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(80,80,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
			 //================================================
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1, y+62+Y1, x+23+X1 , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1, y+67+Y1, x+26+X1 , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1, y+61+Y1, x+43+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1, y+65+Y1, x+46+X1 , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1, y+60+Y1, x+7+X1 , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1, y+65+Y1, x+10+X1 , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1, y+70+Y1, x+43+X1 , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1, y+75+Y1, x+46+X1 , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1, y+82+Y1, x+23+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1, y+87+Y1, x+26+X1 , y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1, y+87+Y1, x+50+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1, y+92+Y1, x+53+X1 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1, y+87+Y1, x+36+X1 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1, y+92+Y1, x+39+X1 , y+87+Y1);
		   //------------------------------------
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+50+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+10+X1, y+40+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+60+X1, y+36+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+70+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이
			 g2.fillOval(x+35+X1, y+33+Y1, 6, 6);
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