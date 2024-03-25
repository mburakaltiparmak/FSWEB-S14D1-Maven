package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(String id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("MidDeveloper starts to working");
    }
}
