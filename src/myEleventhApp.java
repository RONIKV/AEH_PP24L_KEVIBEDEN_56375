import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>(grades);
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}

public class myEleventhApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // Find the student with the highest average grade
        Optional<Student> topStudent = students.stream()
                .max(Comparator.comparingDouble(Student::calculateAverageGrade));

        // Calculate the average grade of all students
        double overallAverage = students.stream()
                .mapToDouble(Student::calculateAverageGrade)
                .average()
                .orElse(0.0);

        // Sort students by last name
        students.sort(Comparator.comparing(Student::getLastName));

        // Display the student with the highest average
        topStudent.ifPresent(student -> System.out.println("Student with the highest average: "
                + student.getFirstName() + " " + student.getLastName() + " (" + student.getIndexNumber() + ") - Average: "
                + student.calculateAverageGrade()));

        // Display all students sorted by last names
        System.out.println("Students sorted by last names:");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " ("
                    + student.getIndexNumber() + ") - Average: " + student.calculateAverageGrade());
        }
    }
}


