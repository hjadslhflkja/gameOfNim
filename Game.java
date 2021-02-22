import java.util.Scanner;

public class Game 
{
    private Player player1;
    private Player player2;
    private Boolean playAgain = true;
    Scanner sc = new Scanner(System.in);
    Scanner nsc = new Scanner(System.in);
    public Game()
    {
        player1 = new Player();
        player2 = new Player();
    }
    public void Play()
    {
        //promt for input, check inpur, and change number of pieces
        while (playAgain == true)
        {
            Player startPlayer;
            int currentPlayer = ((int)(Math.random() * 2));
            if (currentPlayer == 1)
            {
                startPlayer = player1;
            }
            else 
            {
                startPlayer = player2;
            }

            //loops till game ends
            while (Board.getNumPieces() > 1)
                {
                System.out.println("there are " + Board.getNumPieces() + " pieces on the board");
                System.out.println(startPlayer.getName() + ", it's your move. Enter how many pieces you want to remove.");
                int num = sc.nextInt();

                 // checks that the input is valid, if it isn't the while loop will continue promting for valid input
                while (!(num >= 1) || !(num <= Board.getNumPieces()/2))
                    {
                    System.out.println("enter a valid move");
                    num = sc.nextInt();
                    }
                //removes pieces
                Board.removePieces(num);

                    
                    if (Board.getNumPieces() <= 1)
                    {
                        //increases score for winner if the game is over
                        startPlayer.increaseScore();
                        //prints out the current score
                        System.out.print(player1.getName() + " has a score of " + player1.getScore() + " while ");
                        System.out.println(player2.getName() + " has a score of " + player2.getScore());
                        // asks the players if they want to play again and starts new game loop if they do
                        System.out.println("would u like to play again?");
                        String answer = nsc.nextLine();
                        if (answer.equals("yes"))
                        {
                            
                            System.out.println("yes?");
                            playAgain = true; //starts a new game
                            Board.populate();
                            
                        }
                        else 
                        {
                            System.out.println("no?");
                            playAgain = false; //endsgame
                        }
           
                    }

                    // switch players
                    if (startPlayer == player1)
                    {
                        startPlayer = player2;
                    }
                    else 
                    {
                        startPlayer = player1;
                    }
               
                 }

            
        

            
        }
    }
}
