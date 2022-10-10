import java.util.Random;
import java.util.Scanner;


public class IksOks {
	
	public static char[][] ispisMatrice(char matrica[][]){
		for (int i=0; i<3; i++) {
			for(int j =0; j<3; j++)
			{
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}	
		return matrica;
	}
	
	
	public static boolean proveraPobede(char matrica[][]){
		int brgdx = 0, brgdo = 0, brsdx=0, brsdo=0, brdkx=0, brdko=0, brpkx=0, brpko=0, brnkx=0, brnko=0;
		int brdrx =0, brdro=0, brprx =0, brpro =0, brnrx =0, brnro = 0;
		
		for (int i = 0; i <3; i++) {
			
			for (int j = 0; j < 3; j++) {
				if (i == j && matrica[i][j] == 'x') {brgdx++; } //broj glavne diagonale x
				if (i == j && matrica[i][j] == 'o') {brgdo++; } // broj glavne dijagonale o
				
				if (i+j == matrica.length-1 && matrica[i][j] == 'x') {brsdx++;} // broj sporedne dijagonale x
				if (i+j == matrica.length-1 && matrica[i][j] == 'o') {brsdo++;} // broj sporedne dijagonale x
				
				if (matrica[i][j] == 'x' && i == 2) {brdkx++;} // broj druge kolone x
				if (matrica[i][j] == 'o' && i == 2) {brdko++;} // broj druge kolone o
				
				if (matrica[i][j] == 'x' && i == 1) {brpkx++;} // broj prve kolone x
				if (matrica[i][j] == 'o' && i == 1) {brpko++;} // broj prve kolone o
				
				if (matrica[i][j] == 'x' && i == 0) {brnkx++;} // broj nulte kolone x
				if (matrica[i][j] == 'o' && i == 0) {brnko++;} // broj nulte kolone o
				
				if (matrica[i][j] == 'x' && j == 2) {brdrx++;} // broj drugog reda x
				if (matrica[i][j] == 'o' && j == 2) {brdro++;} // broj drugog reda o
				
				if (matrica[i][j] == 'x' && j == 1) {brprx++;} // broj prvog reda x
				if (matrica[i][j] == 'o' && j == 1) {brpro++;} // broj prvog reda o
				
				if (matrica[i][j] == 'x' && j == 0) {brnrx++;} // broj nultog reda x
				if (matrica[i][j] == 'o' && j == 0) {brnro++;} // broj nultog reda o
			}	
			
			
		}
		if (brgdx == 3 || brsdx == 3 || brdkx == 3 || brpkx == 3 || brnkx == 3 || brdrx == 3 || brprx == 3 || brnrx == 3) 
		{System.out.println("Pobedili ste! "); return true;}
		if (brgdo==3 || brsdo == 3 || brdko == 3 || brpko == 3 || brnko == 3 || brdro == 3 || brpro == 3 || brnro == 3) 
		{System.out.println("Pobedio je racunar! "); return true;}	
		
		else return false;
		
	}
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);	
	char matrica[][] = new char [3] [3];
	
	
	System.out.println("Dobrodosli u igricu Iks Oks ");
	System.out.println("Pravila su sledeca: ");
	System.out.println("Potrebno je u koloni ili diagonalano, spojiti 3 ista oblika,\nko prvi to uradi je pobednik! \n \n");
	
	
	for (int i=0; i<3; i++) {
		for(int j =0; j<3; j++)
		{
			matrica[i][j] = '-';
		}
	}

	ispisMatrice(matrica);
	
	int rand, rand2; 
	
	while(proveraPobede(matrica) == false){
		
			System.out.print("\n");
		
			System.out.println("Unesite potez: ");
		
			
			int b = input.nextInt();
			
			switch (b) {
			
			case 7:
				if(matrica[0][0] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[0][0] = 'o';
					
				}
				else {matrica[0][0] = 'x';}
				break;
			case 8:
				if(matrica[0][1] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[0][1] = 'o';
					
				}
				else {matrica[0][1] = 'x';}
				break;
			case 9:
				if(matrica[0][2] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[0][2] = 'o';
					
				}
				else {matrica[0][2] = 'x';}
				break;
			case 4:
				if(matrica[1][0] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[1][0] = 'o';
					
				}
				else {matrica[1][0] = 'x';}
				break;
			case 5:
				if(matrica[1][1] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[1][1] = 'o';
					
				}
				else {matrica[1][1] = 'x';}
				break;
			case 6:
				if(matrica[1][2] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[1][2] = 'o';
					
				}
				else {matrica[1][2] = 'x';}
				break;
			case 1:
				if(matrica[2][0] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[2][0] = 'o';
					
				}
				else {matrica[2][0] = 'x';}
				break;
			case 2:
				if(matrica[2][1] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[2][1] = 'o';
					
				}
				else {matrica[2][1] = 'x';}
				break;
			case 3:
				if(matrica[2][2] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[2][2] = 'o';
					
				}
				else {matrica[2][2] = 'x';}
				break;
			default:
				System.out.println("Uneli ste pogresan broj! \n");
				break;
				
				
			}
		
			int brrr=0;
			
			rand = (int)(3*Math.random());
			rand2 = (int)(3*Math.random());
			
			
			while (brrr<20)	{
				
				if(matrica[rand][rand2] == '-') {
					matrica[rand][rand2] = 'o';
					break;
					}
					
				rand = (int)Math.floor(3*Math.random());
				rand2 = (int)Math.floor(3*Math.random());
				
				brrr++;
				} 
				
			System.out.print("\n");
			
			ispisMatrice(matrica);
				
			proveraPobede(matrica);
			
			
  }
 }
}

	
	