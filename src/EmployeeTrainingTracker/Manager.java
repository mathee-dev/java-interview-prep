package EmployeeTrainingTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.naming.spi.DirStateFactory.Result;

import EmployeeTrainingTracker.Employee;

public class Manager {

    private HashMap<Integer, Employee> employees = new HashMap<>();
    private static HashMap<Integer, Course> courses = new HashMap<>();
    private static ArrayList<TrainingResult> results = new ArrayList<>();

    public void addTrainingResult(Employee employee, Course course, int grade){
        TrainingResult tr = new TrainingResult(employees.get(employee.getId()), courses.get(course.getId()), grade);
        results.add(tr);
    }
    public void addEmployee(int id, String name, String department){
        //Make an employee
        Employee newEmployee  = new Employee(id, name, department);
        employees.put(id, newEmployee);
    }
    public void addEmployee(Employee newEmployee){
        employees.put(newEmployee.getId(),newEmployee);
    }
    
    public Employee getEmployee(int id){
        return employees.get(id);
    }
    public Course getCourse(int id){
        return courses.get(id);
    }

    public void outputEmployee(Employee employee){
        Employee a = employees.get(employee.getId());
        System.out.println(a.getId() + " - "+a.getName()+" - "+a.getClass());
    }
    public void outputEmployee(int id){
        Employee a = employees.get(id);
        System.out.println(a.getName());
    }

    public void addCourse(int id, String name, int passingScore){
        Course newCourse = new Course(id, name, passingScore);
        courses.put(id,newCourse);
    }

    public void addCourse(Course course){
        courses.put(course.getId(),course);
    }

    public void showResults(Employee employee){
        for (TrainingResult tr : results) {
            if (tr.getEmployee().getId()==employee.getId()){
                System.out.println(tr.getEmployee().getName() + " - " + tr.getCourse().getTitle()+ ": "+tr.getScore());
            }
        }
        
    }
    
}
