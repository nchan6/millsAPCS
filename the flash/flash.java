
/**
 * Write a description of class flash here.
 * 
 * Norris Chan
 * 10/3/2015
 */
public class flash
{
    public static void main (String[] args){
        woosh(20,0,0,1,0,0);
        woosher(9,5,2,0);
        woosh(8,1,9,2,1,1);
        woosh(6,1,10,3,2,1);
        woosh(4,1,11,4,4,1);
        woosh(3,1,11,4,6,1);
        woosh(2,1,11,4,8,1);
        woosh(1,1,11,5,9,1);
        woosh(1,1,10,5,10,1);
        woosh(0,1,10,6,11,1);
        woosh(0,1,9,11,7,1);
        woosh(0,1,8,11,8,1);
        woosh(0,1,7,11,9,1);
        woosh(0,1,11,6,10,1);
        woosh(1,1,10,5,11,1);
        woosh(1,1,9,5,11,1);
        woosh(2,1,8,4,11,1);
        woosh(3,1,6,4,11,1);
        woosh(4,1,4,4,11,1);
        woosh(5,1,3,3,11,1);
        woosh(7,1,1,2,10,1);
        woosher(8,0,2,5);
        woosh(8,0,0,1,0,0);
    }
    public static void woosh( int space,int hashtag, int spaces, int slash, int spacess, int hashtags){
        for (int i = 1; i <= space; i++){
                System.out.print(" ");
        }
        for (int i = 1; i <= hashtag; i++){
                System.out.print("#");
        }
        for (int i = 1; i <= spaces; i++){
                System.out.print(" ");
        }
        for (int i = 1; i <= slash; i++){
                System.out.print("/");
        }
        for (int i = 1; i <= spacess; i++){
                System.out.print(" ");
        }
        for (int i = 1; i <= hashtags; i++){
                System.out.print("#");
        }
        System.out.println();
    }
    public static void woosher(  int space,int spaceHashtag, int slash, int spaceHashtags){
        for (int i = 1; i <= space; i++){
            System.out.print(" ");
        }
        for (int i = 1; i<= spaceHashtag; i++){
            System.out.print(" #");
        }
        for (int i = 1; i <= slash; i++){
                System.out.print("/");
        }
         for (int i = 1; i<= spaceHashtags; i++){
            System.out.print(" #");
        }
        System.out.println();
    }
}
        
        