package org.redrover;

public class Manager extends Employee{
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, int age, Gender gender, double salaryPerDay, double baseSalary, int numberOfSubordinates) {
        super(name, age, gender, salaryPerDay, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(int days){
        return days * this.getSalaryPerDay() * (1 + (double)this.getNumberOfSubordinates() / 100);
    }

    public double getSalary(){
        return this.getBaseSalary() + this.getSalaryManager();
    }

    public double getSalaryManager(){
        if (this.getNumberOfSubordinates() == 0) return  getBaseSalary();
        return this.getBaseSalary() * ((double)this.getNumberOfSubordinates() / 100 * 3);
    }
}
