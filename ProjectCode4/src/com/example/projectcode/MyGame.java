package com.example.projectcode;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.example.projectcode.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MyGame extends View {
	public MyGame(Context context,int stage) {
		super(context);
		this.stage = stage;
		// TODO Auto-generated constructor stub
	}
	private Paint paint;
	private Bitmap bitmap_Map;
	public boolean leftMoveFlag;
	public boolean rightMoveFlag;
	private boolean upMoveFlag;
	private boolean downMoveFlag;
	private boolean attackFlag;
	public boolean deadFlag;
	public boolean clearFlag;
	public MyMan myman;
	private MainActivity parents;
	public float x;
	public float y;
	public float screenX;
	public float screenY;
	private int nowObjectR;
	private int nowObjectL;
	private int blockU;
	private int blockD;
	private int colObjectL = -1;
	private int colObjectR = -1;
	private final int stage;
	MyUpdater updater;
	private ArrayList<MapObject> object_Right_Sorted; // 오브젝트의 우측 끝좌표 순으로 정렬
	private ArrayList<MapObject> object_Left_Sorted;  // 오브젝트의 좌측 끝좌표 순으로 정렬
	private ArrayList<MapObject> object_Now;
	public class MyUpdater implements Runnable
	{
		Timer timer;
		MyTimerTask task;
		public void set(MyGame game)
		{
			timer = new Timer();
			task = new MyTimerTask();
			task.set(game);
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			timer.scheduleAtFixedRate(task, 0, 25);
		}
	}
	public class MyTimerTask extends TimerTask
	{
		MyGame game;
		public void set(MyGame game)
		{
			this.game = game;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			game.run();
		}
		
	}
	public void start(Context context,final float screenX,final float screenY) {
		parents = (MainActivity) context;
		clearFlag = false;
		this.screenX = screenX;
		this.screenY = screenY;
		bitmap_Map = BitmapFactory.decodeResource(getResources(), R.drawable.sky);
		bitmap_Map = Bitmap.createScaledBitmap(bitmap_Map, (int)screenX,(int)screenY, true);
		paint = new Paint();
		Bomb.setting(getResources(),screenX,screenY);
		paint.setColor(Color.MAGENTA);
		paint.setStrokeWidth(2);
		object_Right_Sorted = new ArrayList<MapObject>();
		object_Left_Sorted = new ArrayList<MapObject>();
		object_Now = new ArrayList<MapObject>();
		/*setOnTouchListener(new OnTouchListener() 
		{
			@Override
			public boolean onTouch(View v, MotionEvent event) 
			{
				if(event.getX()<screenX*(float)0.2)  // 왼쪽이동
				{
					leftMoveFlag = true;
				}
				else if(event.getX()>screenX*(float)0.8) // 오른쪽이동
				{
					rightMoveFlag = true;
				}
				else
				{
					if(myman.getV() == 0)
					{
						myman.startJump(screenY*(float)0.087);
					}
				}
				return false;
			}
		});*/
		leftMoveFlag = false;
		rightMoveFlag = false;
		downMoveFlag = false;
		upMoveFlag = false;
		attackFlag = false;
		deadFlag = false;
		makeMap();
		myman = new MyMan(screenX/20,screenY*(float)0.70,screenY*(float)0.15,screenX/20,screenX,screenY);
		x = myman.getW();
		y = myman.getH();
		nowObjectR = 0;
		nowObjectL = 1;
		while(object_Right_Sorted.get(nowObjectR+1).getX1() <= x+screenX/2)
		{
			object_Now.add(object_Right_Sorted.get(nowObjectR+1));
			object_Now.get(object_Now.size()-1).set(getResources());
			nowObjectR++;
		}
		updater = new MyUpdater();
		updater.set(this);
		updater.run();
	}
	private boolean colObject(float addX, float addY)  // false일경우 이동불가
	{
		boolean flag = true;
		for(int i=0;i<object_Now.size();i++)
		{
			if(object_Now.get(i).getIsBomb())
			{
				if(object_Now.get(i).getAttackable())
				{
					if((myman.getY()-myman.getH()/2 < object_Now.get(i).getY1() && object_Now.get(i).getY1() < myman.getY()+myman.getH()/2)
							||(myman.getY()-myman.getH()/2 < object_Now.get(i).getY2() && object_Now.get(i).getY2() < myman.getY()+myman.getH()/2))
						if((myman.getX()-myman.getW()/2 < object_Now.get(i).getX1() && object_Now.get(i).getX1() < myman.getX()+myman.getW()/2)
								||(myman.getX()-myman.getW()/2 < object_Now.get(i).getX2() && object_Now.get(i).getX2() < myman.getX()+myman.getW()/2))
							deadFlag = true;
					if((myman.getY()-myman.getH()/2 > object_Now.get(i).getY1() && object_Now.get(i).getY1() > myman.getY()+myman.getH()/2)
							||(myman.getY()-myman.getH()/2 > object_Now.get(i).getY2() && object_Now.get(i).getY2() > myman.getY()+myman.getH()/2))
						if((myman.getX()-myman.getW()/2 > object_Now.get(i).getX1() && object_Now.get(i).getX1() > myman.getX()+myman.getW()/2)
								||(myman.getX()-myman.getW()/2 > object_Now.get(i).getX2() && object_Now.get(i).getX2() > myman.getX()+myman.getW()/2))
							deadFlag = true;
				}
			}
		}
		if(addX < 0.001 && addX > -0.001)
		{
			for(int i=0;i<object_Now.size();i++)
			{
				if(object_Now.get(i).getIsBomb())
					continue;
				if(object_Now.get(i).getX1()<myman.getX()+myman.getW()/2 && myman.getX()-myman.getW()/2 < object_Now.get(i).getX2())
				{
					if(myman.getY()+myman.getH()/2 < object_Now.get(i).getY1())
					{
						if(myman.getY()+myman.getH()/2 + addY > object_Now.get(i).getY1())
						{
							if(blockD == -1 || object_Now.get(i).getY1() < object_Now.get(blockD).getY1())
								blockD = i;
							flag = false;
							if(object_Now.get(i).getAttackable())
								deadFlag = true;
						}
					}
					if(myman.getY()-myman.getH()/2 > object_Now.get(i).getY2())
					{
						if(myman.getY()-myman.getH()/2 + addY < object_Now.get(i).getY2())
						{
							if(blockU == -1 || object_Now.get(i).getY2() > object_Now.get(blockU).getY2())
								blockU = i;
							flag = false;
							if(object_Now.get(i).getAttackable())
								deadFlag = true;
						}
					}
				}
			}
		}
		if(addY < 0.001 && addY > -0.001)
		{
			for(int i=0;i<object_Now.size();i++)
			{
				if(object_Now.get(i).getIsBomb())
					continue;
				if(object_Now.get(i).getY1() < myman.getY()+myman.getH()/2 && myman.getY()-myman.getH() / 2 < object_Now.get(i).getY2())
				{
					if(myman.getX()+myman.getW()/2 < object_Now.get(i).getX1())
					{
						if(myman.getX()+myman.getW()/2 + addX > object_Now.get(i).getX1())
						{
							if(colObjectR == -1 || object_Now.get(i).getX1() < object_Now.get(colObjectR).getX1())
							{
								colObjectR = i;
							}
							flag = false;
							if(object_Now.get(i).getAttackable())
							{
								deadFlag = true;
							}
						}
					}
					if(myman.getX()-myman.getW()/2 > object_Now.get(i).getX2())
						if(myman.getX()-myman.getW()/2 + addX < object_Now.get(i).getX2())
						{
							if(colObjectL == -1 || object_Now.get(i).getX2() > object_Now.get(colObjectL).getX2())
							{
								colObjectL = i;
							}
							flag = false;
							if(object_Now.get(i).getAttackable())
							{
								deadFlag = true;
							}
						}
				}
			}
		}
		if((colObjectL > -1 && object_Now.get(colObjectL).getIsFlag()) ||(colObjectR > -1 && object_Now.get(colObjectR).getIsFlag()) || 
				(blockU > -1 && object_Now.get(blockU).getIsFlag()) || (blockD > -1 && object_Now.get(blockD).getIsFlag()))
			clearFlag = true;
		if(flag)
			return true;
		return false;
	}
	
	public void run()
	{
		update();
		postInvalidate();
	}
	public void update()
	{
		colObjectL = -1;
		colObjectR = -1;
		if(myman.getY()>screenY*1.2)      // 화면밑으로 떨어지면 사망
			deadFlag = true;
		if(deadFlag)
		{
			updater.timer.cancel();
		}
		if(leftMoveFlag)  // 왼쪽이동
		{
			myman.moveState();
			if(colObject(-screenX/100,0))
			{
				myman.move(-screenX/100, 0);
				x -= screenX/100;
				int i=0;
				while(i<object_Now.size())
				{
					if(object_Now.get(i).x1 >= x+screenX/2 )
					{
						object_Now.get(i).recycle();
						object_Now.remove(i);
						nowObjectR--;
					}
					else
						i++;
				}
				while(object_Left_Sorted.get(nowObjectL-1).x2 >= x-screenX/2 )
				{
					object_Now.add(object_Left_Sorted.get(nowObjectL-1));
					object_Now.get(object_Now.size()-1).set(getResources());
					nowObjectL--;
				}
			}
			else if(colObjectL > -1)
			{
		//		myman.setX(0, object_Now.get(colObjectL).getX1());
			}
		}
		else if(rightMoveFlag) // 오른쪽이동
		{
			myman.moveState();
			if(colObject(screenX/100,0))
			{
				myman.move(screenX/100, 0);
				x += screenX/100;
				int i=0;
				while(i<object_Now.size())
				{
					if(object_Now.get(i).x2 <= x-screenX/2 )
					{
						object_Now.get(i).recycle();
						object_Now.remove(i);
						nowObjectL++;
					}
					else
						i++;
				}
				while(object_Right_Sorted.get(nowObjectR+1).x1 <= x+screenX/2 )
				{
					object_Now.add(object_Right_Sorted.get(nowObjectR+1));
					object_Now.get(object_Now.size()-1).set(getResources());
					nowObjectR++;
				}
			}
			else if(colObjectR > -1);
		//		myman.setX(1, object_Now.get(colObjectR).getX1());
		}

		blockU = -1;
		blockD = -1;
		myman.accel();
		if(colObject(0,myman.getV()))
			myman.falling();
		else
		{
				if(blockU > -1)
				{
					myman.setY(0, object_Now.get(blockU).getY1());
					myman.resetV(true);
				}
				if(blockD > -1)
				{
					myman.setY(1, object_Now.get(blockD).getY1());
					myman.resetV(false);
				}
		}
		//leftMoveFlag = false;
	//	rightMoveFlag = false;
	}
	private void makeMap()
	{
		ArrayList<MapObject> tempList = new ArrayList<MapObject>();
		switch(stage)
		{
		case 1 :
		tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // 절대 빠지면 안되는 더미
		tempList.add(new Wall(-screenX*(float)0.05,-screenX*(float)0.06,0,screenY*(float)0.84,screenX,screenY));
		tempList.add(new Wall(screenX*(float)0.59,screenX*(float)0.6,screenY*(float)0.84,screenY*(float)1.16,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.09,screenX*(float)1.1,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.39,screenX*(float)1.4,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.49,screenX*(float)1.5,screenY*(float)0.57,screenY*(float)1.16,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.69,screenX*(float)1.7,screenY*(float)0.57,screenY*(float)0.84,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.79,screenX*(float)1.8,screenY*(float)0.77,screenY*(float)0.84,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.84,screenX*(float)1.85,screenY*(float)0.72,screenY*(float)0.77,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.89,screenX*(float)1.9,screenY*(float)0.64,screenY*(float)0.72,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.94,screenX*(float)1.95,screenY*(float)0.57,screenY*(float)0.64,screenX,screenY));
		tempList.add(new Wall(screenX*(float)1.99,screenX*(float)2,screenY*(float)0.5,screenY*(float)0.57,screenX,screenY));
		tempList.add(new Wall(screenX*(float)2.49,screenX*(float)2.5,screenY*-(float)0.28,screenY*(float)0.5,screenX,screenY));
		tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //절대 빠지면 안되는 더미
		tempList.add(new Flat(-screenX*(float)0.06,screenX*(float)0.6,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));
		tempList.add(new Spike(screenX*(float)0.32,screenX*(float)0.35,screenY*(float)0.81,screenY*(float)0.84,1,screenX,screenY));
		for(int i=0;i<50;i++)
		tempList.add(new Bomb(screenX*(float)0.4,screenX*(float)0.5,screenY*(float)0.74,screenY*(float)0.84,screenX,screenY,2000,System.currentTimeMillis()));
		tempList.add(new Bomb(screenX*(float)0.5,screenX*(float)0.6,screenY*(float)0.74,screenY*(float)0.84,screenX,screenY,2000,System.currentTimeMillis()-500));
		tempList.add(new Flat(screenX*(float)0.7,screenX,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
		tempList.add(new Flat(screenX*(float)0.7,screenX*(float)0.97,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
		tempList.add(new Flat(screenX*(float)1.1,screenX*(float)1.4,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
		tempList.add(new Flat(screenX*(float)1.5,screenX*(float)1.7,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
		tempList.add(new Flat(screenX*(float)1.7,screenX*(float)1.8,screenY*(float)0.85,screenY*(float)0.86,screenX,screenY));
		tempList.add(new Flat(screenX*(float)1.8,screenX*(float)1.85,screenY*(float)0.77,screenY*(float)0.78,screenX,screenY));
		tempList.add(new Flat(screenX*(float)1.85,screenX*(float)1.9,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
		tempList.add(new Flat(screenX*(float)1.9,screenX*(float)1.95,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
		tempList.add(new Flat(screenX*(float)1.95,screenX*(float)2,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
		tempList.add(new Flat(screenX*(float)2,screenX*(float)2.5,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
		tempList.add(new Flag(screenX*(float)2.35,screenX*(float)2.40,screenY*(float)0.45,screenY*(float)0.49,screenX,screenY));
		break;
		case 2 :
			tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // 절대 빠지면 안되는 더미
			tempList.add(new Wall(-screenX*(float)0.05,-screenX*(float)0.06,0,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)0.59,screenX*(float)0.6,screenY*(float)0.84,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.09,screenX*(float)1.1,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.39,screenX*(float)1.4,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.49,screenX*(float)1.5,screenY*(float)0.57,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.69,screenX*(float)1.7,screenY*(float)0.57,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.79,screenX*(float)1.8,screenY*(float)0.77,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.84,screenX*(float)1.85,screenY*(float)0.72,screenY*(float)0.77,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.89,screenX*(float)1.9,screenY*(float)0.64,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.94,screenX*(float)1.95,screenY*(float)0.57,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.99,screenX*(float)2,screenY*(float)0.5,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Wall(screenX*(float)2.49,screenX*(float)2.5,screenY*-(float)0.28,screenY*(float)0.5,screenX,screenY));
			tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //절대 빠지면 안되는 더미
			tempList.add(new Flat(-screenX*(float)0.06,screenX*(float)0.6,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Spike(screenX*(float)0.32,screenX*(float)0.35,screenY*(float)0.81,screenY*(float)0.84,1,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.7,screenX,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.7,screenX*(float)0.97,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.1,screenX*(float)1.4,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.5,screenX*(float)1.7,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.7,screenX*(float)1.8,screenY*(float)0.85,screenY*(float)0.86,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.8,screenX*(float)1.85,screenY*(float)0.77,screenY*(float)0.78,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.85,screenX*(float)1.9,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.9,screenX*(float)1.95,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.95,screenX*(float)2,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Flat(screenX*(float)2,screenX*(float)2.5,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
			break;
		case 3 :
			tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // 절대 빠지면 안되는 더미
			tempList.add(new Wall(-screenX*(float)0.05,-screenX*(float)0.06,0,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)0.59,screenX*(float)0.6,screenY*(float)0.84,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.09,screenX*(float)1.1,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.39,screenX*(float)1.4,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.49,screenX*(float)1.5,screenY*(float)0.57,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.69,screenX*(float)1.7,screenY*(float)0.57,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.79,screenX*(float)1.8,screenY*(float)0.77,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.84,screenX*(float)1.85,screenY*(float)0.72,screenY*(float)0.77,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.89,screenX*(float)1.9,screenY*(float)0.64,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.94,screenX*(float)1.95,screenY*(float)0.57,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.99,screenX*(float)2,screenY*(float)0.5,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Wall(screenX*(float)2.49,screenX*(float)2.5,screenY*-(float)0.28,screenY*(float)0.5,screenX,screenY));
			tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //절대 빠지면 안되는 더미
			tempList.add(new Flat(-screenX*(float)0.06,screenX*(float)0.6,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Spike(screenX*(float)0.32,screenX*(float)0.35,screenY*(float)0.81,screenY*(float)0.84,1,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.7,screenX,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.7,screenX*(float)0.97,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.1,screenX*(float)1.4,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.5,screenX*(float)1.7,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.7,screenX*(float)1.8,screenY*(float)0.85,screenY*(float)0.86,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.8,screenX*(float)1.85,screenY*(float)0.77,screenY*(float)0.78,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.85,screenX*(float)1.9,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.9,screenX*(float)1.95,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.95,screenX*(float)2,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Flat(screenX*(float)2,screenX*(float)2.5,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
			break;
		case 4 :
			tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // 절대 빠지면 안되는 더미
			tempList.add(new Wall(-screenX*(float)0.05,-screenX*(float)0.06,0,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)0.59,screenX*(float)0.6,screenY*(float)0.84,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.09,screenX*(float)1.1,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.39,screenX*(float)1.4,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.49,screenX*(float)1.5,screenY*(float)0.57,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.69,screenX*(float)1.7,screenY*(float)0.57,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.79,screenX*(float)1.8,screenY*(float)0.77,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.84,screenX*(float)1.85,screenY*(float)0.72,screenY*(float)0.77,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.89,screenX*(float)1.9,screenY*(float)0.64,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.94,screenX*(float)1.95,screenY*(float)0.57,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.99,screenX*(float)2,screenY*(float)0.5,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Wall(screenX*(float)2.49,screenX*(float)2.5,screenY*-(float)0.28,screenY*(float)0.5,screenX,screenY));
			tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //절대 빠지면 안되는 더미
			tempList.add(new Flat(-screenX*(float)0.06,screenX*(float)0.6,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Spike(screenX*(float)0.32,screenX*(float)0.35,screenY*(float)0.81,screenY*(float)0.84,1,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.7,screenX,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.7,screenX*(float)0.97,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.1,screenX*(float)1.4,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.5,screenX*(float)1.7,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.7,screenX*(float)1.8,screenY*(float)0.85,screenY*(float)0.86,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.8,screenX*(float)1.85,screenY*(float)0.77,screenY*(float)0.78,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.85,screenX*(float)1.9,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.9,screenX*(float)1.95,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.95,screenX*(float)2,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Flat(screenX*(float)2,screenX*(float)2.5,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));	
			break;
		case 5 :
			tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // 절대 빠지면 안되는 더미
			tempList.add(new Wall(-screenX*(float)0.05,-screenX*(float)0.06,0,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)0.59,screenX*(float)0.6,screenY*(float)0.84,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.09,screenX*(float)1.1,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.39,screenX*(float)1.4,screenY*(float)0.64,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.49,screenX*(float)1.5,screenY*(float)0.57,screenY*(float)1.16,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.69,screenX*(float)1.7,screenY*(float)0.57,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.79,screenX*(float)1.8,screenY*(float)0.77,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.84,screenX*(float)1.85,screenY*(float)0.72,screenY*(float)0.77,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.89,screenX*(float)1.9,screenY*(float)0.64,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.94,screenX*(float)1.95,screenY*(float)0.57,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Wall(screenX*(float)1.99,screenX*(float)2,screenY*(float)0.5,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Wall(screenX*(float)2.49,screenX*(float)2.5,screenY*-(float)0.28,screenY*(float)0.5,screenX,screenY));
			tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //절대 빠지면 안되는 더미
			tempList.add(new Flat(-screenX*(float)0.06,screenX*(float)0.6,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Spike(screenX*(float)0.32,screenX*(float)0.35,screenY*(float)0.81,screenY*(float)0.84,1,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.7,screenX,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.7,screenX*(float)0.97,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.1,screenX*(float)1.4,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.5,screenX*(float)1.7,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.7,screenX*(float)1.8,screenY*(float)0.85,screenY*(float)0.86,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.8,screenX*(float)1.85,screenY*(float)0.77,screenY*(float)0.78,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.85,screenX*(float)1.9,screenY*(float)0.71,screenY*(float)0.72,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.9,screenX*(float)1.95,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));
			tempList.add(new Flat(screenX*(float)1.95,screenX*(float)2,screenY*(float)0.56,screenY*(float)0.57,screenX,screenY));
			tempList.add(new Flat(screenX*(float)2,screenX*(float)2.5,screenY*(float)0.49,screenY*(float)0.5,screenX,screenY));
			break;
			
		}
		for(int i=0;i<tempList.size()-1;i++)
		{
			for(int j=i+1;j<tempList.size();j++)
			{
				if(tempList.get(i).getX1() > tempList.get(j).getX1())
				{
					MapObject temp = tempList.get(i);
					tempList.set(i, tempList.get(j));
					tempList.set(j, temp);
				}
			}
		}
		for(int i=0;i<tempList.size();i++)
			object_Right_Sorted.add(tempList.get(i));
		@SuppressWarnings("unchecked")
		ArrayList<MapObject> tempList2 = (ArrayList<MapObject>) tempList.clone();

		for(int i=0;i<tempList2.size()-1;i++)
		{
			for(int j=i+1;j<tempList2.size();j++)
			{
				if(tempList2.get(i).getX2() > tempList2.get(j).getX2())
				{
					MapObject temp = tempList2.get(i);
					tempList2.set(i, tempList2.get(j));
					tempList2.set(j, temp);
				}
			}
		}
		for(int i=0;i<tempList.size();i++)
			object_Left_Sorted.add(tempList2.get(i));
	}
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawBitmap(bitmap_Map, 0, 0, paint);
		screenX = (float)screenX;
		for(int i=0;i<object_Now.size();i++)
		{
		//	object_Now.get(i).set(getResources());
			object_Now.get(i).draw(x, y, canvas, paint);
		}
		myman.draw(canvas, paint);
		/*for(int i=0;i<object_Now.size();i++)
		{
			object_Now.get(i).recycle();
		}*/
		//canvas.drawText(colObjectL+" "+object_Now.get(0).y2, 150, 200, paint);
	}
	public void recycleAll()
	{
		for(int i=0;i<object_Now.size();i++)
		{
			object_Now.get(i).recycle();
		}
		bitmap_Map.recycle();
	}
}
