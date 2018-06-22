package com.example.projectcode;

import java.io.IOException;
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
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public class MyGame extends View  {
	public MyGame(Context context,int stage) {
		super(context);
		contextHandle = context;
		this.stage = stage;
		// TODO Auto-generated constructor stub
	}
	public Thread sound;
	private Context contextHandle;
	private Paint paint;
	private Bitmap bitmap_Map;
	private Bitmap bitmap_Left;
	private Bitmap bitmap_Right;
	public boolean leftMoveFlag;
	public boolean rightMoveFlag;
	public boolean jumpFlag;
//	private boolean downMoveFlag;
//	private boolean attackFlag;
	public boolean deadFlag;
	public boolean clearFlag;
	public MyMan myman;
	private MainActivity parents;
	public float x;
	public float y;
	private float map;
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
	private ArrayList<MapObject> object_Right_Sorted; // ������Ʈ�� ���� ����ǥ ������ ����
	private ArrayList<MapObject> object_Left_Sorted;  // ������Ʈ�� ���� ����ǥ ������ ����
	private ArrayList<MapObject> object_Now;
	private ArrayList<MediaPlayer> list;
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
			try {
				game.run();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void start(Context context,final float screenX,final float screenY) throws IllegalStateException, IOException {
		parents = (MainActivity) context;
		sound = new Thread(new Sound(getContext(),this));
		//sound = new Sound(getContext());
		//sound.start();
		clearFlag = false;
		this.screenX = screenX;
		this.screenY = screenY;
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
				if(event.getX()<screenX*(float)0.2)  // �����̵�
				{
					leftMoveFlag = true;
				}
				else if(event.getX()>screenX*(float)0.8) // �������̵�
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
		//downMoveFlag = false;
		jumpFlag = false;
		//attackFlag = false;
		deadFlag = false;
		makeMap();
		bitmap_Map = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.background), (int)(screenX*1.5),(int)(screenY*1.0), true);
		bitmap_Left = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.arrow_left), (int)(screenX*0.15),(int)(screenY*0.15), true);
		bitmap_Right = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.arrow_right), (int)(screenX*0.15),(int)(screenY*0.15), true);
		
		myman = new MyMan(screenX/20,screenY*(float)0.70,screenY*(float)0.15,screenX/20,screenX,screenY,getResources());
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
	private boolean colObject(float addX, float addY)  // false�ϰ�� �̵��Ұ�
	{
		boolean flag = true;
		float x = myman.getX();
		float y = myman.getY();
		float w = myman.getW();
		float h = myman.getH();
		float nx = x+addX;
		float ny = y+addY;
		for(int i=0;i<object_Now.size();i++)
		{
			if(object_Now.get(i).getIsBomb() || object_Now.get(i).getAttackable())
			{
				if(object_Now.get(i).getAttackable())
				{
					if(y-h/2 < object_Now.get(i).getY1() && object_Now.get(i).getY1() < y+h/2
								|| object_Now.get(i).getY1() < y-h/2)
						if(y-h/2 < object_Now.get(i).getY2() && object_Now.get(i).getY2() < y+h/2
								|| object_Now.get(i).getY2() > y+h/2)
							if(x-w/2 < object_Now.get(i).getX1() && object_Now.get(i).getX1() < x+w/2
									|| object_Now.get(i).getX1() < x-w/2)
								if(x-w/2 < object_Now.get(i).getX2() && object_Now.get(i).getX2() < x+w/2
										|| object_Now.get(i).getX2() > x+w/2)
									deadFlag = true;
				}
			}
			else
			{
				if(ny-h/2 < object_Now.get(i).getY1() && object_Now.get(i).getY1() < ny+h/2
						|| object_Now.get(i).getY1() < ny-h/2)
					if(ny-h/2 < object_Now.get(i).getY2() && object_Now.get(i).getY2() < ny+h/2
							|| object_Now.get(i).getY2() > ny+h/2)
						if(nx-w/2 < object_Now.get(i).getX1() && object_Now.get(i).getX1() < nx+w/2
								|| object_Now.get(i).getX1() < nx-w/2)
							if(nx-w/2 < object_Now.get(i).getX2() && object_Now.get(i).getX2() < nx+w/2
									|| object_Now.get(i).getX2() > nx+w/2)
							{
								if(addY > 0 && (blockD == -1 || object_Now.get(i).getY1() < object_Now.get(blockD).getY1()))
									blockD = i;
								else if(addY < 0 && (blockU == -1 || object_Now.get(i).getY2() > object_Now.get(blockU).getY2()))
									blockU = i;
								else if(addX < 0 && (colObjectL == -1 || object_Now.get(i).getX2() > object_Now.get(colObjectL).getX2()))
									colObjectL = i;
								else if(addX > 0 && (colObjectR == -1 || object_Now.get(i).getX1() < object_Now.get(colObjectR).getX1()))
									colObjectR = i;
								flag = false;
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
	
	public void run() throws IllegalStateException, IOException
	{
		//if(!deadFlag && !clearFlag)
			update();
		if(!deadFlag && !clearFlag)
			postInvalidate();
	}
	public void update() throws IllegalStateException, IOException
	{
		colObjectL = -1;
		colObjectR = -1;
		if(myman.getY()>screenY*1.2)      // ȭ������� �������� ���
			deadFlag = true;
		if(deadFlag)
		{
			updater.timer.cancel();
		}
		if(leftMoveFlag)  // �����̵�
		{
			myman.moveState();
			if(colObject(-screenX/100,0))
			{
				myman.setIsL(true);
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
		else if(rightMoveFlag) // �������̵�
		{
			myman.moveState();
			if(colObject(screenX/100,0))
			{
				myman.setIsL(false);
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
		else
			myman.resetState();

		blockU = -1;
		blockD = -1;
		myman.accel();
		if(colObject(0,myman.getV()))
			myman.falling();
		else
		{
				if(blockU > -1)
				{
					myman.setY(0, object_Now.get(blockU).getY2());
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
		case 1:
			//
			tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // ���� ������ �ȵǴ� ����
			tempList.add(new Wall(screenX*(float)0.90,screenX*(float)0.91,screenY*(float)0.00,screenY*(float)0.65,screenX,screenY)); 	//02�� ��
			tempList.add(new Wall(screenX*(float)1.05,screenX*(float)1.06,screenY*(float)0.29,screenY*(float)0.84,screenX,screenY)); 	//03�� ��
			tempList.add(new Wall(screenX*(float)1.20,screenX*(float)1.21,screenY*(float)0.00,screenY*(float)0.65,screenX,screenY)); 	//04�� ��
			tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //���� ������ �ȵǴ� ����
			tempList.add(new Flat(-screenX*(float)0.10,screenX*(float)0.2,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 01�� �ٴ�(����)
			tempList.add(new Flat(screenX*(float)0.35,screenX*(float)0.55,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 02�� �ٴ�
			tempList.add(new Flat(screenX*(float)0.35,screenX*(float)0.45,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 03�� �ٴ�
			tempList.add(new Flat(screenX*(float)0.45,screenX*(float)0.55,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 04�� �ٴ�
			tempList.add(new Flat(screenX*(float)0.65,screenX*(float)0.80,screenY*(float)0.29,screenY*(float)1.00,screenX,screenY));	// 05�� �ٴ�
			tempList.add(new Flat(screenX*(float)0.80,screenX*(float)2.00,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 06�� �ٴ�
			tempList.add(new Flat(screenX*(float)0.90,screenX*(float)0.91,screenY*(float)0.65,screenY*(float)0.66,screenX,screenY));	// 07�� �ٴ�(��2��ȣ)
			tempList.add(new Flat(screenX*(float)1.05,screenX*(float)1.06,screenY*(float)0.27,screenY*(float)0.29,screenX,screenY));	// 08�� �ٴ�(��3��ȣ)
			tempList.add(new Flat(screenX*(float)1.20,screenX*(float)1.21,screenY*(float)0.65,screenY*(float)0.66,screenX,screenY));	// 09�� �ٴ�(��4��ȣ)
			tempList.add(new Flat(screenX*(float)1.04,screenX*(float)1.07,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 10�� �ٴ�(��3 ����01)
			tempList.add(new Flat(screenX*(float)0.91,screenX*(float)0.94,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 11�� �ٴ�(��2 ����01)
			tempList.add(new Flat(screenX*(float)1.30,screenX*(float)2.00,screenY*(float)0.75,screenY*(float)0.85,screenX,screenY));	// 12�� �ٴ�(�� �ٴ�1)
			tempList.add(new Flat(screenX*(float)1.45,screenX*(float)2.00,screenY*(float)0.65,screenY*(float)0.75,screenX,screenY));	// 13�� �ٴ�(�� �ٴ�2)
			tempList.add(new Flat(screenX*(float)1.60,screenX*(float)2.00,screenY*(float)0.55,screenY*(float)0.65,screenX,screenY));	// 14�� �ٴ�(�� �ٴ�3)
			tempList.add(new Flat(screenX*(float)1.75,screenX*(float)2.00,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY));	// 15�� �ٴ�(�� �ٴ�4)
			tempList.add(new Flat(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.35,screenY*(float)0.45,screenX,screenY));	// 16�� �ٴ�(�� �ٴ�5)
			tempList.add(new Flag(screenX*(float)1.97,screenX*(float)2.00,screenY*(float)0.26,screenY*(float)0.35,screenX,screenY));// ���
			//(��Ÿ��, ����Ÿ��)
			tempList.add(new Bomb(screenX*(float)0.35,screenX*(float)0.45,screenY*(float)0.74,screenY*(float)0.79,screenX,screenY,
					2000,System.currentTimeMillis()));																					//��ź 1
			tempList.add(new Bomb(screenX*(float)0.45,screenX*(float)0.55,screenY*(float)0.74,screenY*(float)0.79,screenX,screenY,
					2000,System.currentTimeMillis()-1000));																				//��ź 2
			tempList.add(new Bomb(screenX*(float)0.35,screenX*(float)0.45,screenY*(float)0.54,screenY*(float)0.59,screenX,screenY,
					3000,System.currentTimeMillis()));																					//��ź 3
			tempList.add(new Bomb(screenX*(float)0.45,screenX*(float)0.55,screenY*(float)0.34,screenY*(float)0.39,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																				//��ź 4
			//1�� ���ϱ��� ��ź
			tempList.add(new Bomb(screenX*(float)0.94,screenX*(float)1.01,screenY*(float)0.70,screenY*(float)0.79,screenX,screenY,
					4000,System.currentTimeMillis()-4000));																				//��ź 5(����2)
			tempList.add(new Bomb(screenX*(float)0.94,screenX*(float)1.01,screenY*(float)0.50,screenY*(float)0.59,screenX,screenY,
					4000,System.currentTimeMillis()-3500));																				//��ź 6
			tempList.add(new Bomb(screenX*(float)0.94,screenX*(float)1.01,screenY*(float)0.30,screenY*(float)0.39,screenX,screenY,
					4000,System.currentTimeMillis()-3000));																				//��ź 7
			tempList.add(new Bomb(screenX*(float)0.94,screenX*(float)1.01,screenY*(float)0.10,screenY*(float)0.19,screenX,screenY,
					4000,System.currentTimeMillis()-2500));																				//��ź 8
			tempList.add(new Bomb(screenX*(float)1.09,screenX*(float)1.16,screenY*(float)0.70,screenY*(float)0.79,screenX,screenY,
					4000,System.currentTimeMillis()-2000));																				//��ź 12
			tempList.add(new Bomb(screenX*(float)1.09,screenX*(float)1.16,screenY*(float)0.50,screenY*(float)0.59,screenX,screenY,
					4000,System.currentTimeMillis()-1500));																				//��ź 11
			tempList.add(new Bomb(screenX*(float)1.09,screenX*(float)1.16,screenY*(float)0.30,screenY*(float)0.39,screenX,screenY,
					4000,System.currentTimeMillis()-1000));																				//��ź 10
			tempList.add(new Bomb(screenX*(float)1.09,screenX*(float)1.16,screenY*(float)0.10,screenY*(float)0.19,screenX,screenY,
					4000,System.currentTimeMillis()-500));																				//��ź 9
			tempList.add(new Bomb(screenX*(float)1.09,screenX*(float)1.16,screenY*(float)0.10,screenY*(float)0.19,screenX,screenY,
					2000,System.currentTimeMillis()-1000));																				//��ź 13
			tempList.add(new Bomb(screenX*(float)0.94,screenX*(float)1.01,screenY*(float)0.30,screenY*(float)0.39,screenX,screenY,
					2000,System.currentTimeMillis()-3000));																				//��ź 14
			tempList.add(new Bomb(screenX*(float)1.35,screenX*(float)1.41,screenY*(float)0.64,screenY*(float)0.70,screenX,screenY,
					2000,System.currentTimeMillis()-2000));																				//��ź 15(����3��)
			tempList.add(new Bomb(screenX*(float)1.50,screenX*(float)1.56,screenY*(float)0.54,screenY*(float)0.60,screenX,screenY,
					2000,System.currentTimeMillis()-1000));																				//��ź 16
			tempList.add(new Bomb(screenX*(float)1.65,screenX*(float)1.71,screenY*(float)0.44,screenY*(float)0.50,screenX,screenY,
					2000,System.currentTimeMillis()-2000));																				//��ź 17
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.86,screenY*(float)0.34,screenY*(float)0.40,screenX,screenY,
					2000,System.currentTimeMillis()-1000));																				//��ź 18
			//tempList.add(new Spike(screenX*(float)0.32,screenX*(float)0.35,screenY*(float)0.81,screenY*(float)0.84,1,screenX,screenY));
			break;
			case 2 :
				//��2ź
				//�ִ� ���� �Ÿ�= 0.16�� ���� ���������� ���Ѵ�.
				tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // ���� ������ �ȵǴ� ����	
				tempList.add(new Wall(screenX*(float)2.425,screenX*(float)2.475,screenY*(float)0.55,screenY*(float)1,screenX,screenY)); 	//04�� ��(12)
				tempList.add(new Wall(screenX*(float)2.985,screenX*(float)3.035,screenY*(float)0.55,screenY*(float)1,screenX,screenY)); 	//05�� ��(13)
				tempList.add(new Wall(screenX*(float)4.00,screenX*(float)4.01,-screenY*(float)0.1,screenY*(float)0.85,screenX,screenY));	//��(��)
				tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //���� ������ �ȵǴ� ����
				tempList.add(new Flat(screenX*(float)1.84,screenX*(float)3.40,screenY*(float)0.24,screenY*(float)0.25,screenX,screenY));	// ġƮŰ
				tempList.add(new Flat(-screenX*(float)0.1,screenX*(float)0.2,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));		// 01�� �ٴ�(����)
				tempList.add(new Flat(screenX*(float)0.20,screenX*(float)0.50,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 02�� �ٴ�
				tempList.add(new Flat(screenX*(float)0.58,screenX*(float)0.60,screenY*(float)0.74,screenY*(float)0.75,screenX,screenY));	// 03�� �ٴ�
				tempList.add(new Flat(screenX*(float)0.70,screenX*(float)0.95,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 04�� �ٴ�
				tempList.add(new Flat(screenX*(float)1.10,screenX*(float)1.13,screenY*(float)0.60,screenY*(float)0.65,screenX,screenY));	// 05�� �ٴ�
				tempList.add(new Flat(screenX*(float)1.20,screenX*(float)1.23,screenY*(float)0.60,screenY*(float)0.65,screenX,screenY));	// 05-2�� �ٴ�
				tempList.add(new Flat(screenX*(float)1.37,screenX*(float)1.40,screenY*(float)0.50,screenY*(float)0.55,screenX,screenY));	// 06�� �ٴ�
				tempList.add(new Flat(screenX*(float)1.47,screenX*(float)1.50,screenY*(float)0.50,screenY*(float)0.55,screenX,screenY));	// 06-2�� �ٴ�
				tempList.add(new Flat(screenX*(float)1.64,screenX*(float)1.67,screenY*(float)0.40,screenY*(float)0.45,screenX,screenY));	// 07�� �ٴ�
				tempList.add(new Flat(screenX*(float)1.74,screenX*(float)1.77,screenY*(float)0.40,screenY*(float)0.45,screenX,screenY));	// 07-2�� �ٴ�
				tempList.add(new Flat(screenX*(float)1.93,screenX*(float)2.00,screenY*(float)0.54,screenY*(float)0.55,screenX,screenY));	// 08�� �ٴ�
				tempList.add(new Flat(screenX*(float)2.14,screenX*(float)2.20,screenY*(float)0.40,screenY*(float)0.45,screenX,screenY));	// 09�� �ٴ�
				tempList.add(new Flat(screenX*(float)2.70,screenX*(float)2.76,screenY*(float)0.40,screenY*(float)0.45,screenX,screenY));	// 10�� �ٴ�
				tempList.add(new Flat(screenX*(float)3.26,screenX*(float)3.32,screenY*(float)0.40,screenY*(float)0.45,screenX,screenY));	// 11�� �ٴ�
				tempList.add(new Flat(screenX*(float)2.14,screenX*(float)2.20,screenY*(float)0.69,screenY*(float)0.74,screenX,screenY));	// 09-2�� �ٴ�
				tempList.add(new Flat(screenX*(float)2.70,screenX*(float)2.76,screenY*(float)0.69,screenY*(float)0.74,screenX,screenY));	// 10-2�� �ٴ�
				tempList.add(new Flat(screenX*(float)3.26,screenX*(float)3.32,screenY*(float)0.69,screenY*(float)0.74,screenX,screenY));	// 11-2�� �ٴ�
				tempList.add(new Flat(screenX*(float)2.30,screenX*(float)2.60,screenY*(float)0.54,screenY*(float)0.55,screenX,screenY));	// 12�� �ٴ�
				tempList.add(new Flat(screenX*(float)2.86,screenX*(float)3.16,screenY*(float)0.54,screenY*(float)0.55,screenX,screenY));	// 13�� �ٴ�
				tempList.add(new Flat(screenX*(float)3.45,screenX*(float)3.50,screenY*(float)0.54,screenY*(float)0.55,screenX,screenY));	// 14�� �ٴ�(��)
				tempList.add(new Flag(screenX*(float)3.46,screenX*(float)3.49,screenY*(float)0.45,screenY*(float)0.54,screenX,screenY));	// ���
				//(��Ÿ��, ����Ÿ��) 
				//����1
				/*
				tempList.add(new Bomb(screenX*(float)0.20,screenX*(float)0.30,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-3000));																					//��ź 1
				tempList.add(new Bomb(screenX*(float)0.30,screenX*(float)0.40,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-2500));																					//��ź 2 
				tempList.add(new Bomb(screenX*(float)0.40,screenX*(float)0.50,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-2000));																					//��ź 3
				*/
				// 13 2 12 23 2 13
				tempList.add(new Bomb(screenX*(float)0.20,screenX*(float)0.30,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-4200));																					//��ź 1
				tempList.add(new Bomb(screenX*(float)0.40,screenX*(float)0.50,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-4200));																					//��ź 3
				//
				tempList.add(new Bomb(screenX*(float)0.30,screenX*(float)0.40,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-3500));																					//��ź 2 
				//
				tempList.add(new Bomb(screenX*(float)0.20,screenX*(float)0.30,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-2800));																					//��ź 1
				tempList.add(new Bomb(screenX*(float)0.30,screenX*(float)0.40,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-2800));																					//��ź 2 
				//
				tempList.add(new Bomb(screenX*(float)0.30,screenX*(float)0.40,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-2100));																					//��ź 2 
				tempList.add(new Bomb(screenX*(float)0.40,screenX*(float)0.50,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-2100));																					//��ź 3
				//
				tempList.add(new Bomb(screenX*(float)0.30,screenX*(float)0.40,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-1400));																					//��ź 2 
				//
				tempList.add(new Bomb(screenX*(float)0.20,screenX*(float)0.30,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-700));																					//��ź 1
				tempList.add(new Bomb(screenX*(float)0.40,screenX*(float)0.50,screenY*(float)0.45,screenY*(float)0.55,screenX,screenY,
						4200,System.currentTimeMillis()-700));																					//��ź 3
				//
				tempList.add(new Bomb(screenX*(float)0.70,screenX*(float)0.78,screenY*(float)0.52,screenY*(float)0.70,screenX,screenY,
						2100,System.currentTimeMillis()-1400));																					//��ź 7
				tempList.add(new Bomb(screenX*(float)0.70,screenX*(float)0.78,screenY*(float)0.52,screenY*(float)0.70,screenX,screenY,
						2100,System.currentTimeMillis()-700));																					//��ź 7
				tempList.add(new Bomb(screenX*(float)0.79,screenX*(float)0.87,screenY*(float)0.52,screenY*(float)0.70,screenX,screenY,
						2100,System.currentTimeMillis()-700));																					//��ź 8
				tempList.add(new Bomb(screenX*(float)0.79,screenX*(float)0.87,screenY*(float)0.52,screenY*(float)0.70,screenX,screenY,
						2100,System.currentTimeMillis()-2100));																					//��ź 8
				tempList.add(new Bomb(screenX*(float)0.88,screenX*(float)0.96,screenY*(float)0.52,screenY*(float)0.70,screenX,screenY,
						2100,System.currentTimeMillis()-2100));																					//��ź 9
				tempList.add(new Bomb(screenX*(float)0.88,screenX*(float)0.96 ,screenY*(float)0.52,screenY*(float)0.70,screenX,screenY,
						2100,System.currentTimeMillis()-1400));																					//��ź 9	
				//����2
				tempList.add(new Bomb(screenX*(float)2.15,screenX*(float)2.20,screenY*(float)0.27,screenY*(float)0.34,screenX,screenY,
						4000,System.currentTimeMillis()-4000));																					//��ź 10
				tempList.add(new Bomb(screenX*(float)2.71,screenX*(float)2.76,screenY*(float)0.27,screenY*(float)0.34,screenX,screenY,
						4000,System.currentTimeMillis()-2000));																					//��ź 11
				tempList.add(new Bomb(screenX*(float)3.27,screenX*(float)3.32,screenY*(float)0.27,screenY*(float)0.34,screenX,screenY,
						4000,System.currentTimeMillis()-4000));																					//��ź 12
				tempList.add(new Bomb(screenX*(float)2.15,screenX*(float)2.20,screenY*(float)0.56,screenY*(float)0.63,screenX,screenY,
						4000,System.currentTimeMillis()-2000));																					//��ź 13
				tempList.add(new Bomb(screenX*(float)2.71,screenX*(float)2.76,screenY*(float)0.56,screenY*(float)0.63,screenX,screenY,
						4000,System.currentTimeMillis()-4000));																					//��ź 14
				tempList.add(new Bomb(screenX*(float)3.27,screenX*(float)3.32,screenY*(float)0.56,screenY*(float)0.63,screenX,screenY,
						4000,System.currentTimeMillis()-2000));																					//��ź 15
				/*
				 * ��ġ������ϻ�
				tempList.add(new Bomb(screenX*(float)2.32,screenX*(float)2.38,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-4000));																					//��ź 16
				tempList.add(new Bomb(screenX*(float)2.42,screenX*(float)2.48,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-4000));																					//��ź 17
				tempList.add(new Bomb(screenX*(float)2.52,screenX*(float)2.58,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-4000));																					//��ź 18
				tempList.add(new Bomb(screenX*(float)2.88,screenX*(float)2.94,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-4000));																					//��ź 19
				tempList.add(new Bomb(screenX*(float)2.98,screenX*(float)3.04,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-4000));																					//��ź 20
				tempList.add(new Bomb(screenX*(float)3.08,screenX*(float)3.14,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-4000));																					//��ź 21
				*/
				tempList.add(new Bomb(screenX*(float)2.52,screenX*(float)2.58,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-3000));																					//��ź 18
				tempList.add(new Bomb(screenX*(float)2.98,screenX*(float)3.04,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-3000));																					//��ź 20
				tempList.add(new Bomb(screenX*(float)2.42,screenX*(float)2.48,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-2500));																					//��ź 17
				tempList.add(new Bomb(screenX*(float)2.88,screenX*(float)2.94,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-2500));																					//��ź 19
				tempList.add(new Bomb(screenX*(float)2.52,screenX*(float)2.58,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-2000));																					//��ź 18
				tempList.add(new Bomb(screenX*(float)2.98,screenX*(float)3.04,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-2000));																					//��ź 20
				tempList.add(new Bomb(screenX*(float)2.32,screenX*(float)2.38,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-1500));																					//��ź 16
				tempList.add(new Bomb(screenX*(float)3.08,screenX*(float)3.14,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-1500));																					//��ź 21
				tempList.add(new Bomb(screenX*(float)2.42,screenX*(float)2.48,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-1000));																					//��ź 17
				tempList.add(new Bomb(screenX*(float)2.88,screenX*(float)2.94,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-1000));																					//��ź 19
				tempList.add(new Bomb(screenX*(float)2.32,screenX*(float)2.38,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-500));																					//��ź 16
				tempList.add(new Bomb(screenX*(float)3.08,screenX*(float)3.14,screenY*(float)0.45,screenY*(float)0.52,screenX,screenY,
						3000,System.currentTimeMillis()-500));																					//��ź 21
				break;
			case 3 :
				//��3ź
				//�ִ� ���� �Ÿ�= 0.16�� ���� ���������� ���Ѵ�.
				tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // ���� ������ �ȵǴ� ����
				tempList.add(new Wall(screenX*(float)1.49,screenX*(float)1.50,screenY*(float)0.02,screenY*(float)0.58,screenX,screenY)); 	//02�� ��(2-1)
				tempList.add(new Wall(screenX*(float)0.70,screenX*(float)0.71,screenY*(float)0.30,screenY*(float)0.84,screenX,screenY)); 	//02�� ��(2-2)
				//tempList.add(new Wall(screenX*(float)1.49,screenX*(float)1.50,-screenY*(float)0.5,screenY*(float)0.01,screenX,screenY)); 	//03�� �� �����Ը��º�
				tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //���� ������ �ȵǴ� ����
				tempList.add(new Flat(-screenX*(float)0.1,screenX*(float)0.2,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));		// 01�� �ٴ�(����)
				tempList.add(new Flat(screenX*(float)1.6,screenX*(float)3.4,screenY*(float)0.1,screenY*(float)0.11,screenX,screenY));	// �ӽ� �ٴ�
				tempList.add(new Flat(screenX*(float)0.25,screenX*(float)0.30,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 02-1�� �ٴ�
				tempList.add(new Flat(screenX*(float)0.35,screenX*(float)0.40,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 02-2�� �ٴ�
				tempList.add(new Flat(screenX*(float)0.45,screenX*(float)0.50,screenY*(float)0.24,screenY*(float)0.25,screenX,screenY));	// 02-3�� �ٴ�
				tempList.add(new Flat(screenX*(float)0.55,screenX*(float)0.60,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 02-4�� �ٴ�
				tempList.add(new Flat(screenX*(float)0.70,screenX*(float)1.50,screenY*(float)0.01,screenY*(float)0.02,screenX,screenY));	// 3-1�� ū �ٴ�
				tempList.add(new Flat(screenX*(float)1.10,screenX*(float)1.20,screenY*(float)0.27,screenY*(float)0.29,screenX,screenY));	// 3-2�� �����ٴ�																				//��ź 2 5
				tempList.add(new Flat(screenX*(float)0.70,screenX*(float)1.40,screenY*(float)0.29,screenY*(float)0.30,screenX,screenY));	// 3-2�� ū �ٴ�
				tempList.add(new Flat(screenX*(float)0.80,screenX*(float)1.50,screenY*(float)0.58,screenY*(float)0.59,screenX,screenY));	// 3-3�� ū �ٴ�
				tempList.add(new Flat(screenX*(float)0.70,screenX*(float)1.50,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 3-4�� ū �ٴ�
				tempList.add(new Flat(screenX*(float)1.65,screenX*(float)1.70,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 4-1�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)1.85,screenX*(float)1.90,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 4-2�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)2.05,screenX*(float)2.10,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 4-3�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)2.20,screenX*(float)2.25,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 5-1�� ��ź �ٴ�
				tempList.add(new Flat(screenX*(float)2.40,screenX*(float)2.45,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 5-2�� ��ź �ٴ�
				tempList.add(new Flat(screenX*(float)2.60,screenX*(float)2.65,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 5-3�� ��ź �ٴ�
				tempList.add(new Flat(screenX*(float)2.80,screenX*(float)2.85,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 5-4�� ��ź �ٴ�
				tempList.add(new Flat(screenX*(float)3.00,screenX*(float)3.05,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 5-5�� ��ź �ٴ�
				tempList.add(new Flat(screenX*(float)3.20,screenX*(float)3.30,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 6�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)3.40,screenX*(float)4.85,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 7�� ū �ٴ�
				tempList.add(new Flat(screenX*(float)3.60,screenX*(float)3.65,screenY*(float)0.74,screenY*(float)0.75,screenX,screenY));	// 8-1�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)3.80,screenX*(float)3.85,screenY*(float)0.74,screenY*(float)0.75,screenX,screenY));	// 8-2�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.00,screenX*(float)4.05,screenY*(float)0.74,screenY*(float)0.75,screenX,screenY));	// 8-3�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.20,screenX*(float)4.25,screenY*(float)0.74,screenY*(float)0.75,screenX,screenY));	// 8-4�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.40,screenX*(float)4.45,screenY*(float)0.74,screenY*(float)0.75,screenX,screenY));	// 8-5�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.60,screenX*(float)4.65,screenY*(float)0.74,screenY*(float)0.75,screenX,screenY));	// 8-6�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)3.60,screenX*(float)3.65,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 9-1�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)3.80,screenX*(float)3.85,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 9-2�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.00,screenX*(float)4.05,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 9-3�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.20,screenX*(float)4.25,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 9-4�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.40,screenX*(float)4.45,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 9-5�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.60,screenX*(float)4.65,screenY*(float)0.44,screenY*(float)0.45,screenX,screenY));	// 9-6�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)3.60,screenX*(float)3.65,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-1�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)3.80,screenX*(float)3.85,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-2�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.00,screenX*(float)4.05,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-3�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.20,screenX*(float)4.25,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-4�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.40,screenX*(float)4.45,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-5�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.60,screenX*(float)4.65,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-6�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.80,screenX*(float)4.85,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-7�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)5.00,screenX*(float)5.05,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-8�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)5.20,screenX*(float)5.25,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-9�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)5.40,screenX*(float)5.45,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// 10-10�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)4.75,screenX*(float)4.80,screenY*(float)0.59,screenY*(float)0.60,screenX,screenY));	// 11-1�� ����� �ٴ�
				tempList.add(new Flat(screenX*(float)3.45,screenX*(float)3.50,screenY*(float)0.29,screenY*(float)0.30,screenX,screenY));	// 11-2�� ����� �ٴ�
				tempList.add(new Flag(screenX*(float)5.41,screenX*(float)5.44,screenY*(float)0.05,screenY*(float)0.14,screenX,screenY));	// ���
				
				//����1������
				//(����1-1~1-8,2-1~2-8,3-1~3-8)
/*
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-8000));																					//��ź 1 1	
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-7000));																					//��ź 1 2
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-6000));																					//��ź 1 3
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-5000));																					//��ź 1 4
				tempList.add(new Bomb(screenX*(float)1.1,screenX*(float)1.2,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4000));																					//��ź 1 5
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-3000));																					//��ź 1 6
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-2000));																					//��ź 1 7
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-1000));																					//��ź 1 8
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						6400,System.currentTimeMillis()-8000));																					//��ź 2 1	
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-7000));																					//��ź 2 2
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-6000));																					//��ź 2 3
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-5000));																					//��ź 2 4
				tempList.add(new Bomb(screenX*(float)1.1,screenX*(float)1.2,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-4000));																					//��ź 2 5
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-3000));																					//��ź 2 6
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-2000));																					//��ź 2 7
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-1000));																					//��ź 2 8
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-8000));																					//��ź 3 1	
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-7000));																					//��ź 3 2
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-6000));																					//��ź 3 3
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-5000));																					//��ź 3 4
				tempList.add(new Bomb(screenX*(float)1.1,screenX*(float)1.2,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-4000));																					//��ź 3 5
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-3000));																					//��ź 3 6
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-2000));																					//��ź 3 7
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-1000));																					//��ź 3 8
*/
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-7200));																					//��ź 1 2
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-7200));																					//��ź 1 6
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-7200));																					//��ź 1 8
				//1����-1���� 126
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-6400));																					//��ź 1 3
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-6400));																					//��ź 1 4
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-6400));																					//��ź 1 6
				//1-2		134
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-5600));																					//��ź 1 1
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-5600));																					//��ź 1 3
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-5600));																					//��ź 1 7
				//1-3	137
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4800));																					//��ź 1 6
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4800));																					//��ź 1 7
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4800));																					//��ź 1 8
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4800));																					//��ź 1 4
				//1-4	4678
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4000));																					//��ź 1 1	
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4000));																					//��ź 1 2
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4000));																					//��ź 1 4
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-4000));																					//��ź 1 8
				//1-5	1248
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-3200));																					//��ź 1 2
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-3200));																					//��ź 1 6
				//1-6	26
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-2400));																					//��ź 1 1
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-2400));																					//��ź 1 4
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-2400));																					//��ź 1 7
				//1-7	147
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-1600));																					//��ź 1 1
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-1600));																					//��ź 1 3
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-1600));																					//��ź 1 8
				//1-8	138
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-800));																					//��ź 1 2
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-800));																					//��ź 1 3
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.10,screenY*(float)0.29,screenX,screenY,
						7200,System.currentTimeMillis()-800));																					//��ź 1 7
				//1-9 	237
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-3200));																					//��ź 2 2
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-3200));																					//��ź 2 3
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-3200));																					//��ź 2 6
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-3200));																					//��ź 2 7
				//2-1 2367
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-2400));																					//��ź 2 1	
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-2400));																					//��ź 2 2
				tempList.add(new Bomb(screenX*(float)1.1,screenX*(float)1.2,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-2400));																					//��ź 2 5
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-2400));																					//��ź 2 6
				//2-2 1256
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-1600));																					//��ź 2 1	
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-1600));																					//��ź 2 4
				tempList.add(new Bomb(screenX*(float)1.1,screenX*(float)1.2,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-1600));																					//��ź 2 5
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-1600));																					//��ź 2 8
				//2-3 1458
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-800));																					//��ź 2 3
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-800));																					//��ź 2 4
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.38,screenY*(float)0.59,screenX,screenY,
						3200,System.currentTimeMillis()-800));																					//��ź 2 7
				//2-4 347
				tempList.add(new Bomb(screenX*(float)0.7,screenX*(float)0.8,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-2400));																					//��ź 3 1	
				tempList.add(new Bomb(screenX*(float)0.8,screenX*(float)0.9,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-2100));																					//��ź 3 2
				tempList.add(new Bomb(screenX*(float)0.9,screenX*(float)1.0,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-1800));																					//��ź 3 3
				tempList.add(new Bomb(screenX*(float)1.0,screenX*(float)1.1,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-1500));																					//��ź 3 4
				tempList.add(new Bomb(screenX*(float)1.1,screenX*(float)1.2,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-1200));																					//��ź 3 5
				tempList.add(new Bomb(screenX*(float)1.2,screenX*(float)1.3,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-900));																					//��ź 3 6
				tempList.add(new Bomb(screenX*(float)1.3,screenX*(float)1.4,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-600));																					//��ź 3 7
				tempList.add(new Bomb(screenX*(float)1.4,screenX*(float)1.5,screenY*(float)0.68,screenY*(float)0.84,screenX,screenY,
						2400,System.currentTimeMillis()-300));																					//��ź 3 8
				//1-3����
				//����2 ����(5����) ��ǥ����
				/*
				tempList.add(new Bomb(screenX*(float)2.20,screenX*(float)2.25,screenY*(float)0.54,screenY*(float)0.64,screenX,screenY,
						5000,System.currentTimeMillis()-5000));																					//��ź 1
				tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.45,screenY*(float)0.54,screenY*(float)0.64,screenX,screenY,
						5000,System.currentTimeMillis()-5000));																					//��ź 2
				tempList.add(new Bomb(screenX*(float)2.60,screenX*(float)2.65,screenY*(float)0.54,screenY*(float)0.64,screenX,screenY,
						5000,System.currentTimeMillis()-5000));																					//��ź 3
				tempList.add(new Bomb(screenX*(float)2.80,screenX*(float)2.85,screenY*(float)0.54,screenY*(float)0.64,screenX,screenY,
						5000,System.currentTimeMillis()-5000));																					//��ź 4
				tempList.add(new Bomb(screenX*(float)3.00,screenX*(float)3.05,screenY*(float)0.54,screenY*(float)0.64,screenX,screenY,
						5000,System.currentTimeMillis()-5000));																					//��ź 5
						*/
				//2-1���� 3
				tempList.add(new Bomb(screenX*(float)2.60,screenX*(float)2.65,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-5000));																					//��ź 3
				//2-2 12345
				tempList.add(new Bomb(screenX*(float)2.20,screenX*(float)2.25,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-4000));																					//��ź 1
				tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.45,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-4000));																					//��ź 2
				tempList.add(new Bomb(screenX*(float)2.60,screenX*(float)2.65,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-4000));																					//��ź 3
				tempList.add(new Bomb(screenX*(float)2.80,screenX*(float)2.85,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-4000));																					//��ź 4
				tempList.add(new Bomb(screenX*(float)3.00,screenX*(float)3.05,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-4000));																					//��ź 5
				//2-3 24
				tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.45,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-3000));																					//��ź 2
				tempList.add(new Bomb(screenX*(float)2.80,screenX*(float)2.85,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-3000));																					//��ź 4
				//2-4 3
				tempList.add(new Bomb(screenX*(float)2.60,screenX*(float)2.65,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-2000));																					//��ź 3
				//2-5 24
				tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.45,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-1000));																					//��ź 2
				tempList.add(new Bomb(screenX*(float)2.80,screenX*(float)2.85,screenY*(float)0.50,screenY*(float)0.60,screenX,screenY,
						5000,System.currentTimeMillis()-1000));																					//��ź 4
				//���ϸ����� �ӽ�
