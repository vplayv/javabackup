package MyRobot;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.Timer;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class MyHomework2 extends JPanel implements MyRobot{
	private static final long serialVersionUID = 1L;
	JComboBox<String> ShapeCombobox;//JComBoBox : Shape
	JButton MoveJButton;//JButton : Move
	JRadioButton RedButton, GreenButton, BlueButton;//JRadioButton : Color
	ButtonGroup group;//JRadioButton Group
	String ColorRadio = "",ShapeCombox = "";//String Color,Shape
	ColorSelected c1;//Selected ActionListener Color
	ShapeSelected s1;//Selected ActionListener Shape
	Color SelectedColor;//Color Type
	int XAxis1,YAxis1,XAxis2,YAxis2;//Axis
	SelectedAxis m1;//Mouse Listener
	MyHomework2Component ComponentList;//Class Component
	int ListNum = 0;//Number of List
	double EllipseWidth,  EllipseHeight;//Ellipse Height,Width
	double RectangleWidth, RectangleHeight;//Rectangle Height, Width
	ArrayList<Object> ObjectList;//Object ArrayList
	Box sizeBox;//JRadioButton Box 
	Graphics2D g1;//Graphics2D		
	Graphics g2;//Graphics
	final int DELAY = 300;//Time Delay
	TimerListener t1;//Time ActionListener
	Timer Time1;//Timer Class
	Line2D.Double MyLine, nowLine;//Line
	Rectangle Mybox, nowRectangle;//Rectangle
	Ellipse2D.Double MyEllipse, nowEllipse;//Ellipse
	int TimeLimit = 1;//Time Limit
	boolean MoveOn = false;//paint Boolean
	MyHomework2(){//constructor
		ObjectList = new ArrayList<Object>();
		MoveJButton = new JButton("Move Robot");
		RedButton = new JRadioButton("Red");
		GreenButton = new JRadioButton("Green");
		BlueButton = new JRadioButton("Blue");
		ShapeCombobox = new JComboBox<String>();
		ComponentList = new MyHomework2Component();
		t1 = new TimerListener();
		m1 = new SelectedAxis();
		c1 = new ColorSelected();								  
		s1 = new ShapeSelected(); 
		Time1= new Timer(DELAY, t1);
		ShapeCombobox.addItem("Line");
		ShapeCombobox.addItem("Rectangle");
		ShapeCombobox.addItem("Ellipse");
		group = new ButtonGroup(); 
		group.add(RedButton); 
		group.add(GreenButton); 
		group.add(BlueButton);
		sizeBox = Box.createVerticalBox();
		sizeBox.add(RedButton);
		sizeBox.add(GreenButton);
		sizeBox.add(BlueButton);
		sizeBox.setBorder(BorderFactory.createTitledBorder("Color"));
		sizeBox.setLocation(500, 100);
		this.setLayout(new BorderLayout());
		RedButton.addActionListener(c1);
		GreenButton.addActionListener(c1);
		BlueButton.addActionListener(c1);
		ShapeCombobox.addActionListener(s1);
		MoveJButton.addActionListener(t1);
		this.addMouseListener(m1);
		add(ShapeCombobox,BorderLayout.NORTH);
		add(MoveJButton, BorderLayout.SOUTH);
		add(sizeBox, BorderLayout.WEST);
		add(ComponentList);
	}
	public class MyHomework2Component extends JPanel {
		private static final long serialVersionUID = 1L;
		MyHomework2Component(){}
		public void paintComponent(Graphics g){
			if(XAxis1 != 0 && XAxis1 != 0 && YAxis1 != 0 && YAxis1 != 1){
			super.paintComponent(g);
			g1=(Graphics2D)g;
			for(int i = 0 ; i < ObjectList.size() ; i = i+2){
				if(ObjectList.get(i) instanceof Line2D.Double ){
					g1.setColor((Color)ObjectList.get(i+1));
					g1.draw((Line2D.Double)ObjectList.get(i));
				}
				else if(ObjectList.get(i) instanceof Rectangle){
					g1.setColor((Color)ObjectList.get(i+1));
					g1.fill((Rectangle)ObjectList.get(i));
					g1.draw((Rectangle)ObjectList.get(i));
				}
				else if(ObjectList.get(i) instanceof Ellipse2D.Double){
					g1.setColor((Color)ObjectList.get(i+1));
					g1.fill((Ellipse2D.Double)ObjectList.get(i));
					g1.draw((Ellipse2D.Double)ObjectList.get(i));
				}
			}
			if(ColorRadio == "Red"){
				SelectedColor = new Color(255,0,0);
			}
			else if(ColorRadio == "Green"){
				SelectedColor = new Color(0,255,0);
			}
			else if(ColorRadio ==  "Blue"){
				SelectedColor = new Color(0,0,255);
			}
			
			if(ShapeCombox =="Line"){
				Color nowColor = SelectedColor;
				MyLine = new Line2D.Double();
				MyLine.setLine(XAxis1, YAxis1, XAxis2, YAxis2);//¼± À§Ä¡
				g1.setColor(nowColor);
				g1.draw(MyLine);
				ObjectList.add((Object)MyLine);
				ObjectList.add((Object)nowColor);
			}
			else if(ShapeCombox =="Rectangle"){
				Color nowColor = SelectedColor;
				Mybox = new Rectangle();
				Mybox.setRect(XAxis1, YAxis1, RectangleWidth,  RectangleHeight);
				g1.setColor(nowColor);
				g1.fill(Mybox);
				g1.draw(Mybox);
				ObjectList.add((Object)Mybox);
				ObjectList.add((Object)nowColor);
			}
			else if(ShapeCombox =="Ellipse"){
				Color nowColor = SelectedColor;
				MyEllipse = new Ellipse2D.Double();
				MyEllipse.setFrame(XAxis1,YAxis1, EllipseWidth ,EllipseHeight);
				g1.setColor(nowColor);
				g1.fill(MyEllipse);
				g1.draw(MyEllipse);
				ObjectList.add((Object)MyEllipse);
				ObjectList.add((Object)nowColor);
				}
			XAxis1 = 0;
			YAxis1 = 0;
			XAxis2 = 0;
			YAxis2 = 0;
		
			}
			else if(MoveOn){
				super.paintComponent(g);
				g1=(Graphics2D)g;
				repaint();
				for(int i = 0 ; i < ObjectList.size() ; i = i+2){
					if(ObjectList.get(i) instanceof Line2D.Double ){
						g1.setColor((Color)ObjectList.get(i+1));
						g1.draw((Line2D.Double)ObjectList.get(i));
					}
					else if(ObjectList.get(i) instanceof Rectangle){
						g1.setColor((Color)ObjectList.get(i+1));
						g1.fill((Rectangle)ObjectList.get(i));
						g1.draw((Rectangle)ObjectList.get(i));
					}
					else if(ObjectList.get(i) instanceof Ellipse2D.Double){
						g1.setColor((Color)ObjectList.get(i+1));
						g1.fill((Ellipse2D.Double)ObjectList.get(i));
						g1.draw((Ellipse2D.Double)ObjectList.get(i));
					}
				}
				XAxis1 = 0;
				YAxis1 = 0;
				XAxis2 = 0;
				YAxis2 = 0;
			
			}
		}
		
		
	}
	
	class ColorSelected implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(RedButton.isSelected()){
				ColorRadio="Red";
			}
			else if(GreenButton.isSelected()){
				ColorRadio="Green";
			}
			else if(BlueButton.isSelected()){
				ColorRadio="Blue";
			}
		}
	}
	public class ShapeSelected implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if("Line" == ShapeCombobox.getSelectedItem()){
				ShapeCombox="Line";
			}
			else if("Rectangle" == ShapeCombobox.getSelectedItem()){
				ShapeCombox="Rectangle";
			}
			else if("Ellipse" == ShapeCombobox.getSelectedItem()){
				ShapeCombox="Ellipse";
			}
		}
	}
	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g1 = g;
		ComponentList.paintComponent(g1);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < ObjectList.size() ; i = i+2){
			if(ObjectList.get(i) instanceof Line2D.Double ){
				nowLine = new Line2D.Double();
				nowLine = (Line2D.Double) ObjectList.get(i);
				nowLine.setLine(nowLine.getX1()+5, nowLine.getY1(), nowLine.getX2()+5, nowLine.getY2());
				ObjectList.set(i,(Object)nowLine);
			}
			else if(ObjectList.get(i) instanceof Rectangle){
				nowRectangle = (Rectangle) ObjectList.get(i);
				nowRectangle.setRect(nowRectangle.getX()+5, nowRectangle.getY(), nowRectangle.getWidth(), nowRectangle.getHeight());
				ObjectList.set(i,(Object)nowRectangle);
			}
			else if(ObjectList.get(i) instanceof Ellipse2D.Double){
				nowEllipse = new Ellipse2D.Double();
				nowEllipse = (Ellipse2D.Double)ObjectList.get(i);
				nowEllipse.setFrame(nowEllipse.getX()+5, nowEllipse.getY(), nowEllipse.getWidth(), nowEllipse.getHeight());
				ObjectList.set(i,(Object)nowEllipse);
			}
		}
	}
	class TimerListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(TimeLimit ==1){ Time1.start(); TimeLimit = 0; MoveOn = true;}
			draw(g1);
			move();
			}
	}
	public class SelectedAxis implements MouseListener{
		@Override public void mouseClicked(MouseEvent arg0) {System.out.println("Click");}// TODO Auto-generated method stub
		@Override public void mouseEntered(MouseEvent arg0) {}// TODO Auto-generated method stub}
		@Override public void mouseExited(MouseEvent arg0) {}// TODO Auto-generated method stub
		@Override 
		public void mousePressed(MouseEvent arg0) {
			if(ShapeCombox == "Line"){
				XAxis1 = arg0.getX() -63;
				YAxis1 = arg0.getY() -28;
			}
			else if(ShapeCombox == "Rectangle")
			{
				XAxis1 = arg0.getX() -63;
				YAxis1 = arg0.getY() -28;
			}
			else if(ShapeCombox == "Ellipse")
			{
				XAxis1 = arg0.getX() -63;
				YAxis1 = arg0.getY() -28;
			}
		}// TODO Auto-generated method stub	
		@Override 
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			if(ShapeCombox == "Line"){
				XAxis2 = arg0.getX() - 63;
				YAxis2 = arg0.getY() - 28;
				ListNum++;
				repaint();
			}
			else if(ShapeCombox == "Rectangle")
			{
				XAxis2 = arg0.getX() -63;
				YAxis2 = arg0.getY() -28;
				RectangleWidth = XAxis2 - XAxis1;
				RectangleHeight = YAxis2 - YAxis1;
				ListNum++;
				repaint();
			}
			else if(ShapeCombox == "Ellipse")
			{
				XAxis2 = arg0.getX() -63;
				YAxis2 = arg0.getY() -28;
				EllipseWidth = XAxis2 - XAxis1;
				EllipseHeight = YAxis2 - YAxis1;
				ListNum++;
				repaint();
			}
		}
	}
}


