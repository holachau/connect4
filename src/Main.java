import java.util.Scanner;

public class Main {

	public static int input;
	public static int[][] gameArray = new int[6][7];
	public static Scanner inputScanner;
	public static int winCondition = 0;
	

	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		Board_aux board = new Board_aux();
		Board p = new Board();
		
		//p.resetGameArray();
		p.printGameArray();

		while(p.winConditionHorizontal() != 1 || p.winConditionHorizontal() != 2) {
			
			p.setInput(inputScanner.nextInt());
			inputScanner.nextLine();
			p.inputPieceP1(p.getInput());
			p.printGameArray();
			System.out.println("H WIN COND: "+ p.winConditionHorizontal());
			System.out.println("V WIN COND: "+ p.winConditionVertical());
			System.out.println();
			
			p.setInput(inputScanner.nextInt());
			inputScanner.nextLine();
			p.inputPieceP2(p.getInput());
			p.printGameArray();
			System.out.println("H WIN COND: "+ p.winConditionHorizontal());
			System.out.println("V WIN COND: "+ p.winConditionVertical());
			System.out.println();
			if(p.winConditionHorizontal()==1 || p.winConditionVertical()==1) {
				break;
			}
		}
		System.out.println("El juego termino");
		System.out.println(p.winConditionHorizontal());		

	
	}

}
