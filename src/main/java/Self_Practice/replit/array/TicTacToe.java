package replit.array;

public class TicTacToe {

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
			boolean flag = true;
			for (int j = 0; j < arr[i].length; j++) {	// checks if X won
			//	System.out.print(arr[i][j] + " ");
				if (x[arr[i][j]-1] != 'X') {		// each possibilities is converted to index number by -1 then checked
					flag = false;
					break; // inner loop X
				}	
			}
			if (flag) {
				result = "Player X won";
				break;	// outer loop
			}
			
			flag = true;
			for (int j = 0; j < arr[i].length; j++) {	// checks if O won
			//	System.out.print(arr[i][j] + " ");
				if (x[arr[i][j]-1] != 'O') {
					flag = false;
					break;	// inner loop O
				}	
			}
			if (flag) {
				result = "Player O won";
				break;	// outer loop
			}
			
		//	System.out.println();
		}
		
		return result;
	}
}
