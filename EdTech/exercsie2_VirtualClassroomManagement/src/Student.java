public class Student {
    private String studentId;
    private String classroomName;
    private boolean assignmentSubmitted;

    public Student(String id, String classroom) {
        this.studentId = id;
        this.classroomName = classroom;
        this.assignmentSubmitted = false;
    }

    public String getId() {
        return studentId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setAssignmentSubmitted(boolean assignmentSubmitted) {
        this.assignmentSubmitted = assignmentSubmitted;
    }

    public boolean isAssignmentSubmitted() {
        return assignmentSubmitted;
    }

    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", classroomName='" + classroomName + '\'' +
                ", assignmentSubmitted=" + assignmentSubmitted +
                '}';
    }
}
