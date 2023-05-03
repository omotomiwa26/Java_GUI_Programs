import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myForm{
	
	public void showFrame() {
		//Building the frame
		
		JFrame myFrame = new JFrame("A Simple Java Graphical User interface Registration Form");
		myFrame.setSize(600,400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Building Container
		
		Container myCon = myFrame.getContentPane();
		GridLayout F = new GridLayout(4,1,15,15);
		myCon.setLayout(F);
		look();
		
		
		//Start of first panel
		
		JPanel bio = new JPanel();
		bio.setLayout(new GridLayout(3,2));
		JLabel fname = new JLabel("First Name: ");
		JTextField fn = new JTextField("Enter your first name",30);
		JLabel lname = new JLabel("Last name: ");
		JTextField ln = new JTextField("Enter your last name",30);
		JLabel email = new JLabel("Email: ");
		JTextField em = new JTextField("Enter your mail",30);
		
		bio.add(fname);
		bio.add(fn);
		bio.add(lname);
		bio.add(ln);
		bio.add(email);
		bio.add(em);
		
		//End of first panel
		
		
		
		//Start of second panel
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,3));
		JLabel dob = new JLabel("D.O.B: ");
		
		//Setting Day combo
		JComboBox<Integer> dai = new JComboBox<Integer>();
		for(int i = 1; i<=31; i++){
			dai.addItem(i);
		}
		
		
		
		//Setting months combo
		JComboBox<Integer> mont = new JComboBox<Integer>();
		for(int v = 1; v<=12; v++){
			mont.addItem(v);
		}
		
		
		//Setting year combo
		JComboBox<Integer> yr = new JComboBox<Integer>();
		for(int u = 1950; u<=2015; u++){
			yr.addItem(u);
		}
		
		
		p2.add(dob);
		p2.add(dai);
		p2.add(mont);
		p2.add(yr);
		
		//End of second panel
		
		
		//start of third panel
		
		JPanel p3 =  new JPanel();
		p3.setLayout(new GridLayout(2,2));
		JLabel sx = new JLabel("Sex: ");
		JCheckBox male = new JCheckBox("Male",true);
		JCheckBox female = new JCheckBox("Female",false);
		ButtonGroup sexes = new ButtonGroup();
		sexes.add(male);
		sexes.add(female);

		//Creating Address
		
		JLabel enterAdd = new JLabel("Enter Address:");
		JTextField address = new JTextField("Enter your address here");
		
		p3.add(sx);
		p3.add(male);
		p3.add(female);
		p3.add(enterAdd);
		p3.add(address);
		
		//End of third panel	
		
		//Creating fourth panel and Submit button
		
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(1,2));
		JButton sub = new JButton("Submit Form");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					JOptionPane.showMessageDialog(null, "Registration Successful");
				}
			
		
				
			
		});
		p4.add(sub);
		
		//end of fourth panel

		myCon.add(bio);
		myCon.add(p2);
		myCon.add(p3);
		myCon.add(p4);
		myFrame.setVisible(true);
		
		
		
	}
	
	
	
public void look(){

		try{
			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			
		}
		
		
		catch(Exception c){
			
			System.out.print("Design didn't work oops!");
			
		}


	}
}



public class regForm {

	public static void main(String[] args) {
		
		myForm x = new myForm();
		x.showFrame();

	}
}
