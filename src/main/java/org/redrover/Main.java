package org.redrover;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        Employee ben = new Employee("Ben", 34, Gender.MALE, 25.3, 755);

        int days = 10;
        System.out.printf("%s's salary for %d days is %.2f%n", ben.getName(), days, ben.getSalary(days));

        Manager anna = new Manager("Anna", 45, Gender.FEMALE, 30, 900, 33);
        Manager ted = new Manager("Ted", 51, Gender.MALE, 30, 800, 23);
        Manager sveta = new Manager("Sveta", 41, Gender.FEMALE, 30, 600,45);
        Manager ihar = new Manager("Ihar", 41, Gender.MALE, 30, 700,46);

        days = 30;
        System.out.printf("%s's salary for %d days is %.2f%n", anna.getName(), days, anna.getSalary(days));
        System.out.printf("%s's manager bonus is %.2f%n", anna.getName(), anna.getSalaryManager());

        Worker nick = new Worker("Nick", 24, Gender.MALE, 23, 750);
        System.out.printf("%s's base salary is %.2f%n", nick.getName(), nick.getSalaryWorker());

        Director bill = new Director("Bill", 52, Gender.MALE, 40, 1000, 354);
        System.out.printf("%s's director bonus is %.2f%n", bill.getName(), bill.getSalaryDirector());

        Employee [] empoyees = {ben, anna, ted, sveta, ihar, nick, bill};
        Manager [] managers = {anna, ted, sveta, ihar};

        String name = "Ihar";
        System.out.printf("Employee with name %s is %s%n", name, Utils.getEmployeeByName(name, empoyees));

        String pathOfName = "ic";
        System.out.printf("Employee with path of name %s is %s%n",
                pathOfName, Utils.getEmployeeByPathOfName(pathOfName, empoyees));

        System.out.printf("Budget of company is %.2f%n", Utils.getBudget(empoyees));

        System.out.printf("Min salary is %.2f%n", Utils.getMinSalary(empoyees));

        System.out.printf("Max salary is %.2f%n", Utils.getMaxSalary(empoyees));

        System.out.printf("Max number of subordinates is %d%n", Utils.getMaxNumberOfSubordinates(managers));

        System.out.printf("Min number of subordinates is %d%n", Utils.getMinNumberOfSubordinates(managers));

        System.out.printf("Max manager bonus is %.2f%n", Utils.getMaxManagerBonus(managers));

        System.out.printf("Min manager bonus is %.2f%n", Utils.getMinManagerBonus(managers));

        System.out.printf("%s's manager bonus is %.2f and full salary is %.2f%n",
                anna.getName(), anna.getSalaryManager(), anna.getSalary());

        System.out.println(Utils.sum(1,2,3));

        System.out.println(StringUtils.capitalize("rrrEEE ggg"));
    }
}
