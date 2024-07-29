import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VirtualClassroomManager {
    private static final Logger LOGGER = Logger.getLogger(VirtualClassroomManager.class.getName());
    private ArrayList<VirtualClassroom> classrooms;

    public VirtualClassroomManager() {
        this.classrooms = new ArrayList<>();
    }

    public void addClassroom(String className) {
        VirtualClassroom classroom = new VirtualClassroom(className);
        classrooms.add(classroom);
        LOGGER.log(Level.INFO, "Classroom {0} has been created", className);
    }

    public void removeClassroom(String className) {
        VirtualClassroom classroom = findClassroom(className);
        if (classroom != null) {
            classrooms.remove(classroom);
            LOGGER.log(Level.INFO, "Classroom {0} has been removed", className);
        } else {
            LOGGER.log(Level.WARNING, "Virtual classroom {0} not found", className);
        }
    }

    public VirtualClassroom findClassroom(String className) {
        for (VirtualClassroom classroom : classrooms) {
            if (classroom.getClassroomName().equals(className)) {
                return classroom;
            }
        }
        return null;
    }

    public void addStudent(String studentId, String className) {
        VirtualClassroom classroom = findClassroom(className);
        if (classroom != null) {
            Student student = new Student(studentId, className);
            classroom.addStudent(student);
            LOGGER.log(Level.INFO, "Student {0} has been enrolled in {1}", new Object[] { studentId, className });
        } else {
            LOGGER.log(Level.WARNING, "Virtual classroom {0} not found", className);
        }
    }

    public void scheduleAssignment(String className, String assignment) {
        VirtualClassroom classroom = findClassroom(className);
        if (classroom != null) {
            classroom.addAssignment(assignment);
            LOGGER.log(Level.INFO, "Assignment for {0} has been scheduled", className);
        } else {
            LOGGER.log(Level.WARNING, "Virtual classroom {0} not found", className);
        }
    }

    public void submitAssignment(String studentId, String className, String assignment) {
        VirtualClassroom classroom = findClassroom(className);
        if (classroom == null) {
            LOGGER.log(Level.WARNING, "Virtual classroom {0} not found", className);
            return;
        }
        if (!classroom.getAssignments().contains(assignment)) {
            LOGGER.log(Level.WARNING, "Assignment {0} not found in classroom {1}",
                    new Object[] { assignment, className });
            return;
        }
        for (Student student : classroom.getStudents()) {
            if (student.getId().equals(studentId)) {
                student.setAssignmentSubmitted(true);
                LOGGER.log(Level.INFO, "Assignment submitted by Student {0} in {1}",
                        new Object[] { studentId, className });
                return;
            }
        }
        LOGGER.log(Level.WARNING, "Student {0} not found in classroom {1}", new Object[] { studentId, className });
    }

    public void listClassrooms() {
        LOGGER.log(Level.INFO, "Listing all classrooms: {0}", classrooms);
    }

    public void listStudents(String className) {
        VirtualClassroom classroom = findClassroom(className);
        if (classroom != null) {
            LOGGER.log(Level.INFO, "Listing students in {0}: {1}", new Object[] { className, classroom.getStudents() });
        } else {
            LOGGER.log(Level.WARNING, "Virtual classroom {0} not found", className);
        }
    }
}
