package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import book.BookInput;
import manager.BookManager;

import javax.swing.JScrollPane;
public class BookViewer extends JPanel{
	
	WindowFrame frame;
	BookManager bookManager;
	public BookViewer(WindowFrame frame,BookManager bookManager) {
		this.frame=frame;
		this.bookManager=bookManager;
		
		System.out.println("***"+bookManager.size()+"***");
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("AUTHOR");
		model.addColumn("PUBLISHER");
		
		for(int i=0; i<bookManager.size();i++) {
			Vector row=new Vector();
			BookInput si=bookManager.get(i);
			
			row.add(si.getName());
			row.add(si.getAuthor());
			row.add(si.getPublisher());
			model.addRow(row);
		}
		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);
	   
	
		this.add(sp);
		
	}

}
