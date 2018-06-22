import javax.swing.*;

public class RobotFrame
{
	public RobotFrame()
	{
		JFrame jf = new JFrame();
		jf.setSize(300,500);
		jf.setTitle("Draw Robot");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorNDraw cd = new ColorNDraw();
		jf.add(cd);
		jf.setVisible(true);
	}

}
