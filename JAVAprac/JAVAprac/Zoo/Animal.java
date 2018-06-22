import java.awt.*;


public class Animal
{
	protected double x;
	protected double y;
	protected double distance;
	protected long frameCount;
	protected long frameSaver;
	protected long danceFrameCount;
	protected long moveTime;                              //이동시간
	protected long stopTime;								//정지시간
	protected double moveDirection_X;                       //1프레임당 이동하는  x축이동량
	protected double moveDirection_Y;						//1프레임당 이동하는  y축이동량
	protected long moveCount;
	protected boolean Left_Right;                                //동물이 false일때 왼쪽을, false일때 오른쪽을 봄
	protected boolean danceFlag;
	protected int targetFeed;
	public Animal(int inputX,int inputY)
	{
		targetFeed = -1;
		distance = 1000;
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
		frameCount = System.currentTimeMillis();
		danceFrameCount = 2000;
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
		int x = (int)this.x;
		int y = (int)this.y;
		if(System.currentTimeMillis() - danceFrameCount < 50)
		{
			g2.setColor(new Color(0,0,255));
			g2.fillOval(x-10, y-10, 20, 20);
		}
		else if(System.currentTimeMillis() - danceFrameCount < 100)
		{
			g2.setColor(new Color(0,0,255));
			g2.fillOval(x-15, y-15, 30, 30);
		}
		else if(System.currentTimeMillis() - danceFrameCount < 150)
		{
			g2.setColor(new Color(0,0,255));
			g2.fillOval(x-20, y-20, 40, 40);
		}
		else if(System.currentTimeMillis() - danceFrameCount < 200)
		{
			g2.setColor(new Color(0,0,255));
			g2.fillOval(x-25, y-25, 50, 50);
		}
		else if(System.currentTimeMillis() - danceFrameCount < 250)
		{
			g2.setColor(new Color(0,0,255));
			g2.fillOval(x-20, y-20, 40, 40);
		}
		else if(System.currentTimeMillis() - danceFrameCount < 300)
		{
			g2.setColor(new Color(0,0,255));
			g2.fillOval(x-15, y-15, 30, 30);
		}
		else
		{
			g2.setColor(new Color(0,0,255));
			g2.fillOval(x-10, y-10, 20, 20);
			danceFrameCount = System.currentTimeMillis();
		}
	}
	private void moveFrame(Graphics2D g2)
	{
		int x = (int)this.x;
		int y = (int)this.y;
		if(System.currentTimeMillis() - frameCount < 100)        //1프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-25, y-50, 50, 100);
		}
		else if(System.currentTimeMillis() - frameCount < 200)   //2프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-30, y-45, 60, 90);
		}
		else if(System.currentTimeMillis() - frameCount < 300)   //3프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-35, y-40, 70, 80);
		}
		else if(System.currentTimeMillis() - frameCount < 400)   //4프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-35, 80, 70);
		}
		else if(System.currentTimeMillis() - frameCount < 500)   //5프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-45, y-30, 90, 60);
		}
		else if(System.currentTimeMillis() - frameCount < 600)   //6프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-50, y-25, 100, 50);
		}
		else if(System.currentTimeMillis() - frameCount < 700)   //7프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-45, y-30, 90, 60);
		}
		else if(System.currentTimeMillis() - frameCount < 800)   //8프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-40, y-35, 80, 70);
		}
		else if(System.currentTimeMillis() - frameCount < 900)   //9프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-35, y-40, 70, 80);
		}
		else if(System.currentTimeMillis() - frameCount < 1000)  //10프레임
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-30, y-45, 60, 90);
		}
		else               									    //프레임초기화
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-25, y-50, 50, 100);
			frameCount = System.currentTimeMillis();
		}
	}
	private void stopFrame(Graphics2D g2)
	{
		int x = (int)this.x;
		int y = (int)this.y;
		if(System.currentTimeMillis() - frameCount < 100)
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-50, y-50, 100, 100);
			g2.setColor(new Color(0,255,0));
			g2.fillOval(x-10, y-10, 20, 20);
		}
		else if(System.currentTimeMillis() - frameCount < 200)
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-50, y-50, 100, 100);
			g2.setColor(new Color(0,255,0));
			g2.fillOval(x-15, y-15, 30, 30);
		}
		else if(System.currentTimeMillis() - frameCount < 300)
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-50, y-50, 100, 100);
			g2.setColor(new Color(0,255,0));
			g2.fillOval(x-20, y-20, 40, 40);
		}
		else if(System.currentTimeMillis() - frameCount < 400)
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-50, y-50, 100, 100);
			g2.setColor(new Color(0,255,0));
			g2.fillOval(x-25, y-25, 50, 50);
		}
		else if(System.currentTimeMillis() - frameCount < 500)
		{
			g2.setColor(new Color(0,0,0));
			g2.fillOval(x-50, y-50, 100, 100);
			g2.setColor(new Color(0,255,0));
			g2.fillOval(x-20, y-20, 40, 40);
		}
		else if(System.currentTimeMillis() - frameCount < 600)
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
			frameCount = System.currentTimeMillis();
		}
	}
	public void moveAround()
	{
		if(targetFeed < 0)
		{
			if(System.currentTimeMillis()-moveCount < moveTime)
			{
				if(moveDirection_X > 0)
					Left_Right = false;
				else if(moveDirection_X <0)
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
		else
		{
			if(moveDirection_X >= 0)
				Left_Right = false;
			else
				Left_Right = true;
			x += moveDirection_X;
			y += moveDirection_Y;
		}	
	}
	public boolean touchSpace(double inputX,double inputY)
	{
		if(inputX >= x-50 && inputX <= x+50 && inputY >= y-50 && inputY <= y+50)
			return true;
		else
			return false;
	}
	public void setXY(double inputX, double inputY)
	{
			x = inputX;
			y = inputY;
	}
	public void setDance()
	{
		if(!danceFlag)
		{
			danceFlag = true;
			frameSaver = System.currentTimeMillis() - frameCount;
		}
		else
		{
			frameCount = System.currentTimeMillis()-frameSaver;
			danceFlag = false;
		}
	}
	public void targetFeed(int newTarget,double targetX,double targetY)
	{
		if(newTarget == -1)
		{
			targetFeed = -1;
			this.distance = 1000;
		}
		else
		{
			double distance = Math.sqrt((targetX-x)*(targetX-x)+(targetY-y)*(targetY-y));
			if(distance<this.distance || targetFeed == newTarget)
			{
				targetFeed = newTarget;
				this.distance = distance;
				moveDirection_X = 2*(targetX-x)/distance;
				moveDirection_Y = 2*(targetY-y)/distance;
			}
		}
	}
	public int getTarget()
	{
		return targetFeed;
	}
	public boolean targetToMouth(double targetX,double targetY)
	{
		if(targetX >= x-10 && targetX <= x+10 && targetY >= y-10 && targetY <= y+10)
			return true;
		else
			return false;
	}
}
