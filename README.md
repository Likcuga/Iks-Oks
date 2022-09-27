import java.util.Random;
import java.util.Scanner;

public class IksOks {
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);	
	//string X;
	//int red = 3, kolona = 3;
	char br = '-' ;
	char matrica[][] = new char [3] [3];
	
	
	System.out.println("Dobrodosli u igricu Iks Oks ");
	System.out.println("Pravila su sledeca: ");
	System.out.println("Potrebno je u koloni ili diagonalana, spojiti 3 ista oblika,\n ko prvi to uradi je pobednik! \n \n");
	
	
	for (int i=0; i<3; i++) {
		for(int j =0; j<3; j++)
		{
			matrica[i][j] = '-';
			System.out.print(matrica[i][j] + " ");
		}
		System.out.println();
	}

		
		
	//Random rnd = new Random();
	int max =2, min = 0;
	int rand, rand2; //= (int)(Math.random()*(min-max+1)+min);
	
	//char X = 'X';
	for (int i =0; i<8; i++){
	
		for(int j =0; j<8; j++)
		{
			
			for (int y=0; y<3;y++) {
				for (int u=0;u<3;u++) {
				
			if (y == u || matrica[y][u] == 'o')
			{	
			System.out.println("Pobedio je racunar!");	
			break;
			}
			else if (u==2 ||  y == 0 || y== 1 ||y== 2 || matrica[y][u] == 'o')
			{
				System.out.println("Pobedio je racunar!");
				break;
			}
			else if (y==0 || u == 0 || u== 1 ||u== 2 ||matrica[y][u] == 'o')
			{
				System.out.println("Pobedio je racunar!");
				break;
			}
			else if (u==0 || y==0 || y==1 || y==2 ||matrica[y][u] == 'o')
			{
				System.out.println("Pobedio je racunar!");
				break;
			}
			else if (y==2 || u==0 || u==1 || u==2 ||matrica[y][u] == 'o')
			{
				System.out.println("Pobedio je racunar!");
				break;
			}
			else if (u==0 || y==0 || y==1 || y==2 ||matrica[y][u] == 'o')
			{
				System.out.println("Pobedio je racunar!");
				break;
			}
			else if (y+u == matrica.length ||matrica[y][u] == 'o')
			{
				System.out.println("Pobedio je racunar!");
				break;
			}
			

			else if (y == u || matrica[y][u] == 'x')
			{	
			System.out.println("Vi ste pobednik!");	
			break;
			}
			else if (u==2 ||  y == 0 || y== 1 ||y== 2 || matrica[y][u] == 'x')
			{
				System.out.println("Vi ste pobednik!");
				break;
			}
			else if (y==0 || u == 0 || u== 1 ||u== 2 ||matrica[y][u] == 'x')
			{
				System.out.println("Vi ste pobednik!");
				break;
			}
			else if (u==0 || y==0 || y==1  || y==2  ||matrica[y][u] == 'x')
			{
				System.out.println("Vi ste pobednik!");
				break;
			}
			else if (y==2 || u==0 || u==1  || u==2  ||matrica[y][u] == 'x')
			{
				System.out.println("Vi ste pobednik!");
				break;
			}
			else if (u==0 || y==0 || y==1  || y==2  ||matrica[y][u] == 'x')
			{
				System.out.println("Vi ste pobednik!");
				break;
			}
			else if (y+u == matrica.length  ||matrica[y][u] == 'x')
			{
				System.out.println("Vi ste pobednik!");
				break;
			}
			else break;
			
		 }
		}
			
		
			
			int b = input.nextInt();
			switch (b) {
			
			case 1:
				if(matrica[0][0] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[0][0] = 'o';
					
				}
				else {matrica[0][0] = 'x';}
				break;
			case 2:
				if(matrica[0][1] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[0][1] = 'o';
					
				}
				else {matrica[0][1] = 'x';}
				break;
			case 3:
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
			case 7:
				if(matrica[2][0] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[2][0] = 'o';
					
				}
				else {matrica[2][0] = 'x';}
				break;
			case 8:
				if(matrica[2][1] == 'o')
				{
					System.out.println("Vec je zauzeto polje! \n");
					matrica[2][1] = 'o';
					
				}
				else {matrica[2][1] = 'x';}
				break;
			case 9:
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
		
			
			
			for (int random =0; random<1; random++)
			{
				rand = (int)(Math.random()*(max-min+1)+min);
				rand2 = (int)(Math.random()*(max-min+1)+min);
				
				if (matrica[rand][rand2] == 'x')
				{
				 if (matrica[rand][rand2] == 'o') {
					rand = (int)(Math.random()*(max-min+1)+min);
					rand2 = (int)(Math.random()*(max-min+1)+min);
				}
				}
				else if (matrica[rand][rand2] == 'o')
				{
					if(matrica[rand][rand2] == 'x'){
						
					
					rand = (int)(Math.random()*(max-min+1)+min);
					rand2 = (int)(Math.random()*(max-min+1)+min);
					}
				}
				
				else if (matrica[rand][rand2] == 'o')
				{
					if(matrica[rand][rand2] == 'x'){
						
					
					rand = (int)(Math.random()*(max-min+1)+min);
					rand2 = (int)(Math.random()*(max-min+1)+min);
					}
				}
				
				
				
				else matrica[rand][rand2] = 'o';
				
				
			}
			
			
		
			
			for (int k=0; k<3; k++) {
				for(int l =0; l<3; l++)
				{
				
					System.out.print(matrica[k][l] + " ");
				}
				System.out.println();
			}
			
				}
		
	
  }
 }
}
