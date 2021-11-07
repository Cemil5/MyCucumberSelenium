package replit.array;

public class TicTacToe2 {

	public static void main(String[] args) {
		
		char[] game1 = {
				  'X', 'X', 'X',
				  '-', 'O', '-',
				  '-', 'O', '-'
				}; 			//	Result: Player X won
		System.out.println(won(game1));
		
		char[] game2 = {
				  'X', 'X', '-',
				  '-', 'X', '-',
				  '-', 'O', 'X'
				}; 			//	Result: Player X won
		System.out.println(won(game2));
		
		char[] game3 = {
				  'X', 'O', '-',
				  '-', 'O', '-',
				  '-', 'O', 'X'
				}; 			//	Result: Player O won
		System.out.println(won(game3));
		
		char[] game4 = {
				  'X', '-', 'O',
				  '-', 'O', '-',
				  'O', 'O', 'X'
				}; 			//	Result: Player O won
		System.out.println(won(game4));
		
		char[] game5 = {
				  'X', '-', 'O',
				  '-', '-', '-',
				  'O', 'O', 'X'
				}; 			//	Result: no winner
		System.out.println(won(game5));
		
	}
	public static String won(char[] x){
		String result = "no winner";
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};	// all possibilities to win
		
		for (int i = 0; i < arr.length; i++) {
			boolean flagX = true;
			boolean flagO = true;

			for (int j = 0; j < arr[i].length; j++) {	
				int winner = x[arr[i][j]-1]; 	// each possibilities is converted to index number by -1
				if (flagX && winner != 'X') {	// checks if X lose
					flagX = false;
				}
				if (flagO && winner != 'O') {	// checks if O lose
					flagO = false;
				}	
			}
			
			if (flagX) {
				result = "Player X won";
				break;	// outer loop
			}
			
			if (flagO) {
				result = "Player O won";
				break;	// outer loop
			}		
		}
		
		return result;
	}
}
