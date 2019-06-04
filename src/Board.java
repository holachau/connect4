
public class Board {
	
	public String p1name;
	public String p2name;
	public int[][] gameArray = new int[6][7];
	public int input; 
	public boolean auxBooleanP1;
	public boolean auxBooleanP2;
	public int resultHor;
	public int resultVert;
	public int resultDiag1;
	public int resultDiag2;

	
	public Board(String p1name, String p2name, int[][] gameArray, int input, boolean auxBooleanP1,
			boolean auxBooleanP2, int resultHor, int resultVert, int resultDiag1, int resultDiag2) {
		super();
		this.p1name = p1name;
		this.p2name = p2name;
		this.gameArray = gameArray;
		this.input = input;
		this.auxBooleanP1 = auxBooleanP1;
		this.auxBooleanP2 = auxBooleanP2;
		this.resultHor = resultHor;
		this.resultVert = resultVert;
		this.resultDiag1 = resultDiag1;
		this.resultDiag2 = resultDiag2;
		resetGameArray();
	}

	public Board(String p1name, String p2name, int input) {
		this.p1name = p1name;
		this.p2name = p2name;
		this.input = input;
	}
	
	public Board()
	{
		p1name = "player1";
		p2name = "player2";
		input  = 10;
	}
	
	
	//Metodos de la clase
	public void resetGameArray() {
		for (int f = 0; f < 6; f++) {
			for (int c = 0; c < 7; c++) {
				gameArray[f][c] = 0;
			}
		}
	}
	
	public void inputPieceP1(int input){
			boolean auxBooleanP1 = false;
			for(int i = 5 ; i >= 0 ; i--) {
				if ( auxBooleanP1 ) {
					break;
				}
				if( gameArray[i][input] == 0) {
					auxBooleanP1 = true;
					gameArray[i][input] = 1;
				}
			}
		}
	
	public void inputPieceP2(int input){
		boolean auxBooleanP2 = false;
		for(int i = 5 ; i >= 0 ; i--) {
			if ( auxBooleanP2 ) {
				break;
			}
			if( gameArray[i][input] == 0) {
				auxBooleanP2 = true;
				gameArray[i][input] = 2;
			}
		}
	}
	//Prints the Game Array (for testing the proper functioning of the methods only)
	public void printGameArray() {
		for (int f = 0; f < 6; f++) {
			for (int c = 0; c < 7; c++) {
				System.out.print(gameArray[f][c]+" ");
			}
			System.out.println();
		}
		System.out.println("\n0 1 2 3 4 5 6");
	}
	
	
	// Horizontal Connect 4 Condition
	public int winConditionHorizontal() {
		resultHor = 0;
		for (int f = 0; f < 6; f++) {
			for (int c = 0; c < 4; c++) {
				if (gameArray[f][c] == gameArray[f][c+1] && gameArray[f][c] == gameArray[f][c+2] && gameArray[f][c] == gameArray[f][c+3]) {
					resultHor = gameArray[f][c];
				}
			}
		}
		return resultHor;
	}
	
	//
	public int inputConditionVerticalWin(int column, int row, int token) {
		int conditionToWin = 0;
		int auxColumn = 0;
		try{
			while(true) {
				for(int y = 0; y < 3; y++) {
					
					if( token == gameArray[row][column]) {
						conditionToWin ++;
					}
				}
				for(y=3; y>0; y--) {
					
				}
			}
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
		
		return 0;
	}
	
	public int winConditionVertical() {
		resultVert = 0;
		for (int f = 0; f < 3 ; f++) {
			for (int c = 0; c < 7; c++) {
				if (gameArray[f][c] == gameArray[f+1][c] &&  gameArray[f][c] == gameArray[f+2][c] &&  gameArray[f][c] == gameArray[f+3][c]){
					resultVert = gameArray[f][c];
				}																								
			}
		}
		return resultVert;
	}
	
	
	//Getters-Settes
	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public String getP1name() {
		return p1name;
	}
	public void setP1name(String p1name) {
		this.p1name = p1name;
	}
	public String getP2name() {
		return p2name;
	}
	public void setP2name(String p2name) {
		this.p2name = p2name;
	}
	
	
	
}