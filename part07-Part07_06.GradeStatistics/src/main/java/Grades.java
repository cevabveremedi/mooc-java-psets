import java.util.ArrayList;

public class Grades {
    private ArrayList<Grade> grades;

    public Grades() {
        grades = new ArrayList<>();
    }

    public void add(int score) {
        grades.add(new Grade(score));
    }

    public int[] distribute() {
        int[] list = {0, 0, 0, 0, 0, 0};
        for(Grade grade: grades) {
            int score = grade.getScore();
            if(score < 50)
                list[0]++;
            else if(score < 60)
                list[1]++;
            else if(score < 70)
                list[2]++;
            else if(score < 80)
                list[3]++;
            else if(score < 90)
                list[4]++;
            else
                list[5]++;
        }
        return list;
    }

    public Double average() {
        if(grades.isEmpty())
            return -1.0;
        int sum = 0;
        for(Grade grade: grades)
            sum += grade.getScore();
        return (sum * 1.0) / grades.size();
    }

    public Double passingAverage() {
        if(grades.isEmpty())
            return -1.0;
        int sum = 0;
        int total = 0;
        for(Grade grade: grades) {
            if(grade.isPassing()) {
                sum += grade.getScore();
                total++;
            }
        }
        return sum / (total * 1.0);
    }

    public int totalPassing(int[] list) {
        if(grades.isEmpty())
            return -1;
        int total = 0;
        for(int i = 1; i < 6; i++)
            total += list[i];
        return total;
    }

    public int totalParticipant() {
        return grades.size();
    }

    public void draw(int[] list) {
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for(int j = 0; j < list[i]; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
