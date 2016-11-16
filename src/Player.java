/**
 * Created by scofieldservices on 11/16/16.
 */
public class Player {

    String name;
    String weapon;
    String location;

    public void chooseName() {
        System.out.println("What is your name?");
        name = Game.scanner.nextLine();
        System.out.println("Welcome, " + name);

    }

    public void chooseWeapon() throws Exception {
    System.out.println("Choose your weapon [sword/mace]");
    weapon = Game.scanner.nextLine();

        if(weapon.equalsIgnoreCase("sword")) {
        System.out.println("A sword is a fine choice!");}
        else if(weapon.equalsIgnoreCase("mace")) {
        System.out.println("A mace is a fine choice!");}
        else {
        throw new Exception("Invalid Weapon");
    }}

    public void chooseLocation() throws Exception {
        System.out.println("Choose your location [forest/tunnel]");
        location = Game.scanner.nextLine();

        if(location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");}
        else if(location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");}
        else {
            throw new Exception("Invalid location:" + location);
        }}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

