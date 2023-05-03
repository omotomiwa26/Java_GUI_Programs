import javax.swing.*;

import java.awt.*;
class theGUI {
	
	public void showFrame(){
	JFrame amzat = new JFrame("My Frame Noni");
	amzat.setSize(400,300);
	amzat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container jide = amzat.getContentPane();
	FlowLayout f = new FlowLayout();
	amzat.setLayout(f);
	look();
	
	JButton play = new JButton("Play This");
	JButton stop = new JButton("Stop");
	JTextField myEmail = new JTextField("Enter your email here", 20);
	JLabel message = new JLabel("We are here");
	message.setBorder(BorderFactory.createLoweredBevelBorder());
	
	
	JColorChooser cbn = new JColorChooser();
	JFileChooser vx = new JFileChooser("C:/Users/Prince_Tommy/Videos");
	
	JComboBox<String> drop = new JComboBox<String>();
	drop.addItem("Monday");
	drop.addItem("Tuesday");
	drop.setEditable(true);
	
	jide.add(play);
	jide.add(stop);
	jide.add(myEmail);
	jide.add(message);
	jide.add(drop);
	jide.add(cbn);
	jide.add(vx);
	amzat.setVisible(true);
	
	}
	
	public void look(){

		try{
			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			
		}
		
		
		catch(Exception c){
			
			JOptionPane.showMessageDialog(null,"Design didnt work...sorry");
			
		}
		
		
	}
}

public class myGUI{
	public static void main(String args[]){
		
		theGUI xup = new theGUI();
		xup.showFrame();
		
	}
}