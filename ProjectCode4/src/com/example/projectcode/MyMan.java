package com.example.projectcode;

import android.graphics.Canvas;
import android.graphics.Paint;

public class MyMan {
	private float x;
	private float y;
	private final float h;
	private final float w;
	private float v;           // 속도. 밑방향이 양수
	private char state;            //0 정지 1~5 좌이동 6~10 우이동
	private final float screenX;
	private final float screenY;
	public MyMan(float x,float y,float height,float width,float screenX, float screenY)
	{
		this.screenX = screenX;
		this.screenY = screenY;
		this.h = height;
		this.w = width;
		this.x = x;
		this.y = y;
		y = 0;
		state = 0;
	}
	public void startJump(float height)
	{
		v = -height;
	}
	public void accel()
	{
		if(v<30)
		v += screenY/70;
	}
	public void resetState()
	{
		state = 0;
	}
	public void moveState()
	{
		if(state == 7)
			state = 1;
		else
			state++;
	}
	public void draw(Canvas canvas,Paint paint)
	{
		canvas.drawText(x+" "+y, 300, 300, paint);
		switch(state)
		{
		case 0 :
			canvas.drawRect((screenX-w)/2, y-h/2, (screenX+w)/2, y+h/2, paint);
			break;
		case 1 :
			canvas.drawRect((screenX-w)/2, y-h/2, (screenX+w)/2, y+h/2, paint);
			break;
		case 2 :
			canvas.drawRect((screenX-w)/2, y-h/2, (screenX+w)/2, y+h/2, paint);
			break;
		case 3 :
			canvas.drawRect((screenX-w)/2, y-h/2, (screenX+w)/2, y+h/2, paint);
			break;
		case 4 :
			canvas.drawRect((screenX-w)/2, y-h/2, (screenX+w)/2, y+h/2, paint);
			break;
		case 5 :
			canvas.drawRect((screenX-w)/2, y-h/2, (screenX+w)/2, y+h/2, paint);
			break;
		case 6 :
			canvas.drawRect((screenX-w)/2, y-h/2, (screenX+w)/2, y+h/2, paint);
			break;
		case 7 :
			canvas.drawRect((screenX-w)/2, y-h/2, (screenX+w)/2, y+h/2, paint);
			 break;
		}
		//String str = x + "  " + y + " " + v;
		//g2.drawString(str, 300, 300);
	}
	public void falling()
	{
		y += v;
	}
	public void resetV(boolean jump)
	{
		if(jump)
			v = screenY/500;
		else
			v = 0;
	}
	public void setX(int leftright, float wallX)
	{
		if(leftright == 0)
			x = wallX + w/2 + screenX/50;
		else
			x = wallX - w/2 - screenX/50;
	}
	public void setY(int updown, float blockY)
	{
		if(updown == 0)
			y = blockY + h/2 + screenY/100;
		else
			y = blockY - h/2 - screenY/100;
	}
	public void move(float x,float y)
	{
		this.x += x;
		this.y += y;
	}
	public float getX()
	{
		return x;
	}
	public float getY()
	{
		return y;
	}
	public float getV()
	{
		return v;
	}
	public float getH()
	{
		return h;
	}
	public float getW()
	{
		return w;
	}
}
