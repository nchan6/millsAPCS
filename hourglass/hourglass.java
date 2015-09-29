
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
       //top triangle
       int x = 8;
       for (int i = 1; i <= 4; i++){
           for (int j = 1; j <= i; j++){
            System.out.print(" ");
            }
           for (int k = 1; k <= 1; k++){
               System.out.print("\\");
               for (int l = 1; l <= i * -2 + 10; l++){
                   System.out.print(":");
                }
                System.out.print("/");
            }
            System.out.println();          
        }
        //middle
        System.out.println("     ||");
        // bottom triangle
       for (int i = 4; i >= 1; i--){
           for (int j = 4; j >= -i + 5; j--){
                System.out.print(" ");
            }
           for (int k = 1; k <= 1; k++){
               System.out.print("/");
               for (int l = 1; l <= i * -2 + 10; l++){
                    System.out.print(":");   
                }
                System.out.print("\\");
            }
            System.out.println();
       }                
    line ();
   }
    public static void line(){
        System.out.print("|");
        for (int i = 1; i <= 10; i++){
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.println();
   }
}


