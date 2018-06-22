package com.example.projectcode;

import java.util.ArrayList;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
	private boolean isL;
	private ArrayList<Bitmap> bitmapL;
	private ArrayList<Bitmap> bitmapR;
	public MyMan(float x,float y,float height,float width,float screenX, float screenY,Resources get)
	{
		this.screenX = screenX;
		this.screenY = screenY;
		this.h = height;
		this.w = width;
		this.x = x;
		this.y = y;
		isL = false;
		y = 0;
		state = 0;
		bitmapL = new ArrayList<Bitmap>();
		bitmapR = new ArrayList<Bitmap>();
		for(int i=1;i<=5;i++)
			bitmapL.add(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(get, R.drawable.snowman_left+i),(int)(w*1.32),(int)h, true));
		for(int i=1;i<=5;i++)
			bitmapR.add(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(get, R.drawable.snowman_right+i),(int)(w*1.32),(int)h, true));
	}
	public void startJump(float height)
	{
		v = -height;
	}
	public void accel()
	{
		if(v<screenY/40)
		v += screenY/130;
	}
	public void setIsL(boolean isL)
	{
		this.isL = isL;
	}
	public void resetState()
	{
		state = 0;
	}
	public void moveState()
	{
		if(state == 7)
			state = 0;
		else
			state++;
	}
	public void draw(Canvas canvas,Paint paint)
	{
		int temp = state;
		if(temp>4)
			temp = 8-temp;
		if(isL)
			canvas.drawBitmap(bitmapL.get(temp),(int)(screenX*(float)0.5-w*0.6),y-h/2, paint);
		else
			canvas.drawBitmap(bitmapR.get(temp),(int)(screenX*(float)0.5-w*0.5),y-h/2, paint);
			
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
			y = blockY + h/2 + screenY/1000;
		else
			y = blockY - h/2 - screenY/1000;
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
