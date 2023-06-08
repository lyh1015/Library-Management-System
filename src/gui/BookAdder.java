package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import manager.BookManager;

public class BookAdder extends JPanel{
	
	WindowFrame frame;
	
	BookManager bookManager;
	
	public BookAdder(WindowFrame frame,BookManager bookManager) {
		this.frame=frame;
		this.bookManager=bookManager;
		JPanel p=new JPanel();
		p.setLayout(new SpringLayout());
		JLabel l1=new JLabel("NAME: ",JLabel.TRAILING);
		JTextField f1=new JTextField(10);
		l1.setLabelFor(f1);
		p.add(l1);
		p.add(f1);
		
		JLabel l2=new JLabel("Author: ",JLabel.TRAILING);
		JTextField f2=new JTextField(10);
		l2.setLabelFor(f2);
		p.add(l2);
		p.add(f2);
		
		JLabel l3=new JLabel("Publisher: ",JLabel.TRAILING);
		JTextField f3=new JTextField(10);
		l2.setLabelFor(f3);
		p.add(l3);
		p.add(f3);
		
		JLabel l4=new JLabel("Type: ",JLabel.TRAILING);
		JTextField f4=new JTextField(10);
		l2.setLabelFor(f4);
		p.add(l4);
		p.add(f4);
		p.add(new JButton("save"));
		p.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(p,5,2,6,6,6,6);
		
	    this.add(p);
		
		
	}
}
