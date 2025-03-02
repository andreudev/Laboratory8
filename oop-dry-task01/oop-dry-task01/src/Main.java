import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static double calculateAvg(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList(List.of(new String[]{"Gery", "Joel", "Carmen", "Lia", "Phill"}));
        List<List<Double>> scores = new ArrayList(List.of(new ArrayList(List.of(new Double[]{67.0, 80.0, 90.5, 75.3, 70.0})), new ArrayList(List.of(new Double[]{70.0, 85.0, 65.5, 75.3, 80.0})), new ArrayList(List.of(new Double[]{69.0, 85.0, 95.5, 85.3, 74.0}))));
        List<String> subjects = new ArrayList<>(List.of(new String[]{"Programming", "DataBase", "Language"}));

        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option !=6) {
            System.out.println("1. New student");
            System.out.println("2. List students");
            System.out.println("3. Add subject");
            System.out.println("4. Edit scores");
            System.out.println("5. View student");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:{
                    String name = "";
                    System.out.println("Insert name");
                    name = sc.nextLine();
                    students.add(name);
                    for (int j = 0; j < scores.size(); j++) {
                        scores.get(j).add(0.0);
                    }
                    }
                    break;
                case 2:{
                    for (int i = 0; i < students.toArray().length; i++) {
                        System.out.println("Name: " + students.get(i));
                        for (int j = 0; j < subjects.size(); j++) {
                            System.out.print(subjects.get(j) + ": " + scores.get(j).get(i) + " ");
                        }
                        System.out.println();
                    }
                    }
                    break;
                case 3:
                    String newSubject = "";
                    System.out.println("Subject name: ");
                    newSubject = sc.nextLine();
                    subjects.add(newSubject);
                    scores.add(new ArrayList<>());
                    for (int i = 0; i < students.toArray().length; i++) {
                        scores.get(scores.size() - 1).add(0.0);
                    }
                    break;
                case 4: {
                    int studentIndex = -1;
                    System.out.println("Select student index:");
                    studentIndex = Integer.parseInt(sc.nextLine());
                    System.out.println(students.get(studentIndex));
                    for (int i = 0; i < subjects.size(); i++) {
                        System.out.println(subjects.get(i) + " Current score :" + scores.get(i).get(studentIndex));
                        System.out.print("new Score: ");
                        double newScore = Integer.parseInt(sc.nextLine());
                        scores.get(i).set(studentIndex, newScore);
                    }
                    }
                    break;
                case 5: {
                    int studentIndex = -1;
                    System.out.println("Select student index: ");
                    studentIndex = Integer.parseInt(sc.nextLine());
                    System.out.println(students.get(studentIndex));
                    double average = 0.0;
                    for(int i = 0; i < subjects.toArray().length; i++) {
                        System.out.println(subjects.get(i) + ": " + scores.get(i).get(studentIndex) + " ");
                        average += scores.get(i).get(studentIndex);
                    }
                    System.out.println("Average : " + average/subjects.size());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}