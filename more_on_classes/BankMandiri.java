package more_on_classes;

public class BankMandiri {
    private double balance = 0;
    public void deposit(double x) {
        if (x > 0) {
            balance+= x;
            System.out.println(balance);
        }
    }

    public static void main(String[] args) {
        BankMandiri person = new BankMandiri();
        person.deposit(250.50);
        person.deposit(300);
    }
}
