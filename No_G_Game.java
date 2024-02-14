import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class No_G_Game {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game");
        Random random= new Random();
        int number=random.nextInt(1,101);
     //   System.out.println(number);
        System.out.println("You Have to Guess a number --you have  Maximum 5 attemp :");
        int guessno;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a guess Number between 1 to 100 :");
            guessno=scan.nextInt();
            if(guessno==number){
                System.out.println("OOhhOO!, Your Number is Correct. You won the Game! ");
                break;
            }
            if(guessno>number){
                System.out.println("Your Guess Number is Greater");
                System.out.println(  4-i +" Attemp Left");
            }else {
                System.out.println("Your Guess Number is Smaller");
                System.out.println(  4-i +" Attemp Left");
            }
            if(i==4){
                System.out.println("You Loss the Game");
                System.out.println("Number is : "+ number);
            }
        }

    }
}