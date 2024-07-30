# EdTech
1. Exercise 1
   - Behavioral Design
     - [Elevator System](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/behavioral%20design/Elevator%20System/src)
     - [Traffic Monitor System](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/behavioral%20design/Traffic%20Monitor%20System/src)
   - Creational Design
     - [Singleton Design -- Logger](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/creational%20design/Singleton%20design/src)
     - [Word Document](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/creational%20design/Word%20document/src)
   - Structural Design
     - [Farming System](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/structural%20design/Farming%20System/src)
     - [UI Component](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/structural%20design/UI%20Component/src)
2. Exercise 2
- [Virtual Classroom Manager Programming](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercsie2_VirtualClassroomManagement/src)

## Exercise 1
### Behavioral Design
### [Elevator System](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/behavioral%20design/Elevator%20System/src)
     - State design pattern
     - An elevator system has multiple states:
       - Idle: The elevator is not moving and waiting for a command.
       - Moving Up: The elevator is moving up.
       - Moving Down: The elevator is moving down.
       - Door Open: The elevator door is open.
    Each state has different behaviors for handling events like calling the elevator, selecting a floor, opening/closing the door, etc.
### [Traffic Monitor System](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/behavioral%20design/Traffic%20Monitor%20System/src)
      - Observer pattern
      - Actors:
        - RoadTrafficMonitor (Subject): Detects objects or conditions on the road and notifies car drivers about these detections.
        - CarDriver (Observer): Receives updates about road conditions or obstacles and adjusts their driving behavior accordingly.
### Creational Design
### [Singleton Design -- Logger](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/creational%20design/Singleton%20design/src)
      - The Main class demonstrates how to use the Singleton Logger to record various messages.
      - The same Logger instance is used throughout the application, ensuring all log messages are written to the same file.
### [Word Document](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/creational%20design/Word%20document/src)
      - Factory Method Pattern
      - Defines an interface for creating objects but allows subclasses to alter the type of objects that will be created.         - The DocumentFactory and its subclasses (WordDocumentFactory and PDFDocumentFactory) demonstrate this pattern, allowing for the creation of different types of documents.
### Structural Design
### [Farming System](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/structural%20design/Farming%20System/src)
      - Bridge Pattern
      - Demonstrates how to use the Bridge pattern to manage crops with different farming techniques. By using different combinations of CropManagement and FarmingTechnique.
      - Decouples the abstraction (crop management) from the implementation (farming techniques), making the system more flexible and easier to extend.
      - Allows for easy addition of new types of crops or farming techniques without altering existing code.
### [UI Component](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercise1/structural%20design/UI%20Component/src)
      - Decorator Pattern
      - Create an instance of UIComponent (e.g., BasicWindow).
      - Wrap the component with decorators to add desired functionalities.
      - Call the render method on the decorated component.

## Exercise 2
### [Virtual Classroom Manager Programming](https://github.com/PushpaRani2113/EdTech/tree/main/EdTech/exercsie2_VirtualClassroomManagement/src)
- This program achieves **Encapsulation** by VirtualClassroom and Student classes encapsulate their data members (e.g., classroomName, students, assignments in VirtualClassroom, and id, classroomName, assignSubmit in Student) and provide public methods to access and modify these members.
- Achieves **Abstraction** by exposing only necessary methods like getClassroomName(), setStudents(), getAssignments(), etc., while the internal workings (e.g., how assignments and students are stored) are hidden from the user.
- Achieves **Logging** by using java.util.logging to record operations such as classroom creation and student enrollment, and exception handling by throwing and catching custom exceptions like ClassroomNotFoundException, StudentNotFoundException, and AssignmentNotScheduledException to manage errors such as when no classroom, student, or assignment is found.
  - **Student**
    -  Class Variables and Constructor:
      - studentId: A string to hold the unique identifier for the student.
      - classroomName: A string to hold the name of the classroom to which the student is assigned.
      - assignmentSubmitted: A boolean to indicate whether the student has submitted the assignment.
      - Student(): Initializes the student class.
        
  - **Virtual Classroom**
    - Class Variables and Constructor:
    - classroomName: A string to hold the name of the classroom.
    - students: An ArrayList<Student> to store the list of students enrolled in the classroom.
    - assignments: An ArrayList<String> to store the list of assignments scheduled for the classroom.
    - VirtualClassroom(): Initializes the VitrualClassroom class with 0 students and 0 assignment at initial.
      
  - **VirtualClassroomManager**
    - Well-structured class for managing virtual classrooms and their associated students and assignments.
    - Class Variables and Constructor:
      - ArrayList<VirtualClassroom> classes: A list to hold all virtual classrooms.
      - VirtualClassroomManager(): Initializes the VirtualClassroomManager class with 0 classroom at initial.
    - Methods:
      - addVclassroom(String cname): Adds a new virtual classroom with the given name to the list.
      - isClassroomAvailable(ArrayList<VirtualClassroom> classes, String cname): Checks if a classroom with the given name exists in the list and returns it if found.
      - addStudent(ArrayList<VirtualClassroom> classes, String sid, String cname): Adds a student with the given ID to the specified classroom if it exists.
      - listClassrooms(): Prints the list of all virtual classrooms.
      - listStudents(ArrayList<VirtualClassroom> classes, String cname): Lists all students in the specified classroom if it exists.
      - scheduleAssignment(ArrayList<VirtualClassroom> classes, String cname, String assign): Schedules an assignment for the specified classroom if it exists.
      - assignmentSubmission(ArrayList<VirtualClassroom> classes, String id, String cname, String assign): Allows a student to submit an assignment for the specified classroom if both the student and the assignment exist.
  
!["Result"](https://github.com/PushpaRani2113/EdTech/blob/main/EdTech/Output.png)


!["Error Handling"](https://github.com/PushpaRani2113/EdTech/blob/main/EdTech/output1.png)
