package EmployeeTrainingTracker;

public class Main {
    public static void main(String args[]){
        Manager tim = new Manager();
        Employee cyrus = new Employee(0, "Cyrus", "Comp Sci");
        Course algorithms = new Course(0, "Introduction to Algorithms", 60);
        Course javaCoding = new Course(1, "Introduction to Java", 50);
        tim.addEmployee(1,"Matt","CompSci");
        tim.addEmployee(cyrus);
        tim.addCourse(algorithms);
        tim.addCourse(1,"Java",60);
        tim.addCourse(javaCoding);

        tim.addTrainingResult(cyrus,algorithms,90);
        tim.addTrainingResult(cyrus,javaCoding, 0);

        tim.showResults(cyrus);
    }

    
    
}
