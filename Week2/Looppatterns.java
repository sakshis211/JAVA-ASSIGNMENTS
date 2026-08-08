import java.util.Scanner;

public class LoopPatterns {

    // Pattern A - Square
    static void patternA(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Pattern B - Triangle
    static void patternB(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Pattern C - Number triangle
    static void patternC(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        if (size < 1) {
            System.out.println("Invalid size.");
        } else {

            System.out.println("\nPattern A:");
            patternA(size);

            System.out.println("\nPattern B:");
            patternB(size);

            System.out.println("\nPattern C:");
            patternC(size);
        }

        sc.close();
    }
}
