import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;


public class Sound extends Thread {
	private final int music;
	public Sound(int input)
	{
		music = input;
	}
	public int GetcurrentMusic()
	{
		return music;
	}
	@Override
	public void run()
	{
		Clip clip;
		File soundFile;
		if(music == 0)
        	soundFile = new File("RCT2_Summer.wav");
        else if(music == 1)
        	soundFile = new File("Under The Sea.wav");
        else
        	soundFile = new File("Curtain.wav");
        try
        {
        	AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        	AudioFormat audioFormat = audioInputStream.getFormat();
        	DataLine.Info info = new DataLine.Info(SourceDataLine.class,audioFormat);
        	SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
        	line.open(audioFormat);
        	line.start();
        	int nBytesRead = 0;
        	byte[] abData = new byte[128000];
        	while (nBytesRead != -1)
        	{
        		nBytesRead = audioInputStream.read(abData, 0, abData.length);
        		if (nBytesRead >= 0)
        		{
        			line.write(abData, 0, nBytesRead);
        		}
        	}
        	line.drain();
        	line.close();
        	audioInputStream.close();
        }
        catch (Exception e)
        {
         e.printStackTrace();
        }
	}
}
