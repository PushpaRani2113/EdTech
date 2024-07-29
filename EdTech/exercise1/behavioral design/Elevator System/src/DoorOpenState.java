public class DoorOpenState implements ElevatorStates {
    private Elevator elevator;

    public DoorOpenState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void callElevator(int floor) {
        System.out.println("Elevator door is open. Cannot call elevator.");
    }

    @Override
    public void selectFloor(int floor) {
        System.out.println("Cannot select floor while door is open.");
    }

    @Override
    public void openDoor() {
        System.out.println("Door is already open.");
    }

    @Override
    public void closeDoor() {
        System.out.println("Closing door...");
        elevator.setState(new IdleState(elevator));
    }
}