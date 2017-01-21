import java.lang.*;

public class Riddler
{
	public static void main(String[] args)
	{
		int goal = 10;
		int trials = 1000000000;
		int player1Score = 0;
		int player2Score = 0;
		int player1Wins = 0;
		int coin;
		for (int i = 0; i < trials; i++)
		{
			player1Score = 0;
			player2Score = 0;
			while (player1Score < goal & player2Score < goal)
			{
				coin = (int)(Math.random() * 2);
				player1Score = player1Score + coin;
				if (player1Score > (goal - 1))
					player1Wins++;
				coin = (int)(Math.random() * 2);
				player2Score = player2Score + coin;
			}
		}
		System.out.println((player1Wins * 1.0) / trials);
	}
}