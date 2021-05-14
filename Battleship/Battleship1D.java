import java.util.Scanner;

public class Battleship1D {

    int[] battleShip= new int[7];
    int guessCounter = 0;
    int hitCounter = 0;
    boolean playing = false;
    public Scanner input = new Scanner(System.in);

    public void playBattleship(){
        playing = true;
        while (playing) {
            System.out.println("Guess a position (1-7)");
            int guess = input.nextInt() - 1;

            if (battleShip[guess] == 2) {
                System.out.println("You have already guessed there");
            } else {
                guessCounter++;
                if (battleShip[guess] == 1) {
                    System.out.println("hit!");
                    hitCounter++;
                    battleShip[guess] = 2;
                }
                if (battleShip[guess] == 0) {
                    System.out.println("miss!");
                    battleShip[guess] = 2;
                }
                if (hitCounter >= 3) {
                    System.out.println("sunk!");
                    playing = false;
                }
            }
        }
    }

    public void scoreRating(){
        if(guessCounter<=3){
            System.out.print("Amazing ");
        }else if(guessCounter<5){
            System.out.print("Nice ");
        }else if(guessCounter<=7){
            System.out.print("Nice try ");
        }
        System.out.println("you took " + guessCounter + " shots!");
    }

    public void makeShip(){//ships are 3 long
        int random = (int) (Math.random() * 5);
        for (int i =random; i <random + 3; i++){
            battleShip[i] = 1;
        }
    }
}
