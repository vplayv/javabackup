import java.awt.Color;
import java.awt.Graphics2D;


public class HeadFish extends Animal
{
	public HeadFish(int inputX,int inputY)
	{
		super(inputX,inputY);
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
		int x = (int)this.x;
		int y = (int)this.y;
		if(System.currentTimeMillis() - danceFrameCount < 50)        //1프레임
		{
			g2.setColor(new Color(170,170,170));
			g2.fillArc(x-15, y-45, 70, 90,-90,180);
			g2.fillArc(x+10,y-50,40,100,0,180);
			g2.setColor(new Color(130,130,130));
			g2.fillArc(x-50, y-40, 140, 80, 90, 100);
			g2.fillArc(x-50, y-40, 140, 80, 190, 80);
			g2.fillArc(x-42, y-32, 124, 64, 90, 180);
			g2.fillOval(x-10, y-40, 60, 80);
			g2.setColor(new Color(200,200,200));
			g2.drawArc(x-50, y-20,30,40,-30,60);
			g2.drawArc(x-45, y-20, 30, 40, -30, 60);
			g2.setColor(new Color(255,255,255));
			g2.fillOval(x-43, y-13, 16, 16);
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-10, 10, 10);
			g2.fillArc(x-20, y-20,40,40, 280, 60);
		}
		else if(System.currentTimeMillis() - danceFrameCount < 100)   //2프레임
		{
			y += 5;
			g2.setColor(new Color(170,170,170));
			g2.fillArc(x-15, y-45, 70, 90,-90,180);
			g2.fillArc(x+10,y-50,40,100,0,180);
			g2.setColor(new Color(130,130,130));
			g2.fillArc(x-50, y-40, 140, 80, 90, 100);
			g2.fillArc(x-50, y-40, 140, 80, 195, 75);
			g2.fillArc(x-42, y-32, 124, 64, 90, 180);
			g2.fillOval(x-10, y-40, 60, 80);
			g2.setColor(new Color(200,200,200));
			g2.drawArc(x-50, y-20,30,40,-30,60);
			g2.drawArc(x-45, y-20, 30, 40, -30, 60);
			g2.setColor(new Color(255,255,255));
			g2.fillOval(x-43, y-13, 16, 16);
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-10, 10, 10);
			g2.fillArc(x-20, y-20,40,40, 290, 60);
			y -= 5;
		}
		else if(System.currentTimeMillis() - danceFrameCount < 150)   //3프레임
		{
			y += 10;
			g2.setColor(new Color(170,170,170));
			g2.fillArc(x-15, y-45, 70, 90,-90,180);
			g2.fillArc(x+10,y-50,40,100,0,180);
			g2.setColor(new Color(130,130,130));
			g2.fillArc(x-50, y-40, 140, 80, 90, 100);
			g2.fillArc(x-50, y-40, 140, 80, 200, 70);
			g2.fillArc(x-42, y-32, 124, 64, 90, 180);
			g2.fillOval(x-10, y-40, 60, 80);
			g2.setColor(new Color(200,200,200));
			g2.drawArc(x-50, y-20,30,40,-30,60);
			g2.drawArc(x-45, y-20, 30, 40, -30, 60);
			g2.setColor(new Color(255,255,255));
			g2.fillOval(x-43, y-13, 16, 16);
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-10, 10, 10);
			g2.fillArc(x-20, y-20,40,40, 300, 60);
			y -= 10;
		}
		else if(System.currentTimeMillis() - danceFrameCount < 200)   //4프레임
		{
			y += 15;
			g2.setColor(new Color(170,170,170));
			g2.fillArc(x-15, y-45, 70, 90,-90,180);
			g2.fillArc(x+10,y-50,40,100,0,180);
			g2.setColor(new Color(130,130,130));
			g2.fillArc(x-50, y-40, 140, 80, 90, 100);
			g2.fillArc(x-50, y-40, 140, 80, 205, 65);
			g2.fillArc(x-42, y-32, 124, 64, 90, 180);
			g2.fillOval(x-10, y-40, 60, 80);
			g2.setColor(new Color(200,200,200));
			g2.drawArc(x-50, y-20,30,40,-30,60);
			g2.drawArc(x-45, y-20, 30, 40, -30, 60);
			g2.setColor(new Color(255,255,255));
			g2.fillOval(x-43, y-13, 16, 16);
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-10, 10, 10);
			g2.fillArc(x-20, y-20,40,40, 310, 60);
			y -= 15;
		}

		else if(System.currentTimeMillis() - danceFrameCount < 250)   //9프레임
		{
			y += 10;
			g2.setColor(new Color(170,170,170));
			g2.fillArc(x-15, y-45, 70, 90,-90,180);
			g2.fillArc(x+10,y-50,40,100,0,180);
			g2.setColor(new Color(130,130,130));
			g2.fillArc(x-50, y-40, 140, 80, 90, 100);
			g2.fillArc(x-50, y-40, 140, 80, 200, 70);
			g2.fillArc(x-42, y-32, 124, 64, 90, 180);
			g2.fillOval(x-10, y-40, 60, 80);
			g2.setColor(new Color(200,200,200));
			g2.drawArc(x-50, y-20,30,40,-30,60);
			g2.drawArc(x-45, y-20, 30, 40, -30, 60);
			g2.setColor(new Color(255,255,255));
			g2.fillOval(x-43, y-13, 16, 16);
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-10, 10, 10);
			g2.fillArc(x-20, y-20,40,40, 300, 60);
			y -= 10;
		}
		else if(System.currentTimeMillis() - danceFrameCount < 300)  //10프레임
		{
			y += 5;
			g2.setColor(new Color(170,170,170));
			g2.fillArc(x-15, y-45, 70, 90,-90,180);
			g2.fillArc(x+10,y-50,40,100,0,180);
			g2.setColor(new Color(130,130,130));
			g2.fillArc(x-50, y-40, 140, 80, 90, 100);
			g2.fillArc(x-50, y-40, 140, 80, 195, 75);
			g2.fillArc(x-42, y-32, 124, 64, 90, 180);
			g2.fillOval(x-10, y-40, 60, 80);
			g2.setColor(new Color(200,200,200));
			g2.drawArc(x-50, y-20,30,40,-30,60);
			g2.drawArc(x-45, y-20, 30, 40, -30, 60);
			g2.setColor(new Color(255,255,255));
			g2.fillOval(x-43, y-13, 16, 16);
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-10, 10, 10);
			g2.fillArc(x-20, y-20,40,40, 290, 60);
			y -= 5;
		}
		else               									    //프레임초기화
		{
			g2.setColor(new Color(170,170,170));
			g2.fillArc(x-15, y-45, 70, 90,-90,180);
			g2.fillArc(x+10,y-50,40,100,0,180);
			g2.setColor(new Color(130,130,130));
			g2.fillArc(x-50, y-40, 140, 80, 90, 100);
			g2.fillArc(x-50, y-40, 140, 80, 190, 80);
			g2.fillArc(x-42, y-32, 124, 64, 90, 180);
			g2.fillOval(x-10, y-40, 60, 80);
			g2.setColor(new Color(200,200,200));
			g2.drawArc(x-50, y-20,30,40,-30,60);
			g2.drawArc(x-45, y-20, 30, 40, -30, 60);
			g2.setColor(new Color(255,255,255));
			g2.fillOval(x-43, y-13, 16, 16);
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-10, 10, 10);
			g2.fillArc(x-20, y-20,40,40, 280, 60);
			danceFrameCount = System.currentTimeMillis();
		}
	}
	private void moveFrame(Graphics2D g2)
	{
		int x = (int)this.x;
		int y = (int)this.y;
		if(Left_Right)
		{
			if(System.currentTimeMillis() - frameCount < 100)        //1프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 200)   //2프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 195, 75);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 300)   //3프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 200, 70);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 400)   //4프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 205, 65);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 500)   //5프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 210, 60);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 600)   //6프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 215, 55);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 700)   //7프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 210, 60);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 800)   //8프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 205, 65);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 900)   //9프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 200, 70);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 1000)  //10프레임
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 195, 75);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else               									    //프레임초기화
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillArc(x-42, y-32, 124, 64, 90, 180);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
				frameCount = System.currentTimeMillis();
			}
		}
		else
		{
			if(System.currentTimeMillis() - frameCount < 100)        //1프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 200)   //2프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 75);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 300)   //3프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 70);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 400)   //4프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 65);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 500)   //5프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 60);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 600)   //6프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 55);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 700)   //7프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 60);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 800)   //8프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 65);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 900)   //9프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 70);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 1000)  //10프레임
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 75);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else               									    //프레임초기화
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillArc(x-82, y-32, 124, 64, -90, 180);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
				frameCount = System.currentTimeMillis();
			}
		}
	}
	private void stopFrame(Graphics2D g2)
	{
		int x = (int)this.x;
		int y = (int)this.y;
		if(Left_Right)
		{
			if(System.currentTimeMillis() - frameCount < 100)
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 200)
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 290, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 300)
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 300, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 400)
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 310, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 500)
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 300, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 600)
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 290, 60);
			}
			else
			{
				g2.setColor(new Color(170,170,170));
				g2.fillArc(x-15, y-45, 70, 90,-90,180);
				g2.fillArc(x+10,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));
				g2.fillArc(x-50, y-40, 140, 80, 90, 100);
				g2.fillArc(x-50, y-40, 140, 80, 190, 80);
				g2.fillOval(x-10, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x-50, y-20,30,40,-30,60);
				g2.drawArc(x-45, y-20, 30, 40, -30, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x-43, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x-40, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 280, 60);
				frameCount = System.currentTimeMillis();
			}
		}
		else
		{
			if(System.currentTimeMillis() - frameCount < 100)
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 200)
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 190, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 300)
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 180, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 400)
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 170, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 500)
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 180, 60);
			}
			else if(System.currentTimeMillis() - frameCount < 600)
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 190, 60);
			}
			else
			{
				g2.setColor(new Color(170,170,170)); // 뒤지느러미
				g2.fillArc(x-55, y-45, 70, 90,90,180);
				g2.fillArc(x-50,y-50,40,100,0,180);
				g2.setColor(new Color(130,130,130));  // 머리,몸통
				g2.fillArc(x-90, y-40, 140, 80, -10, 100);
				g2.fillArc(x-90, y-40, 140, 80, 270, 80);
				g2.fillOval(x-50, y-40, 60, 80);
				g2.setColor(new Color(200,200,200));
				g2.drawArc(x+20, y-20,30,40,150,60);
				g2.drawArc(x+15, y-20, 30, 40, 150, 60);
				g2.setColor(new Color(255,255,255));
				g2.fillOval(x+27, y-13, 16, 16);
				g2.setColor(new Color(0,0,0));
				g2.fillOval(x+30, y-10, 10, 10);
				g2.fillArc(x-20, y-20,40,40, 200, 60);
				frameCount = System.currentTimeMillis();
			}
		}
	}
	@Override
	public boolean targetToMouth(double targetX,double targetY)
	{
		if(Left_Right)
		{
			if(targetX > x-50 && targetX < x-40 && targetY > y+3 && targetY < y+13)
				return true;
			else
				return false;
		}
		else
		{
			if(targetX > x+40 && targetX < x+50 && targetY > y+3 && targetY < y+13)
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
				distance = Math.sqrt((targetX-(x-47))*(targetX-(x-47))+(targetY-(y+10))*(targetY-(y+10)));
			else
				distance = Math.sqrt((targetX-(x+47))*(targetX-(x+47))+(targetY-(y+10))*(targetY-(y+10)));
			if(distance<this.distance || newTarget == targetFeed)
			{
				targetFeed = newTarget;
				this.distance = distance;
				if(Left_Right)
				{
					moveDirection_X = 2*(targetX-x+47)/distance;
					moveDirection_Y = 2*(targetY-(y+10))/distance;
				}
				else
				{
					moveDirection_X = 2*(targetX-x-47)/distance;
					moveDirection_Y = 2*(targetY-(y+10))/distance;
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