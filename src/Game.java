import java.util.Scanner;

/**
 * Created by scofieldservices on 11/16/16.
 */


public class Game {

    public static Scanner scanner = new Scanner (System.in);
    public static Player player = new Player();

    public static void main (String [] args) throws Exception{
        System.out.println("Welcome, traveller");

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();


    }
}
