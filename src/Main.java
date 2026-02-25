import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SNAKE & LADDER GAME MENU =====");
            System.out.println("1. Roll a Dice");
            System.out.println("2. Demonstrate Single Move");
            System.out.println("3. Play Until Reaching 100");
            System.out.println("4. Play Until Exact 100");
            System.out.println("8. EXIT");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    SnakeAndLadder.displayDiceRoll();
                    break;
                case 2:
                    SnakeAndLadder.singleMoveUseCase();
                    break;

                case 3:
                    SnakeAndLadder.reachHundredUseCase();
                    break;
                case 4:
                    SnakeAndLadder.exactHundredUseCase();
                    break;
                case 8:
                    System.out.println("Exiting....");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }


    }
}