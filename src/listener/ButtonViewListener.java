package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookViewer;
import gui.WindowFrame;
public class ButtonViewListener implements ActionListener{

	WindowFrame frame;
	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b =(JButton)e.getSource();
		BookViewer viewer=frame.getBookviewer();
		frame.setupPanel(viewer);
	
		
	}

}
