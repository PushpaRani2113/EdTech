public class Elevator {
    private ElevatorStates idleState;
    private ElevatorStates movingUpState;
    private ElevatorStates movingDownState;
    private ElevatorStates doorOpenState;

    private ElevatorStates currentState;
    private int currentFloor = 0;

    public Elevator() {
        idleState = new IdleState(this);
        movingUpState = new MovingUpState(this);
        movingDownState = new MovingDownState(this);
        doorOpenState = new DoorOpenState(this);
        currentState = idleState;
    }

    public void setState(ElevatorStates state) {
        currentState = state;
    }

    public void callElevator(int floor) {
        currentState.callElevator(floor);
    }

    public void selectFloor(int floor) {
        currentState.selectFloor(floor);
    }

    public void openDoor() {
        currentState.openDoor();
    }

    public void closeDoor() {
        currentState.closeDoor();
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveToFloor(int floor) {
        System.out.println("Moving to floor " + floor);
        currentFloor = floor;
    }
}
