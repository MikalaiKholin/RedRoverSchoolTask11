package org.redrover;

public class Employee {
    private String name;
    private int age;
    private Gender gender;
    private double salaryPerDay;
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Employee(String name, int age, Gender gender, double salaryPerDay, double baseSalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalary(int days){
        return days * this.getSalaryPerDay();
    }

    public double getSalary(){
        return this.getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("name=%s, age=%d", name, age);
    }
}
