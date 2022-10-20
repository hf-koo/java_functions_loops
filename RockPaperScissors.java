import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are");

        String ready = scan.nextLine();

        if(ready.equals("yes")){
            System.out.println("\nGreat!");
            System.out.println("rock -- paper -- scissors, shoot");
            String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();

            System.out.println("\nYou chose:\t" + yourChoice);
            System.out.println("\nComputer chose:\t" + computerChoice);

            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);


        } else {
            System.out.println("Darn some other time...!");
        }

        scan.close();
        
    }

    public static String computerChoice(){
        double randomNumber = Math.random() * 3; // range: 0 - 2.999
        int integer = (int)randomNumber; // range: 0 -2

        switch(integer){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return ""; // impossible
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        }   else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        }  else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        }  
        return result;
      }

      public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose:\t" + yourChoice);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println(result);
    }

}
