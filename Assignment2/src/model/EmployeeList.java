/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Habeeb
 */
public class EmployeeList {

    private ArrayList<Employee> EmployeeList;

    public EmployeeList() {
        this.EmployeeList = new ArrayList<>();

    }

    public ArrayList<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public void setEmployeeList(ArrayList<Employee> EmployeeList) {
        this.EmployeeList = EmployeeList;
    }

    @Override
    public String toString() {
        return "EmployeeList{" + "EmployeeList=" + EmployeeList + '}';
    }

    public void deleteEmployee(Employee selectedEmployee) {
        this.EmployeeList.remove(selectedEmployee);
    }

    public void updateEmployee(Employee newEmployee, Employee selectedEmployee) {
        this.EmployeeList.remove(selectedEmployee);
        this.EmployeeList.add(newEmployee);
    }

}
