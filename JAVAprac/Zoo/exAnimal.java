import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class exAnimal extends JPanel {
	int x;
	int y;
	exAnimal(){
		x=200;
		y=200;
		this.setBackground(new Color(255,255,230));
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		 final int BodyX1 = 80 ; //����1
		 final int BodyY1 = 30 ;  //����1
		 final int X1 = (-50) ; //X
		 final int Y1 = (-50) ; //Y
		 final int A = 50; //�ź��� ����
		 
		  this.setBackground(new Color(200,200,200));
		   g2.setColor(new Color(0,0,0));//
		//   g2.drawLine(x+X1, y+Y1, x+X1+300 , y+Y1);//���� ���콺 ������ ��
		   g2.setColor(new Color(255,0,0));//
		//   g2.drawLine(x, y, x+100 , y);//����
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
		   
		   
		 //���� ����, �������� �������� 1
		  /*
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//�������� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		 //���� ����, �������� �������� 2
			  /*
		  g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		    g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 40, 24, 180, 90);//�������� �� 1 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 40, 24, 0, 90);//�������� �� 2 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		   //���� �������� 3 + �޴ٸ� ��¦
		   /*
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-7+A, 30, 24, 180, 90);//�������� �� 1 -3
		   g2.setColor(new Color(102,51,0)); 
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 30, 24, 0, 90);//�������� �� 2 -3
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		   //�������� 4
		   /*
		    g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30+A, y+Y1-10+A, 30, 30, 180, 90);//�������� �� 1 -4
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35+A, y+Y1+5+A, 30, 30, 0, 90);//�������� �� 2 -4
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1-85 +A, y+Y1-10 +A, 5, 4);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		   //������+��������
		   /*
		    g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-60 +A, y+Y1-5 +A, 40, 15, 90, 70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-80 +A, y+Y1-8 +A, 40, 15, 0, 110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1-92 +A, y+Y1-13 +A, 40, 15, 0, 360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-5 +A, 40, 20, 180, 90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-35 +A, y+Y1+5 +A, 50, 20, 0, 90);//�������� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+45 +A, y+Y1 +A, 30, 10, 180, 90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+40 +A, y+Y1+5 +A, 40, 10, 0, 90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1-85+A, y+Y1-10+A, 5, 5, 180, 180);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		   
		   //============================================================================================================================
		   //������ �������� 1
		   /*
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//�������� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		   //�������� 2
		   /*
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15+A, y+Y1-7+A, 40, 24, 0, -90);//�������� �� 1 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15+A, y+Y1+5+A, 40, 24, 180, -90);//�������� �� 2 -2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		   //�������� 3
		   /*
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   
		   //
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15+A, y+Y1-7+A, 30, 24, 0, -90);//�������� �� 1 -3
		   g2.setColor(new Color(102,51,0)); 
		   g2.fillArc(x+X1+15+A, y+Y1+5+A, 30, 24, 180, -90);//�������� �� 2 -3
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//�������� �� 2
		   //
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		   //�������� 4
		   /*
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15+A, y+Y1-10+A, 30, 30, 0, -90);//�������� �� 1 -4
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15+A, y+Y1+5+A, 30, 30, 180, -90);//�������� �� 2 -4
		   
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.fillOval(x+X1+110 +A, y+Y1-10 +A, 5, 4);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   
		   //������
		   /*
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+50 +A, y+Y1-5 +A, 40, 15, 90, -70);//�밡�� 1
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+60+A, y+Y1-8 +A, 40, 15, 180, -110);//�밡�� 2
		   g2.setColor(new Color(255,205,51));
		   g2.fillArc(x+X1+80 +A, y+Y1-13 +A, 40, 15, 180, -360);//�밡�� 3
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-30 +A, 120, 60, 0, 180);//��� ��
		   g2.setColor(new Color(255,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-10 +A, 120, 20, 180, 180);//��� �Ʒ�
		   g2.setColor(new Color(0,204,0));
		   g2.fillArc(x+X1-50 +A, y+Y1-3 +A, 120, 5, 180, 180);//��� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15 +A, y+Y1-5 +A, 40, 20, 0 , -90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1+15 +A, y+Y1+5 +A, 50, 20, 180, -90);//�������� �� 2
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-60 +A, y+Y1 +A, 30, 10, 0, -90);//�������� �� 1
		   g2.setColor(new Color(102,51,0));
		   g2.fillArc(x+X1-65 +A, y+Y1+5 +A, 40, 10, 180, -90);//�������� �� 2
		   g2.setColor(new Color(0,0,0));
		   g2.drawArc(x+X1+110 +A, y+Y1-10 +A, 5, 5, 180, 180);//������
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 1
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 2
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-25 +A, 20, 10, 0, 360);//��� �� ������ 3
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1 +A, y+Y1-15 +A, 20, 10, 0, 360);//��� �� ������ 4
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 5
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+30 +A, y+Y1-10 +A, 20, 10, 0, 360);//��� �� ������ 6
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+40 +A, y+Y1-20 +A, 20, 10, 0, 360);//��� �� ������ 7
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 8
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-10 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 9
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1-20 +A, y+Y1-15 +A, 10, 5, 0, 360);//��� �� ������ 10
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+10 +A, y+Y1-20 +A, 10, 5, 0, 360);//��� �� ������ 11
		   g2.setColor(new Color(0,120,0));
		   g2.fillArc(x+X1+20 +A, y+Y1-10 +A, 10, 5, 0, 360);//��� �� ������ 12
		   */
		   //�����ڽ�
		   /*
		    g2.setColor(new Color(200,200,200));
			g2.fillArc(x-85, y-30, 170, 60,-180,360);        //��
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
			*/
		   
	}
}