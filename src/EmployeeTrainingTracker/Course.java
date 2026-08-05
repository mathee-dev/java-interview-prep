package EmployeeTrainingTracker;

public class Course {
    private int id;
    private String title;
    private int passingScore;

    public Course(int id, String title, int passingScore){
        this.id = id;
        this.title = title;
        this.passingScore = passingScore;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int getPassingScore(){
        return passingScore;
    }


}
