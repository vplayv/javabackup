package com.jinglerun;

import java.io.IOException;


import android.os.Bundle;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
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
	int leftId;
	int rightId;
	int jumpId;
	int stage;
	boolean moveFlag;
	boolean gameFlag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		contextHandle = this;
		listenerHandle = this;
		moveFlag = false;
		gameFlag = false;
		touchX = -1;
		stage = 1;
		leftId = -1;
		rightId = -1;
		jumpId = -1;
		screenX = (float)getWindowManager().getDefaultDisplay().getWidth();
		screenY = (float)getWindowManager().getDefaultDisplay().getHeight();
		try {
			game = new MyGame(contextHandle,stage);
			game.start(contextHandle,screenX,screenY);
			game.recycleFlag = true;
			menu();
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clear()
	{
		stage++;
		if(stage > 4)
		{
			setContentView(R.layout.all_clear);
			game.recycleAll();
			Button btn = (Button)findViewById(R.id.clear_all_button);
			btn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					finish();
				}
			});
			return;
		}
		else
		{
			setContentView(R.layout.stage_clear);
			TextView cleartext = (TextView)findViewById(R.id.clearText);
			cleartext.setText("Stage "+(stage-1)+" Clear!");
			startbutton = (Button)findViewById(R.id.clearbutton);
			game.recycleAll();
			startbutton.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					game = new MyGame(contextHandle,stage);
					game.setOnTouchListener(listenerHandle);
					gameFlag = true;
					try {
						game.start(contextHandle,screenX,screenY);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					setContentView(game);
				}
			});
		}
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
				try {
					game.start(contextHandle,screenX,screenY);
				} catch (IllegalStateException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
			gameFlag = false;
			clear();
		}
		if(game.deadFlag)
		{
			moveFlag = false;
			gameFlag = false;
			menu();
		}
		return false;
	}
	static final int pushState   = 0,

		     moveState   = 1,

		     popState   = 2,

		     INVALID_POINTER_ID  = -1;




		public boolean onTouchEvent(final MotionEvent event) {
			try {
			if(!gameFlag)
				return true;
		 int  action = event.getAction();

		 int  touch_id;

		 int  touch_mode; 
	
		 switch( action & MotionEvent.ACTION_MASK ){

		     case MotionEvent.ACTION_DOWN: {

		      touch_id = event.getPointerId(0);

		      touch_mode = pushState;

		      touchX   = (int)event.getX();
		      if(touchX<screenX*(float)0.2)  // 왼쪽이동
				{
					moveFlag = true;
					game.leftMoveFlag = true;
					leftId = touch_id;
				}
				else if(touchX>screenX*(float)0.8) // 오른쪽이동
				{
					moveFlag = true;
					game.rightMoveFlag = true;
					rightId = touch_id;
				}
				else
				{
					if(game.myman.getV() == 0)
					{
						jumpId = touch_id;
						game.jumpFlag = true;
						game.sound.run(0);
						game.myman.startJump(screenY*(float)0.06);
					}
				}


		         break;

		     }

		     case MotionEvent.ACTION_CANCEL:

		     case MotionEvent.ACTION_UP:{

		      touch_id = event.getPointerId(0);

		      touch_mode = popState;

		      touchX   = (int)event.getX();
		      if(touchX<screenX*(float)0.2)  // 왼쪽이동
				{
					moveFlag = false;
					game.leftMoveFlag = false;
					leftId = -1;
				}
				else if(touchX>screenX*(float)0.8) // 오른쪽이동
				{
					moveFlag = false;
					game.rightMoveFlag = false;
					rightId = -1;
				}
				else
				{
					if(touch_id == jumpId)
					jumpId = -1;
					if(touch_id == rightId)
					{
						moveFlag = false;
						game.rightMoveFlag = false;
						rightId = -1;
					}
					if(touch_id == leftId)
					{
						moveFlag = false;
						game.leftMoveFlag = false;
						leftId = -1;
					}
				}


		         break;

		     }

		     case MotionEvent.ACTION_MOVE:{
		       touch_id = event.getPointerId(0);
		       touch_mode = moveState;

		       touchX   = (int)event.getX();
		       
		       if(touchX<screenX*(float)0.2)  // 왼쪽이동
				{
					moveFlag = true;
					game.leftMoveFlag = true;
					leftId = touch_id;
				}
				else if(touchX>screenX*(float)0.8) // 오른쪽이동
				{
					moveFlag = true;
					game.rightMoveFlag = true;
					rightId = touch_id;
				}
				else
				{
					if(jumpId == rightId)
					{
						rightId = -1;
						moveFlag = false;
						game.rightMoveFlag = false;
					}
					if(touch_id == jumpId) break;
					if(touch_id == rightId)
					{
						rightId = -1;
						moveFlag = false;
						game.rightMoveFlag = false;
					}
					if(touch_id == leftId)
					{
						leftId = -1;
						moveFlag = false;
						game.leftMoveFlag = false;
					}
				}

		      }

		         break;

		     //}

		     case MotionEvent.ACTION_POINTER_DOWN:{
		      int pointer_index = (action & MotionEvent.ACTION_POINTER_ID_MASK) >> MotionEvent.ACTION_POINTER_ID_SHIFT;

		      int pointer_id  = event.getPointerId(pointer_index);

		      if( pointer_id != INVALID_POINTER_ID ){

		       touch_id = pointer_index;
		       touch_mode = pushState;
		       
		       touchX   = (int)event.getX(pointer_id);
		       if(touchX<screenX*(float)0.2)  // 왼쪽이동
				{
					moveFlag = true;
					game.leftMoveFlag = true;
					leftId = touch_id;
				}
				else if(touchX>screenX*(float)0.8) // 오른쪽이동
				{
					moveFlag = true;
					game.rightMoveFlag = true;
					rightId = touch_id;
				}
				else
				{
					if(game.myman.getV() == 0)
					{
						jumpId = touch_id;
						game.jumpFlag = true;
						game.sound.run(0);
						game.myman.startJump(screenY*(float)0.06);
					}
				}


		      }

		      break;

		     }

		     case MotionEvent.ACTION_POINTER_UP:{

		      int pointer_index = (action & MotionEvent.ACTION_POINTER_ID_MASK) >> MotionEvent.ACTION_POINTER_ID_SHIFT;

		      int pointer_id  = event.getPointerId(pointer_index);

		      if( pointer_id != INVALID_POINTER_ID ){
		       touch_id = pointer_index;

		       touch_mode = popState;

		       touchX   = (int)event.getX(pointer_id);
		       if(touchX<screenX*(float)0.2)  // 왼쪽이동
				{
					moveFlag = false;
					game.leftMoveFlag = false;
					leftId = -1;
				}
				else if(touchX>screenX*(float)0.8) // 오른쪽이동
				{
					moveFlag = false;
					game.rightMoveFlag = false;
					rightId = -1;
				}
				else
				{
					if(touch_id == jumpId)
					jumpId = -1;
					if(touch_id == rightId)
					{
						moveFlag = false;
						game.rightMoveFlag = false;
						rightId = -1;
					}
					if(touch_id == leftId)
					{
						moveFlag = false;
						game.leftMoveFlag = false;
						leftId = -1;
					}
				}

		      }

		         break;

		     }

		     default: 
		    	 break;

		 }
		 return true;
	        } 
		catch (IllegalArgumentException ex) {
	            leftId = -1;
	            rightId = -1;
	            moveFlag = false;
	            game.leftMoveFlag = false;
	            game.rightMoveFlag = false;
	        }
			return true;
	}
		@Override
		public void onPause()
		{
			super.onPause();
			if(game.sound != null)
			game.sound.stop();
			game.leftMoveFlag = false;
			game.rightMoveFlag = false;
		}
		@Override
		public void onResume()
		{
			super.onResume();
			if(game.sound != null)
				try {
					game.sound.resume();
				} catch (IllegalStateException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}
