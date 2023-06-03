package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
public class MenuSelection extends JFrame {

	MenuSelection(){
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JLabel label=new JLabel("Menu Selection");
		JButton b1=new JButton("Add Book");
		JButton b2=new JButton("Delete Book");
		JButton b3=new JButton("Edit Book");
		JButton b4=new JButton("View Book");
		JButton b5=new JButton("Exit Program");
		
		p1.add(label);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		this.setVisible(true);
	}
}
