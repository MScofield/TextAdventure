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
        player.findItem("Sheild");
        player.findItem("Boots");
        player.findItem("Belt");

        while(true) {
            nextLine();
        }

    }
    //scanner with switch statement to allow user menu commands
    public static String nextLine(){
        String line = scanner.nextLine();
        while   (line.startsWith("/")){
            switch (line) {
                case "/inv":
                    for(String item : player.getItems()){
                        System.out.println(item);
                    }
                    break;
                case "/exit":
                    System.exit(0);
                    break;
                case "/weapon":
                    System.out.println(player.getWeapon());
                    break;
                default:
                    System.out.println("you're dead to me, more dead than my dead cat");
                    break;
            }
            line= scanner.nextLine();
        }
        return line;
    }
}
