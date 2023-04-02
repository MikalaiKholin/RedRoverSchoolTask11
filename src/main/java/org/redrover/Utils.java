package org.redrover;

import java.util.Arrays;

public class Utils {
    public static Employee getEmployeeByName (String name, Employee[] employees){
        for (Employee e: employees){
            if (e.getName().equals(name)) return e;
        }
        return null;
    }

    public static Employee getEmployeeByPathOfName (String pathOfName, Employee[] employees){
        for (Employee e: employees){
            if (e.getName().contains(pathOfName)) return e;
        }
        return null;
    }

    public static double getBudget (Employee[] employees){
        double budget = 0;
        for (Employee e: employees){
          budget += e.getSalary();
        }
        return budget;
    }

    public static double getMinSalary (Employee[] employees){
        double minSalary = Double.MAX_VALUE;
        for (Employee e: employees){
            if (e.getBaseSalary() < minSalary) minSalary = e.getBaseSalary();
        }
        return minSalary;
    }

    public static double getMaxSalary (Employee[] employees){
        double maxSalary = 0;
        for (Employee e: employees){
            if (e.getBaseSalary() > maxSalary) maxSalary = e.getBaseSalary();
        }
        return maxSalary;
    }

    public static int getMaxNumberOfSubordinates(Manager[] managers){
        int maxNumberOfSubordinates = 0;
        for (Manager m: managers){
            if (m.getNumberOfSubordinates() > maxNumberOfSubordinates) maxNumberOfSubordinates = m.getNumberOfSubordinates();
        }
        return maxNumberOfSubordinates;
    }

    public static int getMinNumberOfSubordinates(Manager[] managers){
        int minNumberOfSubordinates = Integer.MAX_VALUE;
        for (Manager m: managers){
            if (m.getNumberOfSubordinates() < minNumberOfSubordinates) minNumberOfSubordinates = m.getNumberOfSubordinates();
        }
        return minNumberOfSubordinates;
    }

    public static double getMaxManagerBonus (Manager[] managers){
        double maxBonus = 0;
        for (Manager m: managers){
            if (m.getSalaryManager() > maxBonus) maxBonus = m.getSalaryManager();
        }
        return maxBonus;
    }

    public static double getMinManagerBonus (Manager[] managers){
        double minBonus = Double.MAX_VALUE;
        for (Manager m: managers){
            if (m.getSalaryManager() < minBonus) minBonus = m.getSalaryManager();
        }
        return minBonus;
    }

    public static int sum(int... arr){
        return Arrays.stream(arr).sum();
    }
}
