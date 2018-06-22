package MyRobot;
import javax.swing.JFrame;
public class MyHomework2Frame {
	public static void main(String []args){
		JFrame myFrame = new JFrame();
		myFrame.setSize(800,800);
		myFrame.setTitle("20132393 가반 유영근");
		myFrame.add(new MyHomework2());
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}
