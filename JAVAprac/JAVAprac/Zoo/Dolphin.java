import java.awt.Color;
import java.awt.Graphics2D;


public class Dolphin extends Animal
{
	public Dolphin(int inputX, int inputY) {
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
		int x = (int)this.x;
		int y = (int)this.y;
		if(System.currentTimeMillis() - danceFrameCount < 100)
			y+=5;
		else if(System.currentTimeMillis() - danceFrameCount < 150)
			y+= 10;
		else if(System.currentTimeMillis() - danceFrameCount < 200)
			y+= 15;
		else if(System.currentTimeMillis() - danceFrameCount < 250)
			y+= 10;
		else if(System.currentTimeMillis() - danceFrameCount < 300)
			y+= 5;
		g2.setColor(Color.white);
		if(Left_Right)
		{
			if(System.currentTimeMillis() - danceFrameCount < 50)
				g2.fillArc(x-85, y-30, 170, 60,-180,360);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 100)
				g2.fillArc(x-85, y-30, 170, 60,-170,340);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 150)
				g2.fillArc(x-85, y-30, 170, 60,-160,320);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 200)
				g2.fillArc(x-85, y-30, 170, 60,-150,300);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 250)
				g2.fillArc(x-85, y-30, 170, 60,-160,320);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 300)
				g2.fillArc(x-85, y-30, 170, 60,-170,340);        //��
			else
				g2.fillArc(x-85, y-30, 170, 60,-180,360);
			g2.setColor(new Color(100,100,130));
			g2.fillRoundRect(x-90, y-30, 165 ,40, 40, 40);
			g2.fillArc(x-90, y-40, 170, 60,0,180);
			g2.fillArc(x,y-60,40,80,70,150);          //����������
			if(System.currentTimeMillis() - danceFrameCount < 50)
				g2.fillArc(x-50, y-50, 40, 80, -110, 110);
			else if(System.currentTimeMillis() - danceFrameCount < 100)
				g2.fillArc(x-49, y-50, 40, 80, -106, 106);
			else if(System.currentTimeMillis() - danceFrameCount < 150)
				g2.fillArc(x-48, y-50, 40, 80, -102, 102);
			else if(System.currentTimeMillis() - danceFrameCount < 200)
				g2.fillArc(x-47, y-50, 40, 80, -98, 98);
			else if(System.currentTimeMillis() - danceFrameCount < 250)
				g2.fillArc(x-48, y-50, 40, 80, -102, 102);
			else if(System.currentTimeMillis() - danceFrameCount < 300)
				g2.fillArc(x-49, y-50, 40, 80, -106, 106);
			else
			{
				g2.fillArc(x-50, y-50, 40, 80, -110, 110);
				danceFrameCount = System.currentTimeMillis();
			}
			g2.fillArc(x+80, y-30, 20, 60, 50, 260);         //����
			g2.fillRect(x+40, y-15, 50, 25);
			g2.setColor(Color.black);
			g2.fillOval(x-60, y-20, 15, 15);
			g2.setColor(Color.white);
			g2.fillOval(x-58, y-15, 5, 5);
		}
		else
		{
			if(System.currentTimeMillis() - danceFrameCount < 50)        //1������
				g2.fillArc(x-75, y-30, 170, 60,0,360);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 100)   //2������
				g2.fillArc(x-75, y-30, 170, 60,0,350);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 150)   //3������
				g2.fillArc(x-75, y-30, 170, 60,0,340);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 200)   //4������
				g2.fillArc(x-75, y-30, 170, 60,0,330);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 250)   //5������
				g2.fillArc(x-75, y-30, 170, 60,0,340);        //��
			else if(System.currentTimeMillis() - danceFrameCount < 300)   //6������
				g2.fillArc(x-75, y-30, 170, 60,0,350);        //��
			else{
				g2.fillArc(x-75, y-30, 170, 60,0,360);}        //��
			g2.setColor(new Color(100,100,130));
			g2.fillRoundRect(x-65, y-30, 165 ,40, 40, 40);
			g2.fillArc(x-70, y-40, 170, 60,0,180);
			g2.fillArc(x-20,y-60,40,80,0,110);          //����������
			if(System.currentTimeMillis() - danceFrameCount < 50)
				g2.fillArc(x+20, y-50, 40, 80, 180, 110);
			else if(System.currentTimeMillis() - danceFrameCount < 100)
				g2.fillArc(x+19, y-50, 40, 80, 180, 106);
			else if(System.currentTimeMillis() - danceFrameCount < 150)
				g2.fillArc(x+18, y-50, 40, 80, 180, 102);
			else if(System.currentTimeMillis() - danceFrameCount < 200)
				g2.fillArc(x+17, y-50, 40, 80, 180, 98);
			else if(System.currentTimeMillis() - danceFrameCount < 250)
				g2.fillArc(x+18, y-50, 40, 80, 180, 102);
			else if(System.currentTimeMillis() - danceFrameCount < 300)
				g2.fillArc(x+19, y-50, 40, 80, 180, 106);
			else
			{
				g2.fillArc(x+20, y-50, 40, 80, 180, 110);
				danceFrameCount = System.currentTimeMillis();
			}
			g2.fillArc(x-90, y-30, 20, 60, 230, 260);         //����
			g2.fillRect(x-80, y-15, 50, 25);
			g2.setColor(Color.black);
			g2.fillOval(x+55, y-20, 15, 15);
			g2.setColor(Color.white);
			g2.fillOval(x+63, y-15, 5, 5);
		}
	}
	private void moveFrame(Graphics2D g2)
	{
		int x = (int)this.x;
		int y = (int)this.y;
		g2.setColor(Color.white);
		if(Left_Right)
		{
			if(System.currentTimeMillis() - frameCount < 100)        //1������
				g2.fillArc(x-85, y-30, 170, 60,-180,360);        //��
			else if(System.currentTimeMillis() - frameCount < 200)   //2������
				g2.fillArc(x-85, y-30, 170, 60,-170,340);        //��
			else if(System.currentTimeMillis() - frameCount < 300)   //3������
				g2.fillArc(x-85, y-30, 170, 60,-165,330);        //��
			else if(System.currentTimeMillis() - frameCount < 400)   //4������
				g2.fillArc(x-85, y-30, 170, 60,-160,320);        //��
			else if(System.currentTimeMillis() - frameCount < 500)   //5������
				g2.fillArc(x-85, y-30, 170, 60,-155,310);        //��
			else if(System.currentTimeMillis() - frameCount < 600)   //6������
				g2.fillArc(x-85, y-30, 170, 60,-150,300);        //��
			else if(System.currentTimeMillis() - frameCount < 700)   //7������
				g2.fillArc(x-85, y-30, 170, 60,-155,310);        //��
			else if(System.currentTimeMillis() - frameCount < 800)   //8������
				g2.fillArc(x-85, y-30, 170, 60,-160,320);        //��
			else if(System.currentTimeMillis() - frameCount < 900)   //9������
				g2.fillArc(x-85, y-30, 170, 60,-165,330);        //��
			else if(System.currentTimeMillis() - frameCount < 1000)  //10������
				g2.fillArc(x-85, y-30, 170, 60,-170,340);        //��
			else               									    //�������ʱ�ȭ
			{
				g2.fillArc(x-85, y-30, 170, 60,-180,360);        //��
				frameCount = System.currentTimeMillis();
			}
			g2.setColor(new Color(100,100,130));
			g2.fillRoundRect(x-90, y-30, 165 ,40, 40, 40);
			g2.fillArc(x-90, y-40, 170, 60,0,180);
			g2.fillArc(x,y-60,40,80,70,150);          //����������
			g2.fillArc(x-50, y-50, 40, 80, -110, 110);
			g2.fillArc(x+80, y-30, 20, 60, 50, 260);         //����
			g2.fillRect(x+40, y-15, 50, 25);
			g2.setColor(Color.black);
			g2.fillOval(x-60, y-20, 15, 15);
			g2.setColor(Color.white);
			g2.fillOval(x-58, y-15, 5, 5);
		}
		else
		{
			if(System.currentTimeMillis() - frameCount < 100)        //1������
				g2.fillArc(x-75, y-30, 170, 60,0,360);        //��
			else if(System.currentTimeMillis() - frameCount < 200)   //2������
				g2.fillArc(x-75, y-30, 170, 60,0,350);        //��
			else if(System.currentTimeMillis() - frameCount < 300)   //3������
				g2.fillArc(x-75, y-30, 170, 60,0,345);        //��
			else if(System.currentTimeMillis() - frameCount < 400)   //4������
				g2.fillArc(x-75, y-30, 170, 60,0,340);        //��
			else if(System.currentTimeMillis() - frameCount < 500)   //5������
				g2.fillArc(x-75, y-30, 170, 60,0,335);        //��
			else if(System.currentTimeMillis() - frameCount < 600)   //6������
				g2.fillArc(x-75, y-30, 170, 60,0,330);        //��
			else if(System.currentTimeMillis() - frameCount < 700)   //7������
				g2.fillArc(x-75, y-30, 170, 60,0,335);        //��
			else if(System.currentTimeMillis() - frameCount < 800)   //8������
				g2.fillArc(x-75, y-30, 170, 60,0,340);        //��
			else if(System.currentTimeMillis() - frameCount < 900)   //9������
				g2.fillArc(x-75, y-30, 170, 60,0,345);        //��
			else if(System.currentTimeMillis() - frameCount < 1000)  //10������
				g2.fillArc(x-75, y-30, 170, 60,0,350);        //��
			else               									    //�������ʱ�ȭ
			{
				g2.fillArc(x-75, y-30, 170, 60,0,360);        //��
				frameCount = System.currentTimeMillis();
			}
			g2.setColor(new Color(100,100,130));
			g2.fillRoundRect(x-65, y-30, 165 ,40, 40, 40);
			g2.fillArc(x-70, y-40, 170, 60,0,180);
			g2.fillArc(x-20,y-60,40,80,0,110);          //����������
			g2.fillArc(x+20, y-50, 40, 80, 180, 110);
			g2.fillArc(x-90, y-30, 20, 60, 230, 260);         //����
			g2.fillRect(x-80, y-15, 50, 25);
			g2.setColor(Color.black);
			g2.fillOval(x+55, y-20, 15, 15);
			g2.setColor(Color.white);
			g2.fillOval(x+63, y-15, 5, 5);
		}
	}
	private void stopFrame(Graphics2D g2)
	{
		int x = (int)this.x;
		int y = (int)this.y;
		g2.setColor(Color.white);
		if(Left_Right)
		{
			g2.fillArc(x-85, y-30, 170, 60,-180,360);        //��
			g2.setColor(new Color(100,100,130));
			g2.fillRoundRect(x-90, y-30, 165 ,40, 40, 40);
			g2.fillArc(x-90, y-40, 170, 60,0,180);
			g2.fillArc(x,y-60,40,80,70,150);          //����������
			if(System.currentTimeMillis() - frameCount < 100)
				g2.fillArc(x-50, y-50, 40, 80, -110, 110);
			else if(System.currentTimeMillis() - frameCount < 200)
				g2.fillArc(x-49, y-50, 40, 80, -106, 106);
			else if(System.currentTimeMillis() - frameCount < 300)
				g2.fillArc(x-48, y-50, 40, 80, -102, 102);
			else if(System.currentTimeMillis() - frameCount < 400)
				g2.fillArc(x-47, y-50, 40, 80, -98, 98);
			else if(System.currentTimeMillis() - frameCount < 500)
				g2.fillArc(x-48, y-50, 40, 80, -102, 102);
			else if(System.currentTimeMillis() - frameCount < 600)
				g2.fillArc(x-49, y-50, 40, 80, -106, 106);
			else
			{
				g2.fillArc(x-50, y-50, 40, 80, -110, 110);
				frameCount = System.currentTimeMillis();
			}
			g2.fillArc(x+80, y-30, 20, 60, 50, 260);         //����
			g2.fillRect(x+40, y-15, 50, 25);
			g2.setColor(Color.black);
			g2.fillOval(x-60, y-20, 15, 15);
			g2.setColor(Color.white);
			g2.fillOval(x-58, y-15, 5, 5);
		}
		else
		{
			g2.fillArc(x-75, y-30, 170, 60,0,360);        //��
			g2.setColor(new Color(100,100,130));
			g2.fillRoundRect(x-65, y-30, 165 ,40, 40, 40);
			g2.fillArc(x-70, y-40, 170, 60,0,180);
			g2.fillArc(x-20,y-60,40,80,0,110);          //����������
			if(System.currentTimeMillis() - frameCount < 100)
				g2.fillArc(x+20, y-50, 40, 80, 180, 110);
			else if(System.currentTimeMillis() - frameCount < 200)
				g2.fillArc(x+19, y-50, 40, 80, 180, 106);
			else if(System.currentTimeMillis() - frameCount < 300)
				g2.fillArc(x+18, y-50, 40, 80, 180, 102);
			else if(System.currentTimeMillis() - frameCount < 400)
				g2.fillArc(x+17, y-50, 40, 80, 180, 98);
			else if(System.currentTimeMillis() - frameCount < 500)
				g2.fillArc(x+18, y-50, 40, 80, 180, 102);
			else if(System.currentTimeMillis() - frameCount < 600)
				g2.fillArc(x+19, y-50, 40, 80, 180, 106);
			else
			{
				g2.fillArc(x+20, y-50, 40, 80, 180, 110);
				frameCount = System.currentTimeMillis();
			}
			g2.fillArc(x-90, y-30, 20, 60, 230, 260);         //����
			g2.fillRect(x-80, y-15, 50, 25);
			g2.setColor(Color.black);
			g2.fillOval(x+55, y-20, 15, 15);
			g2.setColor(Color.white);
			g2.fillOval(x+63, y-15, 5, 5);
		}
	}
	@Override
	public boolean touchSpace(double inputX,double inputY)
	{
		if(inputX >= x-80 && inputX <= x+80 && inputY >= y-40 && inputY <= y+40)
			return true;
		else
			return false;
	}
 @Override
