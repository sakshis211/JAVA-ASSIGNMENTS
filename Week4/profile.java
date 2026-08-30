public class Profile {
private String name;
private int age;
private double heightMetres;

public Profile(String name, int age, double heightMetres) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Name cannot be blank");
    }

    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }

    if (heightMetres <= 0) {
        throw new IllegalArgumentException("Height must be positive");
    }

    this.name = name;
    this.age = age;
    this.heightMetres = heightMetres;
}

public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public double getHeightMetres() {
    return heightMetres;
}



}
