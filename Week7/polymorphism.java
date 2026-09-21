class Person {

    void describeRole() {
        System.out.println("I am a person.");
    }
}

class Student extends Person {

    @Override
    void describeRole() {
        System.out.println("I am a student.");
    }

    void submitAssignment() {
        System.out.println("Student submitted assignment.");
    }
}

class Instructor extends Person {

    @Override
    void describeRole() {
        System.out.println("I am an instructor.");
    }

    void conductClass() {
        System.out.println("Instructor is conducting class.");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Person[] people = {
            new Student(),
            new Instructor(),
            new Student(),
            new Instructor()
        };

        for (Person person : people) {

            person.describeRole();

            if (person instanceof Student) {
                Student student = (Student) person;
                student.submitAssignment();
            }

            if (person instanceof Instructor) {
                Instructor instructor = (Instructor) person;
                instructor.conductClass();
            }
        }

        
    }
}
