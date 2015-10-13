
/**
 * Write a description of class equestria here.
 * 
 * Norris Chan
 * 10/13/2015
 */
public class equestria
{
   public static void main(String[] args){
       System.out.println("Distance from Baltimore to Manehattan = " + distance(32,25,35,9));
       System.out.println("Distance from Los Pegasus to Neighagra Falls = " + distance(6,18,22,7));
       System.out.println("Distance from Badlands to Ponyville = " + distance(25,22,16,13));
       roadTrip(35,9,19,11);
    }
   public static double distance(int x1, int y1, int x2, int y2){
       double d=Math.sqrt(x2-x1)*2+(y2-y1)*2;
       return d;
    }
   public static double roadTrip(int x1, int y1, int x2 , int y2){
       double d=Math.sqrt(x2-x1)*2+(y2-y1)*2;
       double c=d*Math.PI;
       return c;
    }
}
       
       
       