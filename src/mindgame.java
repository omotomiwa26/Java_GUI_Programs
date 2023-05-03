import java.util.Random;

public class mindgame {
		public int theGuess;
		public int doRand(){
			Random randGuess = new Random();
			theGuess = 1 + randGuess.nextInt(15);
			
			return theGuess;
		}	
}