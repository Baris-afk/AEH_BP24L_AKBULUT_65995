import java.util.*;

class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
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

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + indexNumber + ") - Average: " + String.format("%.2f", getAverageGrade());
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

        // En yüksek ortalamaya sahip öğrenciyi bul
        Student topStudent = Collections.max(students, Comparator.comparingDouble(Student::getAverageGrade));
        System.out.println("Student with the highest average: " + topStudent);

        // Soyadlara göre sırala
        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("\nStudents sorted by last names:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
