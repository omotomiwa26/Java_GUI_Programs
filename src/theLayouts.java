import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;


public class theLayouts {
	
	public static void main(String args[]){
	
		JFrame amzat = new JFrame("My Frame Noni");
		amzat.setSize(400,300);
		amzat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container jide = amzat.getContentPane();
		jide.setLayout(new CardLayout());
		
		JButton bc = new JButton("Create Account");
		JButton zc = new JButton("Signup");
		
		
		jide.add(bc);
		jide.add(zc);
		amzat.setVisible(true);
		
	}

}
