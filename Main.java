import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("#                                                         #");
        System.out.println("#          welcome to Rock, Paper and Scissors.           #");
        System.out.println("#                     Best of 3!                          #");
        System.out.println("#                                                         #");
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println();
        System.out.println("============================================================");


        boolean game_over = true;


        while(game_over != false) {
            int gameCount = 0;
            int player_count = 0;
            int bot_count = 0;
            while (gameCount != 3) {


                System.out.print("\nRock, Paper or Scissors? ");
                String choice = sc.next().toLowerCase();
                while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
                    System.out.print("\nInvalid input! Please enter again to continue: ");
                    choice = sc.next().toLowerCase();
                }
                System.out.println("You have picked: " + choice);


                Random random = new Random();
                int index = random.nextInt(choices.length);
                String bot = choices[index];
                System.out.println("Bot picked: " + bot);


                if (bot.equals(choice)) {
                    System.out.println("Draw!");
                    continue;
                } else if (bot.equals("rock") && choice.equals("paper") || bot.equals("paper") && choice.equals("scissors") || bot.equals("scissors") && choice.equals("rock")) {
                    player_count++;
                    System.out.println("Match won by Player= " + player_count);

                } else {
                    bot_count++;
                    System.out.println("Match won by Bot=" + bot_count);
                }
                gameCount++;
            }


            System.out.println();
            if (bot_count > player_count) {
                System.out.println("You lost the match!");
            } else {
                System.out.println("You have won the match!");
            }
            System.out.println("============================================================");
            System.out.print("\nDo you want to continue playing(yes/no)? ");
            String again = sc.next().toLowerCase();
            while(!again.equals("yes") && !again.equals("no")){
                System.out.print("Invalid input: ");
                again = sc.next().toLowerCase();
            }
            if (again.equals("no")){
                game_over = false;
            }

        }
    }
}
