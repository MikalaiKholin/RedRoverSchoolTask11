package org.redrover;

public class Director extends Manager{

    public Director(String name, int age, Gender gender, double salaryPerDay, double baseSalary, int numberOfSubordinates) {
        super(name, age, gender, salaryPerDay, baseSalary, numberOfSubordinates);
    }

    public double getSalaryDirector(){
        if (this.getNumberOfSubordinates() == 0) return  getBaseSalary();
        return this.getBaseSalary() * ((double)this.getNumberOfSubordinates() / 100 * 9);
    }

    @Override
    public double getSalary(){
        return this.getBaseSalary() + this.getSalaryDirector();
    }
}
