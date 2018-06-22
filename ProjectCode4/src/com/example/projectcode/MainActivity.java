package com.example.projectcode;

import com.example.projectcode.R;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.graphics.*;
import android.inputmethodservice.Keyboard.Key;

public class MainActivity extends Activity implements View.OnTouchListener
{
	MyGame game;
	Button startbutton;
	Context contextHandle;
	View.OnTouchListener listenerHandle;
	float screenX;
	float screenY;
	float touchX;
	int stage;
	boolean moveFlag;
	boolean gameFlag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		contextHandle = this;
		listenerHandle = this;
		moveFlag = false;
		gameFlag = false;
		touchX = -1;
		stage = 1;
		screenX = (float)getWindowManager().getDefaultDisplay().getWidth();
		screenY = (float)getWindowManager().getDefaultDisplay().getHeight();
		game = new MyGame(contextHandle,stage);
		game.start(contextHandle,screenX,screenY);
		menu();
	}
	public void clear()
	{
		stage++;
		setContentView(R.layout.stage_clear);
		TextView cleartext = (TextView)findViewById(R.id.clearText);
		cleartext.setText("Stage "+stage+" Clear!");
		startbutton = (Button)findViewById(R.id.clearbutton);
		startbutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				game = new MyGame(contextHandle,stage);
				game.setOnTouchListener(listenerHandle);
				gameFlag = true;
				game.start(contextHandle,screenX,screenY);
				setContentView(game);
			}
		});
	}
	public void menu()
	{
		setContentView(R.layout.activity_main);
		startbutton = (Button)findViewById(R.id.startbutton);
		game.recycleAll();
		startbutton.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				game = new MyGame(contextHandle,stage);
				game.setOnTouchListener(listenerHandle);
				gameFlag = true;
				game.start(contextHandle,screenX,screenY);
				setContentView(game);
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		if(!gameFlag)
			return true;
		if(game.clearFlag)
		{
			moveFlag = false;
			clear();
		}
		if(game.deadFlag)
		{
			moveFlag = false;
			menu();
		}
		if(game.deadFlag)
			menu();
		return false;
	}
	static final int MODE_TOUCH_PUSH   = 0,

		     MODE_TOUCH_MOVE   = 1,

		     MODE_TOUCH_POP   = 2,

		     INVALID_POINTER_ID  = -1,

		     SIZE_TOUCH_PACKET  = 20;




		public boolean onTouchEvent(final MotionEvent event) {
			if(!gameFlag)
				return true;
		 int  action = event.getAction();

		 int  touch_id; //��ġ �ĺ���

		 int  touch_mode; //��ġ ����, ����Ʈ�� MODE_TOUCH_POP�� �س��� ���ø� �˴ϴ�.
	
		 switch( action & MotionEvent.ACTION_MASK ){

		     case MotionEvent.ACTION_DOWN: {

		      touch_id = event.getPointerId(0);

		      touch_mode = MODE_TOUCH_PUSH;

		      touchX   = (int)event.getX();
		      if(touchX<screenX*(float)0.2)  // �����̵�
				{
					moveFlag = true;
					game.leftMoveFlag = true;
				}
				else if(touchX>screenX*(float)0.8) // �������̵�
				{
					moveFlag = true;
					game.rightMoveFlag = true;
				}
				else
				{
					if(game.myman.getV() == 0)
					{
						game.myman.startJump(screenY*(float)0.087);
					}
				}

		      //�� ������ ���ϴµ��� ����ϼ���.

		         break;

		     }

		     case MotionEvent.ACTION_CANCEL:	 return true;

		     case MotionEvent.ACTION_UP:{

		      touch_id = event.getPointerId(0);

		      touch_mode = MODE_TOUCH_POP;

		      touchX   = (int)event.getX();
		      if(touchX<screenX*(float)0.2)  // �����̵�
				{
					moveFlag = false;
					game.leftMoveFlag = false;
				}
				else if(touchX>screenX*(float)0.8) // �������̵�
				{
					moveFlag = false;
					game.rightMoveFlag = false;
				}

		      //�� ������ ���ϴµ��� ����ϼ���.

		         break;

		     }

		     case MotionEvent.ACTION_MOVE:{

		      for(int i=0;i<event.getPointerCount();++i){

		       int pointer_id = event.findPointerIndex(i);

		       if( pointer_id == INVALID_POINTER_ID ) continue;

		       touch_id = i;

		       touch_mode = MODE_TOUCH_MOVE;

		       touchX   = (int)event.getX();

		       //�� ������ ���ϴµ��� ����ϼ���.

		      }

		         break;

		     }

		     case MotionEvent.ACTION_POINTER_DOWN:{

		      int pointer_index = (action & MotionEvent.ACTION_POINTER_ID_MASK) >> MotionEvent.ACTION_POINTER_ID_SHIFT;

		      int pointer_id  = event.getPointerId(pointer_index);

		      if( pointer_id != INVALID_POINTER_ID ){

		       touch_id = pointer_index;

		       touch_mode = MODE_TOUCH_PUSH;

		       touchX   = (int)event.getX(pointer_id);
		       if(touchX<screenX*(float)0.2)  // �����̵�
				{
					moveFlag = true;
					game.leftMoveFlag = true;
				}
				else if(touchX>screenX*(float)0.8) // �������̵�
				{
					moveFlag = true;
					game.rightMoveFlag = true;
				}
				else
				{
					if(game.myman.getV() == 0)
					{
						game.myman.startJump(screenY*(float)0.087);
					}
				}

		       //�� ������ ���ϴµ��� ����ϼ���.

		      }

		      break;

		     }

		     case MotionEvent.ACTION_POINTER_UP:{

		      int pointer_index = (action & MotionEvent.ACTION_POINTER_ID_MASK) >> MotionEvent.ACTION_POINTER_ID_SHIFT;

		      int pointer_id  = event.getPointerId(pointer_index);

		      if( pointer_id != INVALID_POINTER_ID ){

		       touch_id = pointer_index;

		       touch_mode = MODE_TOUCH_POP;

		       touchX   = (int)event.getX(pointer_id);
		       if(touchX<screenX*(float)0.2)  // �����̵�
				{
					moveFlag = false;
					game.leftMoveFlag = false;
				}
				else if(touchX>screenX*(float)0.8) // �������̵�
				{
					moveFlag = false;
					game.rightMoveFlag = false;
				}

		       //�� ������ ���ϴµ��� ����ϼ���.

		      }

		         break;

		     }

		     default: 
		    	 break;

		 }
		 return true;

		}

}
