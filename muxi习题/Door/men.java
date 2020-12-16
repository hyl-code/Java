package Door;

public class men extends Door implements door{
    public void openDoor(){
        System.out.println("The door is open.");
    }

    public void closeDoor(){
        System.out.println("The door is close.");
    }

    public void theftproof(){
        System.out.println("The door can theftproof.");
    }

    public void waterproof(){
        System.out.println("The door can waterproof.");
    }

    public void fireproof(){
        System.out.println("The door can fireproof.");
    }

    public void bulletproof(){
        System.out.println("The door can bulletproof.");
    }

    public void rustproof(){
        System.out.println("The door can rustproof.");
    }
}
