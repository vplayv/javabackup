import java.awt.Color;
import java.awt.Graphics2D;


public class Tuna extends Animal{

	public Tuna(int inputX, int inputY) {
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
		 int x = (int)this.x;
		 int y = (int)this.y;
		 if(Left_Right){
		 if(System.currentTimeMillis() - danceFrameCount < 50)
	  	{

			   g2.setColor(new Color(205,102,0));
			   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
			   g2.setColor(new Color(139,69,19));
			   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
			   g2.setColor(new Color(36,36,36));
			   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
			   g2.setColor(new Color(0,0,60));
			   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
			   g2.setColor(new Color(0,0,60));
			   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
			   g2.setColor(new Color(0,0,60));
			   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
			   g2.setColor(new Color(0,34,102));
			   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
			   g2.setColor(new Color(0,34,102));
			   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
			   g2.setColor(new Color(0,34,102));
			   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
			   g2.setColor(new Color(255,255,255));
			   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
			   g2.setColor(new Color(255,255,255));
			   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
			   g2.setColor(new Color(255,255,255));
			   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
			   g2.setColor(new Color(36,36,36));
			   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
			   g2.setColor(new Color(255,255,255));
			   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
			   g2.setColor(new Color(0,0,0));
			   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
			   g2.setColor(new Color(0,0,0));
			   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
			   g2.setColor(new Color(0,0,0));
			   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
			   g2.setColor(new Color(0,0,0));
			   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
			   g2.setColor(new Color(0,0,0));
			   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
			   g2.setColor(new Color(0,0,0));
			   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
			   g2.setColor(new Color(0,0,0));
			   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
			   g2.setColor(new Color(0,0,0));
			   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 100)
	  {
		  y += 5;
		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
		   y -= 5;
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 150)
	  {
		  y += 10;
		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 340, 90);//�������� ��� ��
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
		   y -= 10;
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 200)
	  {
		  y += 15;
		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 340, 90);//�������� ��� ��
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
		   y -= 15;
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 250)
	  {
		  y += 10;
		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
		   y -= 10;
	  }
	  else if(System.currentTimeMillis() - danceFrameCount < 300)
	  {
		  y += 5;
		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
		   y -= 5;
	  }
	  else
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	   danceFrameCount = System.currentTimeMillis();
	  }
		 }
		 else{
			 if(System.currentTimeMillis() - danceFrameCount < 50)
			  {
				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 100)
			  {
				  y += 5;
				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
				   y -= 5;
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 150)
			  {
				  y += 10;
				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 200, -90);//�������� ��� ��
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
				   y -= 10;
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 200)
			  {
				  y += 15;
				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
				   y -= 15;
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 250)
			  {
				  y += 10;
				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
				   y -= 10;
			  }
			  else if(System.currentTimeMillis() - danceFrameCount < 300)
			  {
				  y += 5;
				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
				   y -= 5;
			  }
			  else
			  {
				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			   danceFrameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 private void moveFrame(Graphics2D g2)
	 {
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 int x = (int)this.x;
		 int y = (int)this.y;
		 if(Left_Right){
	  if(System.currentTimeMillis() - frameCount < 100)        //1������
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else if(System.currentTimeMillis() - frameCount < 200)   //2������
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	  }


	  else if(System.currentTimeMillis() - frameCount < 300)   //3������
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else if(System.currentTimeMillis() - frameCount < 400)   //4������
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else if(System.currentTimeMillis() - frameCount < 500)   //5������
	  {
		  g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else if(System.currentTimeMillis() - frameCount < 600)   //6������
	  {
		  g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else if(System.currentTimeMillis() - frameCount < 700)   //7������
	  {
		  g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else if(System.currentTimeMillis() - frameCount < 800)   //8������
	  {

		  g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	  }
	  else if(System.currentTimeMillis() - frameCount < 900)   //9������
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 340, 90);//�������� ��� ��
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else if(System.currentTimeMillis() - frameCount < 1000)  //10������
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 340, 90);//�������� ��� ��
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else                            //�������ʱ�ȭ
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	   frameCount = System.currentTimeMillis();
	  		}
		 }
		 else{//1111 22 33 41 1
			 if(System.currentTimeMillis() - frameCount < 100)        //1������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 200)   //2������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 300)   //3������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 400)   //4������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 500)   //5������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 600)   //6������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 700)   //7������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 200, -90);//�������� ��� ��
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 800)   //8������
			  {

			   g2.setColor(new Color(205,102,0));
			   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
			   g2.setColor(new Color(139,69,19));
			   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
			   g2.setColor(new Color(36,36,36));
			   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
			   g2.setColor(new Color(0,0,60));
			   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
			   g2.setColor(new Color(0,0,60));
			   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
			   g2.setColor(new Color(0,0,60));
			   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
			   g2.setColor(new Color(0,34,102));
			   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
			   g2.setColor(new Color(0,34,102));
			   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
			   g2.setColor(new Color(0,34,102));
			   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
			   g2.setColor(new Color(0,34,102));
			   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
			   g2.setColor(new Color(255,255,255));
			   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
			   g2.setColor(new Color(255,255,255));
			   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
			   g2.setColor(new Color(255,255,255));
			   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
			   g2.setColor(new Color(36,36,36));
			   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 200, -90);//�������� ��� ��
			   g2.setColor(new Color(0,0,0));
			   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
			   g2.setColor(new Color(0,0,0));
			   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
			   g2.setColor(new Color(0,0,0));
			   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
			   g2.setColor(new Color(0,0,0));
			   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
			   g2.setColor(new Color(0,0,0));
			   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
			   g2.setColor(new Color(0,0,0));
			   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
			   g2.setColor(new Color(0,0,0));
			   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
			   g2.setColor(new Color(0,0,0));
			   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3

			  }
			  else if(System.currentTimeMillis() - frameCount < 900)   //9������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 1000)  //10������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else                            //�������ʱ�ȭ
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			   frameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 private void stopFrame(Graphics2D g2)
	 {
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 int x = (int)this.x;
		 int y = (int)this.y;
		 if(Left_Right){
	  if(System.currentTimeMillis() - frameCount < 100)//
			 {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	  }
	  else if(System.currentTimeMillis() - frameCount < 200)//
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	  }
	  else if(System.currentTimeMillis() - frameCount < 300)//
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	  }
	  else if(System.currentTimeMillis() - frameCount < 400)//
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 340, 90);//�������� ��� ��
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	  }
	  else if(System.currentTimeMillis() - frameCount < 500)//
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 340, 90);//�������� ��� ��
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-10, y+Y1-10, 20, 20, 220, 100);//�� ������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3

	  }
	  else if(System.currentTimeMillis() - frameCount < 600)//
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-45, y+Y1-10, 63, 60, 180, -40);//�������� 1-1 (�� ����)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 340, 90);//�������� ��� ��
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	  }
	  else
	  {

		   g2.setColor(new Color(205,102,0));
		   g2.fillArc(x+X1-30, y+Y1-70, 100, 50, 250, 90);//�������� ����
		   g2.setColor(new Color(139,69,19));
		   g2.fillArc(x+X1-10, y+Y1+10, 50, 70, 270, 90);//�������� �� �Ʒ�
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1+80, y+Y1-40, 50, 50, 80, 90);//�������� �� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+80, y+Y1+15, 50, 50, 300, 90);//�������� �Ʒ� �ι�°
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, -125);//�������� ������
		   g2.setColor(new Color(0,0,60));
		   g2.fillArc(x+X1+159, y+Y1-20, 23, 80, 180, 125);//�������� �����Ʒ�
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-100, y+Y1-42, 120, 90, 320, 80);//�������� 1 (�� ��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-25, y+Y1-30, 100, 100, 60, 60);//�������� 2 (��)
		   g2.setColor(new Color(0,34,102));
		   g2.fillArc(x+X1-140, y+Y1-30, 300, 100, 0, 80);//�������� 3 (���� ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-140, y+Y1-5, 200, 50, 0, -80);//�������� 4 (�ԾƷ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-191, y+Y1-15, 350, 70, 0, -90);//�������� 5(ū�κ�)
		   g2.setColor(new Color(255,255,255));
		   g2.fillArc(x+X1-21, y+Y1+35, 13, 17, 180, 60);//�������� 6 (������)
		   g2.setColor(new Color(36,36,36));
		   g2.fillArc(x+X1, y+Y1-20, 50, 50, 300, 90);//�������� ���
		   g2.setColor(new Color(255,255,255));
		   g2.fillOval(x-5+X1, y-5+Y1, 12, 12);//������
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x-4+X1, y-3+Y1, 7, 7);//������
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+15, y+Y1-30, x+25+X1 , y+Y1-40);//�������� �� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+25, y+Y1-30, x+35+X1 , y+Y1-40);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+35, y+Y1-28, x+45+X1 , y+Y1-38);//�������� �� 3
		   g2.setColor(new Color(0,0,0));
		   g2.drawLine(x+X1+45, y+Y1-27, x+55+X1 , y+Y1-37);//�������� �� 4
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+10, y+Y1-10, 10, 50, 270, 180);//�ư��� 1
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+12, y+Y1-10, 10, 50, 270, 180);//�ư��� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+14, y+Y1-10, 10, 50, 270, 180);//�ư��� 3
	   frameCount = System.currentTimeMillis();
	  	}
		 }
		 else if(!Left_Right){//232345  1
			 if(System.currentTimeMillis() - frameCount < 100)//������
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 200)//��
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 200, -90);//�������� ��� ��
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 300)//��
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 400)//��
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 200, -90);//�������� ��� ��
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 500)//��
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+105, y+Y1-10, 20, 20, 320, -100);//�� ������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else if(System.currentTimeMillis() - frameCount < 600)//����
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-10, 63, 60, 0, 40);//�������� 1-1 (�� ����)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			  }
			  else
			  {

				   g2.setColor(new Color(205,102,0));
				   g2.fillArc(x+X1+45, y+Y1-70, 100, 50, 290, -90);//�������� ����
				   g2.setColor(new Color(139,69,19));
				   g2.fillArc(x+X1+80, y+Y1+10, 50, 70, 270, -90);//�������� �� �Ʒ�
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1-15, y+Y1-40, 50, 50, 100, -90);//�������� �� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1+0, y+Y1+15, 50, 50, 240, -90);//�������� �Ʒ� �ι�°
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, 125);//�������� ������
				   g2.setColor(new Color(0,0,60));
				   g2.fillArc(x+X1-55, y+Y1-20, 23, 80, 0, -125);//�������� �����Ʒ�
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+100, y+Y1-42, 120, 90, 220, -80);//�������� 1 (�� ��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1+42, y+Y1-30, 100, 100, 120, -60);//�������� 2 (��)
				   g2.setColor(new Color(0,34,102));
				   g2.fillArc(x+X1-33, y+Y1-30, 300, 100, 180, -80);//�������� 3 (���� ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+64, y+Y1-5, 200, 50, 180, 80);//�������� 4 (�ԾƷ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1-33, y+Y1-15, 350, 70, 180, 90);//�������� 5(ū�κ�)
				   g2.setColor(new Color(255,255,255));
				   g2.fillArc(x+X1+132, y+Y1+35, 13, 17, 0, -60);//�������� 6 (������)
				   g2.setColor(new Color(36,36,36));
				   g2.fillArc(x+X1+70, y+Y1-20, 50, 50, 240, -90);//�������� ���
				   g2.setColor(new Color(255,255,255));
				   g2.fillOval(x+X1+110, y-5+Y1, 12, 12);//������
				   g2.setColor(new Color(0,0,0));
				   g2.fillOval(x+X1+113, y-3+Y1, 7, 7);//������
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+100, y+Y1-30, x+90+X1 , y+Y1-40);//�������� �� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+90, y+Y1-30, x+80+X1 , y+Y1-40);//�������� �� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+80, y+Y1-28, x+70+X1 , y+Y1-38);//�������� �� 3
				   g2.setColor(new Color(0,0,0));
				   g2.drawLine(x+X1+70, y+Y1-27, x+60+X1 , y+Y1-37);//�������� �� 4
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+100, y+Y1-10, 10, 50, 270, -180);//�ư��� 1
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+98, y+Y1-10, 10, 50, 270, -180);//�ư��� 2
				   g2.setColor(new Color(0,0,0));
				   g2.drawArc(x+X1+96, y+Y1-10, 10, 50, 270, -180);//�ư��� 3
			   frameCount = System.currentTimeMillis();
			  }
		 }
	 }
	 @Override
	public boolean touchSpace(double inputX,double inputY)
		{
			if(inputX >= x-110 && inputX <= x+110 && inputY >= y-80 && inputY <= y+20)
				return true;
			else
				return false;
		}
	 @Override
	public boolean targetToMouth(double targetX,double targetY)
	{
		if(Left_Right)
		{
			if(targetX > x-100 && targetX < x-90 && targetY > y-30 && targetY < y-20)
				return true;
			else
				return false;
		}
		else
		{
			if(targetX > x+90 && targetX < x+100 && targetY > y-30 && targetY < y-20)
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
				distance = Math.sqrt((targetX-(x-97))*(targetX-(x-97))+(targetY-(y-25))*(targetY-(y-25)));
			else
				distance = Math.sqrt((targetX-(x+97))*(targetX-(x+97))+(targetY-(y-25))*(targetY-(y-25)));
			if(distance<this.distance || newTarget == targetFeed)
			{
				targetFeed = newTarget;
				this.distance = distance;
				if(Left_Right)
				{
					moveDirection_X = 2*(targetX-x+97)/distance;
					moveDirection_Y = 2*(targetY-(y-25))/distance;
				}
				else
				{
					moveDirection_X = 2*(targetX-x-97)/distance;
					moveDirection_Y = 2*(targetY-(y-25))/distance;
				}
				if(Left_Right && x-99 < targetX && targetX < x-96)
					moveDirection_X = -0.000001;   //��������� �ؼҰ�
				else if(!Left_Right && x + 96 < targetX && targetX < x+99)
					moveDirection_X = 0.000001;    //��������� �ؼҰ�
				else if( x-99<targetX && !Left_Right && targetX < x+96 || Left_Right && x-96<targetX && targetX<x+99)
					moveDirection_X *= -1;
			}
		}
	}
}