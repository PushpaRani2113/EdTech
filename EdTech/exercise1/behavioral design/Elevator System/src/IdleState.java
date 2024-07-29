public class IdleState implements ElevatorStates {
    private Elevator elevator;

    public IdleState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void callElevator(int floor) {
        System.out.println("Elevator called to floor " + floor);
        if (floor > elevator.getCurrentFloor()) {
            elevator.setState(new MovingUpState(elevator));
        } else if (floor < elevator.getCurrentFloor()) {
            elevator.setState(new MovingDownState(elevator));
        } else {
            elevator.setState(new DoorOpenState(elevator));
        }
    }

    @Override
    public void selectFloor(int floor) {
        System.out.println("Cannot select floor while idle.");
    }

    @Override
    public void openDoor() {
        System.out.println("Opening door...");
        elevator.setState(new DoorOpenState(elevator));
    }

    @Override
    public void closeDoor() {
        System.out.println("Door is already closed.");
    }
}