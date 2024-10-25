import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean hasGuessed = false;
        int numOfChoices = 1;


        System.out.println("Hello, hello and welcome to our humble game.\nYou will be tasked with guessing a randomly generated number from 1 to 100. \n\nWe wish you good luck!!!");
        int randomNum = rand.nextInt(1,101);

        while(!hasGuessed){
            System.out.println("Enter your " + numOfChoices + " guess");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();

                if(number > 100) {
                    System.out.println("Please enter a number less than or equal to 100");
                    continue;
                }
                else if(number < 0) {
                    System.out.println("Please enter a number greater than or equal to 0");
                    continue;
                }

                if(number == randomNum){
                    System.out.println("CONGRATULATIONS!!! You have guessed the random number! Well done!");
                    hasGuessed = true;
                }else if(number > randomNum){
                    System.out.println("The number you provided is larger than the number we seek!");
                }else if(number < randomNum){
                    System.out.println("The number you provided is less than the number we seek!");
                }
            }else if(scanner.hasNextDouble()){
                double number = scanner.nextDouble();
                System.out.println("Please enter a whole number");
            } else if(scanner.hasNextLong()){
                long number = scanner.nextLong();
                System.out.println("Please enter a number from 1 to 100");
            }
            else{
                String line = scanner.next();

                if(line.equals("Quit") || line.equals("quit") || line.equals("exit") || line.equals("Exit") || line.equals("stop") || line.equals("Stop")){
                    System.out.println("Goodbye!" + " The correct number was: " + randomNum);
                    System.exit(0);
                }else System.out.println("Wrong input! " + line + " was invalid.");
            }
            numOfChoices++;
        }
    }

}
