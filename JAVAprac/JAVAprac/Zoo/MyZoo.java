import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyZoo extends JPanel implements MouseListener,MouseMotionListener,ActionListener
{
	ArrayList<Animal> animal = new ArrayList();
	ArrayList<Feed> feed = new ArrayList();
	private final Sequencer sequencer = null;
	private final Sequence sequence = null;
	final int frameTime = 50;
	JComboBox comboBox;
	JPanel panel;
	JPanel panel2;
	JButton button;
	JButton button2;
	Container con;
	JFrame frame;
	Image img;
	Image clearImg;
	Toolkit tk;
	int start_X;
	int start_Y;
	int finish_X;
	int finish_Y;
	int error_X;
	int error_Y;
	int draggedAnimal;
	int draggedFeed;
	int music;
	boolean moveFlag;
	boolean feedremoveFlag;
	boolean clearFlag;
	long clearTime1;
	long clearTime2;
	Sound sound;
	public MyZoo()
	{
		music = 0;
		tk = Toolkit.getDefaultToolkit();
	    img= tk.getImage("Aqua.jpg");
	    clearImg = tk.getImage("Curtain.jpg");
	    sound = new Sound(0);
	    sound.start();
		start_X = 0;
		start_Y = 0;
		finish_X = 0;
		finish_Y = 0;
		error_X = -5;
		error_Y = -60;
		draggedAnimal = -1;
		draggedFeed = -1;
		clearFlag = false;
		moveFlag = false;
		feedremoveFlag = false;
		comboBox = new JComboBox();
		frame = new JFrame();
		con = frame.getContentPane();
		comboBox.addItem("HeadFish");
		comboBox.addItem("Octopus");
		comboBox.addItem("Puffer");
		comboBox.addItem("Tuna");
		comboBox.addItem("Dolphin");
		comboBox.addItem("Turtle");
		comboBox.addItem("Eraser");
		comboBox.addItem("Feed");
		panel = new JPanel();
		panel2 = new JPanel();
		button = new JButton("                  Music!                  ");
		button2 = new JButton("Clear");
		con.setLayout(new BorderLayout());
		panel.add(comboBox);
		panel.add(button2);
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
		panel2.add(button);
		//add(panel);
		con.add(panel,BorderLayout.NORTH);
		con.add(panel2,BorderLayout.SOUTH);
		button.addActionListener(this);
		button2.addActionListener(this);
		comboBox.addActionListener(this);
		frame.setSize(600,600);
		frame.setTitle("Zoo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setVisible(true);
		while(true)
		{
			long a = System.currentTimeMillis();
			long b = System.currentTimeMillis();
			while(b-a<frameTime)
			{
				b = System.currentTimeMillis();
			}
			this.paintImmediately(0, 0, 600, 600);
		}
	}
	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.clearRect(0, 0, 600, 600);
		g2.drawImage(img, 0, 0, 600, 600, this);
		if(music == 0)
			for(int i=0;i<animal.size();i++)
			{
				animal.get(i).draw(g2);
				if(!clearFlag)
					animal.get(i).moveAround();
			}
		else
		{
			for(int i=0;i<animal.size();i++)
				animal.get(i).draw(g2);
		}
		for(int i=0;i<feed.size();i++)
		{
			feed.get(i).draw(g2);
			if(!clearFlag)
				feed.get(i).moveAround();
			if(!feedremoveFlag)
			{
				for(int j=animal.size()-1;j>=0;j--)
				{
					animal.get(j).targetFeed(i, feed.get(i).getX(), feed.get(i).getY());
					if(animal.get(j).targetToMouth(feed.get(i).getX(), feed.get(i).getY()))
					{
						feed.remove(i);
						feedremoveFlag = true;
						for(int k=animal.size()-1;k>=0;k--)
						{
							if(animal.get(k).getTarget() == i)
								animal.get(k).targetFeed(-1,0,0);
						}
						i--;
						draggedFeed = -1;
						break;
					}
				}
			}
		}
		feedremoveFlag = false;
		if(clearFlag)
			clearFrame(g2);
	}
	private void clearFrame(Graphics2D g2) {
		clearTime2 = System.currentTimeMillis();
		if(clearTime2-clearTime1 < 50 || clearTime2-clearTime1 > 2450)
			g2.drawImage(clearImg, 0, -570, 600, 600, this);
		else if(clearTime2-clearTime1 < 100 || clearTime2-clearTime1 > 2400)
			g2.drawImage(clearImg, 0, -540, 600, 600, this);
		else if(clearTime2-clearTime1 < 150 || clearTime2-clearTime1 > 2350)
			g2.drawImage(clearImg, 0, -510, 600, 600, this);
		else if(clearTime2-clearTime1 < 200 || clearTime2-clearTime1 > 2300)
			g2.drawImage(clearImg, 0, -480, 600, 600, this);
		else if(clearTime2-clearTime1 < 250 || clearTime2-clearTime1 > 2250)
			g2.drawImage(clearImg, 0, -450, 600, 600, this);
		else if(clearTime2-clearTime1 < 300 || clearTime2-clearTime1 > 2200)
			g2.drawImage(clearImg, 0, -420, 600, 600, this);
		else if(clearTime2-clearTime1 < 350 || clearTime2-clearTime1 > 2150)
			g2.drawImage(clearImg, 0, -390, 600, 600, this);
		else if(clearTime2-clearTime1 < 400 || clearTime2-clearTime1 > 2100)
			g2.drawImage(clearImg, 0, -360, 600, 600, this);
		else if(clearTime2-clearTime1 < 450 || clearTime2-clearTime1 > 2050)
			g2.drawImage(clearImg, 0, -330, 600, 600, this);
		else if(clearTime2-clearTime1 < 500 || clearTime2-clearTime1 > 2000)
			g2.drawImage(clearImg, 0, -300, 600, 600, this);
		else if(clearTime2-clearTime1 < 550 || clearTime2-clearTime1 > 1950)
			g2.drawImage(clearImg, 0, -270, 600, 600, this);
		else if(clearTime2-clearTime1 < 600 || clearTime2-clearTime1 > 1900)
			g2.drawImage(clearImg, 0, -240, 600, 600, this);
		else if(clearTime2-clearTime1 < 650 || clearTime2-clearTime1 > 1850)
			g2.drawImage(clearImg, 0, -210, 600, 600, this);
		else if(clearTime2-clearTime1 < 700 || clearTime2-clearTime1 > 1800)
			g2.drawImage(clearImg, 0, -180, 600, 600, this);
		else if(clearTime2-clearTime1 < 750 || clearTime2-clearTime1 > 1750)
			g2.drawImage(clearImg, 0, -150, 600, 600, this);
		else if(clearTime2-clearTime1 < 800 || clearTime2-clearTime1 > 1700)
			g2.drawImage(clearImg, 0, -120, 600, 600, this);
		else if(clearTime2-clearTime1 < 850 || clearTime2-clearTime1 > 1650)
			g2.drawImage(clearImg, 0, -90, 600, 600, this);
		else if(clearTime2-clearTime1 < 900 || clearTime2-clearTime1 > 1600)
			g2.drawImage(clearImg, 0, -60, 600, 600, this);
		else if(clearTime2-clearTime1 < 950)
		{
			g2.drawImage(clearImg, 0, -30, 600, 600, this);
			sound.stop();
		}
		else if(clearTime2-clearTime1 > 1550)
		{
			g2.drawImage(clearImg, 0, -30, 600, 600, this);
			sound = new Sound(2);
			sound.start();
		}
		else
		{
			g2.drawImage(clearImg, 0, 0, 600, 600, this);
			if(animal.size()>0 || feed.size()>0)
			{
				for(int i = animal.size()-1; i>-1; i--)
					animal.remove(i);
				for(int i= feed.size()-1; i>-1; i--)
					feed.remove(i);
			}
		}
		if(clearTime2-clearTime1 >2500)
		{
			clearFlag = false;
			sound.stop();
			sound = new Sound(0);
			sound.start();
		}
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(music == 0)
		{
			if(comboBox.getSelectedItem() == "HeadFish")
				animal.add(new HeadFish(arg0.getX()+error_X,arg0.getY()+error_Y));
			else if(comboBox.getSelectedItem() == "Octopus")
				animal.add(new Octopus(arg0.getX() + error_X,arg0.getY() + error_Y));
			else if(comboBox.getSelectedItem() == "Feed")
				feed.add(new Feed(arg0.getX() + error_X,arg0.getY() + error_Y));
			else if(comboBox.getSelectedItem() == "Puffer")
				animal.add(new Puffer(arg0.getX() + error_X,arg0.getY() + error_Y));
			else if(comboBox.getSelectedItem() == "Tuna")
				animal.add(new Tuna(arg0.getX() + error_X,arg0.getY() + error_Y));
			else if(comboBox.getSelectedItem() == "Dolphin")
				animal.add(new Dolphin(arg0.getX() + error_X, arg0.getY() + error_Y));
			else if(comboBox.getSelectedItem() == "Turtle")
				animal.add(new Turtle(arg0.getX() + error_X,arg0.getY() + error_Y));
			else if(comboBox.getSelectedItem() == "Eraser")
			{
				start_X = arg0.getX()+error_X;
				start_Y = arg0.getY()+error_Y;
				for(int i = animal.size()-1;i>=0;i--)
				{
					if(animal.get(i).touchSpace(start_X, start_Y))
					{

						animal.remove(i);
						break;
					}
				}
			}
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {
		start_X = arg0.getX()+error_X;
		start_Y = arg0.getY()+error_Y;
		if(music == 0 && !clearFlag)
		{
			draggedAnimal = animal.size()-1;
			draggedFeed = feed.size()-1;
			if(draggedAnimal >= 0)
			{
				while(true)
				{
					if(animal.get(draggedAnimal).touchSpace(start_X, start_Y))
					{
						break;
					}
					if(draggedAnimal == 0)
					{
						draggedAnimal--;
						break;
					}
					draggedAnimal--;
				}
			}
			if(draggedFeed >= 0)
			{
				while(true)
				{
					if(feed.get(draggedFeed).touchSpace(start_X, start_Y))
					{
						break;
					}
					if(draggedFeed == 0)
					{
						draggedFeed--;
						break;
					}
					draggedFeed--;
				}
			}
			moveFlag = true;
		}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		if(draggedAnimal >= 0)
			draggedAnimal = -1;
		if(draggedFeed >= 0)
			draggedFeed = -1;
		moveFlag = false;
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		finish_X = arg0.getX()+error_X;
		finish_Y = arg0.getY()+error_Y;
		if(draggedFeed >= 0)
			feed.get(draggedFeed).setXY(finish_X, finish_Y);
		else if(draggedAnimal >= 0)
			animal.get(draggedAnimal).setXY(finish_X, finish_Y);
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == button && !clearFlag)
		{
			sound.stop();
			music = Math.abs(sound.GetcurrentMusic()-1);
			sound = new Sound(music);
			panel2.remove(button);
			if(music == 1)
				button = new JButton("                  Stop!                   ");
			else
				button = new JButton("                  Music!                  ");
			for(int i=animal.size()-1;i>=0;i--)
				animal.get(i).setDance();
			panel2.add(button);
			con.add(panel2,BorderLayout.SOUTH);
			button.addActionListener(this);
			//paintImmediately(0, 0, 600, 600);
		//	frame.setVisible(false);
			frame.setVisible(true);
			sound.start();
		}
		else if(arg0.getSource() == button2 && music == 0 && !clearFlag)
		{
			clearFlag = true;
			sound.stop();
			sound = new Sound(2);
			sound.start();
			clearTime1 = System.currentTimeMillis();
		}
	}
}
