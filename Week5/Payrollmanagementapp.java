public class PayrollManagementApp {
    public static void main(String[] args) {

        PayrollProcessor processor = new PayrollProcessor(5);

        SalariedEmployee e1 =
            new SalariedEmployee("Sakshi", 101, 50000);

        SalariedEmployee e2 =
            new SalariedEmployee("Rahul", 102, 45000);

        HourlyEmployee e3 =
            new HourlyEmployee("Ananya", 103, 160, 250);

        HourlyEmployee e4 =
            new HourlyEmployee("Amit", 104, 120, 300);

        Invoice invoice =
            new Invoice("INV101", 35000);

        processor.addPayment(e1);
        processor.addPayment(e2);
        processor.addPayment(e3);
        processor.addPayment(e4);
        processor.addPayment(invoice);

        System.out.println("TOTAL PAYMENT");
        System.out.println("----------------");
        System.out.println(processor.calculateTotalPayment());

        System.out.println();
        System.out.println("LARGEST PAYMENT");
        System.out.println("----------------");
        System.out.println(processor.largestPayment());
        System.out.println("Amount: " +
                           processor.largestPayment().calculatePayment());

        System.out.println();
        System.out.println("PAYMENT TYPES");
        System.out.println("----------------");
        processor.countPaymentTypes();
    }
}
