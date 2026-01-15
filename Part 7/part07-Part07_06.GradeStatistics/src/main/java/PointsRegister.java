import java.util.ArrayList;

public class PointsRegister {
    private ArrayList<Integer> points = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public void add(int number) {
        if (number > 0 && number <= 100) {
            points.add(number);
            grades.add(pointsToGrade(number));
        }
    }

    public double average() {
        double sumOfGrades = 0;

        for (int point : points) {
            sumOfGrades = sumOfGrades + point;
        }

        return sumOfGrades / points.size();
    }

    public double averagePassing() {
        double sumOfGrades = 0;
        int participants = 0;
        int passingGrade = 50;

        for (int point : points) {
            if (point >= passingGrade) {
                sumOfGrades = sumOfGrades + point;
                participants++;
            }
        }

        if (sumOfGrades == 0) {
            return sumOfGrades;
        }

        return sumOfGrades / participants;
    }

    public double passPercentage() {
        int passed = 0;
        int participants = 0;
        int passingGrade = 50;

        for (int point : points) {
            if (point >= passingGrade) {
                passed++;
            }
            participants++;
        }

        if (participants == 0) {
            return 0;
        }

        return 100 * ((double) passed / participants);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public int pointsToGrade(int points) {
        int grade = 0;

        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}