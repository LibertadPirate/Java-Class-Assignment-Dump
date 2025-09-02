import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //openingmessage
        System.out.println("Welcome to the Weight Program that does absolutely nothing!");
        System.out.print("Please enter your weight in pounds, because this is America and the Imperial system got us to the Moon: ");

        int weight = input.nextInt();

        //meanmessagesbasedonweight
        String message = "";
        if (weight < 50) {
            message = "Eat more.";
        } else if (weight <= 100) {
            message = "I hope you are short.";
        } else if (weight <= 200) {
            message = "Quite average.";
        } else if (weight <= 300) {
            message = "I hope you are tall.";
        } else if (weight <= 500) {
            message = "Into sumo?";
        } else {
            message = "You liar!";
        }

        //messageborder
        System.out.println("\n--------stupidborder---------");
        System.out.println("| " + message + " |");
        System.out.println("--------stupidborder---------\n");
        
        //peacemf
        System.out.println("Peace");
        input.close();
    }
}