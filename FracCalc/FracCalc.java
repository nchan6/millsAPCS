 
import java.util.*;
public class FracCalc {
    public static void main(String[] args) 
    {
        Scanner me = new Scanner(System.in);
        System.out.println("lets do some math! type \"quit to stop\" ");
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
        int wholeFirst = Integer.parseInt(first.substring(6,first.indexOf("numerator:")));
        int numerFirst = Integer.parseInt(first.substring(first.indexOf("numerator:")+1,first.indexOf("denominator:")-1));
        int denomFirst = Integer.parseInt(first.substring(first.indexOf("denominator:")+1,first.length()+1));
        int wholeSec = Integer.parseInt(second.substring(6,second.indexOf("numerator:")));
        int numerSec = Integer.parseInt(second.substring(second.indexOf("numerator:")+1,second.indexOf("denominator:")-1));
        int denomSec = Integer.parseInt(second.substring(second.indexOf("denominator:")+1,second.length()+1));
        int impropFracOneNum = (denomFirst*wholeFirst)+numerFirst;
        int impropFracTwoNum = (denomSec*wholeSec)+numerSec;
        int finalWhole = 0;
        int finalNumerator = 0;
        int finalDenominator = 0;
        if (operand == "+"){
            finalWhole = wholeFirst + wholeSec;
            finalNumerator = (numerFirst*denomSec)+(numerSec*denomFirst);
            finalDenominator = denomFirst*denomSec;
        }else if (operand == "-"){
            finalWhole = wholeFirst - wholeSec;
            finalNumerator = (numerFirst*denomSec)-(numerSec*denomFirst);
            finalDenominator = denomFirst*denomSec;
        }else if (operand == "/"){
            finalWhole = 0;
            finalNumerator = impropFracOneNum*denomSec;
            finalDenominator = impropFracTwoNum*denomFirst;
        }else if (operand == "*"){
            finalWhole = 0;
            finalNumerator = impropFracOneNum*impropFracTwoNum;
            finalDenominator = denomFirst*denomSec;
        }
        String answer = finalWhole+"_"+finalNumerator+"/"+finalDenominator;
        return answer;
    }        
   public static String parseFrac(String fract)
   {
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