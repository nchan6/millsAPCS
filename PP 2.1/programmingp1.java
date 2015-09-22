
/**
 * Write a description of class programmingp1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class programmingp1
{
    public static void main (String[] args){
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= -i + 7; j++){
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for (int l = 2; l <= -i * 2 + 15; l++){
                System.out.print("\\");
            }
            for (int m = 1; m <= i * 2 - 2; m++){
                System.out.print("/");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= -i + 7; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
                                