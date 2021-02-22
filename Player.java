import java.util.Scanner;

public class Player
{
    private String name;
    private int score;
    public Player()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        name = sc.nextLine();
    }
    public String getName()
    {
        return name;
    }
    public int getScore()
    {
        return score;
    }
    public void increaseScore()
    {
        score =  score + 1;
    }
}