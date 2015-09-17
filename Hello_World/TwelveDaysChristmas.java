/**
+ * "The Twelve Days of Christmas" song.
+ * 
+ * Naomi Yung Revised 8/31
+ * HW P 1.4
+ */
public class TwelveDaysChristmas
{
   public static void main(String[] args) {
      System.out.println("On the first day of Christmas,");
       trueLove();
       aPartridge();
       System.out.println("On the second day of Christmas,");
       trueLove();
       twoDoves();
       System.out.println("On the third day of Christmas,");
       trueLove();
       threeHens();
       System.out.println("On the fourth day of Christmas,");
       trueLove();
       fourBirds();
       System.out.println("On the fifth day of Christmas,");
       trueLove();
       fiveRings();
       System.out.println("On the sixth day of Christmas,");
       trueLove();
       sixGeese();
       System.out.println("On the seventh day of Christmas,");
       trueLove();
       sevenSwans();
       System.out.println("On the eighth day of Christmas,");
       trueLove();
       eightMaids();
       System.out.println("On the ninth day of Christmas,");
       trueLove();
       nineLadies();
       System.out.println("On the tenth day of Christmas,");
       trueLove();
       tenLords();
       System.out.println("On the eleventh day of Christmas,");
       trueLove();
       elevenPipers();
       System.out.println("On the twelfth day of Christmas,");
       trueLove();
       twelveDrummers();
    }
    public static void trueLove() {
        System.out.println("my true love sent to me");
    }
    public static void aPartridge() {
        System.out.println("a partridge in a pear tree.");
        System.out.println("");    
    }
    public static void twoDoves() {
        System.out.println("two turtle doves, and");
        aPartridge();
    }
    public static void threeHens() {
        System.out.println("three French hens,");
        twoDoves();
    }
    public static void fourBirds() {
        System.out.println("four calling birds,");
        threeHens();
    }
    public static void fiveRings() {
        System.out.println("five golden rings,");
        fourBirds();
    }
    public static void sixGeese() {
        System.out.println("six geese a-laying,");
        fiveRings();
    }
    public static void sevenSwans(){
        System.out.println("seven swans a-swimming,");
        sixGeese();
    }
    public static void eightMaids() {
        System.out.println("eight maids a-milking,");
        sevenSwans();
    }
    public static void nineLadies() {
        System.out.println("nine ladies dancing,");
        eightMaids();
    }
    public static void tenLords() {
        System.out.println("ten lords a-leaping,");
        nineLadies();
    }
    public static void elevenPipers() {
        System.out.println("eleven pipers piping,");
        tenLords();
    }
    public static void twelveDrummers() {
        System.out.println("twelve drummers drumming,");
        elevenPipers();
        
    }
}