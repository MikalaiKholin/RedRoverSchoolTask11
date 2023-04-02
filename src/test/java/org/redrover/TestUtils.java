package org.redrover;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUtils {

    Employee ben = new Employee("Ben", 34, Gender.MALE, 25.3, 755);
    Manager anna = new Manager("Anna", 45, Gender.FEMALE, 30, 900, 33);
    Manager ted = new Manager("Ted", 51, Gender.MALE, 30, 800, 23);
    Manager sveta = new Manager("Sveta", 41, Gender.FEMALE, 30, 600,45);
    Manager ihar = new Manager("Ihar", 41, Gender.MALE, 30, 700,46);
    Worker nick = new Worker("Nick", 24, Gender.MALE, 23, 750);
    Director bill = new Director("Bill", 52, Gender.MALE, 40, 1000, 354);
    Employee [] empoyees = {ben, anna, ted, sveta, ihar, nick, bill};
    Manager [] managers = {anna, ted, sveta, ihar};
    @Test
    public void testSum(){
        Assert.assertEquals(Utils.sum(1, 2, 3), 6);
    }

    @Test
    public void testAbbr1(){
        Assert.assertEquals(StringUtils.abbreviate("Hello World", 5), "He...");
    }

    @Test
    public void testAbbr2(){
        Assert.assertEquals(StringUtils.abbreviate("Hello", 5), "Hello");
    }

    @Test
    public void testDeleteWhitespace() {
        Assert.assertEquals(StringUtils.deleteWhitespace("1 2 3"), "123");
    }

    @Test
    public void testCapitalize(){
        Assert.assertEquals(StringUtils.capitalize("mikalai"), "Mikalai");
    }

    @Test
    public void testGetEmployeeByName(){
        Assert.assertEquals(Utils.getEmployeeByName("Ihar", empoyees)
                , ihar);
    }

    @Test
    public void testGetEmployeeByPathOfName(){
        Assert.assertEquals(Utils.getEmployeeByPathOfName("Ih", empoyees)
                , ihar);
    }

    @Test
    public void testGetBudget(){
        Assert.assertEquals(Utils.getBudget(empoyees), 40584d);
    }

    @Test
    public void testGetMinSalary(){
        Assert.assertEquals(Utils.getMinSalary(empoyees), 600d);
    }

    @Test
    public void testGetMaxSalary(){
        Assert.assertEquals(Utils.getMaxSalary(empoyees), 1000d);
    }

    @Test
    public void testGetMaxNumberOfSubordinates(){
        Assert.assertEquals(Utils.getMaxNumberOfSubordinates(managers), 46);
    }

    @Test
    public void testGetMinNumberOfSubordinates(){
        Assert.assertEquals(Utils.getMinNumberOfSubordinates(managers), 23);
    }

    @Test
    public void testGetMaxManagerBonus(){
        Assert.assertEquals(Utils.getMaxManagerBonus(managers), 966.0000000000001);
    }

    @Test
    public void testGetMinManagerBonus(){
        Assert.assertEquals(Utils.getMinManagerBonus(managers), 552d);
    }
}
