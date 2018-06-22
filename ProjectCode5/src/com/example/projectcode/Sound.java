package com.example.projectcode;

import java.io.IOException;
import java.util.ArrayList;

import android.content.Context;
import android.media.MediaPlayer;

public class Sound extends Thread{
	private ArrayList<MediaPlayer> list;
	private MyGame handle;
	public static boolean runable;
	public Sound(Context chandle,MyGame handle)
	{
		super();
		this.handle = handle;
		runable = true;
		list = new ArrayList<MediaPlayer>();
		list.add(MediaPlayer.create(chandle,R.raw.bomb));
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(runable)
		{
			try {
				if(handle.jumpFlag)
				{
					handle.jumpFlag = false;
					if(list.get(0).isPlaying())
					{
						list.get(0).stop();
						list.get(0).prepare();
						list.get(0).start();
					}
					else
						list.get(0).start();
					break;
				}
			}
			catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
