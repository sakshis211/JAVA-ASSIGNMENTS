interface Payable {
    double calculatePayment();
}

abstract class Employee implements Payable {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    abstract String getEmployeeType();

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name +
               ", Type: " + getEmployeeType();
    }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;

    SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);

        this.monthlySalary = monthlySalary;
    }

    @Override
    String getEmployeeType() {
        return "Salaried Employee";
    }

    @Override
    public double calculatePayment() {
        return monthlySalary;
    }

    public String toString() {
        return super.toString() +
               ", Monthly Salary: " + monthlySalary;
    }
}

class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyRate;

    HourlyEmployee(String name, int id, double hours, double hourlyRate) {
        super(name, id);

        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    String getEmployeeType() {
        return "Hourly Employee";
    }

    @Override
    public double calculatePayment() {
        return hours * hourlyRate;
    }

    public String toString() {
        return super.toString() +
               ", Hours: " + hours +
               ", Hourly Rate: " + hourlyRate;
    }
}

class Invoice implements Payable {
    private String invoiceNumber;
    private double amount;

    Invoice(String invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount;
    }

    public String toString() {
        return "Invoice: " + invoiceNumber +
               ", Amount: " + amount;
    }
}

class PayrollProcessor {
    private Payable[] payments;
    private int size;

    PayrollProcessor(int capacity) {
        payments = new Payable[capacity];
        size = 0;
    }

    void addPayment(Payable payment) {
        if (size < payments.length) {
            payments[size] = payment;
            size++;
        } else {
            System.out.println("Payroll is full.");
        }
    }

    double calculateTotalPayment() {
        double total = 0;

        for (int i = 0; i < size; i++) {
            total += payments[i].calculatePayment();
        }

        return total;
    }

    Payable largestPayment() {
        Payable largest = payments[0];

        for (int i = 1; i < size; i++) {
            if (payments[i].calculatePayment() >
                largest.calculatePayment()) {
                largest = payments[i];
            }
        }

        return largest;
    }

    void countPaymentTypes() {
        int employees = 0;
        int nonEmployees = 0;

        for (int i = 0; i < size; i++) {
            if (payments[i] instanceof Employee) {
                employees++;
            } else {
                nonEmployees++;
            }
        }

        System.out.println("Employee Payments: " + employees);
        System.out.println("Non-Employee Payments: " + nonEmployees);
    }
}
