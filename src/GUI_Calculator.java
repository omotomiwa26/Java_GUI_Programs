//importing the java standard library
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	//main class
public class GUI_Calculator {

	public static void main(String[] args) {
		
		//calling the lookandfeel method from the lookandfeel class
		//lookandfeel me = new lookandfeel();
		//me.look();
		
		   
		
		
	//creating the frame
	JFrame myFrame = new JFrame("GUI CALCULATOR");
	myFrame.setSize(450,300);
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//creating the container
	Container mycon = myFrame.getContentPane();
	GridLayout A = new GridLayout(2,1,5,5);
	mycon.setLayout(A);
	
	//creating the first panel
	JPanel P1 = new JPanel();
	P1.setLayout(new GridLayout(4,3,5,5));
	
	//creating the labels,TextFields and clear button
	JLabel Num1 = new JLabel("Num 1");
	Num1.setBorder(BorderFactory.createLoweredBevelBorder());
	JTextField num1 = new JTextField("Enter First Number");
	num1.setBorder(BorderFactory.createLoweredBevelBorder());
	JLabel Num2 = new JLabel("Num 2");
	Num2.setBorder(BorderFactory.createLoweredBevelBorder());
	JTextField num2 = new JTextField("Enter Second Number");
	num2.setBorder(BorderFactory.createLoweredBevelBorder());
	JLabel Ans = new JLabel("Answer");
	Ans.setBorder(BorderFactory.createLoweredBevelBorder());
	JTextField ans = new JTextField("Display Answer");
	ans.setBorder(BorderFactory.createLoweredBevelBorder());
	JButton clear = new JButton("CLEAR");
	clear.setBorder(BorderFactory.createLoweredBevelBorder());
	
	//adding actionListener to the clear button
	clear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
						num1.setText ("");
						num2.setText("");
						ans.setText("");
						
					}
			}
	);
	
	

	
	//adding the labels,TextFields and clear button to the first panel
	P1.add(Num1);
	P1.add(num1);
	P1.add(Num2);
	P1.add(num2);
	P1.add(Ans);
	P1.add(ans);
	P1.add(clear);
	
	//creating the second panel
	JPanel P2 = new JPanel();
	P2.setLayout(new GridLayout(1,4,5,5));
	
	//creating the add button
	JButton add = new JButton("ADD");
	add.setBorder(BorderFactory.createLoweredBevelBorder());
	
	//adding ActionListener to the add button
	add.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
					int Num1,Num2,answer;
					try{
						Num1= Integer.parseInt(num1.getText());
						Num2 = Integer.parseInt(num2.getText());
						
						answer = Num1+Num2;
						ans.setText(Integer.toString(answer));
					}catch (Exception t){
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
						
					}
			}
	});
		
		//creating the sub button
	JButton sub = new JButton("SUBTRACT");
	sub.setBorder(BorderFactory.createLoweredBevelBorder());
	
	//adding ActionListener to the sub button
	sub.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
					int Num1,Num2,answer;
					try{
						Num1= Integer.parseInt(num1.getText());
						Num2 = Integer.parseInt(num2.getText());
						
						answer = Num1-Num2;
						ans.setText(Integer.toString(answer));
					}catch (Exception t){
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
						
					}
			}
	});
	
	//creating the mul button
	JButton mul = new JButton("MULTIPLY");
	mul.setBorder(BorderFactory.createLoweredBevelBorder());
	
	//adding ActionListener to the mul button 
	mul.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
					int Num1,Num2,answer;
					try{
						Num1= Integer.parseInt(num1.getText());
						Num2 = Integer.parseInt(num2.getText());
						
						answer = Num1*Num2;
						ans.setText(Integer.toString(answer));
					}catch (Exception t){
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
						
					}
			}
	});
	
	//creating the div button
	JButton div = new JButton("DIVIDE");
	div.setBorder(BorderFactory.createLoweredBevelBorder());
	
	//adding ActionListener to the div button
	div.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			double Num1,Num2,answer;
			
			try{
				Num1= Integer.parseInt(num1.getText());
				Num2 = Integer.parseInt(num2.getText());
				
				answer = Num1/Num2;
				ans.setText(Double.toString(answer));
					}catch (Exception t){
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
						
					}
			}
	});
	
	//adding the add button,sub button, mul button and div button to second panel
	P2.add(add);
	P2.add(sub);
	P2.add(mul);
	P2.add(div);
	
	//adding the first and second panels to the container
	mycon.add(P1);
	mycon.add(P2);
	myFrame.setVisible(true);
	
	}	
}


		 
