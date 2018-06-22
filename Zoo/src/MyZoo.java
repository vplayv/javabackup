import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
//import javax.sound.midi.*;
//import javax.sound.sampled.*;
import javax.swing.*;
public class MyZoo extends JPanel implements MouseListener,MouseMotionListener,ActionListener
{
 ArrayList<Animal> animal = new ArrayList();
 //private Sequencer sequencer = null;
 //private Sequence sequence = null;
 final int frameTime = 50;
 JComboBox comboBox;
 JPanel panel;
 JPanel panel2;
 JButton button;
 Image img;
 int start_X;
 int start_Y;
 int finish_X;
 int finish_Y;
 int error_X;
 int error_Y;
 int draggedAnimal;
 boolean moveFlag;
 //Sound sound;
 public MyZoo()
 {
// Toolkit tk = Toolkit.getDefaultToolkit(); 
//     img= tk.getImage("Tulips.jpg");
//     sound = new Sound(false);
//    sound.start();
  start_X = 0;
  start_Y = 0;
  finish_X = 0;
  finish_Y = 0;
  error_X = -5;
  error_Y = -60;
  draggedAnimal = -1;
  moveFlag = false;
  comboBox = new JComboBox();
  JFrame frame = new JFrame();
  Container con = frame.getContentPane();
  comboBox.addItem("Animal 1");
  comboBox.addItem("Animal 2");
  comboBox.addItem("Animal 3");
  comboBox.addItem("Animal 4");
  comboBox.addItem("Animal 5");
  comboBox.addItem("Animal 6");
  panel = new JPanel();
  panel2 = new JPanel();
  button = new JButton("                  Music!                  ");
  con.setLayout(new BorderLayout());
  panel.add(comboBox);
  frame.addMouseListener(this);
  frame.addMouseMotionListener(this);
  panel2.add(button);
  add(panel);
  con.add(panel,BorderLayout.NORTH);
  con.add(panel2,BorderLayout.SOUTH);
  button.addActionListener(this);
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
 public void paintComponent(Graphics g)
 {
  Graphics2D g2 = (Graphics2D)g;
  g2.clearRect(0, 0, 600, 600);
  g2.drawImage(img,0,0,this);
  for(int i=0;i<animal.size();i++)
  {
   animal.get(i).draw(g2);
   animal.get(i).moveAround();
  }
 }
 public void mouseClicked(MouseEvent arg0) {
  if(comboBox.getSelectedItem() == "Animal 1")
   animal.add(new bok(arg0.getX()+error_X,arg0.getY()+error_Y));
 }
 public void mouseEntered(MouseEvent arg0) {}
 public void mouseExited(MouseEvent arg0) {}
 public void mousePressed(MouseEvent arg0) {
  start_X = arg0.getX()+error_X;
  start_Y = arg0.getY()+error_Y;
  draggedAnimal = animal.size()-1;
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
  moveFlag = true;
 }
 public void mouseReleased(MouseEvent arg0) {
  if(draggedAnimal >= 0)
   draggedAnimal = -1;
  moveFlag = false;
 }
 public void mouseDragged(MouseEvent arg0) {
  finish_X = arg0.getX()+error_X;
  finish_Y = arg0.getY()+error_Y;
  if(draggedAnimal >= 0)
   animal.get(draggedAnimal).setXY(finish_X, finish_Y);
 }
 public void mouseMoved(MouseEvent arg0) {}
 public void actionPerformed(ActionEvent arg0) {}
}