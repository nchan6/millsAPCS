
/**
 * write out mississippi 
 * 
 * Norris Chan 
 * 8/30/15
 */
public class mississippi
{
    public static void main(String[] args){
        m();
        i();
        s();
        s();
        i();
        s();
        s();
        i();
        p();
        p();
        i();
    }
    public static void m(){
        mAndM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        mAndM();
        mAndM();
    }
    public static void mAndM(){
        System.out.println("M     M");
    }
    public static void i(){
        fiveI();
        oneI();
        oneI();
        oneI();
        oneI();
        oneI();
        fiveI();
    }
    public static void fiveI(){
        System.out.println("IIIII");
    }
    public static void oneI(){
        System.out.println("  I");
    }
    public static void s(){
        fiveS();
        twoS();
        System.out.println("S");
        fiveS();
        System.out.println("      S");       
        twoS();
        fiveS();
    }
    public static void fiveS(){
        System.out.println(" SSSSS");
    }
    public static void twoS(){
        System.out.println("S     S");
    }   
    public static void p(){
        sixP();
        twoP();
        twoP();
        sixP();
        oneP();
        oneP();
        oneP();
    }
    public static void sixP(){
        System.out.println("PPPPPP");
    }
    public static void twoP(){
        System.out.println("P      P");
    }
    public static void oneP(){
        System.out.println("P");
    }
}