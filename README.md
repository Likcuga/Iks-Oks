//import java.util.String;
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
	
	Random rnd = new Random();
	int max =2, min = 0;
	int rand, rand2; //= (int)(Math.random()*(min-max+1)+min);
	
	char X = 'X';
	for (int i =0; i<8; i++){
	
		for(int j =0; j<8; j++)
		{
			int b = input.nextInt();
			switch (b) {
			
			case 1:
				matrica[0][0] = 'x';
				break;
			case 2:
				matrica[0][1] = 'x';
				break;
			case 3:
				matrica[0][2] = 'x';
				break;
			case 4:
				matrica[1][0] = 'x';
				break;
			case 5:
				matrica[1][1] = 'x';
				break;
			case 6:
				matrica[1][2] = 'x';
				break;
			case 7:
				matrica[2][0] = 'x';
				break;
			case 8:
				matrica[2][1] = 'x';
				break;
			case 9:
				matrica[2][2] = 'x';
				break;
			default:
				System.out.println("Uneli ste pogresan broj! \n");
				break;
				}
			
			for (int random =0; random<1; random++)
			{
				rand = (int)(Math.random()*(max-min+1)+min);
				rand2 = (int)(Math.random()*(max-min+1)+min);
				System.out.println(rand + rand2);
				if (rand<0 || rand > 2 || rand2 < 0 || rand2 >2)
				{
					break;
				}
				else if (matrica[rand][rand2] == 'x')
				{
					break;
				}
				else if (matrica[rand][rand2] == '-')
				{
					
					matrica[rand][rand2] = 'o';
					
				}
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
