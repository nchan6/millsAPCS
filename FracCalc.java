 
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
        String answer = parseFrac(secondFrac);
        return secondFrac;
    }        
   public static String parseFrac(String input){
        String whole = "bleh";
        String numerator = "bleh";
        String denominator = "bleh";
        boolean mixedNum = false;
        boolean frac = false;
        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) == '_'){
                mixedNum = true;                
            }
            if (input.charAt(i) == '/'){
                frac = true;
            }
        }
        if (mixedNum){
            whole = input.substring(0, input.indexOf(' '));
            numerator = input.substring(input.indexOf(' ')+1, input.indexOf('/'));
            denominator = input.substring(input.indexOf('/')+1, input.length());                     
        } else if (frac){
            whole = "0";
            numerator = input.substring(0, input.indexOf('/'));
            denominator = input.substring(input.indexOf('/')+1, input.length());
        } else {
            whole = input;
            numerator = "0";
            denominator = "1";
        }
        return "whole:"+whole+" numerator:"+numerator+" denominator:"+denominator; 
   }
}
