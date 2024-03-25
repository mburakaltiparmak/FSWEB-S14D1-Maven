package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        addDeveloper(juniorDeveloper, juniorDevelopers);
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        addDeveloper(midDeveloper, midDevelopers);
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        addDeveloper(seniorDeveloper, seniorDevelopers);
    }

    private void addDeveloper(Employee developer, Employee[] developerArray) {
        boolean added = false;
        for (int i = 0; i < developerArray.length; i++) {
            if (developerArray[i] == null) {
                developerArray[i] = developer;
                added = true;
                System.out.println(developer.getName() + " added successfully.");
                break;
            }
        }
        if (!added) {
            System.out.println("Developer array is full. Cannot add " + developer.getName() + ".");
        }
    }
}
