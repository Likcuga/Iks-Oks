import java.util.Random;
import java.util.Scanner;




public class IksOks {
	
	static int winPointcount;
	static int losePointcount;
	
	static boolean playerWin = false;
	static boolean cpuWin = false;
	
	public static void printBoard(char matrix[][])
	{
		for (int i=0; i<3; i++) 
		{
			for(int j =0; j<3; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	public static boolean winnerCheck(char matrix[][])
	{
		int brgdx = 0, brgdo = 0, brsdx=0, brsdo=0, brdkx=0, brdko=0, brpkx=0, brpko=0, brnkx=0, brnko=0;
		int brdrx =0, brdro=0, brprx =0, brpro =0, brnrx =0, brnro = 0;
		
		
		for (int i = 0; i <3; i++) 
		{
			
			for (int j = 0; j < 3; j++) 
			{
				if (i == j && matrix[i][j] == 'x') {brgdx++; } //broj glavne diagonale x
				if (i == j && matrix[i][j] == 'o') {brgdo++; } // broj glavne dijagonale o
				
				if (i+j == matrix.length-1 && matrix[i][j] == 'x') {brsdx++;} // broj sporedne dijagonale x
				if (i+j == matrix.length-1 && matrix[i][j] == 'o') {brsdo++;} // broj sporedne dijagonale x
				
				if (matrix[i][j] == 'x' && i == 2) {brdkx++;} // broj druge kolone x
				if (matrix[i][j] == 'o' && i == 2) {brdko++;} // broj druge kolone o
				
				if (matrix[i][j] == 'x' && i == 1) {brpkx++;} // broj prve kolone x
				if (matrix[i][j] == 'o' && i == 1) {brpko++;} // broj prve kolone o
				
				if (matrix[i][j] == 'x' && i == 0) {brnkx++;} // broj nulte kolone x
				if (matrix[i][j] == 'o' && i == 0) {brnko++;} // broj nulte kolone o
				
				if (matrix[i][j] == 'x' && j == 2) {brdrx++;} // broj drugog reda x
				if (matrix[i][j] == 'o' && j == 2) {brdro++;} // broj drugog reda o
				
				if (matrix[i][j] == 'x' && j == 1) {brprx++;} // broj prvog reda x
				if (matrix[i][j] == 'o' && j == 1) {brpro++;} // broj prvog reda o
				
				if (matrix[i][j] == 'x' && j == 0) {brnrx++;} // broj nultog reda x
				if (matrix[i][j] == 'o' && j == 0) {brnro++;} // broj nultog reda o
			}	
		}
		if (brgdx == 3 || brsdx == 3 || brdkx == 3 || brpkx == 3 || brnkx == 3 || brdrx == 3 || brprx == 3 || brnrx == 3) 
		{playerWin = true; return true;}
		if (brgdo==3 || brsdo == 3 || brdko == 3 || brpko == 3 || brnko == 3 || brdro == 3 || brpro == 3 || brnro == 3) 
		{cpuWin = true; return true;}	
		
		
		else return false;	
	}
	
	public static void printWinner(char matrix[][]) 
	{
		if(winnerCheck(matrix) == true)
		{
			if(playerWin == true)
			{
				System.out.println("Pobedili ste! "); winPointcount++ ;
			}
			
			else if(cpuWin == true) { System.out.println("Pobedio je racunar! "); losePointcount++;}
		}	
	}
	
	public static void winPoints() 
	{
		
		System.out.println("Imate ukupno> " + winPointcount + " poena");
		System.out.println("Racunar ima ukupno> " + losePointcount + " poena");
	}
	
	public static void inputPlay (char matrix[][], int input)
	{
		Scanner scan = new Scanner(System.in);
		boolean repeat = true;
		while (repeat == true) {
			
			switch (input) {
			
			case 7:
				if(matrix[0][0] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[0][0] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[0][0] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[0][0] = 'x'; repeat = false;}
				break;
			case 8:
				if(matrix[0][1] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[0][1] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[0][1] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[0][1] = 'x';repeat = false;}
				break;
			case 9:
				if(matrix[0][2] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[0][2] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[0][2] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[0][2] = 'x'; repeat = false;}
				break;
			case 4:
				if(matrix[1][0] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[1][0] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[1][0] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[1][0] = 'x'; repeat = false;}
				break;
			case 5:
				if(matrix[1][1] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[1][1] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[1][1] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[1][1] = 'x'; repeat = false;}
				break;
			case 6:
				if(matrix[1][2] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[1][2] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[1][2] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[1][2] = 'x'; repeat = false;}
				break;
			case 1:
				if(matrix[2][0] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[2][0] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[2][0] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[2][0] = 'x'; repeat = false;}
				break;
			case 2:
				if(matrix[2][1] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[2][1] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[2][1] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[2][1] = 'x'; repeat = false;}
				break;
			case 3:
				if(matrix[2][2] == 'o' )
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrix[2][2] = 'o';
					input = scan.nextInt();
				}
				else if (matrix[2][2] == 'x')
				{
					System.out.println("Vec je zauzeto polje! \n");
					input = scan.nextInt();
				}
				else {matrix[2][2] = 'x'; repeat = false;}
				break;
				
			
			default:
				System.out.println("Uneli ste pogresan broj! \n");
				break;
				
				
			}
	  }
		
	}
		
	public static void cpuPlay(char[][] matrix) 
	{
		int i=0;
		
		int rand = (int)(3*Math.random());
		int rand2 = (int)(3*Math.random());
		
		
		while (i<20)	
		{
			
			if(matrix[rand][rand2] == '-') 
			{
				matrix[rand][rand2] = 'o';
				break;
			}
				
			rand = (int)Math.floor(3*Math.random());
			rand2 = (int)Math.floor(3*Math.random());
			
			i++;
			} 
	}
	
	public static void resetBoard(char matrix[][])
	{
		for (int i=0; i<3; i++) {
			for(int j =0; j<3; j++)
			{
				matrix[i][j] = '-';
			}
		}
	}
	
	
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);	
	char matrix[][] = new char [3] [3];
	
	
	System.out.println("Welcome to Iks Oks, the real Tic Tac Toe game !");
	System.out.println("The rules are as follows: ");
	System.out.println("The game is played on a grid that's 3 squares by 3 squares ");
	System.out.println("You are X, your friend (or the computer in this case) is O ");
	System.out.println("The first player to get 3 of her marks in a row \n(up, down, across, or diagonally) is the winner");
	System.out.println("When all 9 squares are full, the game is over.\nGOOD LUCK! \n");
	
	
	resetBoard(matrix);

	printBoard(matrix);
	
	int newGame = 1;
	
	while (newGame != 2 || newGame < 4) {
		
		System.out.println();
		
		if(winnerCheck(matrix) == true)
		{
			System.out.println("Da li zelite da zapocnete novu rundu?\n");
			
			System.out.println("Nova runda> 1 \n\nPrekid igre> 2 \n\nPrikaz poena> 3");
			
			newGame = input.nextInt();
			if (newGame == 1) 
				{ 
				resetBoard(matrix);
				printBoard(matrix);
				System.out.println();
				}
			if (newGame == 2)
			{
				System.out.println("Pozdrav!");
				input.close();
				break;
			}
			if(newGame == 3)
			{
				winPoints();
			}
			
			if(newGame > 3)
			{
				System.out.println("Uneli ste pogresan broj ! \n");
				newGame = input.nextInt();
			}
			
		}
		System.out.println();
		
	
		while(winnerCheck(matrix) == false){
			
				System.out.println("");
			
				System.out.println("Unesite potez: ");
			
				int b = input.nextInt();
				
				inputPlay(matrix, b);
			
				cpuPlay(matrix);
					
				System.out.println("");
				
				printBoard(matrix);
					
				printWinner(matrix);
				
				//input.close();
		}
    }
	
  }	
}

	
	