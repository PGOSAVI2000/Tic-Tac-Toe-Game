class TicTacToe
{
	char[][] board;
	
	public TicTacToe()
		{
			board = new char[3][3];    //board is a reference for creating a array 3x3)
			initBoard();  // Calling
		}
	void initBoard()   //Fill the value of Board
	{
		for(int i=0;i<board.length;i++)   // for row
		{
			for(int j=0;j<board[i].length;j++)   //for column
			{
				board[i][j]= ' ';     //Initialized to my board values
			}
		}
	}
	void dispBoard()
	{
		System.out.println("-------------");
		for(int i=0;i<board.length;i++)   // for row
		{
			System.out.print("| ");										
			for(int j=0;j<board[i].length;j++)   //for column
			{
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}		  //board[0][]==board[1][j]
													 // board[1][j]==board[2][j]  J value is '0'
	
	//How to place a Mark(O, X)?
	void placeMark(int row, int column, char mark)
	{
		if(row>=0 && row<=2 && column>=0 && column<=2)          //check the valid row or column
		{
			board[row][column]=mark;
		}
		else
		{
			System.out.println("Invalid Position");
		}
	}
	
	//How to check Column wise win condition
	boolean checkColWin()
	{
		for(int j=0;j<=2;j++)
		{
			if(board[0][j]  != ' ' &&  board[0][j]==board[1][j] && board[1][j]==board[2][j])  //board[0][]==board[1][j]
																	 // board[1][j]==board[2][j] 'J value is Constant'
			{
				return true;
			}
		}
		return false;
	}
	
	//How to check Row wise win condition
	boolean checkRowWin()
	{
		for(int i=0;i<=2;i++)
		{
			if(board[i][0]  != ' ' && board[i][0]==board[i][1] && board[i][1]==board[i][2])  //board[i][0]==board[i][1]
				 													 // board[i][1]==board[i][2] 'i value is Constant'
			{
				return true;
			}
		}
		return false;
	}
	
	//How to check Diagonally win condition
	boolean checkDiagWin()
	{
		if(board[0][0]  != ' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2] 
				|| board[0][2]  != ' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0])
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Game {

	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();   // Creating a object
		
		t.dispBoard();
		System.out.println(t.checkDiagWin());
		System.out.println(t.checkRowWin());
		System.out.println(t.checkColWin());
		
		 /*t.placeMark(0,0,'X');
		 t.placeMark(1,1,'O');
		 t.placeMark(2,0,'X');
		 t.placeMark(0,2,'O');
		 t.placeMark(1,0,'X');
		 System.out.println(t.checkColWin());
		 t.dispBoard();*/
		 
		/* t.placeMark(0,0,'X');
		 t.placeMark(1,0,'O');
		 t.placeMark(0,1,'X');
		 t.placeMark(1,1,'O');
		 t.placeMark(0,2,'X');
		 System.out.println(t.checkRowWin());
		 t.dispBoard();*/
		 
		 /*t.placeMark(0,0,'X');  (0,2,'X');
		 t.placeMark(1,1,'X');    (1,1,'X');
		 t.placeMark(2,2,'X');    (2,2,'X');
		 System.out.println(t.checkDiagWin());
		 t.dispBoard();*/
		 
	}

}
