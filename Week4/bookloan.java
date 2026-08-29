public class BookLoan {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James", "B101");
        Book b2 = new Book("Data Structures", "Robert", "B102");

        System.out.println("Borrow b1: " + b1.borrowBook());

        System.out.println("Borrow b1 again: " + b1.borrowBook());
        System.out.println("Return b1: " + b1.returnBook());
        System.out.println("Return b1 again: " + b1.returnBook());
        System.out.println("\nBooks:");
        System.out.println(b1);
        System.out.println(b2);

        b2.borrowBook();

        System.out.println("\nAfter borrowing b2:");
        System.out.println(b1);
        System.out.println(b2);
    }
}
