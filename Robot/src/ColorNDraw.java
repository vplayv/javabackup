import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class ColorNDraw extends JPanel
{
	public int width, height, x1, y1, x2 = 0, y2, r1, g1, b1, mpx, mpy, mrx,
			mry;;
	public int delay = 100;
	public String Selected = "0";
	public Rectangle square;
	public Ellipse2D.Double circle;
	public Color cl;
	public Line2D.Double line;
	public Timer tm;
	public int set = 0;
	public ArrayList<shaping> shapes = new ArrayList<shaping>();
	public ArrayList<String> codes = new ArrayList<String>();
	int x=0, y=0, z=0;

	JLabel label1 = new JLabel("R");
	JLabel label2 = new JLabel("G");
	JLabel label3 = new JLabel("B");
	JTextField red = new JTextField(3);
	JTextField green = new JTextField(3);
	JTextField blue = new JTextField(3);
	JComboBox box = new JComboBox();
	JButton button = new JButton("Move my Robot");

	public ColorNDraw()
	{
		setLayout(new BorderLayout());

		box.addItem("Square");
		box.addItem("Circle");
		box.addItem("Line");
		box.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				
				r1 = Integer.parseInt(red.getText());
				g1 = Integer.parseInt(green.getText());
				b1 = Integer.parseInt(blue.getText());
				Selected = (String) box.getSelectedItem();
				
				addMouseListener(new MouseListener()
				{

					@Override
					public void mousePressed(MouseEvent e1)
					{
						mpx = e1.getX();
						mpy = e1.getY();
						System.out.println("Press");
					}

					@Override
					public void mouseReleased(MouseEvent e2)
					{
						System.out.println("Release");
						mrx = e2.getX();
						mry = e2.getY();
						if (mrx > mpx&& (Selected.equals("Square") || Selected.equals("Circle")))
						{
							width = mrx - mpx;
							x1 = mpx;
							x2 = mrx;
						} else
						{
							width = mpx - mrx;
							x1 = mrx;
							x2 = mpx;
						}
						if (mry > mpy&& (Selected.equals("Square") || Selected.equals("Circle")))
						{
							height = mry - mpy;
							y1 = mpy;
							y2 = mry;
						} else
						{
							height = mpy - mry;
							y1 = mry;
							y2 = mpy;
						}
						if (Selected.equals("Line"))
						{
							x1 = mpx;
							x2 = mrx;
							y1 = mpy;
							y2 = mry;
						}

						repaint();
					}

					@Override
					public void mouseClicked(MouseEvent arg0)
					{
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseEntered(MouseEvent arg0)
					{
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseExited(MouseEvent arg0)
					{
						// TODO Auto-generated method stub

					}

				});
			}

		});
		tm = new Timer(delay, new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				set = 1;
				for (shaping shape : shapes)
				{
					shape.move();
				}
				repaint();
			}

		});
		button.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Check1");
				for(int i = 0 ; i < codes.size() ; i++)
				{
					System.out.println(codes.get(i));
				}

				
				tm.start();
			}

		});
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(label1);
		p1.add(red);
		p1.add(label2);
		p1.add(green);
		p1.add(label3);
		p1.add(blue);
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3, 1));
		p2.add(p1);
		p2.add(box);
		p2.add(button);
		add(p2, BorderLayout.SOUTH);
		setVisible(true);
		
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		if (set == 1)
		{
			super.paintComponent(g);
			
			drawShape(g);

			for (shaping shape : shapes)
			{
				shape.drawShape(g2);
			}
		}
		if (set == 0)
		{
			drawShape(g);
		}
	}

	public void drawShape(Graphics g)
	{
		
		
		Graphics2D g2 = (Graphics2D) g;
		square = new Rectangle(x1, y1, width, height);
		circle = new Ellipse2D.Double(x1, y1, width, height);
		line = new Line2D.Double(x1, y1, x2, y2);
		cl = new Color(r1, g1, b1);

		if (Selected.equals("Square") && x2 != 0)
		{
			System.out.println("square");
			g2.setColor(cl);
			g2.fill(square);
			g2.draw(square);
			shapes.add(new shaping(x1, y1, width, height, x2, y2, r1, g1, b1,Selected));
			codes.add("Rectangle "+"rec"+x+" = new Rectangle("+x1+","+y1+","+width+","+height+");\n");
			codes.add("g2.setColor(new Color("+r1+","+g1+","+b1+");\n");
			codes.add("g2.fill"+"(rec"+x+");\n");
			codes.add("g2.draw"+"(rec"+x+");\n");
			x++;
			x2 = 0;
		}

		if (Selected.equals("Circle") && x2 != 0)
		{
			System.out.println("circle");
			g2.setColor(cl);
			g2.fill(circle);
			g2.draw(circle);
			shapes.add(new shaping(x1, y1, width, height, x2, y2, r1, g1, b1,Selected));
			codes.add("Ellipse2D.Double "+"circle"+y+" = new Ellipse2D.Double("+x1+","+y1+","+width+","+height+");\n");
			codes.add("g2.setColor(new Color("+r1+","+g1+","+b1+");\n");
			codes.add("g2.fill"+"(circle"+y+");\n");
			codes.add("g2.draw"+"(circle"+y+");\n");
			y++;
			x2 = 0;
		}

		if (Selected.equals("Line") && x2 != 0)
		{
			System.out.println("line");
			g2.setColor(cl);
			g2.fill(line);
			g2.setStroke(new BasicStroke(7));
			g2.draw(line);
			shapes.add(new shaping(x1, y1, width, height, x2, y2, r1, g1, b1,Selected));
			codes.add("Line2D.Double "+"line"+z+" = new Line2D.Double("+x1+","+y1+","+x2+","+height+");\n");
			codes.add("g2.setColor(new Color("+r1+","+g1+","+b1+");\n");
			codes.add("g2.fill"+"(line"+z+");\n");
			codes.add("g2.setStroke(new BasicStroke(7));\n");
			codes.add("g2.draw"+"(line"+z+");\n");
			z++;
			x2 = 0;
		}
	}
}
