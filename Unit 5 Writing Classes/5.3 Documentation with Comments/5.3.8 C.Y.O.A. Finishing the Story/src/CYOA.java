import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        // Start by importing your code from the previous exercise

        //Introduction
        System.out.println("Hello! I am going to ask you some questions!");
        //Name Prompt
        System.out.println("What is you name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        //Greeting
        System.out.println("Nice to meet you, " + name + "!");

        //First Choice Prompt: Mike Tyson or Jake Paul?
        System.out.println("[M]ike Tyson or [J]ake Paul?");
        String firstChoice = input.next();
        if (firstChoice.toUpperCase().substring(0,1).equals("M")) //User Chooses Mike Tyson
            {
                firstChoice = "Mike Tyson";
                System.out.println("Mike Tyson is really cool!"); //Mike Tyson Description
            }
        else if (firstChoice.toUpperCase().substring(0,1).equals("K")) //User Chooses Jake Paul
            {
                firstChoice = "Jake Paul";
                System.out.println("Jake Paul isn't as cool as Mike Tyson."); //Jake Paul Description
            }
        else
            System.out.println("Error!");

        //Second Choice Prompt: Vanilla or Chocolate?
        System.out.println("[V]anilla or [C]hocolate?");
        String secondChoice = input.next();
        if (secondChoice.toUpperCase().substring(0,1).equals("V")) //User Chooses Vanilla
            {
                secondChoice = "Vanilla";
                System.out.println("Ew, Vanilla?!"); //Vanilla Description
            }
        else if (secondChoice.toUpperCase().substring(0,1).equals("C")) //User Chooses Chocolate
            {
                secondChoice = "Chocolate";
                System.out.println("Chocolate is super cool!"); //Chocolate Description
            }
        else
            System.out.println("Error!");

        if (firstChoice.equals("Mike Tyson") && secondChoice.equals("Vanilla"))//Ending One: Mike Tyson and Vanilla
            System.out.println("What an epic combination!");
        else if (firstChoice.equals("Mike Tyson") && secondChoice.equals("Chocolate"))//Ending Two: Mike Tyson and Chocolate
            System.out.println("Perhaps the best combination!");
        else if (firstChoice.equals("Jake Paul") && secondChoice.equals("Vanilla"))//Ending Three: Jake Paul and Vanilla
            System.out.println("I can't say I agree...");
        else if (firstChoice.equals("Jake Paul") && secondChoice.equals("Chocolate"))//Ending Four: Jake Paul and Chocolate
            System.out.println("You have good taste in icecream at least!");
        else
            System.out.println("Error!");
    }
}