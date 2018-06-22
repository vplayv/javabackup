package com.example.projectcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Spike extends MapObject
{
	private final int direction; // 1 ╩С 2 го 3 аб 4 ©Л
	public Spike(float x1,float x2,float y1, float y2,int direction,float screenX,float screenY)
	{
		super(x1,x2,y1,y2,true,screenX,screenY);
		this.direction = direction;
	}
	public void set(Resources get)
	{
		bitmap= BitmapFactory.decodeResource(get, R.drawable.spike);
		bitmap= Bitmap.createScaledBitmap(bitmap, (int)(x2-x1),(int)(y2-y1), true);
	}
	@Override
	public void draw(float mapX,float mapY,Canvas canvas,Paint paint)
	{
		if(bitmap != null)
		switch(direction)
		{
		case 1 :
			canvas.drawBitmap(bitmap,x1-mapX+screenX/2-screenX/200, y1,paint);
			break;
		case 2 :
			break;
		case 3 :
			break;
		case 4 :
			break;
		}
		//String str = x1 + " " + x2 + " " + y;
		//g2.drawString(str,(x1-mapX+50)*10 + 100 , 200);
	}
}
