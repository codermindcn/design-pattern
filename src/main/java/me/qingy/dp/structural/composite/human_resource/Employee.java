package me.qingy.dp.structural.composite.human_resource;

/**
 * @author qingy
 * @since 2021-08-03
 */
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
