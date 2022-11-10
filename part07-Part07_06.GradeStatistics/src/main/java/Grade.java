public class Grade {
    private int score;

    public Grade(int score) {
        this.score = score;
    }

    public Boolean isPassing() {
        return this.score >= 50;
    }

    public int getScore() {
        return this.score;
    }
}
