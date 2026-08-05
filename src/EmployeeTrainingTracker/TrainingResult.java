package EmployeeTrainingTracker;

import java.sql.Date;

public class TrainingResult {
    private Employee employee;
    private Course course;
    private int score;

    public int getScore(){
        return score;
    }
    public Employee getEmployee(){
        return employee;
    }

    public Course getCourse(){
        return course;
    }
    public TrainingResult(Employee employee, Course course,int score){
        this.employee = employee;
        this.course = course;
        this.score = score;
    }    

}