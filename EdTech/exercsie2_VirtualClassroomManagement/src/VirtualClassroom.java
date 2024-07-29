import java.util.ArrayList;

public class VirtualClassroom {
    private String classroomName;
    private ArrayList<Student> students;
    private ArrayList<String> assignments;

    public VirtualClassroom(String name) {
        this.classroomName = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getClassroomName() {
        return classroomName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<String> getAssignments() {
        return assignments;
    }

    public void addAssignment(String assignment) {
        this.assignments.add(assignment);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String toString() {
        return "VirtualClassroom{" +
                "classroomName='" + classroomName + '\'' +
                ", students=" + students +
                ", assignments=" + assignments +
                '}';
    }
}
