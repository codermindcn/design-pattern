package me.qingy.dp.structural.composite.human_resource;

/**
 * @author qingy
 * @since 2021-08-03
 */
public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}
