import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class themindgame {
	
	public static JButton clearBox;
	public static JTextField humanAns;
	public static int y;
	
	public static void main(String[] args){
		
		JFrame myframe = new JFrame("JAVA GUESS GAME v2.0.1");
		myframe.setLayout(new FlowLayout());
		myframe.setSize(300,200);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container mycon = myframe.getContentPane();
		
		humanAns = new JTextField("Enter your guessed number");
		JButton comGuess = new JButton("Computer Guess");
		JButton checkAns = new JButton("Check Answer");
		clearBox = new JButton("Clear");
		
		comGuess.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
			
				mindgame x = new mindgame();
				
				y = x.doRand();
				
				JOptionPane.showMessageDialog(null,"i 've guessed!, guess your own");
			
			}
			});
		
		
		checkAns.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				guessResult();
			
			}
			});
		
		clearBox.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				humanAns.setText("");
			
			}
			});
		
		
		mycon.add(humanAns);
		mycon.add(comGuess);
		mycon.add(checkAns);
		mycon.add(clearBox);
		
		myframe.setVisible(true);
		
	}
	
			public static void guessResult(){
				
				int hResult = Integer.parseInt(humanAns.getText());
				if (hResult > 15){	
					
					JOptionPane.showMessageDialog(null,"Error!!,choose number from 1 to 15");
				}
				else
				if(hResult == y) {
					
					JOptionPane.showMessageDialog(null,"Correct, it's " + y);
				}
				else
				if (hResult != y){
					
					JOptionPane.showMessageDialog(null,"You are wrong i guessed " + y);
				}
				
				
					}
					
				
			}
			
			
