package testswing;
import java.awt.*;

import javax.swing.*;
public class test {
	public static void main (String[] args) {
		JFrame f=new JFrame("HEY");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p=new JPanel(new GridLayout(4,4,10,10));
		f.add(p);
		JButton b=new JButton ("b");
		p.add(b);
		JButton b1=new JButton ("b1");
		p.add(b1);
		JButton b2=new JButton ("b2");
		p.add(b2);
		JButton b3=new JButton ("b3");
		p.add(b3);
		JButton b4=new JButton ("b4");
		p.add(b4);
		f.pack();
		f.setLocationRelativeTo(null);
	}
	
}
