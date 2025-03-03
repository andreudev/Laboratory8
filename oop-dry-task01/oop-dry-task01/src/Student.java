import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private List<Subject> subjects;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public double calculateAverage() {
        double total = 0;
        for (Subject subject : subjects) {
            total += subject.getScore();
        }
        return total / subjects.size();
    }
}