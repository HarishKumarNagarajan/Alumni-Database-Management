import java.awt.*;  
import javax.swing.JFrame;  
import javax.swing.*;
      
    public class MyCanvas extends Canvas{  
          
        public void paint(Graphics g) {  
      
            Toolkit t=Toolkit.getDefaultToolkit();  
            Image i=t.getImage("alumni.png");  
            g.drawImage(i, 20,20,this);  
              
        } 
            public static void main(String[] args) {  
            MyCanvas m=new MyCanvas();  
            JFrame f=new JFrame();  
            JLabel l=new JLabel("hiii");
            //l.setBounds(100, 100, 200, 200);
            f.add(m);  
            //f.add(l);
            f.setSize(2000,1000);  
            f.setVisible(true);
            f.setLayout(null);
        }  
      
    }  