public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.callElevator(3);
        elevator.selectFloor(5);
        elevator.openDoor();
        elevator.closeDoor();
        elevator.selectFloor(1);
    }
}