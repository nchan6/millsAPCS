
/**
 * Write a description of class Homecoming here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Homecoming
{
    public static final Scanner bleh = new Scanner(System.in);
     public static void main(String[] args){
        getADate();
        damage();
    }
    public static void getADate(){
        System.out.print("Hi! My name is ");
        String boy = bleh.nextLine();
        System.out.print("What's your name? ");
        String girl = bleh.nextLine();
        System.out.println();
        System.out.println("Nice to meet you "+girl+".");
        System.out.println("Would you like to go to Homecoming with me?");
        System.out.println("Great! It'll be a magical night -- "+girl+" and "+boy+" going to the Mills Homecoming Dance 2015!");
        System.out.println();
    }
    public static void damage(){
        System.out.println("Let's figure out the damage for the evening.\n");
        System.out.println("What are your estimated costs?");
        System.out.print("Tickets(each): ");
        double tickets = bleh.nextDouble();
        System.out.print("Flowers(total for both of you): ");
        double flowers = bleh.nextDouble();
        System.out.print("Pictures: ");
        double pictures = bleh.nextDouble();
        System.out.print("Dinner(per meal): ");
        double dinner = bleh.nextDouble(); 
        System.out.print("New clothes(Tie to match dress?Vest?Dress?Non-tennis shoes?): ");
        double clothes = bleh.nextDouble();
        System.out.print("Any other expenses: ");
        double others = bleh.nextDouble(); 
        System.out.println();
        double subtotal = (flowers+pictures+dinner+clothes+(tickets*2)+others);
        double tax = Math.round((((dinner*2)+clothes))*.0825*100.0)/100.0;
        double total = Math.round((tax+subtotal)*100.0)/100.0;
        System.out.println("So, you should expect to spend, including tax, "+total);
        System.out.println("If you split the cost with your date, each will pay "+(total/2));
        statsTable(tickets,flowers,pictures,dinner,clothes,others,subtotal,tax,total);
    }
    public static void statsTable(double tickets,double flowers,double pictures,double dinner,double clothes,double others,double subtotal,double tax,double total){
        System.out.println();
        System.out.println("MHS Homecoming 2015");
        System.out.println("Vickie Viking and Melvin Mustang\n");
        System.out.println("Tickets(total):                    "+(tickets*2));
        System.out.println("Flowers(for both of you):          "+flowers);
        System.out.println("Pictues:                           "+pictures);
        System.out.println("Dinner(for two):                   "+(dinner*2));
        System.out.println("New Clothes:                       "+clothes);
        System.out.println("Any other expenses:                "+others);
        System.out.println();
        System.out.println("                          Subtotal "+subtotal);
        System.out.println("                         Sales tax "+tax);
        System.out.println("                             Total "+total);
        
    }
}
