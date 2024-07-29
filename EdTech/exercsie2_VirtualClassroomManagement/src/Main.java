import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            LOGGER.log(Level.INFO, "Enter a command: ");
            String[] command = scanner.nextLine().split(" ");
            try {
                switch (command[0]) {
                    case "add_classroom":
                        if (command.length < 2) {
                            LOGGER.log(Level.WARNING, "Classroom name required.");
                            break;
                        }
                        manager.addClassroom(command[1]);
                        break;
                    case "remove_classroom":
                        if (command.length < 2) {
                            LOGGER.log(Level.WARNING, "Classroom name required.");
                            break;
                        }
                        manager.removeClassroom(command[1]);
                        break;
                    case "list_classrooms":
                        manager.listClassrooms();
                        break;
                    case "add_student":
                        if (command.length < 3) {
                            LOGGER.log(Level.WARNING, "Student ID and classroom name required.");
                            break;
                        }
                        manager.addStudent(command[1], command[2]);
                        break;
                    case "list_students":
                        if (command.length < 2) {
                            LOGGER.log(Level.WARNING, "Classroom name required.");
                            break;
                        }
                        manager.listStudents(command[1]);
                        break;
                    case "schedule_assignment":
                        if (command.length < 3) {
                            LOGGER.log(Level.WARNING, "Classroom name and assignment required.");
                            break;
                        }
                        manager.scheduleAssignment(command[1], command[2]);
                        break;
                    case "submit_assignment":
                        if (command.length < 4) {
                            LOGGER.log(Level.WARNING, "Student ID, classroom name, and assignment required.");
                            break;
                        }
                        manager.submitAssignment(command[1], command[2], command[3]);
                        break;
                    case "exit":
                        LOGGER.log(Level.INFO, "Exiting the program.");
                        scanner.close();
                        exit = true;
                        break;
                    default:
                        LOGGER.log(Level.WARNING, "Unknown command. Please try again.");
                        break;
                }
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Error processing command: ", e);
            }
        }
    }
}
