 
import java.util.*;
public class FracCalc {
    public static void main(String[] args) 
    {
        Scanner me = new Scanner(System.in);
        System.out.print("add or subtract something: ");
        String input = me.nextLine();
        while (!input.equals("quit")){
            String returningFrac = produceAnswer(input);
            System.out.println(returningFrac);        
        }
   }   
   public static String produceAnswer(String input)
    { 
        String firstFrac = "bleh";
        String operand = "bleh";
        String secondFrac = "bleh";
        for (int i=0; i<input.length() ; i++){
            if (input.charAt(i) == ' '){
                firstFrac = input.substring(0, i);
                operand = input.substring(i+1, i+2);
                secondFrac = input.substring(i+1, input.length());
            }
        }
        String first = parseFrac(firstFrac);
        String second = parseFrac(secondFrac);
        return second;
    }        
   public static String parseFrac(String fract){
        String whole = "bleh";
        String numerator = "bleh";
        String denominator = "bleh";
        boolean mixedNum = false;
        boolean frac = false;
        for (int i=0; i<fract.length(); i++){
            if (fract.charAt(i) == '_'){
                mixedNum = true;                
            }
            if (fract.charAt(i) == '/'){
                frac = true;
            }
        }
        if (mixedNum){
            whole = fract.substring(0, fract.indexOf('_'));
            numerator = fract.substring(fract.indexOf('_')+1, fract.indexOf('/'));
            denominator = fract.substring(fract.indexOf('/')+1, fract.length());                     
        } else if (frac){
            whole = "0";
            numerator = fract.substring(0, fract.indexOf('/'));
            denominator = fract.substring(fract.indexOf('/')+1, fract.length());
        } else {
            whole = fract;
            numerator = "0";
            denominator = "1";
        }
        return "whole:"+whole+" numerator:"+numerator+" denominator:"+denominator; 
   }
}
