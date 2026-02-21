public class SnakeAndLadder {

    public static void displayDiceRoll(){
        System.out.println("Dice rolled: "+rollDice());
    }
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
