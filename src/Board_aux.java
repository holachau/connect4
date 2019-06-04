
public class Board_aux {
	private String[][] boardLayout = new String[6][15];
	private String divider = "|";
	private String blank = "_";
	
	public Board_aux () {

		System.out.println("_______________");
	/// Print of the initial board
		for (int f = 0; f < 6; f++) {
			for (int c = 0; c < 15; c++) {
				if (c % 2 == 0) {
					this.boardLayout[f][c] = divider;
				} else {
					this.boardLayout[f][c] = blank;
				}
				System.out.print(this.boardLayout[f][c]);
			}
			System.out.println();
		}   
		System.out.println(" 1 2 3 4 5 6 7 ");
	}
	
	
}
