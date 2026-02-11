import java.util.Random;
import java.util.Scanner;
class numGuess{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guess = rand.nextInt(100)+1; // Generate a random number between 1-100
        int chances = 5;
        for(int i=0; i<5;i++){  // loop for limiting chances to 5
            try {
                System.out.println("Guess a number between 0 and 100");
                int userinput = sc.nextInt();
                if(userinput >= 1 && userinput <= 100){ // Check if the input is valid
                    if(guess == userinput){
                        System.out.println("You win!");
                    }
                    else if(guess > userinput){
                        System.out.println("Too low!");
                    }
                    else{
                        System.out.println("Too high!");
                    }
                }else{
                    System.out.println("Invalid input! Please enter a number between 1 and 100.");
                }

                chances--; // Decrease chances by 1
                System.out.println("Chances left: " + chances); //display chances left
                } catch (Exception InputMismatchException) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.next(); // Clear the invalid input
                    chances--; // Decrease chances by 1 even for invalid input
                    System.out.println("Chances left: " + chances); //display chances left
                }
        }

    }

}