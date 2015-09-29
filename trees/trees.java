
/**
 * Write a description of class trees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trees
{
    public static void main (String[] args){
        int x = 3;
        int y = 2;
        firstTree(x);
        secondTree(y);
    }
    public static void firstTree(int number){
        int height = 4;
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= height; j++){
                // 1st seg
                for (int k = 1; k <= -i + 6; k++){
                    spaces();
                }
                for (int l = 1; l <= 2 * i - 1; l++){
                    ash();
                }
                // 2nd seg
                for (int m = 1; m <= -0.7 * i + 4.5; m++){
                    spaces();
                }
                for (int n = 1; n <= 2 * i + 1; n++){
                    ash();
                }
                // 3rd seg
                for (int o = 1; o <= -i + 4; o++){
                    spaces();
                }
                for (int p = 1; p <= 2 * i + 3; p++){
                    ash();
                }
                System.out.println();
            }
        }
        bottomOfTree();
    }
    public static void secondTree(int number){
        int height = 5;
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= height; j++){
                // 1st seg
                for (int k = 1; k <= -i + 6; k++){
                    spaces();
                }
                for (int l = 1; l <= 2 * i - 1; l++){
                    ash();
                }
                // 2nd seg
                for (int m = 1; m <= 2 * i + 1; m++){
                    spaces();
                }
                for (int m = 1; m <= -i + 5; m++){
                    ash();
                }
                System.out.println();
            }                
        }    
        bottomOfTree();
    }

    public static void spaces(){
        System.out.print(" ");
        
    }
    public static void ash(){
        System.out.print("*");
    }
    public static void bottomOfTree(){
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= 5; j++){
                spaces();
            }
            for (int k = 1; k <= 1; k++){
                ash();
            }
            System.out.println();
        }
        for (int i = 1; i <= 1; i++){
            for (int j = 1; j <= 2; j++){
                spaces();
            }
            for (int k = 1; k <= 7; k++){
                ash();
            }
        }
    }
}
        
        
    