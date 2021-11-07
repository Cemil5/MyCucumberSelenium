package day15_MethodOverloading_Review;

public class Task70_HighScorePosition {
/*
 * § Create a method called displayHighScorePosition. It should have a players name as a parameter, and a 2nd parameter as a position in the high score table. You should display the players name along with a message like “managed to get into position” and the position they got and a further message “on the high score table”
§ Create a 2nd method called calculateHighScorePosition. It should be sent one argument only., the player score. It should return an int. The return data should be :
1 – if the score is >=1000
2 – if the core is >=500 and <1000
3- if the score is >=100 and <500
4- in all other cases
§ Call both methods and display the results of the following:
a score of 1500, 900, 400 and 50
 */
	
	
	public static void main(String[] args) {
		
		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Mike", position);
		
		position = calculateHighScorePosition(900);
		displayHighScorePosition("Saim", position);
		
		position = calculateHighScorePosition(400);
		displayHighScorePosition("Ozzy", position);
		
		position = calculateHighScorePosition(50);
		displayHighScorePosition("Oscar", position);
	}
	
	public static void displayHighScorePosition(String playerName, int highScore) {
		
		System.out.println(playerName + " managed to get into position : " + highScore + " on the high score table");
		
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		int score=0;
		if (playerScore>=1000) {
			score =1;
		} else if (playerScore>=500) {
			score =2;
		} else if (playerScore>=100) {
			score =3;
		} else {
			score =4;
		}
		return score;
	}

}
