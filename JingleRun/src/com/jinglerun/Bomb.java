package com.jinglerun;

import java.util.ArrayList;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Bomb extends MapObject{
	private long startTime;
	private long coolTime;
	private static ArrayList<Bitmap> bitmap2;
	private static final int num_frame = 7;
	public Bomb(float x1, float x2, float y1, float y2,
			float screenX, float screenY,long coolTime,long startTime) {
		super(x1, x2, y1, y2, false, screenX, screenY);
		this.coolTime = coolTime;
		this.startTime = startTime;
		isBomb = true;
		// TODO Auto-generated constructor stub
	}
	public static void setting(Resources get,float screenX,float screenY)
	{
		MapObject.get = get;
		bitmap2 = new ArrayList<Bitmap>();
		for(int i=1;i<=num_frame;i++)
		{
			bitmap2.add(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(get, R.drawable.bomb1+i),(int)(screenX*(float)0.1),(int)(screenY*(float)0.15), true));
		}
	}
	public void set(Resources get)
	{
		;
	}
	public boolean draw(float mapX,float mapY,Canvas canvas,Paint paint)
	{
		if(bitmap2 != null)
		{
			for(int i=1;i<=num_frame;i++)
			{
				if((System.currentTimeMillis()-startTime) % coolTime < 50*i)
				{
					canvas.drawBitmap(bitmap2.get(i-1),x1-mapX+screenX*(float)0.5, y1,paint);
					if(i == 2)
					{
						attackable = true;
						return true;
					}
					else if(i == 4)
						attackable = false;
					break;
				}
			}
		}
		return false;
	}
	public static void recycle2()
	{
		if(bitmap2 != null)
		{
			for(int i=0;i<num_frame;i++)
			{
				bitmap2.get(0).recycle();
				bitmap2.remove(0);
			}
			bitmap2 = null;
		}
	}
	public void recycle()
	{
		;
	}
}
