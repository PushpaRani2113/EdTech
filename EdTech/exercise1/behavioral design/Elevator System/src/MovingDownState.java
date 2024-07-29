public class MovingDownState implements ElevatorStates {
    private Elevator elevator;

    public MovingDownState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void callElevator(int floor) {
        System.out.println("Elevator is moving down. Cannot call elevator.");
    }

    @Override
    public void selectFloor(int floor) {
        System.out.println("Floor " + floor + " selected.");
        if (floor < elevator.getCurrentFloor()) {
            elevator.moveToFloor(floor);
            elevator.setState(new IdleState(elevator));
        } else if (floor > elevator.getCurrentFloor()) {
            elevator.setState(new MovingUpState(elevator));
            elevator.selectFloor(floor);
        } else {
            elevator.setState(new DoorOpenState(elevator));
        }
    }

    @Override
    public void openDoor() {
        System.out.println("Cannot open door while moving.");
    }

    @Override
    public void closeDoor() {
        System.out.println("Cannot close door while moving.");
    }
}