/*
				tempList.add(new Bomb(screenX*(float)3.675,screenX*(float)3.775,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 1 1 
				tempList.add(new Bomb(screenX*(float)3.675,screenX*(float)3.775,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 1 2
				tempList.add(new Bomb(screenX*(float)3.675,screenX*(float)3.775,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 1 3
				tempList.add(new Bomb(screenX*(float)3.875,screenX*(float)3.975,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 2 1
				tempList.add(new Bomb(screenX*(float)3.875,screenX*(float)3.975,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 2 2
				tempList.add(new Bomb(screenX*(float)3.875,screenX*(float)3.975,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 2 3	
				tempList.add(new Bomb(screenX*(float)4.075,screenX*(float)4.175,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 3 1
				tempList.add(new Bomb(screenX*(float)4.075,screenX*(float)4.175,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 3 2
				tempList.add(new Bomb(screenX*(float)4.075,screenX*(float)4.175,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 3 3	
				tempList.add(new Bomb(screenX*(float)4.275,screenX*(float)4.375,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 4 1
				tempList.add(new Bomb(screenX*(float)4.275,screenX*(float)4.375,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 4 2
				tempList.add(new Bomb(screenX*(float)4.275,screenX*(float)4.375,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 4 3
				tempList.add(new Bomb(screenX*(float)4.475,screenX*(float)4.575,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 5 1
				tempList.add(new Bomb(screenX*(float)4.475,screenX*(float)4.575,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 5 2
				tempList.add(new Bomb(screenX*(float)4.475,screenX*(float)4.575,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						8000,System.currentTimeMillis()-8000));																					//��ź 5 3
*/
				tempList.add(new Bomb(screenX*(float)3.675,screenX*(float)3.775,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						1500,System.currentTimeMillis()-1400));																					//��ź 1 3
				tempList.add(new Bomb(screenX*(float)3.675,screenX*(float)3.775,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						1500,System.currentTimeMillis()-1300));																					//��ź 1 2
				tempList.add(new Bomb(screenX*(float)3.675,screenX*(float)3.775,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						1500,System.currentTimeMillis()-1200));																					//��ź 1 1
				tempList.add(new Bomb(screenX*(float)3.875,screenX*(float)3.975,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						1500,System.currentTimeMillis()-1100));																					//��ź 2 1
				tempList.add(new Bomb(screenX*(float)3.875,screenX*(float)3.975,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						1500,System.currentTimeMillis()-1000));																					//��ź 2 2
				tempList.add(new Bomb(screenX*(float)3.875,screenX*(float)3.975,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						1500,System.currentTimeMillis()-900));																					//��ź 2 3
				tempList.add(new Bomb(screenX*(float)4.075,screenX*(float)4.175,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						1500,System.currentTimeMillis()-800));																					//��ź 3 3
				tempList.add(new Bomb(screenX*(float)4.075,screenX*(float)4.175,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						1500,System.currentTimeMillis()-700));																					//��ź 3 2
				tempList.add(new Bomb(screenX*(float)4.075,screenX*(float)4.175,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						1500,System.currentTimeMillis()-600));																					//��ź 3 1
				tempList.add(new Bomb(screenX*(float)4.275,screenX*(float)4.375,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						1500,System.currentTimeMillis()-500));																					//��ź 4 1
				tempList.add(new Bomb(screenX*(float)4.275,screenX*(float)4.375,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						1500,System.currentTimeMillis()-400));																					//��ź 4 2
				tempList.add(new Bomb(screenX*(float)4.275,screenX*(float)4.375,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						1500,System.currentTimeMillis()-300));																					//��ź 4 3
				tempList.add(new Bomb(screenX*(float)4.475,screenX*(float)4.575,screenY*(float)0.63,screenY*(float)0.73,screenX,screenY,
						1500,System.currentTimeMillis()-200));																					//��ź 5 3
				tempList.add(new Bomb(screenX*(float)4.475,screenX*(float)4.575,screenY*(float)0.33,screenY*(float)0.43,screenX,screenY,
						1500,System.currentTimeMillis()-100));																					//��ź 5 2
				tempList.add(new Bomb(screenX*(float)4.475,screenX*(float)4.575,screenY*(float)0.03,screenY*(float)0.13,screenX,screenY,
						1500,System.currentTimeMillis()-0));																					//��ź 5 1
				

				//���� 3
				break;
		case 5 :
			//�� 4ź
			tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // ���� ������ �ȵǴ� ����
			tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //���� ������ �ȵǴ� ����
			tempList.add(new Wall(screenX*(float)1.79,screenX*(float)1.80,screenY*(float)0.04,screenY*(float)0.64,screenX,screenY)); 	// 01�� ��
			tempList.add(new Wall(screenX*(float)1.99,screenX*(float)2.00,screenY*(float)0.24,screenY*(float)0.84,screenX,screenY)); 	// 02�� ��
			tempList.add(new Wall(screenX*(float)2.39,screenX*(float)2.40,screenY*(float)0.24,screenY*(float)0.85,screenX,screenY)); 	// 03�� ��
			tempList.add(new Wall(screenX*(float)2.49,screenX*(float)2.50,screenY*(float)0.04,screenY*(float)0.65,screenX,screenY)); 	// 04�� ��
			
			tempList.add(new Flat(-screenX*(float)0.10,screenX*(float)0.2,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 01�� �ٴ�(����)
			tempList.add(new Flat(screenX*(float)0.30,screenX*(float)2.0,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 02�� �ٴ�
			tempList.add(new Flat(screenX*(float)0.30,screenX*(float)1.8,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 03�� �ٴ�
			tempList.add(new Flat(screenX*(float)2.40,screenX*(float)3.0,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 04�� �ٴ�
			tempList.add(new Flat(screenX*(float)2.50,screenX*(float)3.0,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 05�� �ٴ�
			tempList.add(new Flat(screenX*(float)2.00,screenX*(float)2.4,screenY*(float)0.24,screenY*(float)0.25,screenX,screenY));	// 06�� �ٴ�
			tempList.add(new Flat(screenX*(float)1.80,screenX*(float)2.5,screenY*(float)0.04,screenY*(float)0.05,screenX,screenY));	// 07�� �ٴ�
			tempList.add(new Flat(screenX*(float)0.505,screenX*(float)0.510,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));	// 02 -1 �ٴ� ��ֹ�
			tempList.add(new Flat(screenX*(float)0.705,screenX*(float)0.710,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));	// 02 -2 �ٴ� ��ֹ�
			tempList.add(new Flat(screenX*(float)0.805,screenX*(float)0.810,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));	// 02 -3 �ٴ� ��ֹ�
			tempList.add(new Flat(screenX*(float)1.105,screenX*(float)1.110,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));	// 02 -4 �ٴ� ��ֹ�
			tempList.add(new Flat(screenX*(float)1.505,screenX*(float)1.510,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));	// 02 -5 �ٴ� ��ֹ�
			tempList.add(new Flat(screenX*(float)1.96,screenX*(float)2.00,screenY*(float)0.73,screenY*(float)0.74,screenX,screenY));	// �� ��� 1
			tempList.add(new Flat(screenX*(float)1.80,screenX*(float)1.83,screenY*(float)0.63,screenY*(float)0.64,screenX,screenY));	// �� ��� 2
			tempList.add(new Flat(screenX*(float)1.97,screenX*(float)2.00,screenY*(float)0.53,screenY*(float)0.54,screenX,screenY));	// �� ��� 3
			tempList.add(new Flat(screenX*(float)1.80,screenX*(float)1.82,screenY*(float)0.43,screenY*(float)0.44,screenX,screenY));	// �� ��� 4
			tempList.add(new Flat(screenX*(float)1.98,screenX*(float)2.00,screenY*(float)0.33,screenY*(float)0.34,screenX,screenY));	// �� ��� 5
			tempList.add(new Flat(screenX*(float)3.10,screenX*(float)3.60,screenY*(float)0.84,screenY*(float)0.85,screenX,screenY));	// 08�� �ٴ�
			tempList.add(new Flat(screenX*(float)3.60,screenX*(float)4.20,screenY*(float)0.74,screenY*(float)0.75,screenX,screenY));	// 09�� �ٴ�
			tempList.add(new Flat(screenX*(float)4.20,screenX*(float)5.00,screenY*(float)0.64,screenY*(float)0.65,screenX,screenY));	// 10�� �ٴ�(��)
			tempList.add(new Flag(screenX*(float)4.97,screenX*(float)5.00,screenY*(float)0.55,screenY*(float)0.64,screenX,screenY));	// ���
			tempList.add(new Flat(screenX*(float)1.50,screenX*(float)1.60,screenY*(float)0.54,screenY*(float)0.55,screenX,screenY));	// �ӽùٴ� 2
			tempList.add(new Flat(screenX*(float)1.60,screenX*(float)1.70,screenY*(float)0.34,screenY*(float)0.35,screenX,screenY));	// �ӽùٴ� 3
			tempList.add(new Flat(screenX*(float)1.70,screenX*(float)5.00,screenY*(float)0.14,screenY*(float)0.15,screenX,screenY));	// �ӽùٴ� 4
			//����1 ��ź��ġ �������
			/*
			tempList.add(new Bomb(screenX*(float)0.30,screenX*(float)0.40,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 1
			tempList.add(new Bomb(screenX*(float)0.40,screenX*(float)0.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 2
			tempList.add(new Bomb(screenX*(float)0.50,screenX*(float)0.60,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 3
			tempList.add(new Bomb(screenX*(float)0.60,screenX*(float)0.70,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 4
			tempList.add(new Bomb(screenX*(float)0.70,screenX*(float)0.80,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 5
			tempList.add(new Bomb(screenX*(float)0.80,screenX*(float)0.90,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 6
			tempList.add(new Bomb(screenX*(float)0.90,screenX*(float)1.00,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 7
			tempList.add(new Bomb(screenX*(float)1.00,screenX*(float)1.10,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 8
			tempList.add(new Bomb(screenX*(float)1.10,screenX*(float)1.20,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 9
			tempList.add(new Bomb(screenX*(float)1.20,screenX*(float)1.30,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 10
			tempList.add(new Bomb(screenX*(float)1.30,screenX*(float)1.40,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 11
			tempList.add(new Bomb(screenX*(float)1.40,screenX*(float)1.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 12
			tempList.add(new Bomb(screenX*(float)1.50,screenX*(float)1.60,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 13
			tempList.add(new Bomb(screenX*(float)1.60,screenX*(float)1.70,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 14
			tempList.add(new Bomb(screenX*(float)1.70,screenX*(float)1.80,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 15
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.90,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 16
			tempList.add(new Bomb(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 17
			//��������
			 //������
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.90,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 18
			tempList.add(new Bomb(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 19
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.90,screenY*(float)0.28,screenY*(float)0.40,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 20
			tempList.add(new Bomb(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.28,screenY*(float)0.40,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 21
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.90,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 22
			tempList.add(new Bomb(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 23
			tempList.add(new Bomb(screenX*(float)2.00,screenX*(float)2.10,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 24
			tempList.add(new Bomb(screenX*(float)2.10,screenX*(float)2.20,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 25
			tempList.add(new Bomb(screenX*(float)2.20,screenX*(float)2.30,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 26
			tempList.add(new Bomb(screenX*(float)2.30,screenX*(float)2.40,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 27
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 28
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.28,screenY*(float)0.40,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 29
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 30
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 31
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 32
			tempList.add(new Bomb(screenX*(float)2.50,screenX*(float)2.60,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 33
			tempList.add(new Bomb(screenX*(float)2.60,screenX*(float)2.70,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 34
			tempList.add(new Bomb(screenX*(float)2.70,screenX*(float)2.80,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 35
			tempList.add(new Bomb(screenX*(float)2.80,screenX*(float)2.90,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 36
			tempList.add(new Bomb(screenX*(float)2.90,screenX*(float)3.00,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 37
					*/
			tempList.add(new Bomb(screenX*(float)0.30,screenX*(float)0.40,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 1
			tempList.add(new Bomb(screenX*(float)0.50,screenX*(float)0.60,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 3
			tempList.add(new Bomb(screenX*(float)0.70,screenX*(float)0.80,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 5
			tempList.add(new Bomb(screenX*(float)0.90,screenX*(float)1.00,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 7
			tempList.add(new Bomb(screenX*(float)1.10,screenX*(float)1.20,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 9
			tempList.add(new Bomb(screenX*(float)1.30,screenX*(float)1.40,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 11
			tempList.add(new Bomb(screenX*(float)1.50,screenX*(float)1.60,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 13
			tempList.add(new Bomb(screenX*(float)1.70,screenX*(float)1.80,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 15
			tempList.add(new Bomb(screenX*(float)0.40,screenX*(float)0.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 2
			tempList.add(new Bomb(screenX*(float)0.60,screenX*(float)0.70,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 4
			tempList.add(new Bomb(screenX*(float)0.80,screenX*(float)0.90,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 6
			tempList.add(new Bomb(screenX*(float)1.00,screenX*(float)1.10,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					2500,System.currentTimeMillis()-1500));																					//��ź 8
			tempList.add(new Bomb(screenX*(float)1.20,screenX*(float)1.30,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3500,System.currentTimeMillis()-2000));																					//��ź 10
			tempList.add(new Bomb(screenX*(float)1.40,screenX*(float)1.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					2000,System.currentTimeMillis()-2000));																					//��ź 12
			tempList.add(new Bomb(screenX*(float)1.60,screenX*(float)1.70,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					4000,System.currentTimeMillis()-2000));																					//��ź 14
			//��������
			//�������� 5�ʳ��� ������ ��� 3�ʳ��� �������
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.90,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					5000,System.currentTimeMillis()-3000));																					//��ź 16
			tempList.add(new Bomb(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					5000,System.currentTimeMillis()-3000));																					//��ź 17
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.90,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					5000,System.currentTimeMillis()-3000));																					//��ź 18
			tempList.add(new Bomb(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					5000,System.currentTimeMillis()-3000));																					//��ź 19
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.90,screenY*(float)0.28,screenY*(float)0.40,screenX,screenY,
					5000,System.currentTimeMillis()-3000));																					//��ź 20
			tempList.add(new Bomb(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.28,screenY*(float)0.40,screenX,screenY,
					5000,System.currentTimeMillis()-3000));																					//��ź 21
			tempList.add(new Bomb(screenX*(float)1.80,screenX*(float)1.90,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					5000,System.currentTimeMillis()-3000));																					//��ź 22
			tempList.add(new Bomb(screenX*(float)1.90,screenX*(float)2.00,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					5000,System.currentTimeMillis()-3000));																					//��ź 23
			//
			tempList.add(new Bomb(screenX*(float)2.00,screenX*(float)2.10,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-2500));																					//��ź 24
			tempList.add(new Bomb(screenX*(float)2.10,screenX*(float)2.20,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-2000));																					//��ź 25
			tempList.add(new Bomb(screenX*(float)2.20,screenX*(float)2.30,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 26
			tempList.add(new Bomb(screenX*(float)2.30,screenX*(float)2.40,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 27
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.08,screenY*(float)0.20,screenX,screenY,
					3000,System.currentTimeMillis()-500));																					//��ź 28
			//
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.28,screenY*(float)0.40,screenX,screenY,
					3000,System.currentTimeMillis()-1000));																					//��ź 29
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-2000));																					//��ź 30
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-2500));																					//��ź 31
			tempList.add(new Bomb(screenX*(float)2.40,screenX*(float)2.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					10000,System.currentTimeMillis()-5000));																				//��ź 32
			
			//
			tempList.add(new Bomb(screenX*(float)2.50,screenX*(float)2.60,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					4000,System.currentTimeMillis()-100));																					//��ź 33
			tempList.add(new Bomb(screenX*(float)2.60,screenX*(float)2.70,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					4000,System.currentTimeMillis()-200));																					//��ź 34
			tempList.add(new Bomb(screenX*(float)2.70,screenX*(float)2.80,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					4000,System.currentTimeMillis()-300));																					//��ź 35
			tempList.add(new Bomb(screenX*(float)2.80,screenX*(float)2.90,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					4000,System.currentTimeMillis()-400));																					//��ź 36
			tempList.add(new Bomb(screenX*(float)2.90,screenX*(float)3.00,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					4000,System.currentTimeMillis()-500));																					//��ź 37
			//
			tempList.add(new Bomb(screenX*(float)3.10,screenX*(float)3.20,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 38
			tempList.add(new Bomb(screenX*(float)3.20,screenX*(float)3.30,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 39
			tempList.add(new Bomb(screenX*(float)3.30,screenX*(float)3.40,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 40
			tempList.add(new Bomb(screenX*(float)3.40,screenX*(float)3.50,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 41
			tempList.add(new Bomb(screenX*(float)3.50,screenX*(float)3.60,screenY*(float)0.68,screenY*(float)0.80,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 42
			//
			tempList.add(new Bomb(screenX*(float)3.70,screenX*(float)3.80,screenY*(float)0.58,screenY*(float)0.70,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 43
			tempList.add(new Bomb(screenX*(float)3.80,screenX*(float)3.90,screenY*(float)0.58,screenY*(float)0.70,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 44
			tempList.add(new Bomb(screenX*(float)3.90,screenX*(float)4.00,screenY*(float)0.58,screenY*(float)0.70,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 45
			tempList.add(new Bomb(screenX*(float)4.00,screenX*(float)4.10,screenY*(float)0.58,screenY*(float)0.70,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 46
			tempList.add(new Bomb(screenX*(float)4.10,screenX*(float)4.20,screenY*(float)0.58,screenY*(float)0.70,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 47
			tempList.add(new Bomb(screenX*(float)4.20,screenX*(float)4.30,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 48
			tempList.add(new Bomb(screenX*(float)4.30,screenX*(float)4.40,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 49
			tempList.add(new Bomb(screenX*(float)4.40,screenX*(float)4.50,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 50
			tempList.add(new Bomb(screenX*(float)4.50,screenX*(float)4.60,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 51
			tempList.add(new Bomb(screenX*(float)4.60,screenX*(float)4.70,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 52
			tempList.add(new Bomb(screenX*(float)4.70,screenX*(float)4.80,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-3000));																					//��ź 53
			tempList.add(new Bomb(screenX*(float)4.80,screenX*(float)4.90,screenY*(float)0.48,screenY*(float)0.60,screenX,screenY,
					3000,System.currentTimeMillis()-1500));																					//��ź 54
							
			break;
		case 4:
			tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // ���� ������ �ȵǴ� ����
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
			tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //���� ������ �ȵǴ� ����
			tempList.add(new Flat(-screenX*(float)0.06,screenX*(float)0.6,screenY*(float)0.83,screenY*(float)0.84,screenX,screenY));
			tempList.add(new Spike(screenX*(float)0.30,screenX*(float)0.35,screenY*(float)0.81,screenY*(float)0.84,1,screenX,screenY));
			tempList.add(new Flat(screenX*(float)0.3,screenX*(float)0.35,screenY*(float)0.41,screenY*(float)0.44,screenX,screenY));
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
			tempList.add(new Flag(screenX*(float)1.97,screenX*(float)2.00,screenY*(float)0.46,screenY*(float)0.50,screenX,screenY));// ���
			break;
		case 6 :
			tempList.add(new Wall(-screenX*100,-screenX*101,0,1,screenX,screenY)); // ���� ������ �ȵǴ� ����
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
			tempList.add(new Wall(99998,99999,0,1,screenX,screenY));      //���� ������ �ȵǴ� ����
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
			tempList.add(new Flag(screenX*(float)1.97,screenX*(float)2.00,screenY*(float)0.46,screenY*(float)0.50,screenX,screenY));// ���
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
		map = 500 / (object_Right_Sorted.get(object_Right_Sorted.size()-2).x2 - object_Left_Sorted.get(1).x1)  ;
	}
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawBitmap(bitmap_Map,-x * map, 0, paint);
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
		canvas.drawBitmap(bitmap_Left, (float)(screenX*0.05),(float)(screenY*0.85), paint);
		canvas.drawBitmap(bitmap_Right, (float)(screenX*0.25),(float)(screenY*0.85), paint);
	}
	public void recycleAll()
	{
		for(int i=0;i<object_Now.size();i++)
		{
			object_Now.get(i).recycle();
		}
		object_Now.clear();
		bitmap_Map.recycle();
		bitmap_Left.recycle();
		bitmap_Right.recycle();
	}
}