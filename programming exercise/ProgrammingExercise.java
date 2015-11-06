/**
 * Write a description of class ProgrammingExercise here.
 * 
 * Norris Chan 
 * 11/5/2015
 */import java.util.Scanner;
public class ProgrammingExercise
{
   public static void main(String [] args){
       Scanner bleh = new Scanner(System.in);
       System.out.print("how many numbers would you like to enter ? ");
       int numbers = bleh.nextInt();
       System.out.print("the first number is : ");
       int max = bleh.nextInt();
       int min = max;
       int evenSum = 0;
       int evenMax = 0;
       // retype the first number
       for (int i=1; i<=numbers; i++){
           int num = bleh.nextInt();
           if( min>num ){
               min = num;
            }
           if( min<num ){
               max = num;
            }
           if ( num%2==0 ){
               evenSum = evenSum + num;
            }
           if ( num%2 == 0 ){
               if ( num > evenMax ){
                   evenMax = num;       
              }
            }
       }
       System.out.println("Smallest number : " + min);
       System.out.println("Largest number : " + max);
       System.out.println("The sum of all even numbers is " + evenSum);
       System.out.println("The largest even number is " + evenMax);       
    }
}
