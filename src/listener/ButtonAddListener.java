package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookViewer;
import gui.WindowFrame;
public class ButtonAddListener implements ActionListener{

	WindowFrame frame;
	public ButtonAddListener(WindowFrame frame) {
		this.frame=frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b =(JButton)e.getSource();
		BookAdder viewer=frame.getBookadder();
		frame.setupPanel(viewer);
	
		
	}

}
