public class BankAccount {
    public static void main(String[] args) {

        Account a1 = new Account("A101", "Sakshi", 500);
        Account a2 = new Account("A102", "Riya", 1000);

        System.out.println("Positive deposit: " + a1.deposit(500));

        System.out.println("Zero deposit: " + a1.deposit(0));

        System.out.println("Negative deposit: " + a1.deposit(-100));

        System.out.println("Valid withdrawal: " + a1.withdraw(200));

        System.out.println("Excessive withdrawal: " + a1.withdraw(1000));

        System.out.println(a1);
        System.out.println(a2);

        a2.deposit(500);

        System.out.println("After depositing into Account 2:");
        System.out.println(a1);
        System.out.println(a2);
    }
}
