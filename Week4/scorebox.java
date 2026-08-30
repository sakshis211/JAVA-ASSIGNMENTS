public class ScoreBox {
private int score;

public ScoreBox(int score) {
    setScore(score);
}

public int getScore() {
    return score;
}

public boolean setScore(int score) {
    if (score < 0 || score > 100) {
        return false;
    }

    this.score = score;
    return true;
}



}
