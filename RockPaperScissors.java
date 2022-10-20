import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose rock, paper, or scissors.");

        System.out.println("Are you ready? Write 'yes' if you are");
        String answer1 = scan.nextLine();
        if(answer1.equals("yes")){
            System.out.println("Great!");
        } else {
            System.exit(0);
        }

        System.out.println("rock -- paper -- scissors, shoot");
        String input = scan.nextLine();


        scan.close();
        
    }

    
}
