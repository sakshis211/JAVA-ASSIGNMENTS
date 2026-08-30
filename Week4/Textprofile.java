public class TextProfile {
public static void main(String[] args) {
if (args.length < 3) {
System.out.println("Please provide name, age and height.");
return;
}

    String name = args[0];
    int age = Integer.parseInt(args[1]);
    double height = Double.parseDouble(args[2]);

    Profile profile = new Profile(name, age, height);

    System.out.println(profile);

    String ageText = Integer.toString(age);
    String heightText = Double.toString(height);
    String nameText = String.valueOf(name);

    System.out.println(ageText);
    System.out.println(heightText);
    System.out.println(nameText);
}

}
