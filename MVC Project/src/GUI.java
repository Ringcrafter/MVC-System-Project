import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener {

	JFrame window = new JFrame("Games Workshop");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Welcome to Games Workshop");
	
	JButton b1 = new JButton("View products");
	JButton b2 = new JButton("Place order");
	JButton b3 = new JButton("Check order");

	
	public GUI() {

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		b1.setPreferredSize(new Dimension(300, 100));
		b2.setPreferredSize(new Dimension(300, 100));
		b3.setPreferredSize(new Dimension(300, 100));
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(label);
		window.getContentPane().add(panel);
		window.pack();
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(b1)) {
			label.setText("Left button pressed");
		}
		if(e.getSource().equals(b2)) {
			label.setText("Middle button pressed");
		}
		
		if(e.getSource().equals(b3)) {
			label.setText("Right button pressed");
		}
	}
	
}
