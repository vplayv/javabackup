import java.awt.Color;
import java.awt.Graphics2D;


public class Puffer extends Animal{

	public Puffer(int inputX, int inputY) {
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
		 final int Y1 = (-50) ;
		 int x = (int)this.x;
		 int y = (int)this.y;
		 if(System.currentTimeMillis() - danceFrameCount < 100)
			 y+= 5;
		 else if(System.currentTimeMillis() - danceFrameCount < 150)
			 y+= 10;
		 else if(System.currentTimeMillis() - danceFrameCount < 200)
			 y+= 15;
		 else if(System.currentTimeMillis() - danceFrameCount < 250)
			 y+= 10;
		 else if(System.currentTimeMillis() - danceFrameCount < 300)
			 y+= 5;
		 if(Left_Right){
			 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(120,120,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
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
	  if(System.currentTimeMillis() - danceFrameCount < 50)
	  {
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 100)
	  {
			 g2.setColor(new Color(0,0,0));//눈감은거
			 g2.drawArc(x+20+X1, y+30+Y1, 10, 10, 200, 120);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 150)
	  {
			 g2.setColor(new Color(0,0,0));//눈감은거
			 g2.drawArc(x+20+X1, y+30+Y1, 10, 10, 200, 120);
			 g2.setColor(new Color(100,100,0));//지느러미2
			 g2.fillArc(x+6+X1, y+18+Y1+10, 60 , 30 , 25, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 200)
	  {
			 g2.setColor(new Color(0,0,0));//눈감은거
			 g2.drawArc(x+20+X1, y+30+Y1, 10, 10, 200, 120);
			 g2.setColor(new Color(100,100,0));//지느러미2
			 g2.fillArc(x+6+X1, y+18+Y1+10, 60 , 30 , 25, 40);
			 g2.setColor(new Color(204,204,051));//입 위
			 g2.fillRoundRect(x-5+X1, y+44+Y1+4, 5, 3, 2,2);
			 g2.setColor(new Color(204,204,051));//입 아래
			 g2.fillRoundRect(x-3+X1, y+44+Y1, 5, 3, 1,1);
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 250)
	  {
		  g2.setColor(new Color(0,0,0));//눈감은거
			 g2.drawArc(x+20+X1, y+30+Y1, 10, 10, 200, 120);
			 g2.setColor(new Color(100,100,0));//지느러미2
			 g2.fillArc(x+6+X1, y+18+Y1+10, 60 , 30 , 25, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 300)
	  {
		  g2.setColor(new Color(0,0,0));//눈감은거
			 g2.drawArc(x+20+X1, y+30+Y1, 10, 10, 200, 120);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else
	  {
		  g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	   danceFrameCount = System.currentTimeMillis();
	  }
		 }
		 else{
			 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 240, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 240, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1-10, y+20+Y1, 110 , 60 , 0, 135);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 153, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+X1-20, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(120,120,0));//꼬리 연걸점
			 g2.fillArc(x-25+X1, y+28+Y1, 50 , 54 , 80, 25);

				 g2.setColor(new Color(30,30,30));//꼬리 선1
				 g2.drawLine(x-20+X1, y+45+Y1, x-10+X1 , y+45+Y1);
				 g2.setColor(new Color(30,30,30));//꼬리 선2
				 g2.drawLine(x-20+X1, y+35+Y1, x-10+X1 , y+35+Y1);
				 g2.setColor(new Color(30,30,30));//꼬리 선3
				 g2.drawLine(x-20+X1, y+40+Y1, x-10+X1 , y+40+Y1);
				 int a = 40;
				 g2.setColor(new Color(0,0,0));//가시1
				 g2.drawLine(x+5+X1 + a, y+60+Y1, x+7+X1 + a , y+65+Y1);
				 g2.setColor(new Color(0,0,0));//가시1
				 g2.drawLine(x+7+X1 + a, y+65+Y1, x+10+X1 + a , y+60+Y1);
				 g2.setColor(new Color(0,0,0));//가시2
				 g2.drawLine(x+20+X1 + a, y+62+Y1, x+23+X1 + a , y+67+Y1);
				 g2.setColor(new Color(0,0,0));//가시2
				 g2.drawLine(x+23+X1 + a, y+67+Y1, x+26+X1 + a , y+62+Y1);
				 g2.setColor(new Color(0,0,0));//가시3
				 g2.drawLine(x+40+X1 + a, y+61+Y1, x+43+X1  + a, y+65+Y1);
				 g2.setColor(new Color(0,0,0));//가시3
				 g2.drawLine(x+43+X1 + a, y+65+Y1, x+46+X1 + a , y+61+Y1);
				 g2.setColor(new Color(0,0,0));//가시4
				 g2.drawLine(x+5+X1 + a, y+60+Y1, x+7+X1 + a , y+65+Y1);
				 g2.setColor(new Color(0,0,0));//가시4
				 g2.drawLine(x+7+X1 + a, y+65+Y1, x+10+X1 + a , y+60+Y1);
				 g2.setColor(new Color(0,0,0));//가시4-1
				 g2.drawLine(x+40+X1 + a, y+70+Y1, x+43+X1 + a , y+75+Y1);
				 g2.setColor(new Color(0,0,0));//가시4-1
				 g2.drawLine(x+43+X1 + a, y+75+Y1, x+46+X1 + a , y+70+Y1);
				 g2.setColor(new Color(0,0,0));//가시5
				 g2.drawLine(x+20+X1 + a, y+82+Y1, x+23+X1 + a , y+87+Y1);
				 g2.setColor(new Color(0,0,0));//가시5
				 g2.drawLine(x+23+X1 + a, y+87+Y1, x+26+X1  + a, y+82+Y1);
				 g2.setColor(new Color(0,0,0));//가시6
				 g2.drawLine(x+33+X1 + 10, y+87+Y1, x+36+X1  + 10, y+92+Y1);
				 g2.setColor(new Color(0,0,0));//가시6
				 g2.drawLine(x+36+X1 + 10, y+92+Y1, x+39+X1 + 10, y+87+Y1);
				 g2.setColor(new Color(0,0,0));//가시7
				 g2.drawLine(x+47+X1 + 20, y+87+Y1, x+50+X1 + 20 , y+92+Y1);
				 g2.setColor(new Color(0,0,0));//가시7
				 g2.drawLine(x+50+X1 + 20, y+92+Y1, x+53+X1 + 20 , y+87+Y1);
				 g2.setColor(new Color(0,0,0));//가시8
				 g2.drawLine(x+33+X1 + 20, y+87+Y1, x+36+X1 + 20, y+92+Y1);
				 g2.setColor(new Color(0,0,0));//가시8
				 g2.drawLine(x+36+X1 + 20, y+92+Y1, x+39+X1 + 20 , y+87+Y1);
				 g2.setColor(new Color(0,0,0));//가시9
				 g2.drawLine(x+20+X1 + 50, y+60+Y1, x+23+X1 + 50, y+65+Y1);
				 g2.setColor(new Color(0,0,0));//가시9
				 g2.drawLine(x+23+X1 + 50, y+65+Y1, x+26+X1 + 50 , y+60+Y1);
				 g2.setColor(new Color(70,70,0));//점박이 8개
				 g2.fillOval(x+20+X1, y+23+Y1, 6, 6);
				 g2.setColor(new Color(70,70,0));//점박이 8개
				 g2.fillOval(x+42+X1, y+28+Y1, 6, 6);
				 g2.setColor(new Color(70,70,0));//점박이 8개
				 g2.fillOval(x+34+X1, y+33+Y1, 6, 6);
				 g2.setColor(new Color(70,70,0));//점박이 8개
				 g2.fillOval(x+50+X1, y+23+Y1, 6, 6);
				 g2.setColor(new Color(70,70,0));//점박이 8개
				 g2.fillOval(x+83+X1, y+33+Y1, 6, 6);
				 g2.setColor(new Color(70,70,0));//점박이 8개
				 g2.fillOval(x+60+X1, y+37+Y1, 6, 6);
				 g2.setColor(new Color(70,70,0));//점박이 8개
				 g2.fillOval(x+65+X1, y+27+Y1, 6, 6);
				 g2.setColor(new Color(70,70,0));//점박이 8개
				 g2.fillOval(x+28+X1, y+24+Y1, 6, 6);

			 if(System.currentTimeMillis() - danceFrameCount < 50)
			  {
			 g2.setColor(new Color(255,255,255));//눈 흰자
			 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
			 g2.setColor(new Color(0,0,0));//눈동자
			 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
				 g2.setColor(new Color(204,204,051));//입
				 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
				 g2.setColor(new Color(0,0,0));//입 선
				 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 100)
			  {
					 g2.setColor(new Color(0,0,0));//눈감은거
					 g2.drawArc(x+20+X1+50, y+30+Y1, 10, 10, 200, 120);
					 g2.setColor(new Color(100,100,0));//지느러미
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 150)
			  {
					 g2.setColor(new Color(0,0,0));//눈감은거
					 g2.drawArc(x+20+X1+50, y+30+Y1, 10, 10, 200, 120);
					 g2.setColor(new Color(100,100,0));//지느러미
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 200)
			  {
					 g2.setColor(new Color(0,0,0));//눈감은거
					 g2.drawArc(x+20+X1+50, y+30+Y1, 10, 10, 200, 120);
					 g2.setColor(new Color(100,100,0));//지느러미2
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 95, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 250)
			  {
					 g2.setColor(new Color(0,0,0));//눈감은거
					 g2.drawArc(x+20+X1+50, y+30+Y1, 10, 10, 200, 120);
					 g2.setColor(new Color(100,100,0));//지느러미2
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 95, 40);
					 g2.setColor(new Color(204,204,051));//입위
					 g2.fillRoundRect(x+100+X1, y+43+Y1, 5, 3, 2,2);
					 g2.setColor(new Color(204,204,051));//입쪽
					 g2.fillRoundRect(x+100+X1, y+47+Y1, 5, 3, 1,1);
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 300)
			  {
					 g2.setColor(new Color(0,0,0));//눈감은거
					 g2.drawArc(x+20+X1+50, y+30+Y1, 10, 10, 200, 120);
					 g2.setColor(new Color(100,100,0));//지느러미2
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 95, 40);
					 g2.setColor(new Color(204,204,051));//입위
					 g2.fillRoundRect(x+100+X1, y+43+Y1, 5, 3, 2,2);
					 g2.setColor(new Color(204,204,051));//입쪽
					 g2.fillRoundRect(x+100+X1, y+47+Y1, 5, 3, 1,1);
			  }
			  else
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
					 g2.setColor(new Color(100,100,0));//지느러미
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			   danceFrameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 private void moveFrame(Graphics2D g2)
	 {
		 int x = (int)this.x;
		 int y = (int)this.y;
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 if(Left_Right){
			 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(120,120,0));//꼬리 연걸점
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
		  if(System.currentTimeMillis() - frameCount < 100)        //1프레임
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
		  }
		  else if(System.currentTimeMillis() - frameCount < 200)   //2프레임
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
		  }
		  else if(System.currentTimeMillis() - frameCount < 300)   //3프레임
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
		  }
		  else if(System.currentTimeMillis() - frameCount < 400)   //4프레임
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
		  }
		  else if(System.currentTimeMillis() - frameCount < 500)   //5프레임
		  {
				 g2.setColor(new Color(0,0,0));//눈감은거
				 g2.drawArc(x+20+X1, y+30+Y1, 10, 10, 200, 120);
		  }
		  else if(System.currentTimeMillis() - frameCount < 600)   //6프레임
		  {
				 g2.setColor(new Color(0,0,0));//눈감은거
				 g2.drawArc(x+20+X1, y+30+Y1, 10, 10, 200, 120);
		  }
		  else if(System.currentTimeMillis() - frameCount < 700)   //7프레임
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
		  }
		  else if(System.currentTimeMillis() - frameCount < 800)   //8프레임
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
		  }
		  else if(System.currentTimeMillis() - frameCount < 900)   //9프레임
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
		  }
		  else if(System.currentTimeMillis() - frameCount < 1000)  //10프레임
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
		  }
		  else                            //프레임초기화
		  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1, y+33+Y1, 5, 5);
				 frameCount = System.currentTimeMillis();
		  }
		 }
		 else{
			 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 240, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 240, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1-10, y+20+Y1, 110 , 60 , 0, 135);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 153, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+X1-20, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
			 g2.setColor(new Color(120,120,0));//꼬리 연걸점
			 g2.fillArc(x-25+X1, y+28+Y1, 50 , 54 , 80, 25);

			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x-20+X1, y+45+Y1, x-10+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x-20+X1, y+35+Y1, x-10+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x-20+X1, y+40+Y1, x-10+X1 , y+40+Y1);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			 int a = 40;
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1 + a, y+60+Y1, x+7+X1 + a , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1 + a, y+65+Y1, x+10+X1 + a , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1 + a, y+62+Y1, x+23+X1 + a , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1 + a, y+67+Y1, x+26+X1 + a , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1 + a, y+61+Y1, x+43+X1  + a, y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1 + a, y+65+Y1, x+46+X1 + a , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1 + a, y+60+Y1, x+7+X1 + a , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1 + a, y+65+Y1, x+10+X1 + a , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1 + a, y+70+Y1, x+43+X1 + a , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1 + a, y+75+Y1, x+46+X1 + a , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1 + a, y+82+Y1, x+23+X1 + a , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1 + a, y+87+Y1, x+26+X1  + a, y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1 + 10, y+87+Y1, x+36+X1  + 10, y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1 + 10, y+92+Y1, x+39+X1 + 10, y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1 + 20, y+87+Y1, x+50+X1 + 20 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1 + 20, y+92+Y1, x+53+X1 + 20 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1 + 20, y+87+Y1, x+36+X1 + 20, y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1 + 20, y+92+Y1, x+39+X1 + 20 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시9
			 g2.drawLine(x+20+X1 + 50, y+60+Y1, x+23+X1 + 50, y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시9
			 g2.drawLine(x+23+X1 + 50, y+65+Y1, x+26+X1 + 50 , y+60+Y1);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+20+X1, y+23+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+42+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+34+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+50+X1, y+23+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+83+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+60+X1, y+37+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+65+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+28+X1, y+24+Y1, 6, 6);
			 if(System.currentTimeMillis() - frameCount < 100)        //1프레임
			  {
				 g2.setColor(new Color(255,255,255));//눈 흰자
				 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
				 g2.setColor(new Color(0,0,0));//눈동자
				 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			  }
			  else if(System.currentTimeMillis() - frameCount < 200)   //2프레임
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			  }
			  else if(System.currentTimeMillis() - frameCount < 300)   //3프레임
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			  }
			  else if(System.currentTimeMillis() - frameCount < 400)   //4프레임
			  {
					 g2.setColor(new Color(0,0,0));//눈감은거
					 g2.drawArc(x+20+X1+50, y+30+Y1, 10, 10, 200, 120);
			  }
			  else if(System.currentTimeMillis() - frameCount < 500)   //5프레임
			  {
					 g2.setColor(new Color(0,0,0));//눈감은거
					 g2.drawArc(x+20+X1+50, y+30+Y1, 10, 10, 200, 120);
			  }
			  else if(System.currentTimeMillis() - frameCount < 600)   //6프레임
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			  }
			  else if(System.currentTimeMillis() - frameCount < 700)   //7프레임
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			  }
			  else if(System.currentTimeMillis() - frameCount < 800)   //8프레임
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			  }
			  else if(System.currentTimeMillis() - frameCount < 900)   //9프레임
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			  }
			  else if(System.currentTimeMillis() - frameCount < 1000)  //10프레임
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			  }
			  else                            //프레임초기화
			  {
					 g2.setColor(new Color(255,255,255));//눈 흰자
					 g2.fillOval(x+20+X1+50, y+30+Y1, 10, 10);
					 g2.setColor(new Color(0,0,0));//눈동자
					 g2.fillOval(x+22+X1+50, y+33+Y1, 5, 5);
			   frameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 private void stopFrame(Graphics2D g2)
	 {
		 int x = (int)this.x;
		 int y = (int)this.y;
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 if(Left_Right){
			 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 180, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 180, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1, y+20+Y1, 110 , 60 , 45, 135);
			 g2.setColor(new Color(0,0,0));//눈감은거
			 g2.drawArc(x+20+X1, y+30+Y1, 10, 10, 200, 120);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 300, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+100+X1, y+30+Y1, 20, 20, 8, 8);

			 g2.setColor(new Color(120,120,0));//꼬리 연걸점
			 g2.fillArc(x+75+X1, y+28+Y1, 50 , 54 , 80, 25);
			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x+105+X1, y+45+Y1, x+115+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x+105+X1, y+35+Y1, x+115+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x+105+X1, y+40+Y1, x+115+X1 , y+40+Y1);
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
			 if(System.currentTimeMillis() - frameCount < 100)//눈감고 파
			 {
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else if(System.currentTimeMillis() - frameCount < 200)//닥
	  {
			 g2.setColor(new Color(100,100,0));//지느러미2
			 g2.fillArc(x+6+X1, y+18+Y1+10, 60 , 30 , 25, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else if(System.currentTimeMillis() - frameCount < 300)//파
	  {
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else if(System.currentTimeMillis() - frameCount < 400)//닥
	  {
			 g2.setColor(new Color(100,100,0));//지느러미2
			 g2.fillArc(x+6+X1, y+18+Y1+10, 60 , 30 , 25, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	  }
	  else if(System.currentTimeMillis() - frameCount < 500)//뻐금
	  {
			 g2.setColor(new Color(100,100,0));//지느러미2
			 g2.fillArc(x+6+X1, y+18+Y1+10, 60 , 30 , 25, 40);
			 g2.setColor(new Color(204,204,051));//입 위
			 g2.fillRoundRect(x-5+X1, y+44+Y1+4, 5, 3, 2,2);
			 g2.setColor(new Color(204,204,051));//입 아래
			 g2.fillRoundRect(x-3+X1, y+44+Y1, 5, 3, 1,1);
	  }
	  else if(System.currentTimeMillis() - frameCount < 600)//파
	  {
			 g2.setColor(new Color(100,100,0));//지느러미2
			 g2.fillArc(x+6+X1, y+18+Y1+10, 60 , 30 , 25, 40);
			 g2.setColor(new Color(204,204,051));//입 위
			 g2.fillRoundRect(x-5+X1, y+44+Y1+4, 5, 3, 2,2);
			 g2.setColor(new Color(204,204,051));//입 아래
			 g2.fillRoundRect(x-3+X1, y+44+Y1, 5, 3, 1,1);
	  }
	  else
	  {
			 g2.setColor(new Color(100,100,0));//지느러미
			 g2.fillArc(x+6+X1, y+30+Y1, 60 , 30 , 10, 40);
			 g2.setColor(new Color(204,204,051));//입
			 g2.fillRoundRect(x-5+X1, y+44+Y1, 7, 7, 2,2);
			 g2.setColor(new Color(0,0,0));//입 선
			 g2.drawLine(x-5+X1, y+47+Y1, x+X1 , y+47+Y1);
	   frameCount = System.currentTimeMillis();
	  	}
		 }
		 else if(!Left_Right){
			 g2.setColor(new Color(255,255,255));//배
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 240, 120);
			 g2.setColor(new Color(0,0,0));//배경계선
			 g2.drawArc(x+X1, y+Y1, 99, 99, 240, 120);
			 g2.setColor(new Color(153,153,0));//배 위
			 g2.fillArc(x+X1-10, y+20+Y1, 110 , 60 , 0, 135);
			 g2.setColor(new Color(0,0,0));//눈감은거
			 g2.drawArc(x+20+X1+50, y+30+Y1, 10, 10, 200, 120);
			 g2.setColor(new Color(120,120,0));//배 뒤
			 g2.fillArc(x+X1, y+Y1, 100 , 100 , 153, 87);
			 g2.setColor(new Color(65,65,65));//꼬리
			 g2.fillRoundRect(x+X1-20, y+30+Y1, 20, 20, 8, 8);
			 g2.setColor(new Color(120,120,0));//꼬리 연걸점
			 g2.fillArc(x-25+X1, y+28+Y1, 50 , 54 , 80, 25);

			 g2.setColor(new Color(30,30,30));//꼬리 선1
			 g2.drawLine(x-20+X1, y+45+Y1, x-10+X1 , y+45+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선2
			 g2.drawLine(x-20+X1, y+35+Y1, x-10+X1 , y+35+Y1);
			 g2.setColor(new Color(30,30,30));//꼬리 선3
			 g2.drawLine(x-20+X1, y+40+Y1, x-10+X1 , y+40+Y1);
			 int a = 40;
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+5+X1 + a, y+60+Y1, x+7+X1 + a , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시1
			 g2.drawLine(x+7+X1 + a, y+65+Y1, x+10+X1 + a , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+20+X1 + a, y+62+Y1, x+23+X1 + a , y+67+Y1);
			 g2.setColor(new Color(0,0,0));//가시2
			 g2.drawLine(x+23+X1 + a, y+67+Y1, x+26+X1 + a , y+62+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+40+X1 + a, y+61+Y1, x+43+X1  + a, y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시3
			 g2.drawLine(x+43+X1 + a, y+65+Y1, x+46+X1 + a , y+61+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+5+X1 + a, y+60+Y1, x+7+X1 + a , y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시4
			 g2.drawLine(x+7+X1 + a, y+65+Y1, x+10+X1 + a , y+60+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+40+X1 + a, y+70+Y1, x+43+X1 + a , y+75+Y1);
			 g2.setColor(new Color(0,0,0));//가시4-1
			 g2.drawLine(x+43+X1 + a, y+75+Y1, x+46+X1 + a , y+70+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+20+X1 + a, y+82+Y1, x+23+X1 + a , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시5
			 g2.drawLine(x+23+X1 + a, y+87+Y1, x+26+X1  + a, y+82+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+33+X1 + 10, y+87+Y1, x+36+X1  + 10, y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시6
			 g2.drawLine(x+36+X1 + 10, y+92+Y1, x+39+X1 + 10, y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+47+X1 + 20, y+87+Y1, x+50+X1 + 20 , y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시7
			 g2.drawLine(x+50+X1 + 20, y+92+Y1, x+53+X1 + 20 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+33+X1 + 20, y+87+Y1, x+36+X1 + 20, y+92+Y1);
			 g2.setColor(new Color(0,0,0));//가시8
			 g2.drawLine(x+36+X1 + 20, y+92+Y1, x+39+X1 + 20 , y+87+Y1);
			 g2.setColor(new Color(0,0,0));//가시9
			 g2.drawLine(x+20+X1 + 50, y+60+Y1, x+23+X1 + 50, y+65+Y1);
			 g2.setColor(new Color(0,0,0));//가시9
			 g2.drawLine(x+23+X1 + 50, y+65+Y1, x+26+X1 + 50 , y+60+Y1);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+20+X1, y+23+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+42+X1, y+28+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+34+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+50+X1, y+23+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+83+X1, y+33+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+60+X1, y+37+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+65+X1, y+27+Y1, 6, 6);
			 g2.setColor(new Color(70,70,0));//점박이 8개
			 g2.fillOval(x+28+X1, y+24+Y1, 6, 6);

			 if(System.currentTimeMillis() - frameCount < 100)//눈감고
			  {
				 g2.setColor(new Color(100,100,0));//지느러미
				 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
				 g2.setColor(new Color(204,204,051));//입
				 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
				 g2.setColor(new Color(0,0,0));//입 선
				 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - frameCount < 200)//파
			  {
					 g2.setColor(new Color(100,100,0));//지느러미
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - frameCount < 300)//닥
			  {
					 g2.setColor(new Color(100,100,0));//지느러미2
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 95, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - frameCount < 400)//파
			  {
					 g2.setColor(new Color(100,100,0));//지느러미
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - frameCount < 500)//닥
			  {
					 g2.setColor(new Color(100,100,0));//지느러미2
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 95, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			  }
			  else if(System.currentTimeMillis() - frameCount < 600)//뻐끔
			  {
					 g2.setColor(new Color(100,100,0));//지느러미2
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 95, 40);
					 g2.setColor(new Color(204,204,051));//입위
					 g2.fillRoundRect(x+100+X1, y+43+Y1, 5, 3, 2,2);
					 g2.setColor(new Color(204,204,051));//입쪽
					 g2.fillRoundRect(x+100+X1, y+47+Y1, 5, 3, 1,1);
			  }
			  else
			  {
					 g2.setColor(new Color(100,100,0));//지느러미
					 g2.fillArc(x+6+X1+25, y+30+Y1, 60 , 30 , 110, 40);
					 g2.setColor(new Color(204,204,051));//입
					 g2.fillRoundRect(x+100+X1, y+44+Y1, 7, 7, 2,2);
					 g2.setColor(new Color(0,0,0));//입 선
					 g2.drawLine(x+100+X1, y+47+Y1, x+X1+105 , y+47+Y1);
			   frameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 @Override
	 public boolean touchSpace(double inputX,double inputY)
	 {
	  if(inputX >= x-50 && inputX <= x+50 && inputY >= y-30 && inputY <= y+60)
	   return true;
	  else
	   return false;
	 }
	 @Override
	public boolean targetToMouth(double targetX,double targetY)
		{
			if(Left_Right)
			{
				if(targetX > x-50 && targetX < x-40 && targetY > y-2 && targetY < y+2)
					return true;
				else
					return false;
			}
			else
			{
				if(targetX > x+40 && targetX < x+50 && targetY > y-2 && targetY < y+2)
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
					distance = Math.sqrt((targetX-(x-47))*(targetX-(x-47))+(targetY-(y))*(targetY-(y)));
				else
					distance = Math.sqrt((targetX-(x+47))*(targetX-(x+47))+(targetY-(y))*(targetY-(y)));
				if(distance<this.distance || newTarget == targetFeed)
				{
					targetFeed = newTarget;
					this.distance = distance;
					if(Left_Right)
					{
						moveDirection_X = 2*(targetX-x+47)/distance;
						moveDirection_Y = 2*(targetY-(y))/distance;
					}
					else
					{
						moveDirection_X = 2*(targetX-x-47)/distance;
						moveDirection_Y = 2*(targetY-(y))/distance;
					}
					if(Left_Right && x-49 < targetX && targetX < x-46)
					{
						moveDirection_X = -0.000001;   //방향고정용 극소값
					}
					else if(!Left_Right && x + 46 < targetX && targetX < x+49)
					{
						moveDirection_X = 0.000001;    //방향고정용 극소값
					}
					else if( x-49<targetX && !Left_Right && targetX < x+47 || Left_Right && x-47<targetX && targetX<x+49)
					{
						moveDirection_X *= -1;
					}
				}
			}
		}
}