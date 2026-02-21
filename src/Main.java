import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SNAKE & LADDER GAME MENU =====");
            System.out.println("1. Roll a Dice");
            System.out.println("2. Demonstrate Single Move");
            System.out.println("8. EXIT");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    SnakeAndLadder.displayDiceRoll();
                    break;
                case 2:
                    SnakeAndLadder.singleMoveUseCase();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }


    }
}