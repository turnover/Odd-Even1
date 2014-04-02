import java.util.Scanner;
import java.util.Random;

public class OddEven1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		
		int compNum;
		int wins=0;
		int losses=0;
		
		String word1=" ";
		String word2;
		String word3;
		
		Boolean replay; 
		Boolean even;
		
		Random random = new Random();
		compNum =	random.nextInt(9)+1;

		replay=true;

		do{
			System.out.println("Guess if a number I choose between 1-10 is Even or Odd: ");
			word1 = input.nextLine();

			if(compNum % 2 == 0)
			{
				even = true;
			}
			else 
			{
				even = false;
			}

			switch(word1.toLowerCase()) 
			{

				case "even":
					if(even=true)
					{
						System.out.println("Correct.");
						wins++;
					}
					else
					{
						System.out.println("Incorrect.");
						losses++;
					}
					break;
				case"odd":
					if(even=true)
					{
						System.out.println("Incorrect.");
						losses++;
					}
					else
					{
						System.out.println("Correct.");
						wins++;				
					}
					break;
				default:
				{
					System.out.println("You did not choose an Even or Odd.");
				}

			}
			if(wins > losses)
			{
				word3 = "You are winning.";
			}
			else if(wins == losses)
			{
				word3 = "We are tied.";
			}
			else
			{
				word3 = "You are losing.";
			}
			System.out.printf("The Total is Wins:%d Losses:%d\n%s\n",wins, losses, word3);
			System.out.println("Would you like to continue playing? If yes type yes. If no then please close the program and thanks for playing: ");
			word2 = input.nextLine();

		}while(replay=true);	
	}
}
