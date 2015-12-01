
/**
 * Write a description of class trees here.
 * 
 * Norris Chan
 * 9/30\15
 */
public class trees
{
    public static void main (String[] args){
        tree(4,5);
        tree(5,2);
    }
    public static void tree(int height, int segment){
        for (int i = 1; i <= segment; i++){
            for (int j = 1; j <= height; j++){
                for (int k = 1; k <= segment+height-i-j; k++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= ((j+2)*2)-2+((i-2)*2)-1; k++){
                   System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int i = 1; i <= height+segment-2; i++){
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 1; i <= height+segment-2; i++){
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i =1; i <= height+segment-5; i++){
            System.out.print(" ");
        }
        System.out.print("*******");
        System.out.println();
    }
}
        
        
    