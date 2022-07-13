package kz.bitlab.db;

public class User {
    private String fullName;
    private int examPoints;

    public User() {
    }

    public User(String fullName, int examPoints) {
        this.fullName = fullName;
        this.examPoints = examPoints;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExamPoints() {
        return examPoints;
    }

    public void setExamPoints(int examPoints) {
        this.examPoints = examPoints;
    }
}
