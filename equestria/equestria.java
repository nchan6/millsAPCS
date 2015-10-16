
/**
 * Write a description of class equestria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class equestria
{
    public static void main(String[] args){
        System.out.println("Distance from Baltimare to Manehattan = " + cityDistance(32,25,35,9));
        System.out.println("Distance from Los Pegasus to Neighagra Falls = " + cityDistance(6,18,22,7));
        System.out.println("Distance from the Badlands to Ponyville = " + cityDistance(25,22,16,13));
        roadTrip(1,2,3,4);
        distanceAndAngle(32,25,35,9,22,7);
    }
    public static double cityDistance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt((Math.pow((x2-x1),2))+Math.pow((y2-y1),2));
        return distance;
    }
    public static double roadTrip(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt((Math.pow((x2-x1),2))+Math.pow((y2-y1),2));
        double circumference = distance*Math.PI;
        return circumference;
    }
    public static double distanceAndAngle(int x1,int y1,int x2,int y2,int x3,int y3){
        double distanceA = cityDistance(x1,y1,x2,y2);
        double distanceB = cityDistance(x2,y2,x3,y3);
        double distanceC = cityDistance(x3,y3,x1,y1);
        double angleA = Math.acos((-Math.pow((distanceA),2)+Math.pow((distanceB),2)+Math.pow((distanceC),2))/(2*distanceB*distanceC));
        return angleA;
        double angleB = Math.acos((Math.pow((distanceA),2)-Math.pow((distanceB),2)+Math.pow((distanceC),2))/(2*distanceA*distanceC));
        return angleB;
        double angleC = 180-angleA-angleB;
        return angleC;
    }
}