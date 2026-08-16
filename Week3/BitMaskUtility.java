import java.util.Scanner;

public class BitMaskUtility {

    static boolean isBitSet(int number, int position) {

        return (number & (1 << position)) != 0;
    }


    static int setBit(int number, int position) {

        return number | (1 << position);
    }


    static int clearBit(int number, int position) {

        return number & ~(1 << position);
    }


    static int toggleBit(int number, int position) {

        return number ^ (1 << position);
    }


    static String toBinary32(int number) {

        return String.format("%32s",
                Integer.toBinaryString(number))
                .replace(' ', '0');
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = sc.nextInt();

        if (position < 0 || position > 31) {

            System.out.println(
                "Invalid bit position."
            );

            sc.close();
            return;
        }

        System.out.println("Original decimal = " + number);
        System.out.println(
            "Original binary = " + toBinary32(number)
        );

        System.out.println();
        System.out.println("1. Check bit");
        System.out.println("2. Set bit");
        System.out.println("3. Clear bit");
        System.out.println("4. Toggle bit");

        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println(
                "Bit is set = " +
                isBitSet(number, position)
            );
        }
        else {

            int result;

            if (choice == 2) {
                result = setBit(number, position);
            }
            else if (choice == 3) {
                result = clearBit(number, position);
            }
            else if (choice == 4) {
                result = toggleBit(number, position);
            }
            else {
                System.out.println("Invalid operation.");
                sc.close();
                return;
            }

            System.out.println(
                "After decimal = " + result
            );

            System.out.println(
                "After binary = " + toBinary32(result)
            );
        }

        sc.close();
    }
}
