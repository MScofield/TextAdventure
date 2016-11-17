import java.util.ArrayList;

/**
 * Created by scofieldservices on 11/16/16.
 */
public class Player {

    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList();

    public void findItem(String item){
        System.out.println("You found a " + item +"! Pick it up? [y/n]");
        String answer = Game.nextLine();
        if(answer.equalsIgnoreCase("y")){
            items.add(item);
                    System.out.println("You picked up an item!");
    }   else {
            System.out.println("Are you sure you want to discard " + item + "? [y/n]");
            answer = Game.nextLine();
            if(answer.equals("n")){
                items.add(item);
                System.out.println("You picked up an item!");
            }
        }
    }

    public void chooseName() {
        System.out.println("What is your name?");
        name = Game.nextLine();
        System.out.println("Welcome, " + name);

    }

    public void chooseWeapon() throws Exception {
    System.out.println("Choose your weapon [sword/mace]");
    weapon = Game.nextLine();

        if(weapon.equalsIgnoreCase("sword")) {
        System.out.println("A sword is a fine choice!");}
        else if(weapon.equalsIgnoreCase("mace")) {
        System.out.println("A mace is a fine choice!");}
        else {
        throw new Exception("Invalid Weapon");
    }}

    public void chooseLocation() throws Exception {
        System.out.println("Choose your location [forest/tunnel]");
        location = Game.nextLine();

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

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}

