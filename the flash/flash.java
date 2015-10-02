
/**
 * Write a description of class flash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flash
{
    public static void main (String[] args){
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= -i+15; j++){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int k = 2; k <= i; k++){
                System.out.print("/");
            }
            System.out.println();
        }
        sixSpace();
        fiveHash();
        threeSlash();
        newLine();
        fourSpace();
        twoHash();
        fourSpace();
        fourSlash();
        newLine();
        threeSpace();
        oneHash();
        fiveSpace();
        fourSlash();
        oneHash();
        newLine();
        twoSpace();
        oneHash();
        fiveSpace();
        fourSlash();
        twoSpace();
        oneHash();
        newLine();
        oneSpace();
        oneHash();
        fiveSpace();
        fiveSlash();
        threeSpace();
        oneHash();
        newLine();
        oneSpace();
        oneHash();
        fourSpace();
        fiveSlash();
        fourSpace();
        oneHash();
        newLine();
        oneHash();
        fourSpace();
        sixSlash();
        fiveSpace();
        oneHash();
        newLine();
        oneHash();
        threeSpace();
        elevenSlash();
        oneSpace();
        oneHash();
        newLine();
        oneHash();
        twoSpace();
        elevenSlash();
        twoSpace();
        oneHash();
        newLine();
        oneHash();
        oneSpace();
        elevenSlash();
        threeSpace();
        oneHash();
        newLine();
        oneHash();
        fiveSpace();
        sixSlash();
        fourSpace();
        oneHash();
        newLine();
        oneSpace();
        oneHash();
        fourSpace();
        fiveSlash();
        fourSpace();
        oneHash();
        newLine();
        oneSpace();
        oneHash();
        threeSpace();
        fiveSlash();
        fiveSpace();
        oneHash();
        newLine();
        twoSpace();
        oneHash();
        twoSpace();
        fourSlash();
        fiveSpace();
        oneHash();
        newLine();
        threeSpace();
        oneHash();
        fourSlash();
        fiveSpace();
        oneHash();
        newLine();
        threeSpace();
        fourSlash();
        fourSpace();
        twoHash();
        newLine();
        threeSpace();
        threeSlash();
        fiveHash();
        newLine();
        twoSpace();
        threeSlash();
        newLine();
        twoSpace();
        twoSlash();
        newLine();
        twoSpace();
        oneSlash();        
    }
    public static void oneSpace(){
        System.out.print(" ");
    }
    public static void twoSpace(){
        System.out.print("  ");
    }
    public static void threeSpace(){
        System.out.print("   ");
    }
    public static void fourSpace(){
        System.out.print("    ");
    }
    public static void fiveSpace(){
        System.out.print("     ");
    }
    public static void sixSpace(){
        System.out.print("      ");
    }
    public static void oneHash(){
        System.out.print("#");
    }
    public static void twoHash(){
        System.out.print("##");
    }
    public static void fiveHash(){
        System.out.print("#####");
    }
    public static void oneSlash(){
        System.out.print("/");
    }
    public static void twoSlash(){
        System.out.print("//");
    }
    public static void threeSlash(){
        System.out.print("///");
    }
    public static void fourSlash(){
        System.out.print("////");
    }
    public static void fiveSlash(){
        System.out.print("/////");
    }
    public static void sixSlash(){
        System.out.print("//////");
    }
    public static void elevenSlash(){
        System.out.print("///////////");
    }
    public static void newLine(){
        System.out.println();
    }
}
