import java.util.Scanner;

public class GradingSystem {

    static String classifyMark(int mark) {

        if (mark < 0 || mark > 100) {
            return "Invalid mark";
        } else if (mark >= 80) {
            return "Distinction";
        } else if (mark >= 70) {
            return "Merit";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = input.nextInt();

        String result = classifyMark(mark);

        System.out.println(result);

        input.close();
    }
}
