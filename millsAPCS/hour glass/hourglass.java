
/**
 * Write a description of class hourglass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hourglass
{
    public static void main (String[] args){
        line();
        for (int i = 1; i <=4; i++){
            System.out.print(" ");
            for (int j = 1; j <= i; j++){
                System.out.print("\\");
                for ( int k = 1; k <= 8; k++){
                    System.out.print(":");
                }
                System.out.print("/");
            }
        }
        System.out.println("    ||");
        for ( int i = 4; i <= 1; i--){
            System.out.print(" ");
            for ( int j = 1; j <= i
        }
    }
    public static void line(){
        System.out.print("|");
        for ( int i = 1; i <= 10; i++){
            System.out.print("\"");
        }
        System.out.println("|");
    }