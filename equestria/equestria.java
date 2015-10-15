
/**
 * Write a description of class equestria here.
 * 
 * Norris Chan
 * 10/13/2015
 */
public class equestria
{
   public static void main(String[] args){
       System.out.println("Distance from Baltimore to Manehattan = " + distanceCity(32,25,35,9));
       System.out.println("Distance from Los Pegasus to Neighagra Falls = " + distanceCity(6,18,22,7));
       System.out.println("Distance from Badlands to Ponyville = " + distanceCity(25,22,16,13));
       roadTrip(1,2,2,3);
       System.out.println("angle a is " + angleA);
       System.out.println("angle b is " + angleB);
       System.out.println("angle c is " + angleC);
       
    }
   public static double distanceCity(int x1, int y1, int x2, int y2){
       double distance=Math.sqrt(x2-x1)*2+(y2-y1)*2;
       return distance;
    }
   public static double roadTrip(int x1, int y1, int x2 , int y2){
       double distance = distanceCity(x1,y1,x2,y2);
       double circumference=distance*Math.PI;
       return circumference;
    }
    //use law of cosine
   public static double tour(int x1, int y1, int x2, int y2, int x3, int y3){
       double a = distanceCity(x1,y1,x2,y2);
       double b = distanceCity(x2,y2,x3,y3);
       double c = distanceCity(x3,y3,x1,y1);
       double angleA = Math.asin
        
    }
    
   
}
       
       
       