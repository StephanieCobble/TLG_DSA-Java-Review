package com.hr.personnel;

public class Department {
    // fields
    private String name;
    private String location;

    private Employee[] employees = new Employee[100];
    private int currentIndex = 0; // indicates the empty array slot to use for adding an Employee object

    // ctor

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int counter = 0;
        for (int i = 0; i < currentIndex; i++) {
            counter++;
        }
        return counter;
    }

    public double ComputeDepartmentMonthlyTotalCompensation() {
        double totalComp = 0.00;
        for (int i = 0; i <currentIndex; i++) {
            totalComp += employees[i].computeMonthlyCompensation();
        }
        return totalComp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}