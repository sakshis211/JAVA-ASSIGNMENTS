abstract class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract String getRole();

    public String toString() {
        return "Name: " + name + ", Role: " + getRole();
    }
}

class Student extends Person {
    private int[] marks;

    Student(String name, int[] marks) {
        super(name);

        this.marks = marks;
    }

    @Override
    String getRole() {
        return "Student";
    }

    int getTotalMarks() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public String toString() {
        return super.toString() + ", Total Marks: " + getTotalMarks();
    }
}

class Instructor extends Person {
    private String subject;

    Instructor(String name, String subject) {
        super(name);

        this.subject = subject;
    }

    @Override
    String getRole() {
        return "Instructor";
    }

    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}

class CampusRegistry {
    private Person[] people;
    private int size;

    CampusRegistry(int capacity) {
        people = new Person[capacity];
        size = 0;
    }

    void addPerson(Person person) {
        if (size < people.length) {
            people[size] = person;
            size++;
        } else {
            System.out.println("Registry is full.");
        }
    }

    void displayAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(people[i]);
        }
    }

    Person searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return people[i];
            }
        }

        return null;
    }

    Student highestStudent() {
        Student highest = null;

        for (int i = 0; i < size; i++) {

            if (people[i] instanceof Student) {
                Student student = (Student) people[i];

                if (highest == null ||
                    student.getTotalMarks() > highest.getTotalMarks()) {
                    highest = student;
                }
            }
        }

        return highest;
    }
}
