//importing the java standard library
import javax.swing.UIManager;

//creating the lookandfeel class
public class lookandfeel {
	
	//creating the lookandfeel method
	public void look(){

		try{
			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			
		}
		
		
		catch(Exception c){
			
			System.out.print("Design didn't work oops!");
			
		}
}
}

