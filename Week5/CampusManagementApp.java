public class CampusManagementApp {
    public static void main(String[] args) {

        CampusRegistry registry = new CampusRegistry(5);

        Student s1 = new Student("Sakshi", new int[]{85, 90, 88});
        Student s2 = new Student("Rahul", new int[]{78, 82, 80});
        Student s3 = new Student("Ananya", new int[]{92, 95, 90});

        Instructor i1 = new Instructor("Amit", "Java");
        Instructor i2 = new Instructor("Neha", "Database");

        registry.addPerson(s1);
        registry.addPerson(s2);
        registry.addPerson(s3);
        registry.addPerson(i1);
        registry.addPerson(i2);

        System.out.println("ALL CAMPUS MEMBERS");
        System.out.println("------------------");
        registry.displayAll();

        System.out.println();
        System.out.println("SEARCH RESULT");
        System.out.println("------------------");

        Person found = registry.searchByName("Sakshi");

        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Person not found.");
        }

        System.out.println();
        System.out.println("HIGHEST PERFORMING STUDENT");
        System.out.println("------------------");

        Student highest = registry.highestStudent();

        if (highest != null) {
            System.out.println(highest);
        }
    }
}
