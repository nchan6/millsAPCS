
/**
 * Write a description of class trees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trees
{
    public static void main (String[] args){
        tree(4, 3);
        tree(5, 2);
    }
    public static void tree(int x, int y){
        for (int i = 1; i <= y; i++){
            for (int j = 1; j <= x; j++){
                for (int k = 1; k <= -j + 6; k++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * j - 1; k++){
                   System.out.print("*");
                }
               System.out.println();
            }
        }
        bottomOfTree(
    }                  
    public static void bottomOfTree(){
        System.out.println("     *");
        System.out.println("     *");
        System.out.println("  *******");
    }
}
        
        
    