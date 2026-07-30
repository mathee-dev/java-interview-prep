import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassesAndObjectsWarmup {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("Cyrus",100);
        myAccount.deposit(100);
        System.out.println(myAccount.getBalance());
        myAccount.deposit(-100);
        myAccount.withdraw(100);
        myAccount.withdraw(1000);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getOwner());

        Student student = new Student("Cyrus", Arrays.asList(80,50,65,70));
        System.out.println(student.getAverage());
        System.out.println(student.hasPassed());
        student.addGrade(0);
        student.addGrade(0);
        System.out.println(student.getAverage());
        System.out.println(student.hasPassed());
    }
    

}

class BankAccount {
    private String owner;
    private double balance;
    
    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    
    public void deposit(double amm){
        if (amm<0){
            System.out.println("Can't deposit negative amount");
        }
        else{
            balance+=amm;    
        }
                    
    }
    
    void withdraw(double amm){
        if (amm>balance){
            System.out.println("Can't withdraw more than balance");
        }
        else{
            balance-=amm; 
        }
    }
    double getBalance(){
        return balance;
    }

    String getOwner(){
        return owner;
    }
}

class Student{
    private String name;
    private List<Integer> grades = new ArrayList<>();

    Student(String name,List<Integer> grades){
        this.name = name; 
        this.grades.addAll(grades);
    }

    void addGrade(int grade){
        grades.add(grade);
    }

    double getAverage(){
        double sum = 0;
        for (int i = 0;i<grades.size();i++){
            sum+=grades.get(i);
        }

        return (sum/grades.size());
    } 
    
    boolean hasPassed(){
        return (getAverage()>=50);
    }
}