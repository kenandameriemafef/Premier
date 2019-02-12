/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.unibechar.mad.model;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class EmployeeModel extends Employee implements Model {

    public EmployeeModel(String empName, String empId) {
        super(empName, empId);
    }
    public ArrayList<Employee> getEnrolledEmployeeDetailsFromModel(){return new ArrayList();
}
    public  void addEmployeeToModel(Employee Em){}
    public  void removeEmployeeFromModel(String x){}
    

}
