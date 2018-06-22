package com.jinglerun;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class MapObject
{
	protected boolean attackable;
	protected boolean isFlag;
	protected boolean isBomb;
	protected final float x1;
	protected final float x2;
	protected final float y1;
	protected final float y2;
	protected final float screenX;
	protected final float screenY;
	protected Bitmap bitmap;
	protected static Resources get;
	public MapObject(float x1 , float x2 , float y1,float y2,boolean attackable,float screenX,float screenY)
	{
		this.screenX = screenX;
		this.screenY = screenY;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.attackable = attackable;
		isFlag = false;
		isBomb = false;
	}
	public boolean draw(float mapX,float mapY,Canvas canvas,Paint paint)
	{
		canvas.drawCircle(x1, y1, 30, paint);
		return false;
	}
	public void set(Resources get)
	{
		bitmap= BitmapFactory.decodeResource(get, R.drawable.wall1_l);
		bitmap= Bitmap.createScaledBitmap(bitmap, (int)(x2-x1),(int)(y2-y1), true);
	}
	public void recycle()
	{
		if(bitmap != null)
		{
			bitmap.recycle();
			bitmap = null;
		}
	}
	public float getX1()
	{
		return x1;
	}
	public float getX2()
	{
		return x2;
	}
	public float getY1()
	{
		return y1;
	}
	public float getY2()
	{
		return y2;
	}
	public boolean getAttackable()
	{
		return attackable;
	}
	public boolean getIsFlag()
	{
		return isFlag;
	}
	public boolean getIsBomb()
	{
		return isBomb;
	}
}