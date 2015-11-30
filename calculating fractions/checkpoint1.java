
/**
 * Write a description of class checkpoint1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class checkpoint1
{
    public static void main(String[] args){
        Scanner me = new Scanner(System.in);
        System.out.print("first whole number = ");
        int whole = me.nextInt();
        System.out.print("first numerator = ");
        int numer = me.nextInt();
        System.out.print("first denominator = ");
        int denom = me.nextInt();
        System.out.print("+ or - = ");
        String sign = me.next();
        System.out.print("second whole number = ");
        int secWhole = me.nextInt();
        System.out.print("second numerator = ");
        int secNumer = me.nextInt();
        System.out.print("second denominator = ");
        int secDenom = me.nextInt();
        String input = whole+"_"+numer+"/"+denom+sign+secWhole+"_"+secNumer+"/"+secDenom+"=";
        System.out.println(input);
        produceAnswer(input);
        String second = produceAnswer(input);
        System.out.println(second);
    }
    public static String produceAnswer(String input){
        String firstOperand = input.substring(0,5);
        String operator = input.substring(5,6);
        String secondOperand = input.substring(6,11);
        return secondOperand;
    }
}
   