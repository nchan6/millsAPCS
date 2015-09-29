
/**
 * Write a description of class day10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class day10
{
    public static void main(String[] args){
        friends();
        parents();
        brother();
    }
    public static void friends(){
        hobbies();
        lovelife();
    }
    public static void parents(){
        hobbies();
        money();
    }
    public static void brother(){
        money();
        lovelife();
    }
    public static void hobbies(){
        System.out.println("We should go hangout during the weekend and watch a movie or something");
        System.out.println("My dad just bought me this new game and its the bomb. You should come over and play with me");
    }
    public static void lovelife(){
        System.out.println("I can believe that I just broke up with my girlfriend. It's going to take me a while to get over her.");
        System.out.println("When we were first daying I thought I found the one, but I deserve be with better people.");
    }
    public static void money(){
        System.out.println("I know that I always ask you for money, but can you lend me a dollar. I promise I will pay you back as soon as I can.");
        System.out.println("Right now I'm in a bad position and I owe people some money. Can lend a dollar to help me out please.");
    }
}
        