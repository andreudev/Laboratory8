package liskov.substitution;

public class Tester extends Employee {
    TestType testType;

    public Tester(String name, int payment) {
        super(name, payment);
    }

    public void setTestType(TestType type) {
        testType = type;
    }

    @Override
    public int calculatePayment() {
        return (int) (this.payment + this.payment * 0.15);
    }
}
