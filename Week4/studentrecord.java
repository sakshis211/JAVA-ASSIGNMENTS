public class StudentRecord {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Student s1 = new Student("Sakshi", "S101", 49);
        Student s2 = new Student("Riya", "S102", 50);
        Student s3 = new Student("Aman", "S103", 79);

    
        Student s4 = new Student("Rahul", "S104", 80);

    
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    
        System.out.println("\nPassed status:");
        System.out.println(s1.getname() + ": " + s1.hasPasses());
        System.out.println(s2.getname() + ": " + s2.hasPasses());

        
        System.out.println("\nUpdating " + s1.getname() + "'s mark to 50:");
        System.out.println("Update successful: " + s1.setmarks(50));
        System.out.println(s1);

        
        System.out.println("\nTrying to update " + s2.getname() + "'s mark to 150:");
        System.out.println("Update successful: " + s2.setmarks(150));

        
        System.out.println("After invalid update:");
        System.out.println(s2);
    }
}

    

    

    

    

    

    

    

