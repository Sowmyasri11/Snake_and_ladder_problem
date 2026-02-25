public class SnakeAndLadder {
    static final int NO_PLAY = 0, LADDER = 1, SNAKE = 2;

    public static void displayDiceRoll()
    {

        System.out.println("Dice rolled: "+rollDice());
    }
    public static int rollDice()
    {
        return (int) (Math.random() * 6) + 1;
    }
    public static void singleMoveUseCase(){
        int position = 0;
        int dice = rollDice();
        int option = getGameOption();

        position = updatePlayerPosition(position, dice, option);

        System.out.println("Dice="+dice+ ", Option="+option+", New Position="+position);

    }
    public static int updatePlayerPosition(int position, int dice, int option) {
        if (option == LADDER) position += dice;
        else if (option == SNAKE) position -= dice;

        if (position < 0) position = 0;

        return position;
    }
    public static int getGameOption()
    {
        return (int) (Math.random() * 3);
    }

    public static void reachHundredUseCase(){

        int position = 0;
        while(position < 100){
            int dice = rollDice();
            int option =getGameOption();
            position =updatePlayerPosition(position,dice,option);
        }
        System.out.println("Player reached 100!");

    }

}
