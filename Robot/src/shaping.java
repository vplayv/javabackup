import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class shaping extends ColorNDraw implements myRobot
{
	private int r1, g1, b1, width, height, y1, y2;
	private String Selected;

	public shaping(int x1, int y1, int width, int height, int x2, int y2, int r1, int g1, int b1, String Selected)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.width = width;
		this.height = height;
		this.x2 = x2;
		this.y2 = y2;
		this.cl = cl;
		this.r1 = r1;
		this.g1 = g1;
		this.b1 = b1;
		this.Selected = Selected;
	}

	public void drawShape(Graphics g)
	{
		
		Graphics2D g2 = (Graphics2D) g;
		square = new Rectangle(x1, y1, width, height);
		circle = new Ellipse2D.Double(x1, y1, width, height);
		line = new Line2D.Double(x1, y1, x2, y2);
		cl = new Color(r1, g1, b1);
		draw(g2);
	}

	public shaping()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2)
	{
		
		if (Selected.equals("Square"))
		{
			g2.setColor(cl);
			g2.fill(square);
			g2.draw(square);
		}

		if (Selected.equals("Circle"))
		{
			g2.setColor(cl);
			g2.fill(circle);
			g2.draw(circle);
		}

		if (Selected.equals("Line"))
		{
			g2.setColor(cl);
			g2.fill(line);
			g2.draw(line);
		}

	}

	@Override
	public void move()
	{
		x1++;
		x2++;
	}

}
