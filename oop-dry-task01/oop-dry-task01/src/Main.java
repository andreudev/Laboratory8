import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Student> students = new ArrayList<>();
    private static int nextStudentId = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 6) {
            System.out.println("1. New student");
            System.out.println("2. List students");
            System.out.println("3. Add subject");
            System.out.println("4. Edit scores");
            System.out.println("5. View student");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    addNewStudent(sc);
                    break;
                case 2:
                    listStudents();
                    break;
                case 3:
                    addNewSubject(sc);
                    break;
                case 4:
                    editScores(sc);
                    break;
                case 5:
                    viewStudent(sc);
                    break;
                default:
                    break;
            }
        }
    }

    private static void addNewStudent(Scanner sc) {
        System.out.println("Insert name:");
        String name = sc.nextLine();
        Student student = new Student(nextStudentId++, name);
        students.add(student);
    }

    private static void listStudents() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
            for (Subject subject : student.getSubjects()) {
                System.out.println(subject.getName() + ": " + subject.getScore());
            }
            System.out.println();
        }
    }

    private static void addNewSubject(Scanner sc) {
        System.out.println("Insert student ID:");
        int studentId = Integer.parseInt(sc.nextLine());
        Student student = findStudentById(studentId);
        if (student != null) {
            System.out.println("Subject name:");
            String subjectName = sc.nextLine();
            System.out.println("Initial score:");
            double score = Double.parseDouble(sc.nextLine());
            student.addSubject(new Subject(subjectName, score));
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void editScores(Scanner sc) {
        System.out.println("Insert student ID:");
        int studentId = Integer.parseInt(sc.nextLine());
        Student student = findStudentById(studentId);
        if (student != null) {
            for (Subject subject : student.getSubjects()) {
                System.out.println(subject.getName() + " Current score: " + subject.getScore());
                System.out.print("New score: ");
                double newScore = Double.parseDouble(sc.nextLine());
                subject.setScore(newScore);
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void viewStudent(Scanner sc) {
        System.out.println("Insert student ID:");
        int studentId = Integer.parseInt(sc.nextLine());
        Student student = findStudentById(studentId);
        if (student != null) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
            double average = student.calculateAverage();
            for (Subject subject : student.getSubjects()) {
                System.out.println(subject.getName() + ": " + subject.getScore());
            }
            System.out.println("Average: " + average);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}