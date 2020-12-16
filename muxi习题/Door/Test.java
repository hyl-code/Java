package Door;

public class Test {
    public static void main(String[] args){
        men m = new men();
        m.openDoor();
        m.closeDoor();
    }
}

abstract class Door {
    public void openDoor() {};
    public void closeDoor() {};
}