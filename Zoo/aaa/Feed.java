import java.awt.Color;
import java.awt.Graphics2D;


public class Feed{
	protected double x;
	protected double y;
	protected Color color;
	protected Color reverseColor;
	public Feed(int inputX, int inputY)
	{
		x = inputX;
		y = inputY;
		color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		reverseColor = new Color(255-color.getRed(),255-color.getGreen(),255-color.getBlue());
	}
	public void draw(Graphics2D g2)
	{
		frame(g2);
	}
	private void frame(Graphics2D g2)
	{
		int x = (int)this.x;
		int y = (int)this.y;
		g2.setColor(color);
		g2.fillOval(x-10, y-10, 20, 20);
		g2.setColor(reverseColor);
		g2.drawOval(x-10, y-10, 20, 20);
	}
	public void moveAround()
	{
		if(y<470)
			y+=0.5;
	}
	public boolean touchSpace(double inputX,double inputY)
	{
		if(x-10 < inputX && inputX < x+10 && y-10 < inputY && inputY < y+10)
			return true;
		else
			return false;
	}
	public void setXY(double inputX, double inputY)
	{
			x = inputX;
			y = inputY;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
}
