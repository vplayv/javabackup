import javax.swing.JFrame;
public class ZooMain {
	public static void main(String []args){
		JFrame myFrame = new JFrame();
		myFrame.setSize(800,800);
		myFrame.setTitle("«Ÿ≤‹¿Î");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(new  MyZoo());
		myFrame.setVisible(true);
	}
}
