 
// Norris Chan
// 12/1/2015
 import java.util.*;
public class FracCalc
{
   public static void main(String[] args) 
    {
        Scanner me = new Scanner(System.in);
        System.out.println("lets do some math! type \"type quit to stop\" ");
        String input = me.nextLine();
        while (!input.equals("quit")){
            String answer = produceAnswer(input);
            System.out.println(answer);    
            System.out.println("lets do some math! type \"type quit to stop\" ");
            input = me.nextLine();
        }
    }
   public static String produceAnswer(String input){
        int space = input.indexOf(" ");
        String firstFrac = input.substring(0, space);
        String operator = input.substring(space+1,space+2);
        String secFrac = input.substring(space+3,input.length());
        String frac1 = parseFrac(firstFrac);
        String whole1Str = frac1.substring(6,frac1.indexOf(" numer"));
        int whole1 = Integer.parseInt(whole1Str);
        String numer1Str = frac1.substring(frac1.indexOf("numerator:")+10,frac1.indexOf(" denom"));
        int numer1 = Integer.parseInt(numer1Str);
        String denom1Str = frac1.substring(frac1.indexOf("denominator:")+12,frac1.length());
        int denom1 = Integer.parseInt(denom1Str);
        String frac2 = parseFrac(secFrac);
        String whole2Str = frac2.substring(6,frac2.indexOf(" numer"));
        int whole2 = Integer.parseInt(whole2Str);
        String numer2Str = frac2.substring(frac2.indexOf("numerator:")+10,frac2.indexOf(" denom"));
        int numer2 = Integer.parseInt(numer2Str);
        String denom2Str = frac2.substring(frac2.indexOf("denominator:")+12,frac2.length());
        int denom2 = Integer.parseInt(denom2Str);
        int impropNumer1 = Math.abs(denom1*whole1)+numer1;
        int impropNumer2 = Math.abs(denom2*whole2)+numer2;        
        String ans = "bleh";
        if (operator.equals("+")){
            ans = add(impropNumer1,denom1,impropNumer2,denom2);
        }
        if (operator.equals("-")){
            ans = sub(impropNumer1,denom1,impropNumer2,denom2);
        }
        if (operator.equals("/")){
            ans = div(impropNumer1,denom1,impropNumer2,denom2);
        }
        if (operator.equals("*")){
            ans = mult(impropNumer1,denom1,impropNumer2,denom2);
        }
        return ans;
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
   public static String add(int numer1,int denom1,int numer2, int denom2){
       int numer = (numer1*denom2)+(numer2*denom1);
       int denom = denom1*denom2;
       String ans = simp(numer,denom);
       return ans;
   }
    public static String sub(int numer1,int denom1,int numer2, int denom2){
       int numer = (numer1*denom2)-(numer2*denom1);
       int denom = denom1*denom2;
       String ans = simp(numer,denom);
       return ans;
   }
    public static String div(int numer1,int denom1,int numer2, int denom2){
       int numer = numer1/denom2;
       int denom = numer2*denom1;
       String ans = simp(numer,denom);
       return ans;
   }
   public static String mult(int numer1,int denom1,int numer2, int denom2){
       int numer = numer1*numer2;
       int denom = denom1*denom2;
       String ans = simp(numer,denom);
       return ans;
   }
   public static String simp(int numer,int denom){
       int whole = 0;
       String ans = "bleh";
       if (numer%denom == 0){
           whole = numer/denom;
           ans = whole+"";
       }else if (numer > denom){
           whole = numer/denom;
           numer = numer%denom;
           int comFact = gcf(numer,denom);
           numer = numer/comFact;
           denom = denom/comFact;
           ans = whole+"_"+numer+"/"+denom;
       } else if (numer < denom){
           int comFact = gcf(numer,denom);
           numer = numer/comFact;
           denom = denom/comFact;
           ans = numer+"/"+denom;
       }
       return ans;
   }
   public static int gcf(int numer,int denom){
        while(numer!=0 && denom!=0) {
            int c =  denom;
            denom = numer%denom;
            numer = c;
        }
        return Math.abs(numer+denom);
    }

   }

               
            
       
   

    
