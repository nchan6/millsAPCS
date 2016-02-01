
/**
 * Write a description of class GolfProblem here.
 * 
 * Norris Chan 
 * 1/22/16
 */
import java.util.*;
public class GolfProblem
{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("How many holes have you played?");
       int numOfGames = input.nextInt();
       int[] givenPar = new int[numOfGames];
       int[] playerScore = new int[numOfGames];
       System.out.println("What is you score compared to par for each hole?");
       for (int i = 0; i < numOfGames ; i++){
           System.out.println("Score for hole "+(i+1)); 
           System.out.print(" Par: ");
           givenPar[i] = input.nextInt();
           System.out.print(" Your Score: ");
           playerScore[i] = input.nextInt();
           System.out.println("Your score compared to par is "+score(givenPar[i],playerScore[i]));
       }
       System.out.println("Your overall score is "+cumulativeScore(givenPar, playerScore));
    }
   public static String score(int parr, int score){
       String result = " ";
       if(score == parr){
           result = "par";
       }
       else if((score+1) == parr){
           result = "birdie";
       }
       else if((score+2) == parr){
           result = "eagle";
       }
       else if(score == (parr+1)){
           result = "bogey";
       }
       else if(score > parr){
           result = "double bogey";
       }
       return result;
    }
   public static String cumulativeScore(int[] par,int[] score){
       int totalPar = 0;
       int totalScore = 0;
       String result = " ";
       for(int i = 0; i < par.length; i++){
           totalPar = totalPar + par[i];
       }
       for(int i = 0; i < score.length; i++){
           totalScore = totalScore + score[i];
       }
       result = score(totalPar, totalScore);
       return result;
    }
}
