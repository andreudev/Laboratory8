package liskov.substitution;

public class Programmer extends Employee {

    String languaje;

    public Programmer(String name, int payment, String languaje) {
        super(name, payment);
        this.languaje = languaje;
    }

    public void setLanguaje(String lang) {
        this.languaje = lang;
    }

    @Override
    public int calculatePayment() {
        return (int) (this.payment + this.payment * 0.10);
    }
}
