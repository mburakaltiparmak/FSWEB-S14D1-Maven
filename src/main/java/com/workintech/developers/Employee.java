package com.workintech.developers;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary){
        setId(id);
        setName(name);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
     public void work(){
         System.out.println("Employee starts to working");
    }

}
