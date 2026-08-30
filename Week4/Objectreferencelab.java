public class ObjectReferenceLab {

static void addBonus(ScoreBox box, int bonus) {
    box.setScore(box.getScore() + bonus);
}

static void replaceLocally(ScoreBox box) {
    box = new ScoreBox(100);
    System.out.println("Inside method: " + box);
}

static ScoreBox createScoreBox(int score) {
    return new ScoreBox(score);
}

public static void main(String[] args) {
    ScoreBox box1 = new ScoreBox(50);
    ScoreBox box2 = box1;

    System.out.println("box1: " + box1);
    System.out.println("box2: " + box2);

    System.out.println("box1 == box2: " + (box1 == box2));

    box2.setScore(70);

    System.out.println("After changing through box2:");
    System.out.println("box1: " + box1);
    System.out.println("box2: " + box2);

    addBonus(box1, 10);

    System.out.println("After addBonus:");
    System.out.println("box1: " + box1);
    System.out.println("box2: " + box2);

    ScoreBox box3 = new ScoreBox(40);

    System.out.println("box3: " + box3);
    System.out.println("box1 == box3: " + (box1 == box3));

    System.out.println("Before replaceLocally:");
    System.out.println("box1: " + box1);

    replaceLocally(box1);

    System.out.println("After replaceLocally:");
    System.out.println("box1: " + box1);

    ScoreBox box4 = createScoreBox(90);

    System.out.println("box4: " + box4);
    System.out.println("box1 == box4: " + (box1 == box4));
}


}
