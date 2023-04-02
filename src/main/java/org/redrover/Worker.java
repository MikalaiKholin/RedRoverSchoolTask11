package org.redrover;

public class Worker extends  Employee{
    public Worker(String name, int age, Gender gender, double salaryPerDay, double baseSalary) {
        super(name, age, gender, salaryPerDay, baseSalary);
    }

    public double getSalaryWorker(){
        return this.getBaseSalary();
    }
}
