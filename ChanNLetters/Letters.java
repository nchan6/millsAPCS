
/**
 * Write letters to people!
 * 
 * Jia Lian and Norris Chan
 * 8/30/15
 */
public class Letters
{
    public static void main(String[] args){     
        friend();
        parent();
        brother();
    }
    
    public static void friend(){
        heading();
        System.out.println("What's up!");
        hobbies();
        lovelife();
        signature();
    }
    
    public static void parent(){
        heading();
        System.out.println("Dear mom,");
        hobbies();
        money();
        signature();
    }
    
    public static void brother(){
        heading();   
        System.out.println("Hey,");
        money();
        lovelife();
        signature();
    }
    
    public static void hobbies(){
        System.out.println("\tI recently discovered a lot of new hobbies. We should go hangout during the weekend and watch a movie or something!");
        System.out.println("Also, my dad just bought me this new game and its the bomb, you should come over and play with me soon.");
    }
    
    public static void lovelife(){
        System.out.println("\tI can't believe that I just broke up with my girlfriend. It's going to take me a while to get over her.");
        System.out.println("When we were first dating I thought she was the one, but I deserve to be with better people.");
    }
    
    public static void money(){
        System.out.println("\tI know that I always ask you for money, but this time I really need it. I promise I will pay you back as soon as I can.");
        System.out.println("Right now I'm in a bad position and I owe people some money. It would be great if you can lend me $1000 to help me out please.");
    }
    
    public static void heading() {
        System.out.println("Date: 8-27-15");
        System.out.println("Address: 1234 Nowhere St.");
        System.out.println("Cell: 650-911-711");
        System.out.println("");
    }
    
    public static void signature() {
        System.out.println("Regards,\n\nJorris\n");
    }
}

