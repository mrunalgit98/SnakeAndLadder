import java.util.Scanner;

public class UC3{
    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("Enter your name-- ");
        Scanner sc = new Scanner(System.in);
        String Player_Name = sc.next();

        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6);
        System.out.println("Dice Roll number --" + dieRoll);

        int checkOption = (int) (Math.floor(Math.random() * 10) % 3);

        switch (checkOption)

        {
            case 0:
                System.out.println("Snake");
                startPosition = dieRoll;
                break;

            case 1:
                System.out.println("Ladder");
                startPosition = dieRoll;
                break;

            default:
                System.out.println("NO PLAY");
                startPosition = 0;
        }
        System.out.println("Player " + Player_Name + "On Position :" + startPosition);


    }
}
