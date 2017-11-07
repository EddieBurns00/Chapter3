import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random gen = new Random();
 
          numToGuess = gen.nextInt(11);
 
          System.out.println("Please guess a number between 1 and 10");
 
          guess = scan.nextInt();
                    
          while (guess != numToGuess )  
            {
                  System.out.println("Your guess is wrong!\nPlease try again");
                  guess = scan.nextInt();
          }
 
          System.out.println("Your guess is right!");
        }
}