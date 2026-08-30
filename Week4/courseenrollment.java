public class CourseEnrollment {
public static void main(String[] args) {
Course course = new Course("CS101", "Java Programming", 3);

    System.out.println(course);

    System.out.println("Enroll: " + course.enroll());

    System.out.println("Enroll: " + course.enroll());
    System.out.println(course);

    System.out.println("Enroll: " + course.enroll());
    System.out.println(course);

    System.out.println("Over-enrollment: " + course.enroll());

    System.out.println("Withdrawal: " + course.withdraw());
    System.out.println(course);

    System.out.println("Withdrawal: " + course.withdraw());
    System.out.println("Withdrawal: " + course.withdraw());

    System.out.println("Withdrawal from empty course: " + course.withdraw());
}

}
