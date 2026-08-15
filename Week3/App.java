import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr.length == 0) {
            System.out.println("Array is empty.");
        }
        else {
            System.out.println("Sum = " + ArrayStatistics.sum(arr));
            System.out.println("Average = " + ArrayStatistics.average(arr));
            System.out.println("Minimum = " + ArrayStatistics.minimum(arr));
            System.out.println("Maximum = " + ArrayStatistics.maximum(arr));
            System.out.println("Even count = " + ArrayStatistics.countEven(arr));

            int odd = arr.length - ArrayStatistics.countEven(arr);
            System.out.println("Odd count = " + odd);

            ArrayStatistics.printSignCounts(arr);
        }

        sc.close();
    }
}
