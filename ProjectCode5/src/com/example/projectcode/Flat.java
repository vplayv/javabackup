package com.example.projectcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Flat extends MapObject
{
	private Bitmap bitmap;
	public Flat(float x1 , float x2 , float y1,float y2,float screenX,float screenY)
	{
		super(x1, x2, y1, y2,false,screenX,screenY);
	}
	public void set(Resources get)
	{
		bitmap= Bitmap.createScaledBitmap(BitmapFactory.decodeResource(get, R.drawable.wall1_l), (int)(x2-x1),(int)(y2-y1), true);
	}
	@Override
	public void draw(float mapX,float mapY,Canvas canvas,Paint paint)
	{
		if(bitmap != null)
		canvas.drawBitmap(bitmap,x1-mapX+screenX/2, y1,paint);
		//g2.drawString(str,(x1-mapX+50)*10 + 100 , 200);
	}
}