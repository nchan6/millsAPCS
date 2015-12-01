
/**
 * Write a description of class fdsa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fdsa
{
   public static final int MAX = 5;
   public static void unknown(){
       int number = 0;
       for (int count = MAX; count >= 1; count--){
           number += ( count * count);
        }
        System.out.println("The resuly is: " + number);
    }
    public static void main (String[] args){
        unknown();
    }
}