public boolean targetToMouth(double targetX,double targetY)
{
	if(Left_Right)
	{
		if(targetX > x-90 && targetX < x-80 && targetY > y && targetY < y+10)
			return true;
		else
			return false;
	}
	else
	{
		if(targetX > x+80 && targetX < x+90 && targetY > y && targetY < y+10)
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
			distance = Math.sqrt((targetX-(x-82))*(targetX-(x-82))+(targetY-(y+5))*(targetY-(y+5)));
		else
			distance = Math.sqrt((targetX-(x+82))*(targetX-(x+82))+(targetY-(y+5))*(targetY-(y+5)));
		if(distance<this.distance || newTarget == targetFeed)
		{
			targetFeed = newTarget;
			this.distance = distance;
			if(Left_Right)
			{
				moveDirection_X = 2*(targetX-x+82)/distance;
				moveDirection_Y = 2*(targetY-(y+5))/distance;
			}
			else
			{
				moveDirection_X = 2*(targetX-x-82)/distance;
				moveDirection_Y = 2*(targetY-(y+5))/distance;
			}
			if(Left_Right && x-84 < targetX && targetX < x-81)
				moveDirection_X = -0.000001;   //��������� �ؼҰ�
			else if(!Left_Right && x + 81 < targetX && targetX < x+84)
				moveDirection_X = 0.000001;    //��������� �ؼҰ�
			else if( x-84<targetX && !Left_Right && targetX < x+81 || Left_Right && x-81<targetX && targetX<x+84)
				moveDirection_X *= -1;
		}
	}
}
}
